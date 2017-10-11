package com.moudle.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * LevelListDrawable    level-list 层级来设置，最先设置的在下方，后设置的在上方
 */
public class LevelDrawableActivity extends AppCompatActivity {

    private Button onBtn, offBtn;
    private ImageView iv_level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        onBtn = (Button) findViewById(R.id.btn_on);
        offBtn = (Button) findViewById(R.id.btn_off);
        iv_level = (ImageView) findViewById(R.id.iv_level);

        onBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_level.setImageLevel(15);
            }
        });

        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_level.setImageLevel(10);
            }
        });

    }
}
