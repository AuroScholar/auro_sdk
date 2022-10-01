// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EnterNumberActivityLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RPTextView RPButtonSendOtp;

  @NonNull
  public final ImageView backButton;

  @NonNull
  public final RecyclerView dialerRecyclerView;

  @NonNull
  public final ImageView leftCornerImage;

  @NonNull
  public final EditText numberEdit;

  @NonNull
  public final FullScreenProgressBarBinding progressbar;

  @NonNull
  public final RPTextView termsCondition;

  @NonNull
  public final RPTextView titleFirst;

  protected EnterNumberActivityLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RPTextView RPButtonSendOtp, ImageView backButton,
      RecyclerView dialerRecyclerView, ImageView leftCornerImage, EditText numberEdit,
      FullScreenProgressBarBinding progressbar, RPTextView termsCondition, RPTextView titleFirst) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RPButtonSendOtp = RPButtonSendOtp;
    this.backButton = backButton;
    this.dialerRecyclerView = dialerRecyclerView;
    this.leftCornerImage = leftCornerImage;
    this.numberEdit = numberEdit;
    this.progressbar = progressbar;
    setContainedBinding(this.progressbar);
    this.termsCondition = termsCondition;
    this.titleFirst = titleFirst;
  }

  @NonNull
  public static EnterNumberActivityLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.enter_number_activity_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EnterNumberActivityLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EnterNumberActivityLayoutBinding>inflateInternal(inflater, R.layout.enter_number_activity_layout, root, attachToRoot, component);
  }

  @NonNull
  public static EnterNumberActivityLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.enter_number_activity_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EnterNumberActivityLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EnterNumberActivityLayoutBinding>inflateInternal(inflater, R.layout.enter_number_activity_layout, null, false, component);
  }

  public static EnterNumberActivityLayoutBinding bind(@NonNull View view) {
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
  public static EnterNumberActivityLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (EnterNumberActivityLayoutBinding)bind(component, view, R.layout.enter_number_activity_layout);
  }
}