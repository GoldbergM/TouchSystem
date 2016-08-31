package com.github.goldberg.touchsystem;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by mengzhun on 2016/8/26.
 */
public class MyImageView  extends ImageView{
    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    public MyImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("ontouch", "MyImageView:dispatchTouchEvent" + event.getAction() + "");
        return super.dispatchTouchEvent(event);
    }
}
