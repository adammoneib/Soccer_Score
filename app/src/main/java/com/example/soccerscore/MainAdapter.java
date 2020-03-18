package com.example.soccerscore;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.soccerscore.View.VideoListFragment;

public class MainAdapter extends FragmentPagerAdapter {

    com.example.soccerscore.View.ScoreListFragment scoreListFragment;
    VideoListFragment videoListFragment;


    public MainAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[] {"Scores", "Live Matches"};

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            scoreListFragment = new com.example.soccerscore.View.ScoreListFragment();
            return scoreListFragment;
        }
        else {
            videoListFragment = new VideoListFragment();
            return videoListFragment;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}


