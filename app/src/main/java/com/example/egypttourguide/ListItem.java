package com.example.egypttourguide;

public class ListItem {

    /** Default translation for the word */
    private String mTitle;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public ListItem(String title) {
        mTitle = title;
    }


    public ListItem(String title,int imageResourceId) {
        mTitle = title;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    @Override
    public String toString() {
        return "List Item {" +
                "Title='" + mTitle + '\'' +
                ", ImageResourceId=" + mImageResourceId +
                '}';
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}