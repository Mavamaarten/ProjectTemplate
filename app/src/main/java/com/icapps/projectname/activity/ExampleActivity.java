package com.icapps.projectname.activity;

import android.os.Bundle;

import com.icapps.projectname.MyApplication;
import com.icapps.projectname.R;
import com.icapps.projectname.base.BaseActivity;

public class ExampleActivity extends BaseActivity {
    // @State String aRetainedString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
    }

    @Override
    protected void inject() {
        ((MyApplication) getApplication()).getAppComponent().inject(this);
    }
}
