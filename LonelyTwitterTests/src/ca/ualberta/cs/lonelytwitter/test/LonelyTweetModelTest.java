package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void failtest(){
		
		fail("This is a failing test");
	}
	
	
	public void testSampleCode(){
		assertTrue("This is not true", isGreaterthan(7,6));
		
	}
	
	private boolean isGreaterthan(int i, int j) {
		
		if (i>=j)
				return true;
		return false;
	}
	public void testimportantEquals(){
		
		Date date = new Date();
		ImportantTweetModel tweet= new ImportantTweetModel("Hi", date);
		ImportantTweetModel tweet2= new ImportantTweetModel("Hi", date);
		
		assertTrue("Same tweets are same", tweet.equals(tweet2));
		
		
	}
	public void testnormalEquals(){
		
		Date date = new Date();
		NormalTweetModel tweet= new NormalTweetModel("Hi", date);
		NormalTweetModel tweet2= new NormalTweetModel("Hi", date);
		
		assertTrue("Same tweets are same", tweet.equals(tweet2));
		
		
	}
	
	

}
