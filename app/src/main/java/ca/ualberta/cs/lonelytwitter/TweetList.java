package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Tony on 2017/10/10.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count;

    // add tweet to a list of tweets
    //IllegalArgumentException when one tries to add a duplicate tweet
    public void addTweet(Tweet tweet){
        if(tweets.contains(tweet)){
           throw new IllegalArgumentException("do not add duplicate tweet");
        }
        else{
            tweets.add(tweet);
            count ++;
        }


    }
    // delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
        count --;
    }


    // check if a list of tweets has the specified tweet
    // if it does, return true, else return false
    public boolean hasTweet(Tweet tweet){

        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);



    }


    public int getCount(){
        //return count;
        return tweets.size();
    }

}
