package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    Path mPath = new Path();
    Paint mPaint = new Paint();

    public Practice9DrawPathView(Context context) {
        super(context);
        initPath();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPath();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPath();
    }

    private void initPath() {

        mPath.arcTo(200,200,400,400,-225,250,false);
//        mPath.addArc(400,200,600,400,-180,250);
        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        mPath.lineTo(400,600);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeWidth(20);
//        mPath.lineTo(100,100);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(mPath,mPaint);


    }
}
