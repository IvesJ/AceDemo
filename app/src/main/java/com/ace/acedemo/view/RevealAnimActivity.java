package com.ace.acedemo.view;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.ace.acedemo.anim.view.RevealAnimLayout;
import com.ace.acedemo.databinding.ActivityRevealAnimBinding;

public class RevealAnimActivity extends BaseActivity<ActivityRevealAnimBinding> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mView.ralContainer.startAnim(RevealAnimLayout.AnimaType.Diagonal);
    }

    @Override
    public ActivityRevealAnimBinding getView() {
        return ActivityRevealAnimBinding.inflate(getLayoutInflater());
    }
}
