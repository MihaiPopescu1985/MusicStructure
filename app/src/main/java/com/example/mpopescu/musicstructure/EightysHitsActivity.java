package com.example.mpopescu.musicstructure;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MPopescu on 10-Mar-18.
 */

public class EightysHitsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Physical", "Olivia Newton-John"));
        songs.add(new Song("Bette Davis Eyes", "Kim Carnes"));
        songs.add(new Song("Endless Love", "Diana Ross & Lionel Richie"));
        songs.add(new Song("Eye Of The Tiger", "Survivor"));
        songs.add(new Song("Every Breath You Take", "The Police"));
        songs.add(new Song("Flashdance...What A Feeling", "Irene Cara"));
        songs.add(new Song("Another One Bites The Dust", "Queen"));
        songs.add(new Song("Say Say Say", "Paul McCartney and Michael Jackson"));
        songs.add(new Song("Call Me", "Blondie"));
        songs.add(new Song("Lady", "Kenny Rogers"));
        songs.add(new Song("Centerfold", "The J. Geils Band"));
        songs.add(new Song("(Just Like) Starting Over", " John Lennon"));
        songs.add(new Song("I Love Rock 'N Roll", "Joan Jett & the Blackhearts"));
        songs.add(new Song("Ebony And Ivory", "Paul McCartney and Stevie Wonder"));
        songs.add(new Song("That's What Friends Are For", "Dionne & Friends"));
        songs.add(new Song("Dionne & Friends", "Diana Ross"));
        songs.add(new Song("Abracadabra", "The Steve Miller Band"));
        songs.add(new Song("Billie Jean", "Michael Jackson"));
        songs.add(new Song("Say You, Say Me", "Lionel Richie"));
        songs.add(new Song("All Night Long (All Night)", "Lionel Richie"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list_song);

        listView.setAdapter(songAdapter);
    }
}