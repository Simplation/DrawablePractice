package com.moudle.app.activity

import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.databinding.ActivityTranslationBinding

/**
 * TransitionDrawable   translation 设置图片更换渐变样式
 */
class TranslationDrawableActivity : AppCompatActivity() {
    private lateinit var translateBinding:ActivityTranslationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        translateBinding = ActivityTranslationBinding.inflate(layoutInflater)
        setContentView(translateBinding.root)


        translateBinding.btnOn.setOnClickListener {
            val trans = translateBinding.ivTrans.drawable as TransitionDrawable
            trans.startTransition(1500)
        }

        translateBinding.btnOff.setOnClickListener {
            val trans = translateBinding.ivTrans.drawable as TransitionDrawable
            trans.reverseTransition(1500)
        }
    }
}