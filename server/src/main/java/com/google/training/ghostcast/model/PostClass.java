package com.google.training.ghostcast.model;

import java.util.Date;

public class PostClass {
	
	  public String id;
	  public String message;
	  public Date timestamp;
	  public String votes_id;
	  public String comment_id;
	  public int comment_count;
	  public int shared_count;
	  //TODO: Add geolocation
	  
	    public PostClass () {
	    }

	    public PostClass (String id) {
	       
	    }

	    public String getId() {
	        return id;
	    }

}
