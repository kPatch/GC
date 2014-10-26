package com.google.training.ghostcast.model;
import java.util.Date;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Cache;

@Entity
@Cache
public class CommentClass {
	
	@Id String commentId;
	String text;
	Date date;
	String upload_id;
	@Index public String votes_id;
	int votes_count;
	
	 /**
     * Holds Profile key as the parent.
     */
    @Parent
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    private Key<PostClass> postKey;

    /**
     * The userId of the user.
     */
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    private String userId;

	
	public CommentClass() {
		
	}
	
	public CommentClass(String commentId, String text, String upload_id) {
		this.commentId = commentId;
		this.text = text;
		this.upload_id = upload_id;
	}
	
	public String getCommentId() {
		return commentId;
	}
	
	
	public String getText() {
		return text;
	}
	
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public Key<PostClass> getProfileKey() {
		return postKey;
	}
	
	// Get a String version of the key
	public String getWebsafeKey() {
		return Key.create(postKey, CommentClass.class, commentId).getString();
	}
	
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public String getUserId() {
		return userId;
	}
	
	/**TODO
	* Returns poster's display username.
	*
	* @return poster's display usernamename.
	*/
	
	
	/**
	* Returns the date the comment was posted.
	* @return  comment date
	*/
	public Date getDate() {
		return date == null ? null : new Date(date.getTime());
	}
	
	

}
