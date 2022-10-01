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
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ToolbarHeaderLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final ConstraintLayout backParentLayout;

  @NonNull
  public final RPTextView langEng;

  @NonNull
  public final ConstraintLayout toolbarHeader;

  protected ToolbarHeaderLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backArrow, ConstraintLayout backParentLayout, RPTextView langEng,
      ConstraintLayout toolbarHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backArrow = backArrow;
    this.backParentLayout = backParentLayout;
    this.langEng = langEng;
    this.toolbarHeader = toolbarHeader;
  }

  @NonNull
  public static ToolbarHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar_header_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ToolbarHeaderLayoutBinding>inflateInternal(inflater, R.layout.toolbar_header_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ToolbarHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.toolbar_header_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ToolbarHeaderLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ToolbarHeaderLayoutBinding>inflateInternal(inflater, R.layout.toolbar_header_layout, null, false, component);
  }

  public static ToolbarHeaderLayoutBinding bind(@NonNull View view) {
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
  public static ToolbarHeaderLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (ToolbarHeaderLayoutBinding)bind(component, view, R.layout.toolbar_header_layout);
  }
}