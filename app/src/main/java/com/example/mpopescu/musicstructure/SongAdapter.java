package com.example.mpopescu.musicstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Implements the SongAdapter used in the app
 */

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songList){
        super(context, 0, songList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if (listView == null){
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs, parent, false);
        }
        Song currentSong = getItem(position);

        TextView textView = listView.findViewById(R.id.song_title);
        textView.setText(currentSong.getTitle());

        textView = listView.findViewById(R.id.song_author);
        textView.setText(currentSong.getAuthor());

        return listView;
    }
}
