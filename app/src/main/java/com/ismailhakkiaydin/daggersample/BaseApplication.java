package com.ismailhakkiaydin.daggersample;

import android.app.Application;

import com.ismailhakkiaydin.daggersample.di.components.AppComponent;
import com.ismailhakkiaydin.daggersample.di.components.DaggerAppComponent;


public class BaseApplication extends Application {

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent= DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
