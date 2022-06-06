package com.ace.acedemo.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

import com.ace.acedemo.databinding.ActivityBBinding;

public class TestBActivity extends BaseActivity<ActivityBBinding> {
    private ActivityBBinding mView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public ActivityBBinding getView() {
        return ActivityBBinding.inflate(getLayoutInflater());
    }
}
