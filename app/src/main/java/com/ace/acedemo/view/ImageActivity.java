package com.ace.acedemo.view;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.ace.acedemo.databinding.ActivityImageBinding;
import com.ace.acedemo.utils.GlideUtil;

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
        GlideUtil.loadBlurPic(this, mView.ivPic);
        mView.ivPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jump = new Intent(ImageActivity.this, AnimActivity.class);
                startActivity(jump, ActivityOptions.makeSceneTransitionAnimation(ImageActivity.this,
                        mView.ivPic, "shareImg").toBundle());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
