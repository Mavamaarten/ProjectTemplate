package com.icapps.projectname;

import android.app.Application;

import com.icapps.projectname.di.application.AppComponent;
import com.icapps.projectname.di.application.AppModule;
import com.icapps.projectname.di.application.DaggerAppComponent;
import com.icapps.projectname.di.user.UserComponent;
import com.icapps.projectname.di.user.UserModule;

/**
 * Created by maartenvangiel on 13/09/16.
 */
public class MyApplication extends Application {

    private AppComponent appComponent;
    private UserComponent userComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }

    public UserComponent createUserComponent() {
        userComponent = appComponent.plus(new UserModule());
        return userComponent;
    }

    public void releaseUserComponent() {
        userComponent = null;
    }
}
