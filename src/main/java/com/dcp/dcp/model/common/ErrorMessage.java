package com.dcp.dcp.model.common;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class ErrorMessage {

    @JsonProperty("ErrorType")
    private String errorType;
    @JsonProperty("Content")
    private String content;
    @JsonProperty("Course")
    private String course;
    @JsonProperty("ErrorItemList")
    private ErrorItem errorItem;
}
