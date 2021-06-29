package com.moudle.app;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

/**
 * TransitionDrawable   translation 设置图片更换渐变样式
 */
public class TranslationDrawableActivity extends AppCompatActivity {

    private ImageView iv_trans;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        iv_trans = findViewById(R.id.iv_trans);
        Button onBtn = findViewById(R.id.btn_on);
        Button offBtn = findViewById(R.id.btn_off);

        onBtn.setOnClickListener(view -> {
            TransitionDrawable trans = (TransitionDrawable) iv_trans.getDrawable();
            trans.startTransition(1500);
        });

        offBtn.setOnClickListener(view -> {
            TransitionDrawable trans = (TransitionDrawable) iv_trans.getDrawable();
            trans.reverseTransition(1500);
        });

    }
}
