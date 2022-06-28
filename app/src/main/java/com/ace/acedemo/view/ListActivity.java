package com.ace.acedemo.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;

import com.ace.acedemo.adapter.ListAdapter;
import com.ace.acedemo.anim.animator.CustomAnimationHelper;
import com.ace.acedemo.databinding.ActivityListBinding;
import com.ace.acedemo.decoration.ListItemDecoration;

public class ListActivity extends BaseActivity<ActivityListBinding> {

    private ListAdapter mListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override
    public ActivityListBinding getView() {
        return ActivityListBinding.inflate(getLayoutInflater());
    }

    private void initView() {
        mView.rvList.setLayoutManager(new GridLayoutManager(this, 2));
        mListAdapter = new ListAdapter(this);
        mListAdapter.setItemClickListener(new ListAdapter.AdapterItemClickListener() {
            @Override
            public void onClick(View view) {
                jumpActivity(view);
            }
        });

        mView.rvList.setAdapter(mListAdapter);
        mView.rvList.addItemDecoration(new ListItemDecoration());
    }

    private void jumpActivity(View view) {
//        Intent intent = new Intent(this, AnimActivity.class);
////        ActivityAnimationHelper.startActivityForResult(this, intent, view);
////        ActivityAnimationHelper.startActivity(this, intent, view);
//        CustomAnimationHelper.startActivity(this, intent, view);

        Intent intent = new Intent(this, RevealAnimActivity.class);
        startActivity(intent);
    }
}
