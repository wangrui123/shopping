package com.example.shopping;

import android.app.Application;

import com.example.latte.app.Latte;
import com.example.latteec.icon.FontEcModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * author：liuting
 * date：2017/8/20
 * description:类描述
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this).
                withIcon(new FontAwesomeModule()).withIcon(new FontEcModule()).
                withApiHost("http://127.0.0.1/").withIcon(new FontEcModule()).configure();
    }
}
