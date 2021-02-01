// Generated by data binding compiler. Do not edit!
package com.joblena.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.joblena.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHome2Binding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView candidateCard;

  @NonNull
  public final LinearLayout headerLayout;

  @NonNull
  public final MaterialCardView jobCardList;

  @NonNull
  public final RecyclerView jobsLists;

  @NonNull
  public final RecyclerView jobsRecyclerview;

  @NonNull
  public final LinearLayout layoutCreateJob;

  @NonNull
  public final ImageView menuImage;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final MaterialCardView savedCard;

  protected FragmentHome2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView candidateCard, LinearLayout headerLayout, MaterialCardView jobCardList,
      RecyclerView jobsLists, RecyclerView jobsRecyclerview, LinearLayout layoutCreateJob,
      ImageView menuImage, CircleImageView profileImage, MaterialCardView savedCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.candidateCard = candidateCard;
    this.headerLayout = headerLayout;
    this.jobCardList = jobCardList;
    this.jobsLists = jobsLists;
    this.jobsRecyclerview = jobsRecyclerview;
    this.layoutCreateJob = layoutCreateJob;
    this.menuImage = menuImage;
    this.profileImage = profileImage;
    this.savedCard = savedCard;
  }

  @NonNull
  public static FragmentHome2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHome2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHome2Binding>inflateInternal(inflater, R.layout.fragment_home2, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHome2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHome2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHome2Binding>inflateInternal(inflater, R.layout.fragment_home2, null, false, component);
  }

  public static FragmentHome2Binding bind(@NonNull View view) {
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
  public static FragmentHome2Binding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHome2Binding)bind(component, view, R.layout.fragment_home2);
  }
}
