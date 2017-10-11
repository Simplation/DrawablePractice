package com.moudle.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.moudle.app.view.CornerDrawable;
import com.moudle.app.view.RoundDrawable;

/**
 * 测试圆形图片
 */
public class TestRoundActivity extends AppCompatActivity {

    private ImageView iv_head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_round);

        iv_head = (ImageView) findViewById(R.id.iv_head);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image_head);

        iv_head.setImageDrawable(new RoundDrawable(bitmap));
    }
}
