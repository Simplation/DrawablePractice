package com.moudle.app.view

import android.graphics.*
import android.graphics.drawable.Drawable

import androidx.annotation.IntRange


/**
 * @作者: Simplation
 * @日期: 2021/6/29 10:13
 * @描述:
 * @更新:
 */
class CornerDrawable(bitmap: Bitmap) : Drawable() {
    private val mPaint: Paint

    private val mBitmap: Bitmap = bitmap
    private var rectF: RectF? = null

    init {
        val shader = BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
        mPaint = Paint()
        mPaint.isAntiAlias = true
        mPaint.shader = shader
    }

    override fun draw(canvas: Canvas) {
        canvas.drawRoundRect(rectF!!, 30f, 30f, mPaint)
    }

    override fun setBounds(left: Int, top: Int, right: Int, bottom: Int) {
        rectF = RectF(left.toFloat(), top.toFloat(), right.toFloat(), bottom.toFloat())
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

    override fun getIntrinsicWidth(): Int {
        return mBitmap.width
    }

    override fun getIntrinsicHeight(): Int {
        return mBitmap.height
    }
}