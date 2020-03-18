package com.example.soccerscore.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soccerscore.Model.Score;

import java.util.List;

public class ScoreViewModel extends ViewModel {

    private MutableLiveData<List<Score>> mScores;

    public LiveData<List<Score>> getScores(){
        return mScores;
    }
}
