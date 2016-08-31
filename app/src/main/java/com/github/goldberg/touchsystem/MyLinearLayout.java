package com.github.goldberg.touchsystem;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by mengzhun on 2016/8/29.
 */
public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("MyLinearLayout", "MyLinearLayout:" + "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    int lastX;
    int lastY;

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

       Log.e("MyLinearLayout","MyLinearLayout:onInterceptTouchEvent");
        boolean intercepted = false;
        int x = (int) ev.getX();
        int y = (int) ev.getY();

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                intercepted = false;
                break;
            case MotionEvent.ACTION_MOVE:
                int deltaX = x - lastX;
                int deltaY = y - lastY;
                Log.e("MyLinearLayout","onInterceptTouchEvent:ACTION_MOVE");
                if (Math.abs(deltaX) > Math.abs(deltaY)) {
                    Log.e("MyLinearLayout","onInterceptTouchEvent:true");
                    intercepted = true;
                } else {
                    Log.e("MyLinearLayout","onInterceptTouchEvent:false");
                    intercepted = false;
                }

                break;
            case MotionEvent.ACTION_UP:
                intercepted = false;
                break;
            default:
                break;
        }
        lastX = x;
        lastY = y;
        return intercepted;
    }
}
