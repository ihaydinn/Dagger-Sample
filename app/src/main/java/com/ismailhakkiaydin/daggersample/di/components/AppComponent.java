package com.ismailhakkiaydin.daggersample.di.components;


import com.ismailhakkiaydin.daggersample.MainActivity;
import com.ismailhakkiaydin.daggersample.di.modules.ContextModule;
import com.ismailhakkiaydin.daggersample.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, ContextModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
