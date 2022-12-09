package com.example.culturise.ui.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavoritesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FavoritesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Jouw favorieten activiteiten komen hier te staan :)");
    }

    public LiveData<String> getText() {
        return mText;
    }
}