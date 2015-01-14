package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class RetweetModel extends LonelyTweetModel{
	public RetweetModel(String text, Date timestamp) {
		super(text, timestamp);
	}

	public RetweetModel(String text) {
		super(text);
	}
	
	public String getText() {
		return text;
	}

	@Override
	public Date getTimestamp() {
		// TODO Auto-generated method stub
		return null;
	}
}
