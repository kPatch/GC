package com.google.training.ghostcast.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class UserClass {
	@Id String user_id;
	
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
