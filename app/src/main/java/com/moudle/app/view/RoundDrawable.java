package com.moudle.app.view;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * 自定义圆形图片
 */
public class RoundDrawable extends Drawable {

    private final Paint mPaint;
    private final int mWidth;

    public RoundDrawable(Bitmap bitmap) {

        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(bitmapShader);

        mWidth = Math.min(bitmap.getWidth(), bitmap.getHeight());
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        canvas.drawCircle(mWidth >> 1, mWidth >> 2, mWidth >> 2, mPaint);
    }

    @Override
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        mPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    @Override
    public int getIntrinsicHeight() {
        return mWidth;
    }

    @Override
    public int getIntrinsicWidth() {
        return mWidth;
    }
}
