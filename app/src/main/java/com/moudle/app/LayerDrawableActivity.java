package com.moudle.app;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * LayerDrawable        layer
 */
public class LayerDrawableActivity extends AppCompatActivity {

    private static final String TAG = "LayerDrawableActivity";
    private ImageView iv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer);
        iv = (ImageView) findViewById(R.id.iv_layer);

        Log.e(TAG, "LayerDrawableActivity:" + iv.toString());
    }
}
