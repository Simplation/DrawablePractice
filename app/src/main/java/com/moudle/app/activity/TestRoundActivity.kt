package com.moudle.app.activity

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.R
import com.moudle.app.databinding.ActivityTestRoundBinding
import com.moudle.app.view.RoundDrawable

/**
 * 测试圆形图片
 */
class TestRoundActivity : AppCompatActivity() {
    private lateinit var roundBinding: ActivityTestRoundBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        roundBinding = ActivityTestRoundBinding.inflate(layoutInflater)
        setContentView(roundBinding.root)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.iv_scape)
        roundBinding.ivHead.setImageDrawable(RoundDrawable(bitmap))
    }
}