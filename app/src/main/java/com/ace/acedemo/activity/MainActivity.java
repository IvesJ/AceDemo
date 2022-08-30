package com.ace.acedemo.activity;

import android.os.Bundle;

import com.ace.acedemo.R;
import com.ace.acedemo.databinding.ActivityBBinding;
import com.ace.acedemo.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public ActivityMainBinding getView() {
        return null;
    }


}