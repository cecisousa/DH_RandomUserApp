package com.example.dh_randomuserapp.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.dh_randomuserapp.model.Result;
import com.example.dh_randomuserapp.repository.ProfileRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ProfileViewModel extends AndroidViewModel {

    private MutableLiveData<List<Result>> itemProfile = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private ProfileRepository repository = new ProfileRepository();

    public ProfileViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Result>> getItemProfile() {
        return this.itemProfile;
    }

    public void getPerfil() {
        disposable.add(
                repository.getProfile()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(profile -> {
                    itemProfile.setValue(profile.getResults());
                }, throwable -> {
                    Log.i("LOG", "Erro" + throwable.getMessage());
                })
        );
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }
}
