package org.example.adapter.insuranceproviders;

public interface TravelInsuranceAdapter {

    void submitClaim(String id, Double amount);
    ClaimStatus getStatus(String id);
}
