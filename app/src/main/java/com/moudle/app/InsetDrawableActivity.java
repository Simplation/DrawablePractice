package com.moudle.app;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

/**
 * InsetDrawable        inset   将一张图插入到另外一张图
 */
public class InsetDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inset);

        ImageView iv_inset = findViewById(R.id.iv_inset);

        Log.e("TAG", "InsetDrawableActivity.onCreate." + iv_inset.toString());

    }
}
