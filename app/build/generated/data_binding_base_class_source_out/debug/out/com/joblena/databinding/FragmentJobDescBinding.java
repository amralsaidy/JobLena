// Generated by view binder compiler. Do not edit!
package com.joblena.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.joblena.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentJobDescBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  private FragmentJobDescBinding(@NonNull MaterialCardView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentJobDescBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentJobDescBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_job_desc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentJobDescBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new FragmentJobDescBinding((MaterialCardView) rootView);
  }
}
