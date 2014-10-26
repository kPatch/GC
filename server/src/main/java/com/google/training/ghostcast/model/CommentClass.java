package com.google.training.ghostcast.model;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class CommentClass {
	
	@Id String comment_id;
	public String user_id;
	public String text;
	public String upload_id;
	public String votes_id;
	
	public CommentClass() {
		
	}
	
	public CommentClass(String user_id, String text) {
		this.user_id = user_id;
		this.text = text;
	}
	
	

}
