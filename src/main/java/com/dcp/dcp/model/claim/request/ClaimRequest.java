package com.dcp.dcp.model.claim.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClaimRequest {
    @JsonProperty
    private String UserID;
}
