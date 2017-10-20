package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String message = extras.getString("TWEET_MESSAGE");
        TextView tweetfield = (TextView) findViewById(R.id.editTweetTextView);

    }
}
