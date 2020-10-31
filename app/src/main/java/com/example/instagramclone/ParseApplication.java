package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //parse some items
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("slmJcakvuGclOSeEd7a8Ol3dZsWpr9KjMcx0ngxc")
                .clientKey("p4fu5IQv83MGTJwyGXaVw0BVVaSdDLhvAdPSRGzw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
