package org.example.adapter.insuranceproviders;

public class TravelGuardAdapter implements TravelInsuranceAdapter {

    private final TravelGuardApi travelGuardApi = new TravelGuardApi();

    @Override
    public void submitClaim(String id, Double amount) {
        travelGuardApi.submitClaim(id, amount);
    }

    @Override
    public ClaimStatus getStatus(String id) {
        String status = travelGuardApi.getClaimStatus(id);

        return switch (status) {
            case "APPROVED" -> ClaimStatus.APPROVED;
            case "DENIED" -> ClaimStatus.DENIED;
            case "PENDING" -> ClaimStatus.PENDING;
            default -> null;
        };

    }
}
