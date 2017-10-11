package com.moudle.app;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * ClipDrawable         clip  对图片进行裁剪操作
 */
public class ClipDrawableActivity extends AppCompatActivity {

    private ImageView iv_clip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);

        iv_clip = (ImageView) findViewById(R.id.iv_clip);

        ClipDrawable clipDrawable = (ClipDrawable) iv_clip.getDrawable();
        clipDrawable.setLevel(8000);
    }
}
