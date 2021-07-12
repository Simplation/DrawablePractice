package com.moudle.app

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.moudle.app.activity.*
import com.moudle.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        initClick()
    }

    /**
     * 设置点击事件
     */
    private fun initClick() {

        mainBinding.apply {
            testRound.setOnClickListener(mOnClickListener)
            testCorner.setOnClickListener(mOnClickListener)
            testRound.setOnClickListener(mOnClickListener)
            bitmapDrawable.setOnClickListener(mOnClickListener)
            clipDrawable.setOnClickListener(mOnClickListener)
            insetDrawable.setOnClickListener(mOnClickListener)
            layerDrawable.setOnClickListener(mOnClickListener)
            levelDrawable.setOnClickListener(mOnClickListener)
            stateDrawable.setOnClickListener(mOnClickListener)
            translationDrawable.setOnClickListener(mOnClickListener)
        }



    }

    /**
     * 跳转
     */
    private val mOnClickListener = View.OnClickListener { v: View ->
        when (v.id) {
            R.id.test_corner -> nextInto(this, TestCornerActivity().javaClass)
            R.id.test_round -> nextInto(this, TestRoundActivity().javaClass)
            R.id.bitmap_drawable -> nextInto(this, BitmapDrawableActivity().javaClass)
            R.id.clip_drawable -> nextInto(this, ClipDrawableActivity().javaClass)
            R.id.inset_drawable -> nextInto(this, InsetDrawableActivity().javaClass)
            R.id.layer_drawable -> nextInto(this, LayerDrawableActivity().javaClass)
            R.id.level_drawable -> nextInto(this, LevelDrawableActivity().javaClass)
            R.id.state_drawable -> nextInto(this, StateDrawableActivity().javaClass)
            R.id.translation_drawable -> nextInto(this, TranslationDrawableActivity().javaClass)
        }
    }

    /**
     * 跳转的方法
     */
    private fun nextInto(context: Context, clazz: Class<Any>) {
        val intent = Intent()
        intent.setClass(context, clazz)
        startActivity(intent)
    }
}