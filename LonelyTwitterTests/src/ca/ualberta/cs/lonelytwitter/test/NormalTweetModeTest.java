package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class NormalTweetModeTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public NormalTweetModeTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();//-->on create for android activity, 
	}
	
	public void testEquals(){
		
		Date date = new Date();
		NormalTweetModel tweet= new NormalTweetModel("Hi", date);
		NormalTweetModel tweet2= new NormalTweetModel("Hi", new Date(31223));
		
		assertTrue("Same tweets are same", tweet.equals(tweet2));
		
		
	}

}
