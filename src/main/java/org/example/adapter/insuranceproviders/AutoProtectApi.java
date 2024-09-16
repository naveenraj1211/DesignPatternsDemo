package org.example.adapter.insuranceproviders;

public class AutoProtectApi {


    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}
