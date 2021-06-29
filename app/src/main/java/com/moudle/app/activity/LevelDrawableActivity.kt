package com.moudle.app.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.moudle.app.databinding.ActivityLevelBinding

/**
 * LevelListDrawable    level-list 层级来设置，最先设置的在下方，后设置的在上方
 */
class LevelDrawableActivity : AppCompatActivity() {
    private lateinit var levelBinding: ActivityLevelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        levelBinding = ActivityLevelBinding.inflate(layoutInflater)
        setContentView(levelBinding.root)

        levelBinding.btnOn.setOnClickListener { levelBinding.ivLevel.setImageLevel(15) }
        levelBinding.btnOff.setOnClickListener { levelBinding.ivLevel.setImageLevel(10) }
    }
}