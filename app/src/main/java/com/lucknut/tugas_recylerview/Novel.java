package com.lucknut.tugas_recylerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Novel implements Parcelable {
    private int poster;
    private String name;
    private String description;

    public Novel(int poster, String name, String description) {
        this.poster = poster;
        this.name = name;
        this.description = description;
    }

    protected Novel(Parcel in){
        poster = in.readInt();
        name =  in.readString();
        description = in.readString();
    }

    public static final Creator<Novel> CREATOR = new Creator<Novel>(){

        @Override
        public Novel createFromParcel(Parcel in) {
            return new Novel(in);
        }

        @Override
        public Novel[] newArray(int size) {
            return new Novel[size];
        }
    };
    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(poster);
        parcel.writeString(name);
        parcel.writeString(description);
    }
}
