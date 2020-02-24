package com.ismailhakkiaydin.daggersample.di.modules;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;


import com.ismailhakkiaydin.daggersample.di.ViewModelKey;
import com.ismailhakkiaydin.daggersample.viewmodel.UserViewModel;
import com.ismailhakkiaydin.daggersample.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindViewModel(UserViewModel userViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindFactory(ViewModelFactory factory);

}
