package com.moudle.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

/**
 * LevelListDrawable    level-list 层级来设置，最先设置的在下方，后设置的在上方
 */
public class LevelDrawableActivity extends AppCompatActivity {

    private ImageView iv_level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        Button onBtn = findViewById(R.id.btn_on);
        Button offBtn = findViewById(R.id.btn_off);
        iv_level = findViewById(R.id.iv_level);

        onBtn.setOnClickListener(view -> iv_level.setImageLevel(15));

        offBtn.setOnClickListener(view -> iv_level.setImageLevel(10));

    }
}
