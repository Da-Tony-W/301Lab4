/*
 * Class Name: NormalTweet
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 * Represents a Normal Tweet
 *  @author CMPUT301 TAs, Da Wang(Tony)
 *  @version 1.0
 *  @see Tweet
 *  @see ImportantTweet
 *  @since 1.0
 */

public class NormalTweet extends Tweet {
    /**
     * Constructs NormalTweet object
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Indicates not isImportant()
     * @return Boolean.FALSE
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
