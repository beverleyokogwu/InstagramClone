package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("slmJcakvuGclOSeEd7a8Ol3dZsWpr9KjMcx0ngxc")
                .clientKey("p4fu5IQv83MGTJwyGXaVw0BVVaSdDLhvAdPSRGzw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
