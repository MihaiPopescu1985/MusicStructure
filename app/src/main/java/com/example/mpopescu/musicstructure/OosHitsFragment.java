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

public class OosHitsFragment extends Fragment {

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
                        "https://www.billboard.com/articles/news/6304098/billboard-hot-100-hits-2000s"
                ))));

        Button button = view.findViewById(R.id.go_back_button);
        button.setOnClickListener(views -> startActivity(
                new Intent(getActivity(), MainActivity.class)
        ));

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("We Belong Together", "Mariah Carey"));
        songs.add(new Song("Yeah!", "Usher Featuring Lil Jon & Ludacris"));
        songs.add(new Song("Low", "Flo Rida Featuring T-Pain"));
        songs.add(new Song("I Gotta Feeling", "The Black Eyed Peas"));
        songs.add(new Song("How You Remind Me", "Nickelback"));
        songs.add(new Song("No One", "Alicia Keys"));
        songs.add(new Song("Boom Boom Pow", "The Black Eyed Peas"));
        songs.add(new Song("Let Me Love You", "Mario"));
        songs.add(new Song("Gold Digger", "Kanye West Featuring Jamie Foxx"));
        songs.add(new Song("Apologize", "Timbaland Featuring OneRepublic"));
        songs.add(new Song("Dilemma", "Nelly Featuring Kelly Rowland"));
        songs.add(new Song("Family Affair", "Mary J. Blige "));
        songs.add(new Song("Big Girls Don't Cry", "Fergie"));
        songs.add(new Song("Maria Maria", "Santana Featuring The Product G&B"));
        songs.add(new Song("U Got It Bad", "Usher"));
        songs.add(new Song("Whatever You Like", "T.I."));
        songs.add(new Song("Bleeding Love", "Leona Lewis"));
        songs.add(new Song("Independent Women Part I", "Destiny's Child"));
        songs.add(new Song("Foolish", "Ashanti"));
        songs.add(new Song("Hey Ya!", "OutKast"));

        ListView listView = view.findViewById(R.id.list_song);
        listView.setAdapter(new SongAdapter(getActivity(), songs));

        return view;
    }
}
