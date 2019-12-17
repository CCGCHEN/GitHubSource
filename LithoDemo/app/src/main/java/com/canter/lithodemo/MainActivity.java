package com.canter.lithodemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.widget.FrameLayout;

import com.canter.lithodemo.component.ListSection;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;
import com.facebook.litho.widget.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        final ComponentContext context = new ComponentContext(this);
//        final Component component = Text.create(context)
//                .text("Hello World")
//                .textSizeDip(50)
//                .build();
//        setContentView(LithoView.create(context, component));

//        ComponentContext context = new ComponentContext(this);
//        final Text.Builder builder = Text.create(context);
//        final Component component = builder.text("Hello World")
//                .textSizeDip(40)
//                .textColor(Color.parseColor("#666666"))
//                .textAlignment(Layout.Alignment.ALIGN_CENTER)
//                .build();
//        LithoView view = LithoView.create(context, component);


        ComponentContext context = new ComponentContext(this);
        final Component component =
                RecyclerCollectionComponent.create(context)
                        .disablePTR(true)
                        .section(ListSection.create(new SectionContext(context)).build())
                        .build();
        LithoView view = LithoView.create(context, component);
        setContentView(view);
    }
}
