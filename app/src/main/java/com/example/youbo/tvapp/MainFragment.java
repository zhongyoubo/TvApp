package com.example.youbo.tvapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.app.BrowseFragment;
import android.support.v17.leanback.widget.ArrayObjectAdapter;
import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ListRowPresenter;
import android.util.Log;

import com.example.youbo.tvapp.GridItem.presenter.GridItemPresenter;

/**
 * Created by youbo on 2018/10/1.
 * 左侧的每个标题都有一个内容行，内容将以网格结构对齐,这个标题 - 内容行关系是一对一的
 */

public class MainFragment extends BrowseFragment {
    private static final String TAG = MainFragment.class.getSimpleName();

    private ArrayObjectAdapter mCategoryRowAdater = null;
    private GridItemPresenter mGridItemPresenter = null;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"MainFragment onActivityCreated");
        setUIElements();

        //创建一个ArrayObjectAdapter，用于添加不同ListRow（标题-内容对或者Category）
        mCategoryRowAdater = new ArrayObjectAdapter(new ListRowPresenter());
        loadGridItemRows();
        //set Adater
        setAdapter(mCategoryRowAdater);
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

    /**
     * 添加Grid Item中的数据
     */
    private void loadGridItemRows(){
        // GridItemPresenter
        HeaderItem gridItemPresenterHeader = new HeaderItem(0,"GridItemPresenter");
        mGridItemPresenter = new GridItemPresenter();
        ArrayObjectAdapter gridRowAdater = new ArrayObjectAdapter(mGridItemPresenter);
        gridRowAdater.add("Grid Item 1");
        gridRowAdater.add("Grid Item 2");
        gridRowAdater.add("Grid Item 3");
        gridRowAdater.add("Grid Item 4");
        //ListRow = HeaderItem + ArrayObjectAdater(RowsAdater):即ListRow由HeaderItem和ArrayObjectAdater构成
        //eg: gridListRow = gridItemPresenterHeader + gridRowAdater
        ListRow gridListRow = new ListRow(gridItemPresenterHeader,gridRowAdater);
        mCategoryRowAdater.add(gridListRow);
    }
}
