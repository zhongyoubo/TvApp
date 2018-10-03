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
        setUIElements();
    }

    /**
     * 设置应用的title或者图标
     * 左侧颜色
     */
    private void setUIElements(){
        //展示在标题栏上的图片(图片如果显示会隐藏标题Title)
        //setBadgeDrawable(getActivity().getResources().getDrawable(R.drawable.app_icon_your_company));
        setTitle("Android TV APP");//设置标题栏Title
        //HEADERS_ENABLED 显示左侧导航栏，HEADERS_DISABLED 不显示 HEADERS_HIDDEN 隐藏，到边缘按左键还能显示
        setHeadersState(HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);
        // 设置快速导航（或 headers) 背景色
        setBrandColor(getResources().getColor(R.color.fastlane_background, null));
        // 设置搜索的颜色
        setSearchAffordanceColor(getResources().getColor(R.color.search_opaque,null));
    }
}
