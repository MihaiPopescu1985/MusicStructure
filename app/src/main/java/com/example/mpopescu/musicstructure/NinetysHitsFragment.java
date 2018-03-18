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


public class NinetysHitsFragment extends Fragment {

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
                        "https://www.billboard.com/articles/news/6297023/billboard-hot-100-1990"
                ))));

        Button button = view.findViewById(R.id.go_back_button);
        button.setOnClickListener(views -> startActivity(
                new Intent(getActivity(), MainActivity.class)
        ));

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

        ListView listView = view.findViewById(R.id.list_song);
        listView.setAdapter(new SongAdapter(getActivity(), songs));

        return view;
    }
}
