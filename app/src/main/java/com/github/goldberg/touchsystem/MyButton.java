package com.github.goldberg.touchsystem;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by mengzhun on 2016/8/26.
 */
public class MyButton  extends Button{
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("ontouch", "MyButton:dispatchTouchEvent" + event.getAction() + "");
        return super.dispatchTouchEvent(event);
    }
}
