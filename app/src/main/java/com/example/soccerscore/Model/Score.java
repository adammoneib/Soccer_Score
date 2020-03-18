package com.example.soccerscore.Model;

import com.google.gson.annotations.SerializedName;

public class Score {

    @SerializedName("home_name")
    String homeName;
    @SerializedName("away_name")
    String awayName;
    @SerializedName("score")
    String currentScore;
    @SerializedName("time")
    int time;
    @SerializedName("league_name")
    String leagueName;

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getAwayName() {
        return awayName;
    }

    public void setAwayName(String awayName) {
        this.awayName = awayName;
    }

    public String getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(String currentScore) {
        this.currentScore = currentScore;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
