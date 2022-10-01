// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import com.auro.application.home.presentation.viewmodel.QuizViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SubjectPrefLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RPTextView RPTextView10;

  @NonNull
  public final RPTextView RPTextView9;

  @NonNull
  public final ImageView auroScholarLogo;

  @NonNull
  public final RPTextView btContinue;

  @NonNull
  public final ConstraintLayout constantLayout;

  @NonNull
  public final ConstraintLayout errorConstraint;

  @NonNull
  public final ErrorLayoutBinding errorLayout;

  @NonNull
  public final ImageView icClose;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final LinearLayout linearLayout6;

  @NonNull
  public final RelativeLayout mainParentLayout;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final ProgressBar progressBarButton;

  @NonNull
  public final RecyclerView subjectRecyclerview;

  @Bindable
  protected QuizViewModel mQuizViewModel;

  protected SubjectPrefLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RPTextView RPTextView10, RPTextView RPTextView9, ImageView auroScholarLogo,
      RPTextView btContinue, ConstraintLayout constantLayout, ConstraintLayout errorConstraint,
      ErrorLayoutBinding errorLayout, ImageView icClose, ImageView imageView5,
      LinearLayout linearLayout6, RelativeLayout mainParentLayout, ProgressBar progressBar2,
      ProgressBar progressBarButton, RecyclerView subjectRecyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RPTextView10 = RPTextView10;
    this.RPTextView9 = RPTextView9;
    this.auroScholarLogo = auroScholarLogo;
    this.btContinue = btContinue;
    this.constantLayout = constantLayout;
    this.errorConstraint = errorConstraint;
    this.errorLayout = errorLayout;
    setContainedBinding(this.errorLayout);
    this.icClose = icClose;
    this.imageView5 = imageView5;
    this.linearLayout6 = linearLayout6;
    this.mainParentLayout = mainParentLayout;
    this.progressBar2 = progressBar2;
    this.progressBarButton = progressBarButton;
    this.subjectRecyclerview = subjectRecyclerview;
  }

  public abstract void setQuizViewModel(@Nullable QuizViewModel quizViewModel);

  @Nullable
  public QuizViewModel getQuizViewModel() {
    return mQuizViewModel;
  }

  @NonNull
  public static SubjectPrefLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.subject_pref_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SubjectPrefLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SubjectPrefLayoutBinding>inflateInternal(inflater, R.layout.subject_pref_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SubjectPrefLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.subject_pref_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SubjectPrefLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SubjectPrefLayoutBinding>inflateInternal(inflater, R.layout.subject_pref_layout, null, false, component);
  }

  public static SubjectPrefLayoutBinding bind(@NonNull View view) {
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
  public static SubjectPrefLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (SubjectPrefLayoutBinding)bind(component, view, R.layout.subject_pref_layout);
  }
}