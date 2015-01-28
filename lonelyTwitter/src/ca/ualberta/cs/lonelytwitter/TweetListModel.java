package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private int count;
	private ArrayList<LonelyTweetModel> tweets;
	private LonelyTweetModel tweet;
	
	public TweetListModel(){
		count=0;
		tweets = new ArrayList<LonelyTweetModel>();
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweets;
	}

	public void addTweet(LonelyTweetModel lonelyTweet) throws Exception{
		// TODO Auto-generated method stub
		count++;
		tweets.add(lonelyTweet);
		for(LonelyTweetModel tweet: tweets)
			if (lonelyTweet==tweet){
				throw new IllegalArgumentException();
			}
			
		
		
	}
	
		
	
}
