package com.icapps.projectname.di.user;

import dagger.Subcomponent;

/**
 * Created by maartenvangiel on 13/09/16.
 */
@UserScope
@Subcomponent(modules = {UserModule.class})
public interface UserComponent {

    // void inject(MyActivity activity);
}
