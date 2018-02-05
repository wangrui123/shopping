package com.example.latte.app;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * author：liuting
 * date：2017/8/20
 * description:类描述
 */

public final class Configurator {
    private static final HashMap<Object, Object> LATTE_CONFEGS = new HashMap<>();
    private static final ArrayList<IconFontDescriptor> ICONS = new ArrayList<>();

    public Configurator() {
        LATTE_CONFEGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }

    final HashMap<Object, Object> getLatteConfigs() {
        return LATTE_CONFEGS;
    }

    public final void configure() {
        LATTE_CONFEGS.put(ConfigType.CONFIG_READY.name(), true);
        initIcons();
    }



    private void initIcons(){
        if(ICONS.size() > 0 ){
            final Iconify.IconifyInitializer initializer =  Iconify.with(ICONS.get(0));
            for(int i = 1 ; i<ICONS.size();i++){
                initializer.with(ICONS.get(i));
            }
        }
    }

    public final Configurator withApiHost(String host) {
        LATTE_CONFEGS.put(ConfigType.CONFIG_READY.name(), host);
        return this;
    }

    public final Configurator withIcon (IconFontDescriptor descriptor){
        ICONS.add(descriptor);
        return this;
    }

    private void checkConfiguretion() {
        final boolean isReady = (boolean) LATTE_CONFEGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("not ready");
        }
    }
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguretion();
        return (T) LATTE_CONFEGS.get(key.name());
    }

}
