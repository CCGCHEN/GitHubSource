package com.canter.lithodemo.component;

import android.graphics.Color;
import android.widget.ImageView;

import com.canter.lithodemo.R;
import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Image;
import com.facebook.litho.widget.Text;

import static com.facebook.yoga.YogaEdge.ALL;

/**
 * Description : 自定义组件
 * Creation    : 2019/12/10
 * Author      : cangui.ccg
 */
@LayoutSpec
public class HelloComponentSpec {
    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c, @Prop String name) {
        return Column.create(c)
                .child(Text.create(c)
                        .text("Hello, " + name)
                        .textSizeRes(R.dimen.text_size)
                        .textColor(Color.BLACK)
                        .paddingDip(ALL, 10)
                        .build())
                .child(Image.create(c)
                        .drawableRes(R.drawable.ic_launcher_background)
                        .scaleType(ImageView.ScaleType.CENTER_CROP)
                        .build())
                .build();
    }
}