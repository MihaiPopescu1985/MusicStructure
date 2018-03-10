package com.example.mpopescu.musicstructure;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MPopescu on 10-Mar-18.
 */

public class SeventysHitsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("You Light Up My Life", "Debby Boone"));
        songs.add(new Song("Tonight's The Night (Gonna Be Alright)", "Rod Stewart"));
        songs.add(new Song("Le Freak", "Chic"));
        songs.add(new Song("How Deep Is Your Love", "Bee Gees"));
        songs.add(new Song("I Just Want To Be Your Everything", "Andy Gibb"));
        songs.add(new Song("Silly Love Songs", "Wings "));
        songs.add(new Song("Let's Get It On", "Marvin Gaye"));
        songs.add(new Song("Night Fever", "Bee Gees"));
        songs.add(new Song("Tie A Yellow Ribbon Round The Ole Oak Tree", "Dawn & Tony Orlando"));
        songs.add(new Song("Shadow Dancing", "Andy Gibb"));
        songs.add(new Song("Stayin' Alive", "Bee Gees"));
        songs.add(new Song("Hot Stuff", "Donna Summer"));
        songs.add(new Song("You're So Vain", "Carly Simon"));
        songs.add(new Song("Play That Funky Music", "Wild Cherry"));
        songs.add(new Song("My Sharona", "The Knack"));
        songs.add(new Song("Killing Me Softly With His Song", "Roberta Flack"));
        songs.add(new Song("Best Of My Love", "The Emotions"));
        songs.add(new Song("The Way We Were", "Barbra Streisand"));
        songs.add(new Song("A Fifth Of Beethoven", "Walter Murphy & The Big Apple Band"));
        songs.add(new Song("I Will Survive", "Gloria Gaynor"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list_song);

        listView.setAdapter(songAdapter);
    }
}