package com.joblena.app.ext;

import java.lang.System;

/**
 * A delegate who lazily inflates a data binding layout, calls [Activity.setContentView], sets
 * the lifecycle owner and returns the binding.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u00020\u0005B\u000f\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0086\u0002\u00a2\u0006\u0002\u0010\u000fR\u0012\u0010\t\u001a\u0004\u0018\u00018\u0001X\u0088\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/joblena/app/ext/ContentViewBindingDelegate;", "R", "Landroidx/appcompat/app/AppCompatActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "", "layoutRes", "", "(I)V", "binding", "Landroidx/databinding/ViewDataBinding;", "getValue", "activity", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/reflect/KProperty;)Landroidx/databinding/ViewDataBinding;", "app_debug"})
public final class ContentViewBindingDelegate<R extends androidx.appcompat.app.AppCompatActivity, T extends androidx.databinding.ViewDataBinding> {
    private T binding;
    private final int layoutRes = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final T getValue(@org.jetbrains.annotations.NotNull()
    R activity, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    public ContentViewBindingDelegate(@androidx.annotation.LayoutRes()
    int layoutRes) {
        super();
    }
}