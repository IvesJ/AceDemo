package com.ace.acedemo.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActivity<V extends ViewBinding> extends AppCompatActivity {
    protected V mView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = getView();
        setContentView(mView.getRoot());
    }

    public abstract V getView();
}
