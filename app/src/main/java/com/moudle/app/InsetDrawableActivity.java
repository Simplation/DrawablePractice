package com.moudle.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * InsetDrawable        inset   将一张图插入到另外一张图
 */
public class InsetDrawableActivity extends AppCompatActivity {

    private ImageView iv_inset;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inset);

        iv_inset = (ImageView) findViewById(R.id.iv_inset);

        Log.e("TAG", "InsetDrawableActivity.onCreate." + iv_inset.toString());

    }
}
