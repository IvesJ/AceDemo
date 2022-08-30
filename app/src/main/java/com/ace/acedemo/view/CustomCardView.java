package com.ace.acedemo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.ace.acedemo.R;

public class CustomCardView extends ConstraintLayout {
    private ImageView mIvIcon;
    private TextView mTvMainContent;
    private TextView mTvSubContent;

    private Drawable mIcon;
    private String mMainContent;
    private String mSubContent;
    private int mHorizontalInterval;
    private int mVerticalInterval;
    private boolean mHasSub;

    public CustomCardView(@NonNull Context context) {
        super(context);
        init(context, null);
    }

    public CustomCardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public CustomCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_custom_card_layout, this, true);
        mIvIcon = view.findViewById(R.id.iv_icon);
        mTvMainContent = view.findViewById(R.id.tv_main_content);
        mTvSubContent = view.findViewById(R.id.tv_sub_content);

        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomCardView);
            mIcon               = a.getDrawable(R.styleable.CustomCardView_icon);
            mMainContent        = a.getString(R.styleable.CustomCardView_main_text);
            mSubContent         = a.getString(R.styleable.CustomCardView_sub_text);
            mHorizontalInterval = a.getDimensionPixelSize(R.styleable.CustomCardView_horizontal_interval, 48);
            mVerticalInterval   = a.getDimensionPixelSize(R.styleable.CustomCardView_vertical_interval, 6);
            mHasSub             = a.getBoolean(R.styleable.CustomCardView_hasSub, false);

            if (mIcon != null) {
                mIvIcon.setImageDrawable(mIcon);
            }
            if (!TextUtils.isEmpty(mMainContent)) {
                mTvMainContent.setText(mMainContent);
            }
            if (!TextUtils.isEmpty(mSubContent)) {
                mTvSubContent.setText(mSubContent);
            }
            LinearLayout.LayoutParams lpMain = (LinearLayout.LayoutParams) mTvMainContent.getLayoutParams();
            lpMain.setMarginStart(mHorizontalInterval);
            mTvMainContent.setLayoutParams(lpMain);

            if (mHasSub) {
                mTvSubContent.setVisibility(VISIBLE);
                LinearLayout.LayoutParams lpSub = (LinearLayout.LayoutParams) mTvSubContent.getLayoutParams();
                lpSub.setMargins(0, mVerticalInterval, 0, 0);
                lpSub.setMarginStart(mHorizontalInterval);
                mTvSubContent.setLayoutParams(lpSub);
            } else {
                mTvSubContent.setVisibility(GONE);
            }
        }
    }
}
