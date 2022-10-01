// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import com.auro.application.teacher.presentation.viewmodel.TeacherSaveDetailViewModel;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTeacherSaveDetailBinding extends ViewDataBinding {
  @NonNull
  public final RPTextView RPTextView;

  @NonNull
  public final RPTextView RPTextView3;

  @NonNull
  public final RPTextView button;

  @NonNull
  public final QuizHeaderLayoutBinding headerParent;

  @NonNull
  public final ImageView icemail;

  @NonNull
  public final ImageView icmobilenumber;

  @NonNull
  public final ImageView icteachername;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextInputLayout tiledittext;

  @NonNull
  public final TextInputLayout tilmobiletxt;

  @NonNull
  public final TextInputLayout tilteachertxt;

  @NonNull
  public final ToolbarHeaderLayoutBinding toolbarLayout;

  @Bindable
  protected TeacherSaveDetailViewModel mTeacherSaveDetailViewModel;

  protected FragmentTeacherSaveDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RPTextView RPTextView, RPTextView RPTextView3, RPTextView button,
      QuizHeaderLayoutBinding headerParent, ImageView icemail, ImageView icmobilenumber,
      ImageView icteachername, ConstraintLayout linearLayout, LinearLayout linearLayout2,
      TextInputLayout tiledittext, TextInputLayout tilmobiletxt, TextInputLayout tilteachertxt,
      ToolbarHeaderLayoutBinding toolbarLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RPTextView = RPTextView;
    this.RPTextView3 = RPTextView3;
    this.button = button;
    this.headerParent = headerParent;
    setContainedBinding(this.headerParent);
    this.icemail = icemail;
    this.icmobilenumber = icmobilenumber;
    this.icteachername = icteachername;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.tiledittext = tiledittext;
    this.tilmobiletxt = tilmobiletxt;
    this.tilteachertxt = tilteachertxt;
    this.toolbarLayout = toolbarLayout;
    setContainedBinding(this.toolbarLayout);
  }

  public abstract void setTeacherSaveDetailViewModel(
      @Nullable TeacherSaveDetailViewModel teacherSaveDetailViewModel);

  @Nullable
  public TeacherSaveDetailViewModel getTeacherSaveDetailViewModel() {
    return mTeacherSaveDetailViewModel;
  }

  @NonNull
  public static FragmentTeacherSaveDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_teacher_save_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTeacherSaveDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTeacherSaveDetailBinding>inflateInternal(inflater, R.layout.fragment_teacher_save_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTeacherSaveDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_teacher_save_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTeacherSaveDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTeacherSaveDetailBinding>inflateInternal(inflater, R.layout.fragment_teacher_save_detail, null, false, component);
  }

  public static FragmentTeacherSaveDetailBinding bind(@NonNull View view) {
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
  public static FragmentTeacherSaveDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentTeacherSaveDetailBinding)bind(component, view, R.layout.fragment_teacher_save_detail);
  }
}