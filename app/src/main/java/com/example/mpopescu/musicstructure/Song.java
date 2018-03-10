package com.example.mpopescu.musicstructure;

/**
 * Created by MPopescu on 10-Mar-18.
 */

public class Song {

    // Private fields
    private String mTitle;
    private String mAuthor;

    // Constructor
    public Song(String title, String author){
        mTitle = title;
        mAuthor = author;
    }
    // Getter methods
    public String getTitle(){
        return mTitle;
    }
    public String getAuthor(){
        return mAuthor;
    }
}
