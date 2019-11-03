
package com.example.dh_randomuserapp.model;

import com.google.gson.annotations.Expose;


public class Picture {

    @Expose
    private String large;
    @Expose
    private String medium;
    @Expose
    private String thumbnail;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
