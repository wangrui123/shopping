package cn.latte_ui.launcher;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;


public class LauncherHolderCreator implements CBViewHolderCreator<LauncherHolder> {

    @Override
    public LauncherHolder createHolder() {
        return new LauncherHolder();
    }
}
