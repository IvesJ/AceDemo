package com.ace.acedemo.decoration;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ace.acedemo.R;
import com.ace.acedemo.utils.ResourceUtil;

public class ListItemDecoration extends RecyclerView.ItemDecoration {
    public ListItemDecoration() {

    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left = (int) ResourceUtil.getDimens(R.dimen.item_interval);
        outRect.top = (int) ResourceUtil.getDimens(R.dimen.item_interval);
        outRect.right = (int) ResourceUtil.getDimens(R.dimen.item_interval);
        outRect.bottom = (int) ResourceUtil.getDimens(R.dimen.item_interval);
    }
}
