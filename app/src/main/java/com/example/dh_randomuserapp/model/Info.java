
package com.example.dh_randomuserapp.model;

import com.google.gson.annotations.Expose;


public class Info {

    @Expose
    private Long page;
    @Expose
    private Long results;
    @Expose
    private String seed;
    @Expose
    private String version;

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getResults() {
        return results;
    }

    public void setResults(Long results) {
        this.results = results;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
