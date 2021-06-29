package com.moudle.app.activity

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.databinding.ActivityInsetBinding

/**
 * InsetDrawable        inset   将一张图插入到另外一张图
 */
class InsetDrawableActivity : AppCompatActivity() {
    private lateinit var insetBinding: ActivityInsetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        insetBinding = ActivityInsetBinding.inflate(layoutInflater)
        setContentView(insetBinding.root)

        Log.e("TAG", "InsetDrawableActivity.onCreate. - ${insetBinding.ivInset}")
    }
}