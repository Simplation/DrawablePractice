package com.moudle.app.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.R
import com.moudle.app.databinding.ActivityStateBinding

/**
 * StateListDrawable    selector   设置选择器，选中，获取焦点等
 */
class StateDrawableActivity : AppCompatActivity() {
    private lateinit var stateBinding: ActivityStateBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        stateBinding = ActivityStateBinding.inflate(layoutInflater)
        setContentView(stateBinding.root)

        stateBinding.ivLayer.setOnClickListener {
            stateBinding.ivLayer.setImageResource(R.drawable.ic_launcher_round)
        }
        Log.e(TAG, "LayerDrawableActivity:" + stateBinding.ivLayer.toString())
    }

    companion object {
        private const val TAG = "LayerDrawableActivity"
    }
}