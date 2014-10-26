package com.google.training.ghostcast.model;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class VoteClass {
	
	@Id String vote_id;
	String post_comment_id;
	String user_id;
    int upvote_count;
	int downvote_count;
	
	public VoteClass() {
		
	}
	

}
