package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Tony on 2017/10/10.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    public void testAddTweet() {
        //assertTrue(Boolean.TRUE);
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);                   // add myTweet to list
        assertTrue(tweets.hasTweet(myTweet));       //

    }
    public void testDeleteTweet(){
        //assertTrue(Boolean.TRUE);
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);
        assertFalse(tweets.hasTweet(myTweet));

    }

    public void testHasTweet(){
        //assertTrue("testHasTweet has failed", Boolean.TRUE);

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));

    }

    public void testGetTweet(){
        // getTweet method will take an index and will return the tweet at that index

        // Hint tweets.getTweet(index) will return a Tweet
        //Hint to check if two tweets are the same, check if their message is the same AND
        // check if their dates are the same

        TweetList tweets = new TweetList();
        //Tweet myTweet = new NormalTweet("my tweet");

        NormalTweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), myTweet.getMessage());

        assertEquals(returnedTweet.getDate(), myTweet.getDate());




    }
    //public void testGetCount(){
     //   assertTrue(boolean.True);
    //}


}
