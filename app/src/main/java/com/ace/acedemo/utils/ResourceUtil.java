package com.ace.acedemo.utils;

import com.ace.acedemo.DemoApp;

public class ResourceUtil {

    public static float getDimens(int resId) {
        return DemoApp.getContext().getResources().getDimension(resId);
    }
}
