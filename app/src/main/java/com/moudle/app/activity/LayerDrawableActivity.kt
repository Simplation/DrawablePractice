package com.moudle.app.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.databinding.ActivityLayerBinding

/**
 * LayerDrawable        layer
 */
class LayerDrawableActivity : AppCompatActivity() {
    private lateinit var layerBinding: ActivityLayerBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layerBinding = ActivityLayerBinding.inflate(layoutInflater)
        setContentView(layerBinding.root)

        Log.e(TAG, "LayerDrawableActivity:${layerBinding.ivLayer}")
    }

    companion object {
        private const val TAG = "LayerDrawableActivity"
    }
}