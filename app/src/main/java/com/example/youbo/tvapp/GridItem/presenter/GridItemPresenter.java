package com.example.youbo.tvapp.GridItem.presenter;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v17.leanback.widget.Presenter;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.youbo.tvapp.R;

/**
 * Created by youbo on 2018/10/3.
 * GridItemPresenter 实现
 */

public class GridItemPresenter extends Presenter {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        TextView textView = new TextView(parent.getContext());
        Resources resources = parent.getResources();
        int width = resources.getDimensionPixelOffset(R.dimen.grid_item_width);
        int height = resources.getDimensionPixelOffset(R.dimen.grid_item_height);
        textView.setLayoutParams(new ViewGroup.LayoutParams(width,height));
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(false);
        textView.setBackgroundColor(ContextCompat.getColor(parent.getContext(),R.color.default_background));
        textView.setTextColor(Color.WHITE);
        textView.setGravity(Gravity.CENTER);
        return new ViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        ((TextView)viewHolder.view).setText((String)item);
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {

    }
}
