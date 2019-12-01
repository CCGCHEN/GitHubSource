package com.canter.lottiedemo;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.os.Build;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.SimpleColorFilter;

/**
 * Description :
 * Creation    : 2019/11/27
 * Author      : cangui.ccg
 */
public class LoadingView extends FrameLayout {

    private LottieAnimationView lottieAnimationView;

    public LoadingView(Context context) {
        super(context);
        lottieAnimationView = new LottieAnimationView(getContext());
        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1000);
        layoutParams.gravity = Gravity.CENTER;
        addView(lottieAnimationView, layoutParams);
//        lottieAnimationView.setAnimation("HamburgerArrow.json");
        lottieAnimationView.setImageAssetsFolder("images");
        lottieAnimationView.setAnimation("WeAccept.json");
        lottieAnimationView.loop(true);
        //设置播放速度
//        lottieAnimationView.setSpeed(10);
        //设置播放进度，浮点数，表示从整理的百分之多少开始播放。
        lottieAnimationView.setProgress(0.9f);
//        lottieAnimationView.addColorFilter(new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP));
//        lottieAnimationView.addColorFilterToContent();
//        lottieAnimationView.addColorFilterToLayer("MASTER", new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP));
        lottieAnimationView.addColorFilterToLayer("BG",  new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP));

        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

            }
        });
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        lottieAnimationView.playAnimation();
    }
}
