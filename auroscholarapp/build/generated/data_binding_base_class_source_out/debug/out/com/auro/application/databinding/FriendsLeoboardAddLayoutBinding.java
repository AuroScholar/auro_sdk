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
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import com.auro.application.home.presentation.viewmodel.QuizViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FriendsLeoboardAddLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout activitySearchResultMapfragment;

  @NonNull
  public final RPTextView distance;

  @NonNull
  public final RelativeLayout inviteButton;

  @NonNull
  public final ConstraintLayout inviteButtonLayout;

  @NonNull
  public final RPTextView inviteText;

  @NonNull
  public final LinearLayout layout;

  @NonNull
  public final RPTextView nameText;

  @NonNull
  public final ConstraintLayout parentLayout;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RPTextView scoreText;

  @NonNull
  public final LinearLayout sentLayout;

  @NonNull
  public final RPTextView sentTxt;

  @NonNull
  public final View viewLine;

  @Bindable
  protected QuizViewModel mQuizViewModel;

  protected FriendsLeoboardAddLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout activitySearchResultMapfragment, RPTextView distance,
      RelativeLayout inviteButton, ConstraintLayout inviteButtonLayout, RPTextView inviteText,
      LinearLayout layout, RPTextView nameText, ConstraintLayout parentLayout,
      ImageView profileImage, ProgressBar progressBar, RPTextView scoreText,
      LinearLayout sentLayout, RPTextView sentTxt, View viewLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activitySearchResultMapfragment = activitySearchResultMapfragment;
    this.distance = distance;
    this.inviteButton = inviteButton;
    this.inviteButtonLayout = inviteButtonLayout;
    this.inviteText = inviteText;
    this.layout = layout;
    this.nameText = nameText;
    this.parentLayout = parentLayout;
    this.profileImage = profileImage;
    this.progressBar = progressBar;
    this.scoreText = scoreText;
    this.sentLayout = sentLayout;
    this.sentTxt = sentTxt;
    this.viewLine = viewLine;
  }

  public abstract void setQuizViewModel(@Nullable QuizViewModel quizViewModel);

  @Nullable
  public QuizViewModel getQuizViewModel() {
    return mQuizViewModel;
  }

  @NonNull
  public static FriendsLeoboardAddLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.friends_leoboard_add_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FriendsLeoboardAddLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FriendsLeoboardAddLayoutBinding>inflateInternal(inflater, R.layout.friends_leoboard_add_layout, root, attachToRoot, component);
  }

  @NonNull
  public static FriendsLeoboardAddLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.friends_leoboard_add_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FriendsLeoboardAddLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FriendsLeoboardAddLayoutBinding>inflateInternal(inflater, R.layout.friends_leoboard_add_layout, null, false, component);
  }

  public static FriendsLeoboardAddLayoutBinding bind(@NonNull View view) {
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
  public static FriendsLeoboardAddLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FriendsLeoboardAddLayoutBinding)bind(component, view, R.layout.friends_leoboard_add_layout);
  }
}