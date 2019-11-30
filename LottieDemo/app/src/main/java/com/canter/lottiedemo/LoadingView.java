package com.canter.lottiedemo;

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
        lottieAnimationView.setAnimation("HamburgerArrow.json");
        lottieAnimationView.loop(true);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        lottieAnimationView.addColorFilter(new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP));
        lottieAnimationView.playAnimation();
    }
}
