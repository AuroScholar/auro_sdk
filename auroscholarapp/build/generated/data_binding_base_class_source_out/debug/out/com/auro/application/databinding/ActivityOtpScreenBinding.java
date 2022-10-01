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
import com.auro.application.core.util.uiwidget.RPButton;
import com.auro.application.core.util.uiwidget.RPTextView;
import com.auro.application.home.presentation.viewmodel.OtpScreenViewModel;
import in.aabhasjindal.otptextview.OtpTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityOtpScreenBinding extends ViewDataBinding {
  @NonNull
  public final RPButton RPButtonConfirm;

  @NonNull
  public final RPTextView RPTextView7;

  @NonNull
  public final BackNewButtonBinding backButton;

  @NonNull
  public final ImageView clockIcon;

  @NonNull
  public final RPTextView codeEditMobileno;

  @NonNull
  public final RPTextView codeValidText;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ConstraintLayout layoutDesgin;

  @NonNull
  public final LinearLayout llOtp;

  @NonNull
  public final OtpTextView otpView;

  @NonNull
  public final FullScreenProgressBarBinding progressbar;

  @NonNull
  public final RPTextView resendText;

  @NonNull
  public final RPTextView textEduction;

  @NonNull
  public final RPTextView textOtpShow;

  @NonNull
  public final LinearLayout timerLayout;

  @NonNull
  public final RPTextView timerText;

  @NonNull
  public final View view;

  @Bindable
  protected OtpScreenViewModel mViewModel;

  protected ActivityOtpScreenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RPButton RPButtonConfirm, RPTextView RPTextView7, BackNewButtonBinding backButton,
      ImageView clockIcon, RPTextView codeEditMobileno, RPTextView codeValidText,
      ImageView imageView4, ConstraintLayout layoutDesgin, LinearLayout llOtp, OtpTextView otpView,
      FullScreenProgressBarBinding progressbar, RPTextView resendText, RPTextView textEduction,
      RPTextView textOtpShow, LinearLayout timerLayout, RPTextView timerText, View view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RPButtonConfirm = RPButtonConfirm;
    this.RPTextView7 = RPTextView7;
    this.backButton = backButton;
    setContainedBinding(this.backButton);
    this.clockIcon = clockIcon;
    this.codeEditMobileno = codeEditMobileno;
    this.codeValidText = codeValidText;
    this.imageView4 = imageView4;
    this.layoutDesgin = layoutDesgin;
    this.llOtp = llOtp;
    this.otpView = otpView;
    this.progressbar = progressbar;
    setContainedBinding(this.progressbar);
    this.resendText = resendText;
    this.textEduction = textEduction;
    this.textOtpShow = textOtpShow;
    this.timerLayout = timerLayout;
    this.timerText = timerText;
    this.view = view;
  }

  public abstract void setViewModel(@Nullable OtpScreenViewModel viewModel);

  @Nullable
  public OtpScreenViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityOtpScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_otp_screen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOtpScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityOtpScreenBinding>inflateInternal(inflater, R.layout.activity_otp_screen, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityOtpScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_otp_screen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOtpScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityOtpScreenBinding>inflateInternal(inflater, R.layout.activity_otp_screen, null, false, component);
  }

  public static ActivityOtpScreenBinding bind(@NonNull View view) {
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
  public static ActivityOtpScreenBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityOtpScreenBinding)bind(component, view, R.layout.activity_otp_screen);
  }
}