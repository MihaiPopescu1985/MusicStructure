package com.example.mpopescu.musicstructure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *
 * I've used the song list from www.billboard.com
 * a link to the specific web page is implemented in the app
 *
 */

public class NinetysHitsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Sets the "About" text field with info about this activity
        TextView textView = findViewById(R.id.about);
        textView.setText(R.string.best_20_songs);

        //Opens the web page with the original songs list
        textView.setOnClickListener(view ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://www.billboard.com/articles/news/6297023/billboard-hot-100-1990"
                ))));

        //Pressing this button, the app returns to the main activity
        Button button = findViewById(R.id.go_back_button);
        button.setOnClickListener(view -> startActivity(
                new Intent(NinetysHitsActivity.this, MainActivity.class)
        ));

        //Populating the ArrayList with songs to be displayed
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("How Do I Live", "LeAnn Rimes "));
        songs.add(new Song("Macarena (Bayside Boys Mix)", "Los Del Rio"));
        songs.add(new Song("Un-Break My Heart", "Toni Braxton"));
        songs.add(new Song("Foolish Games/You Were Meant For Me", "Jewel"));
        songs.add(new Song("(Everything I Do) I Do It For You", "Bryan Adams"));
        songs.add(new Song("I'll Make Love To You", "Boyz II Men"));
        songs.add(new Song("Too Close", "Next"));
        songs.add(new Song("One Sweet Day", "Mariah Carey & Boyz II Men"));
        songs.add(new Song("Truly Madly Deeply", "Savage Garden"));
        songs.add(new Song("Candle In The Wind 1997/Something About The Way You Look Tonight",
                "Elton John"));
        songs.add(new Song("End Of The Road", "Boyz II Men"));
        songs.add(new Song("The Sign", "Ace Of Base"));
        songs.add(new Song("The Boy Is Mine", "Brandy and Monica"));
        songs.add(new Song("Because I Love You (The Postman Song)", "Stevie B"));
        songs.add(new Song("Whoomp! (There It Is)", "Tag Team"));
        songs.add(new Song("Rush Rush", "Paula Abdul"));
        songs.add(new Song("You're Still The One", "Shania Twain"));
        songs.add(new Song("I Will Always Love You", "Whitney Houston"));
        songs.add(new Song("Gangsta's Paradise", "Coolio Featuring L.V."));
        songs.add(new Song("Nothing Compares 2 U", "Sinead O'Connor"));

        //Getting the ListView from the layout
        ListView listView = findViewById(R.id.list_song);

        //Passing a custom adapter to the ListView
        listView.setAdapter(new SongAdapter(this, songs));
    }
}
