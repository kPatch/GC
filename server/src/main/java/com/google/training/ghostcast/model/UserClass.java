package com.google.training.ghostcast.model;

public class UserClass {
    public String message = "Hello World";

    public UserClass () {
    }

    public UserClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}
