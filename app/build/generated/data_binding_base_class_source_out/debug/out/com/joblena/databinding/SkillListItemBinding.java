// Generated by data binding compiler. Do not edit!
package com.joblena.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.joblena.R;
import com.joblena.domain.entities.SkillChoose;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SkillListItemBinding extends ViewDataBinding {
  @Bindable
  protected SkillChoose mSkill;

  protected SkillListItemBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setSkill(@Nullable SkillChoose skill);

  @Nullable
  public SkillChoose getSkill() {
    return mSkill;
  }

  @NonNull
  public static SkillListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.skill_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SkillListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SkillListItemBinding>inflateInternal(inflater, R.layout.skill_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static SkillListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.skill_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SkillListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SkillListItemBinding>inflateInternal(inflater, R.layout.skill_list_item, null, false, component);
  }

  public static SkillListItemBinding bind(@NonNull View view) {
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
  public static SkillListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SkillListItemBinding)bind(component, view, R.layout.skill_list_item);
  }
}
