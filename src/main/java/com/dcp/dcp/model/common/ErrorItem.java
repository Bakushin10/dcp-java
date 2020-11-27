package com.dcp.dcp.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorItem {
    @JsonProperty("ItemName")
    private String itemName;
    @JsonProperty("TabName")
    private String tabName;
    @JsonProperty("Error")
    private String Error;
}
