package com.ccg.multidexsample;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Description :
 * Creation    : 2019/8/21
 * Author      : cangui.ccg
 */
public class MultidexApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
