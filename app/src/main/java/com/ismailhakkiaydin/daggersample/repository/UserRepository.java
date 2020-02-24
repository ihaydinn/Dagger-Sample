package com.ismailhakkiaydin.daggersample.repository;



import com.ismailhakkiaydin.daggersample.model.UserModel;
import com.ismailhakkiaydin.daggersample.remote.UserService;

import javax.inject.Inject;

import io.reactivex.Single;

public class UserRepository {

    private UserService userService;

    @Inject
    public UserRepository(UserService userService) {
        this.userService = userService;
    }

    public Single<UserModel> modelSingle() {
        return userService.getUserModel();
    }
}
