package com.moudle.app.view

import android.graphics.*
import android.graphics.drawable.Drawable
import androidx.annotation.IntRange

/**
 * @作者: Simplation
 * @日期: 2021/6/29 10:45
 * @描述:
 * @更新:
 */
class RoundDrawable(bitmap: Bitmap) : Drawable() {
    private val mPaint: Paint
    private val mBitmap: Bitmap = bitmap
    private val mWidth: Int

    init {
        val bitmapShader = BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
        mPaint = Paint()
        mPaint.isAntiAlias = true
        mPaint.shader = bitmapShader
        mWidth = mBitmap.width.coerceAtMost(mBitmap.height)
    }

    override fun draw(canvas: Canvas) {
        canvas.drawCircle(
            (mWidth / 2).toFloat(),
            (mWidth / 2).toFloat(),
            (mWidth / 2).toFloat(),
            mPaint
        )
    }

    override fun setAlpha(@IntRange(from = 0, to = 255) i: Int) {
        mPaint.alpha = i
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        mPaint.colorFilter = colorFilter
    }

    override fun getOpacity(): Int {
        return PixelFormat.TRANSLUCENT
    }

    override fun getIntrinsicHeight(): Int {
        return mWidth
    }

    override fun getIntrinsicWidth(): Int {
        return mWidth
    }
}