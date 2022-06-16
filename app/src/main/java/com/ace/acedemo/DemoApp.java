package com.ace.acedemo;

import android.app.Application;
import android.content.Context;

public class DemoApp extends Application {

    private static DemoApp sAppContext;

    public DemoApp() {
        sAppContext = this;
    }

    public static Context getContext() {
        return sAppContext;
    }
}
