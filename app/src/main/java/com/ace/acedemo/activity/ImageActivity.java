package com.ace.acedemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.ace.acedemo.databinding.ActivityImageBinding;

public class ImageActivity extends BaseActivity<ActivityImageBinding>{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override
    public ActivityImageBinding getView() {
        return ActivityImageBinding.inflate(getLayoutInflater());
    }

    private void initView() {
        mView.btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ImageActivity.this, AnimActivity.class);
                startActivity(jump);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
