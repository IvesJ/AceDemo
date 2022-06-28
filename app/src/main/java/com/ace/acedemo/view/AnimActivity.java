package com.ace.acedemo.view;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.ace.acedemo.anim.listener.AbsAnimationListener;
import com.ace.acedemo.anim.animator.ActivityAnimationHelper;
import com.ace.acedemo.databinding.ActivityAnimBinding;

public class AnimActivity extends BaseActivity<ActivityAnimBinding>{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public ActivityAnimBinding getView() {
        return ActivityAnimBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void onStart() {
        super.onStart();
        ActivityAnimationHelper.animScaleUp(this, getIntent());
    }

    @Override
    public void finish() {
        ActivityAnimationHelper.animScaleDown(this, new AbsAnimationListener() {
            @Override
            public void onAnimationEnd() {
                AnimActivity.super.finish();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
