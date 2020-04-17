package com.bw.movie.base;

import android.app.Application;
import android.content.Context;

/**
 * Time: 2020/4/17
 * Author: 王冠华
 * Description:
 */
public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
