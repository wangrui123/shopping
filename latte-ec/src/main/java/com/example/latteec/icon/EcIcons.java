package com.example.latteec.icon;

import com.joanzapata.iconify.Icon;

/**
 * author：liuting
 * date：2017/8/20
 * description:类描述
 */

public enum EcIcons implements Icon {
    icon_scan('\ue606'), icon_ali_pay('\ue606');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_','_');
    }

    @Override
    public char character() {
        return character;
    }
}
