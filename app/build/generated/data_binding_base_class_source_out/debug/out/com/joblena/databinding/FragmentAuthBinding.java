// Generated by data binding compiler. Do not edit!
package com.joblena.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.joblena.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAuthBinding extends ViewDataBinding {
  @NonNull
  public final AutoCompleteTextView autoCompleteTextViewCode;

  @NonNull
  public final Button buttonVerifyPhone;

  @NonNull
  public final TextInputLayout textField;

  @NonNull
  public final TextInputEditText textInputEditTextPhone;

  @NonNull
  public final TextInputLayout textInputLayoutPhone;

  @NonNull
  public final TextView textViewSubtitlePhoneAuth;

  @NonNull
  public final TextView textViewTitlePhoneAuth;

  protected FragmentAuthBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AutoCompleteTextView autoCompleteTextViewCode, Button buttonVerifyPhone,
      TextInputLayout textField, TextInputEditText textInputEditTextPhone,
      TextInputLayout textInputLayoutPhone, TextView textViewSubtitlePhoneAuth,
      TextView textViewTitlePhoneAuth) {
    super(_bindingComponent, _root, _localFieldCount);
    this.autoCompleteTextViewCode = autoCompleteTextViewCode;
    this.buttonVerifyPhone = buttonVerifyPhone;
    this.textField = textField;
    this.textInputEditTextPhone = textInputEditTextPhone;
    this.textInputLayoutPhone = textInputLayoutPhone;
    this.textViewSubtitlePhoneAuth = textViewSubtitlePhoneAuth;
    this.textViewTitlePhoneAuth = textViewTitlePhoneAuth;
  }

  @NonNull
  public static FragmentAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_auth, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAuthBinding>inflateInternal(inflater, R.layout.fragment_auth, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_auth, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAuthBinding>inflateInternal(inflater, R.layout.fragment_auth, null, false, component);
  }

  public static FragmentAuthBinding bind(@NonNull View view) {
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
  public static FragmentAuthBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAuthBinding)bind(component, view, R.layout.fragment_auth);
  }
}