package com.example.tardikart1;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mText;
    private String mImageURL;
    private  String mKey;

    public Upload(){
        //empty constructor
    }

    public Upload(String text, String imageURL){
        if (text.trim().equals("")) {
            text = "Untitled";
        }

        mText = text;
        mImageURL = imageURL;
    }

    public String getText() {
        return  mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getImageURL() {
        return mImageURL;
    }

    public void setImageURL(String imageURL) {
        mImageURL = imageURL;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }
}
