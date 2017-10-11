package com.moudle.app;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * TransitionDrawable   translation 设置图片更换渐变样式
 */
public class TranslationDrawableActivity extends AppCompatActivity {

    private Button onBtn, offBtn;
    private ImageView iv_trans;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        iv_trans = (ImageView) findViewById(R.id.iv_trans);
        onBtn = (Button) findViewById(R.id.btn_on);
        offBtn = (Button) findViewById(R.id.btn_off);

        onBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionDrawable trans = (TransitionDrawable) iv_trans.getDrawable();
                trans.startTransition(1500);
            }
        });

        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionDrawable trans = (TransitionDrawable) iv_trans.getDrawable();
                trans.reverseTransition(1500);
            }
        });

    }
}
