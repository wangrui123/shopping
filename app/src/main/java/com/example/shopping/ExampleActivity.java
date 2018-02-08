package com.example.shopping;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.latte.activities.ProxyActivity;
import com.example.latte.app.Latte;
import com.example.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    private static final String TAG = "ExampleActivity";

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate");
        Toast.makeText(Latte.getApplication(), "传入context了", Toast.LENGTH_SHORT).show();

    }
}
