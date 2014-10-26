package com.google.training.ghostcast.model;

public class CommentClass {
	
	public String comment_id;
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
