package com.example.mpopescu.musicstructure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SeventysHitsFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.song_list, container, false);

        TextView textView = view.findViewById(R.id.about);
        textView.setText(R.string.best_20_songs);

        textView.setOnClickListener(views ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://www.billboard.com/articles/news/6296842/billboard-hot-100-hits-1970s"
                ))));

        Button button = view.findViewById(R.id.go_back_button);
        button.setOnClickListener(views -> startActivity(
                new Intent(getActivity(), MainActivity.class)
        ));

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

        ListView listView = view.findViewById(R.id.list_song);
        listView.setAdapter(new SongAdapter(getActivity(), songs));

        return view;
    }
}
