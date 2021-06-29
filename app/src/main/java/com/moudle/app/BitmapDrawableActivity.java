package com.moudle.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * BitmapDrawable       bitmap 设置资源文件
 */
public class BitmapDrawableActivity extends AppCompatActivity {

    private static final String TAG = "BitmapDrawableActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap);

        LinearLayout lin = findViewById(R.id.lin);

        Log.e(TAG, "BitmapDrawableActivity.onCreate." + lin.toString());

    }
}
