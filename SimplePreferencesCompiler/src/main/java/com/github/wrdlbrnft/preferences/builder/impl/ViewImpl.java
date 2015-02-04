package com.github.wrdlbrnft.preferences.builder.impl;

import com.github.wrdlbrnft.preferences.builder.api.code.CodeBlock;
import com.github.wrdlbrnft.preferences.builder.api.elements.Type;
import com.github.wrdlbrnft.preferences.builder.api.views.View;

import java.util.Set;

import javax.lang.model.element.Modifier;

/**
 * Created with Android Studio
 * User: Xaver
 * Date: 09/12/14
 */
class ViewImpl extends VariableImpl implements View {

    private final int mId;

    public ViewImpl(String name, Type type, int id, Set<Modifier> modifiers) {
        super(name, type, modifiers);

        mId = id;
    }

    @Override
    public int id() {
        return mId;
    }

    @Override
    public String setClickListener(CodeBlock onClick) {
        return null;
    }
}
