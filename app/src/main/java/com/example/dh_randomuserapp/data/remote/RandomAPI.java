package com.example.dh_randomuserapp.data.remote;

import com.example.dh_randomuserapp.model.Profile;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RandomAPI {

    @GET("api")
    Observable<Profile> getAllProfiles();
}
