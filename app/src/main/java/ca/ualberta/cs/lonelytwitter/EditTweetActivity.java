package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;


public class EditTweetActivity extends Activity {
    private TextView tweetTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        tweetTextView = (TextView)findViewById(R.id.editTweetTextView);


        //Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        String message = extras.getString("TWEET_MESSAGE");

        tweetTextView.setText(message);


    }
}
