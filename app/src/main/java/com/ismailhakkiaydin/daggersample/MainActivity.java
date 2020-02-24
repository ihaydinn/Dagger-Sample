package com.ismailhakkiaydin.daggersample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.ismailhakkiaydin.daggersample.databinding.ActivityMainBinding;
import com.ismailhakkiaydin.daggersample.model.UserModel;
import com.ismailhakkiaydin.daggersample.viewmodel.UserViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;


    @Inject
    ViewModelProvider.Factory viewModelFactory;

    private UserViewModel userViewModel;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ((BaseApplication) getApplication()).getAppComponent().inject(this);

        userViewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel.class);

        userViewModel.getModelMutableLiveData().observe(this, new Observer<UserModel>() {
            @Override
            public void onChanged(UserModel userModel) {
                activityMainBinding.setUser(userModel);
                Log.d(TAG, "onChanged: " + userModel.getPhone());
            }
        });
    }
}
