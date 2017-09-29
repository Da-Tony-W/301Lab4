/*
 * Class Name: ImportantTweet
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an Important Tweet
 *  @author CMPUT301 TAs, Da Wang(Tony)
 *  @version 1.0
 *  @see Tweet
 *  @see NormalTweet
 *  @since 1.0
 */
public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs ImportantTweet Object
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * Indicates isImportant()
     * @return Boolean.TRUE
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
