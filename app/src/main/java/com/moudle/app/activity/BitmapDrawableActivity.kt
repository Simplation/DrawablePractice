package com.moudle.app.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.databinding.ActivityBitmapBinding

/**
 * BitmapDrawable       bitmap 设置资源文件
 */
class BitmapDrawableActivity : AppCompatActivity() {
    private lateinit var bitmapBinding: ActivityBitmapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bitmapBinding = ActivityBitmapBinding.inflate(layoutInflater)
        setContentView(bitmapBinding.root)
        Log.e(TAG, "BitmapDrawableActivity.onCreate.${bitmapBinding.lin}")
    }

    companion object {
        private const val TAG = "BitmapDrawableActivity"
    }
}