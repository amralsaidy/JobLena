// Generated by data binding compiler. Do not edit!
package com.joblena.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.joblena.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutChipsContainerBinding extends ViewDataBinding {
  @NonNull
  public final FlexboxLayout flexLayoutId;

  @NonNull
  public final LinearLayout llScroll;

  @NonNull
  public final NestedScrollView nsv;

  protected LayoutChipsContainerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FlexboxLayout flexLayoutId, LinearLayout llScroll, NestedScrollView nsv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flexLayoutId = flexLayoutId;
    this.llScroll = llScroll;
    this.nsv = nsv;
  }

  @NonNull
  public static LayoutChipsContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_chips_container, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutChipsContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutChipsContainerBinding>inflateInternal(inflater, R.layout.layout_chips_container, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutChipsContainerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_chips_container, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutChipsContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutChipsContainerBinding>inflateInternal(inflater, R.layout.layout_chips_container, null, false, component);
  }

  public static LayoutChipsContainerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutChipsContainerBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutChipsContainerBinding)bind(component, view, R.layout.layout_chips_container);
  }
}
