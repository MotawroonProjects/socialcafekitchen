package com.socialcafekitchen.share;


import android.content.Context;

import androidx.multidex.MultiDexApplication;

import com.socialcafekitchen.language.Language;


public class App extends MultiDexApplication {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(Language.updateResources(newBase, "ar"));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.setDefaultFont(this, "DEFAULT", "fonts/Almeria Regular.ttf");
        TypefaceUtil.setDefaultFont(this, "MONOSPACE", "fonts/Almeria Regular.ttf");
        TypefaceUtil.setDefaultFont(this, "SERIF", "fonts/Almeria Regular.ttf");
        TypefaceUtil.setDefaultFont(this, "SANS_SERIF", "fonts/Almeria Regular.ttf");

    }
}

