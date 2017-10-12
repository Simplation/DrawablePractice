package com.moudle.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.moudle.app.view.CornerDrawable;

/**
 * 测试圆角图片
 */
public class TestCornerActivity extends AppCompatActivity {

    private ImageView iv_head_corner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_corner);

        iv_head_corner = (ImageView) findViewById(R.id.iv_head_corner);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.iv_scape);

        iv_head_corner.setImageDrawable(new CornerDrawable(bitmap));
    }
}
