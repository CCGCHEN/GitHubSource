package com.canter.lithodemo.component;

import com.canter.lithodemo.ListItem;
import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.facebook.litho.sections.common.SingleComponentSection;

/**
 * Description :
 * Creation    : 2019/12/10
 * Author      : cangui.ccg
 */
@GroupSectionSpec
public class ListSectionSpec {
    @OnCreateChildren
    static Children onCreateChildren(final SectionContext c) {
        Children.Builder builder = Children.create();
        for (int i = 0; i < 32; i++) {
            builder.child(
                    SingleComponentSection.create(c)
                            .key(String.valueOf(i))
                            .component(ListItem.create(c).build()));
        }
        return builder.build();
    }
}
