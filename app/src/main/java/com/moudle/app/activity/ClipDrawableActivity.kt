package com.moudle.app.activity

import android.graphics.drawable.ClipDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.databinding.ActivityClipBinding

/**
 * ClipDrawable         clip  对图片进行裁剪操作
 */
class ClipDrawableActivity : AppCompatActivity() {
    private lateinit var clipBinding: ActivityClipBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        clipBinding = ActivityClipBinding.inflate(layoutInflater)
        setContentView(clipBinding.root)

        val clipDrawable = clipBinding.ivClip.drawable as ClipDrawable
        clipDrawable.level = 8000
    }
}