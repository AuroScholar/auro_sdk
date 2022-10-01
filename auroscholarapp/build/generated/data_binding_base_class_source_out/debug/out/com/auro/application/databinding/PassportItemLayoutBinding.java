// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PassportItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView downArrow;

  @NonNull
  public final RPTextView monthTitle;

  @NonNull
  public final ConstraintLayout parentLayout;

  @NonNull
  public final RecyclerView subjectList;

  protected PassportItemLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView downArrow, RPTextView monthTitle, ConstraintLayout parentLayout,
      RecyclerView subjectList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.downArrow = downArrow;
    this.monthTitle = monthTitle;
    this.parentLayout = parentLayout;
    this.subjectList = subjectList;
  }

  @NonNull
  public static PassportItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.passport_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PassportItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PassportItemLayoutBinding>inflateInternal(inflater, R.layout.passport_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static PassportItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.passport_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PassportItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PassportItemLayoutBinding>inflateInternal(inflater, R.layout.passport_item_layout, null, false, component);
  }

  public static PassportItemLayoutBinding bind(@NonNull View view) {
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
  public static PassportItemLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (PassportItemLayoutBinding)bind(component, view, R.layout.passport_item_layout);
  }
}