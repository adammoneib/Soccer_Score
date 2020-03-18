package com.example.soccerscore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.soccerscore.Model.Score;

import java.util.ArrayList;
import java.util.List;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHolder> {

    private Context mContext;
    private List<Score> mScores;

    public ScoreAdapter(Context context, List<Score> scores) {
        this.mContext = context;
        mScores = scores;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.score_listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.homeTeam.setText(mScores.get(position).getHomeName());
        holder.awayTeam.setText(mScores.get(position).getAwayName());
    }

    @Override
    public int getItemCount() {
        return mScores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView homeTeam;
        TextView awayTeam;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            homeTeam = itemView.findViewById(R.id.home_team);
            awayTeam = itemView.findViewById(R.id.away_team);
            parentLayout = itemView.findViewById(R.id.score_parent);
        }
    }
}
