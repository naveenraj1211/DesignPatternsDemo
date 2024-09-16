package org.example.adapter.insuranceproviders;

public class AutoProtectAdapter implements TravelInsuranceAdapter {


    private final AutoProtectApi autoProtectApi = new AutoProtectApi();

    @Override
    public void submitClaim(String id, Double amount) {
        autoProtectApi.addClaim(amount);
    }

    @Override
    public ClaimStatus getStatus(String id) {
        AutoProtectStatus status = autoProtectApi.getStatus(id);
        return switch (status) {
            case APPROVED -> ClaimStatus.APPROVED;
            case DENIED -> ClaimStatus.DENIED;
            case PENDING -> ClaimStatus.PENDING;
        };
    }
}
