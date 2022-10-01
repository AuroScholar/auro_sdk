// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.auro.application.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ScholarshipQuizItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView amount;

  @NonNull
  public final TextView quizName;

  @NonNull
  public final TextView subjectName;

  protected ScholarshipQuizItemLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView amount, TextView quizName, TextView subjectName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amount = amount;
    this.quizName = quizName;
    this.subjectName = subjectName;
  }

  @NonNull
  public static ScholarshipQuizItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.scholarship_quiz_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ScholarshipQuizItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ScholarshipQuizItemLayoutBinding>inflateInternal(inflater, R.layout.scholarship_quiz_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ScholarshipQuizItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.scholarship_quiz_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ScholarshipQuizItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ScholarshipQuizItemLayoutBinding>inflateInternal(inflater, R.layout.scholarship_quiz_item_layout, null, false, component);
  }

  public static ScholarshipQuizItemLayoutBinding bind(@NonNull View view) {
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
  public static ScholarshipQuizItemLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ScholarshipQuizItemLayoutBinding)bind(component, view, R.layout.scholarship_quiz_item_layout);
  }
}