package com.google.training.ghostcast.model;

import com.google.common.collect.ImmutableList;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class PostClass {
	
	  @Id String postId;
	  String message;
	  String timestamp;
	  int comment_count;
	  int shared_count;
	  
	  private List<String> commentKeys = new ArrayList<>(0);
	  private List<String> voteKeys = new ArrayList<>(0);
	  
	  //TODO: Add geolocation
	  /**
	     * Public constructor for PostClass.
	     * @param postId - The post id
	     * @param message - Any string user wants to post.
	     * @param timestamp - unix date time.
	     *
	     */
	  	public PostClass(String postId, String message , String timestamp) {
	  		this.postId = postId;
	  		this.message =message;
	  		this.timestamp = timestamp;
	  	}
	  	
	  	/**
	     * Getter for vote count.
	     * @return vote count
	     * */
	  	public int getVoteCount() {
	  		return voteKeys.size();
	  	}
	  	
		/**
	     * Getter for comment count.
	     * @return comment count
	     * */
	  	public int getCommentCount() {
	  		return commentKeys.size();
	  	}
	  	
	  	
	    /**
	     * Getter for commentKeys.
	     * @return an immutable copy of commentKeys.
	     */
	    public List<String> getCommentKeys() {
	        return ImmutableList.copyOf(commentKeys);
	    }
	    
	    /**
	     * Adds a CommentId to commentKeys.
	     *
	     * @param commentKey a websafe String representation of the comment Key.
	     */
	    public void addCommentKeys(String commentKey) {
	        commentKeys.add(commentKey);
	    }
	    
	    /**
	     * Getter for voteKeys.
	     * @return an immutable copy of commentKeys.
	     */
	    public List<String> getVoteKeys() {
	        return ImmutableList.copyOf(voteKeys);
	    }
	    
	    /**
	     * Adds a CommentId to commentKeys.
	     *
	     * @param commentKey a websafe String representation of the comment Key.
	     */
	    public void addVoteKeys(String voteKey) {
	        voteKeys.add(voteKey);
	    }
	    
	    

	    /**
	     * Just making the default constructor private.
	     */
	    private PostClass() {}


	    
	    

}



