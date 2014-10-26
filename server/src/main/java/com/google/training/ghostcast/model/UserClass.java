package com.google.training.ghostcast.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class UserClass {
	@Id String userId;
	Date timestamp;
	String username;
	//optional
	String firstName;
	String lastName;
	
	 private List<String> postKeys = new ArrayList<>(0);

    public UserClass(String userId, String username) {
    	this.userId = userId;
    	this.username = username;
    }
    
    public String getUsername() {
    	return username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
	/**
	* Returns the date the comment was posted.
	* @return  comment date
	*/
	public Date getDate() {
		return timestamp == null ? null : new Date(timestamp.getTime());
	}
    
    /*
    * Getter for postKeys.
    * @return an immutable copy of postKeys.
    */
   public List<String> getPostKeys() {
       return ImmutableList.copyOf(postKeys);
   }
   
   /**
    * Adds a postId to postKeys.
    *
    * @param postKey a websafe String representation of the post Key.
    */
   public void addCommentKeys(String postKey) {
       postKeys.add(postKey);
   }
   
}
