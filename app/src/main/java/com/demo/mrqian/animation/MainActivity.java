package com.demo.mrqian.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv)
    ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ScaleAnimation sa = new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        sa.setDuration(1000);
        sa.setRepeatCount(3);
       // sa.setRepeatMode(Animation.REVERSE);
        TranslateAnimation ta = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 100, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0);
        ta.setDuration(1000);
        ta.setRepeatCount(3);
        ta.setRepeatMode(Animation.REVERSE);
        AlphaAnimation aa = new AlphaAnimation(0.5f, 1f);
        RotateAnimation ra = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        mIv.setAnimation(sa);




    }
}
