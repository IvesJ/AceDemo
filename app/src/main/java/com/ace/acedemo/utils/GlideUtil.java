package com.ace.acedemo.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class GlideUtil {
    private static final String sPicUrl = "https://tse1-mm.cn.bing.net/th/id/R-C.2f41aeef425e4d6856510379fc425d6f?rik=hEhqDE0QnQ3N%2bA&riu=http%3a%2f%2fwww.pp3.cn%2fuploads%2f1212qxn%2f964.jpg&ehk=43fBPX%2bIg7ERzAp%2fzAVjS7AXrApw9OIQVQmB55UJzw4%3d&risl=&pid=ImgRaw&r=0";

    public static void loadBlurPic(Context context, ImageView imageView) {
        Glide.with(context)
                .load(sPicUrl)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .apply(RequestOptions.bitmapTransform(new BlurTransformation(25, 8)))
                .into(imageView);
    }
}
