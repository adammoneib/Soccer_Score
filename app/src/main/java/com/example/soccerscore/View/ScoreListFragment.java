package com.example.soccerscore.View;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soccerscore.Model.Score;
import com.example.soccerscore.R;
import com.example.soccerscore.ScoreAdapter;
import com.example.soccerscore.ViewModel.ScoreViewModel;

import java.util.ArrayList;


public class ScoreListFragment extends Fragment {

    private RecyclerView mScoreRecycler;
    private ScoreAdapter mScoreAdapter;
    private ScoreViewModel mScoreVM;


    public ScoreListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mScoreRecycler = getActivity().findViewById(R.id.score_recycler);
        mScoreVM
        initRecyclerView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_score_list, container, false);
    }


    //TODO: change arrayList
    private void initRecyclerView(){
        mScoreAdapter = new ScoreAdapter(getContext(), mScoreVM.getScores().getValue());
        mScoreRecycler.setAdapter(mScoreAdapter);
    }
}
