package com.dcp.dcp.model.claim;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "ClaimInfo")
public class ClaimInfo {
    @Id
    @JsonProperty("ClaimID")
    private String ClaimID;
    @JsonProperty("ProductName")
    private String ProductName;
    @JsonProperty("ClaimDate")
    private String ClaimDate;
    @JsonProperty("ClaimStatus")
    private String ClaimStatus;
}
