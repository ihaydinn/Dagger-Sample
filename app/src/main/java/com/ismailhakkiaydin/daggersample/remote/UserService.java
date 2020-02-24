package com.ismailhakkiaydin.daggersample.remote;


import com.ismailhakkiaydin.daggersample.model.UserModel;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface UserService {


    @GET("/users/2")
    Single<UserModel> getUserModel();
}
