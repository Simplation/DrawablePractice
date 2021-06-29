package com.moudle.app.activity

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.R
import com.moudle.app.databinding.ActivityTestCornerBinding
import com.moudle.app.view.CornerDrawable

/**
 * 测试圆角图片
 */
class TestCornerActivity : AppCompatActivity() {

    private lateinit var cornerBinding: ActivityTestCornerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cornerBinding = ActivityTestCornerBinding.inflate(layoutInflater)
        setContentView(cornerBinding.root)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.iv_scape)
        cornerBinding.ivHeadCorner.setImageDrawable(CornerDrawable(bitmap))
    }
}