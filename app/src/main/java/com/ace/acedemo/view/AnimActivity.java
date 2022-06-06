package com.ace.acedemo.view;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.ace.acedemo.databinding.ActivityAnimBinding;
import com.ace.acedemo.utils.GlideUtil;

public class AnimActivity extends BaseActivity<ActivityAnimBinding>{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override
    public ActivityAnimBinding getView() {
        return ActivityAnimBinding.inflate(getLayoutInflater());
    }

    private void initView() {
        GlideUtil.loadBlurPic(this, mView.ivBg);
        mView.ivBg.setAlpha(0.3f);
    }
}
