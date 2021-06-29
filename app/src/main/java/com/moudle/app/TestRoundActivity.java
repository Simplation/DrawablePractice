package com.moudle.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.moudle.app.view.RoundDrawable;

/**
 * 测试圆形图片
 */
public class TestRoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_round);

        ImageView iv_head = findViewById(R.id.iv_head);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.iv_scape);

        iv_head.setImageDrawable(new RoundDrawable(bitmap));
    }
}
