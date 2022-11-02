// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ShimmerMyClassroomLayoutBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView background;

  @NonNull
  public final ConstraintLayout errorConstraint;

  @NonNull
  public final ErrorLayoutBinding errorLayout;

  @NonNull
  public final ConstraintLayout parentLayoutOne;

  @NonNull
  public final LinearLayout socialShareLayout;

  @NonNull
  public final RPTextView txtInviteStudent;

  @NonNull
  public final RPTextView txtMyclassroom;

  protected ShimmerMyClassroomLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView background, ConstraintLayout errorConstraint,
      ErrorLayoutBinding errorLayout, ConstraintLayout parentLayoutOne,
      LinearLayout socialShareLayout, RPTextView txtInviteStudent, RPTextView txtMyclassroom) {
    super(_bindingComponent, _root, _localFieldCount);
    this.background = background;
    this.errorConstraint = errorConstraint;
    this.errorLayout = errorLayout;
    this.parentLayoutOne = parentLayoutOne;
    this.socialShareLayout = socialShareLayout;
    this.txtInviteStudent = txtInviteStudent;
    this.txtMyclassroom = txtMyclassroom;
  }

  @NonNull
  public static ShimmerMyClassroomLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shimmer_my_classroom_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ShimmerMyClassroomLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ShimmerMyClassroomLayoutBinding>inflateInternal(inflater, R.layout.shimmer_my_classroom_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ShimmerMyClassroomLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shimmer_my_classroom_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ShimmerMyClassroomLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ShimmerMyClassroomLayoutBinding>inflateInternal(inflater, R.layout.shimmer_my_classroom_layout, null, false, component);
  }

  public static ShimmerMyClassroomLayoutBinding bind(@NonNull View view) {
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
  public static ShimmerMyClassroomLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ShimmerMyClassroomLayoutBinding)bind(component, view, R.layout.shimmer_my_classroom_layout);
  }
}
