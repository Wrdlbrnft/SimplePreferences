package com.github.wrdlbrnft.preferences.builder.api.elements;

import java.util.Set;

import javax.lang.model.element.Modifier;

/**
 * Created with Android Studio
 * User: Xaver
 * Date: 09/12/14
 */
public interface Type {
    public String packageName();
    public String className();
    public String fullClassName();
    public Type parent();
    public Set<Modifier> modifiers();
    public boolean isSuperTypeOf(Type type);
    public Type genericVersion(Type... genericTypes);
}
