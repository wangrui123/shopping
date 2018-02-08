package com.flj.shopping;

import com.flj.latte.activities.ProxyActivity;
import com.flj.latte.delegates.LatteDelegate;
import com.flj.latte.ec.launcher.LauncherDelegate;

public class ExampleActivity extends ProxyActivity {

    private static final String TAG = "ExampleActivity";

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.e(TAG, "onCreate");
//        Toast.makeText(Latte.getApplication(), "传入context了", Toast.LENGTH_SHORT).show();
//
//    }
}
