
package com.example.dh_randomuserapp.model;

import com.google.gson.annotations.Expose;


public class Id {

    @Expose
    private String name;
    @Expose
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
