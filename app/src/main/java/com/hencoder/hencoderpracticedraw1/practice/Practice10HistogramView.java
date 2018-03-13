package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint = new Paint();
    Rect rect = new Rect();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(100,100,100,600,mPaint);
        canvas.drawLine(100,600,1000,600,mPaint);

        mPaint.setColor(Color.GREEN);
        mPaint.setStyle(Paint.Style.FILL);
        rect.set(120,590,220,600);
        canvas.drawRect(rect,mPaint);
        rect.set(230,550,330,600);
        canvas.drawRect(rect,mPaint);
        rect.set(340,550,440,600);
        canvas.drawRect(rect,mPaint);
        rect.set(450,450,550,600);
        canvas.drawRect(rect,mPaint);
        rect.set(560,250,660,600);
        canvas.drawRect(rect,mPaint);
        rect.set(670,150,770,600);
        canvas.drawRect(rect,mPaint);
        rect.set(780,500,880,600);
        canvas.drawRect(rect,mPaint);



        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setTextSize(30);
        canvas.drawText("Froyo",120,630,mPaint);
        canvas.drawText("GB",255,630,mPaint);
        canvas.drawText("ICS",365,630,mPaint);
        canvas.drawText("JB",475,630,mPaint);
        canvas.drawText("KitKat",565,630,mPaint);
        canvas.drawText("L",705,630,mPaint);
        canvas.drawText("M",815,630,mPaint);


    }
}
