package com.dcp.dcp.model.common;

import lombok.*;

import java.io.Serializable;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

//import org.apache.http.HttpStatus;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Response<T> implements Serializable {
    private T data;
    private String errorMessage;
    private List<ErrorMessage> messageList;
    private HttpStatus status;


    public Response(T data, Object o) { }


    @SuppressWarnings("unchecked")
    public void setData(T data){
        this.data = data;
    }

    public void success(T data){
        this.data = data;
        this.status = HttpStatus.OK;
    }

    public void fail(String[] errorMessages){
        List<ErrorMessage> errorMessageList = new ArrayList<>();

        for(String ems : errorMessages){
            ErrorMessage errorMessage = new ErrorMessage();
            ErrorItem errorItem = new ErrorItem();

            errorItem.setItemName(ems);
            errorMessage.setErrorItem(errorItem);
            errorMessageList.add(errorMessage);
        }

        this.status = HttpStatus.NO_CONTENT;
        this.messageList = errorMessageList;
    }

    public void successfullyCreated(T data){
        this.status = HttpStatus.CREATED;
    }

}
