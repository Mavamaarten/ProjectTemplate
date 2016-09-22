package com.icapps.projectname.di.application;

import com.icapps.projectname.activity.ExampleActivity;
import com.icapps.projectname.di.user.UserComponent;
import com.icapps.projectname.di.user.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by maartenvangiel on 13/09/16.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    UserComponent plus(UserModule userModule);

    void inject(ExampleActivity exampleActivity);
}
