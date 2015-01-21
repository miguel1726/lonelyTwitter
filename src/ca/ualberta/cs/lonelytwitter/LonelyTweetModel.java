package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
//serailization GSON library, handles STUFF

public abstract class LonelyTweetModel {
	protected String text;
	private Date timestamp;
	
	public String getText() {
		return text;
	}
	
	public LonelyTweetModel(String text) {
		super();//calling the constructor of the superclass, in this case it's object, can have run time exception
		this.text = text;
		timestamp = new Date();//allocates memory for date, no this. because you dont have too, because there is no variabe decared as timestamp, so goes to attribute auto
	}
	
	public LonelyTweetModel(String text, Date timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public abstract Date getTimestamp();//subclass wil have to overwrite it, returns a date, anyone can access it, and no exceptions, takes no argument
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
