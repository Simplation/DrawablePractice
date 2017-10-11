package com.moudle.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * BitmapDrawable       bitmap 设置资源文件
 */
public class BitmapDrawableActivity extends AppCompatActivity {

    private static final String TAG = "BitmapDrawableActivity";
    private LinearLayout lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap);

        lin = (LinearLayout) findViewById(R.id.lin);

        Log.e(TAG, "BitmapDrawableActivity.onCreate." + lin.toString());

    }
}
