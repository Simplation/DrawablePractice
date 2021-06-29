package com.moudle.app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * StateListDrawable    selector   设置选择器，选中，获取焦点等
 */
public class StateDrawableActivity extends AppCompatActivity {

    private static final String TAG = "LayerDrawableActivity";
    private ImageView iv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        iv = findViewById(R.id.iv_layer);
        iv.setOnClickListener(view -> iv.setImageResource(R.drawable.ic_launcher_round));

        Log.e(TAG, "LayerDrawableActivity:" + iv.toString());
    }
}
