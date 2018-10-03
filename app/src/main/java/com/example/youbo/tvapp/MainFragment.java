package com.example.youbo.tvapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.app.BrowseFragment;
import android.util.Log;

/**
 * Created by youbo on 2018/10/1.
 */

public class MainFragment extends BrowseFragment {
    private static final String TAG = MainFragment.class.getSimpleName();
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"MainFragment onActivityCreated");
    }
}
