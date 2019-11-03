package com.example.dh_randomuserapp.repository;

import com.example.dh_randomuserapp.model.Profile;

import io.reactivex.Observable;

import static com.example.dh_randomuserapp.data.remote.RetrofitService.getApiService;

public class ProfileRepository {

    public Observable<Profile> getProfile(){
        return getApiService().getAllProfiles();
    }
}
