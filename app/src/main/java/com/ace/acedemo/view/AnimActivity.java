package com.ace.acedemo.view;

import android.os.Bundle;
import android.transition.Explode;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;

import com.ace.acedemo.R;
import com.ace.acedemo.anim.AbsAnimationListener;
import com.ace.acedemo.anim.ActivityAnimationHelper;
import com.ace.acedemo.databinding.ActivityAnimBinding;
import com.ace.acedemo.utils.ResourceUtil;

public class AnimActivity extends BaseActivity<ActivityAnimBinding>{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWindow();
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

    private void initWindow() {
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.width = (int) ResourceUtil.getDimens(R.dimen.dialog_size);
        layoutParams.height = (int) ResourceUtil.getDimens(R.dimen.dialog_size);
        getWindow().setAttributes(layoutParams);
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
