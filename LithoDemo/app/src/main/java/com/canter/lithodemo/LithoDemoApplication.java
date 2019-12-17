package com.canter.lithodemo;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * Description :
 * Creation    : 2019/12/2
 * Author      : cangui.ccg
 */
public class LithoDemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("App oncreate");
        SoLoader.init(this, false);
    }
}
