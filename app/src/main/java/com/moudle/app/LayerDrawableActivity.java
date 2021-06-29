package com.moudle.app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * LayerDrawable        layer
 */
public class LayerDrawableActivity extends AppCompatActivity {

    private static final String TAG = "LayerDrawableActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer);
        ImageView iv = findViewById(R.id.iv_layer);

        Log.e(TAG, "LayerDrawableActivity:" + iv.toString());
    }
}
