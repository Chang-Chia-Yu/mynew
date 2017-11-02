package com.example.asus.mynew;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class MyView extends View {

    public MyView(Context context) {
        super(context);
        init(null, 0);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
       img =  BitmapFactory.decodeResource(getResources(),R.drawable.supercali);
    }
    Bitmap img;
    int y = 1000;
    int x = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //canvas.drawColor(Color.GREEN);
        //canvas.drawBitmap(img,0,0,null);
        canvas.drawBitmap(img,x,y,null);

        x = x+10;
        y = y-30;

    }


}
