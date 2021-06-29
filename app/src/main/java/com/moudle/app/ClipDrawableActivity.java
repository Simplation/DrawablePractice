package com.moudle.app;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * ClipDrawable         clip  对图片进行裁剪操作
 */
public class ClipDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);

        ImageView iv_clip = findViewById(R.id.iv_clip);

        ClipDrawable clipDrawable = (ClipDrawable) iv_clip.getDrawable();
        clipDrawable.setLevel(8000);
    }
}
