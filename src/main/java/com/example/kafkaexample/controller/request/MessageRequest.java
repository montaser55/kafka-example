package com.example.kafkaexample.controller.request;

public class MessageRequest {

    public MessageRequest(String message) {
        this.message = message;
    }

    public MessageRequest(){
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
