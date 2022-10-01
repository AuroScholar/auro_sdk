// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import com.auro.application.home.presentation.viewmodel.KYCViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentKycInfoItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView docStatusImage;

  @NonNull
  public final RPTextView docStatusTxt;

  @NonNull
  public final RPTextView documentDesc;

  @NonNull
  public final RPTextView documentName;

  @NonNull
  public final LinearLayout statusDescLayout;

  @NonNull
  public final LinearLayout uploadButtonStatusLayout;

  @NonNull
  public final ImageView uploadIcon;

  @NonNull
  public final RPTextView uploadText;

  @NonNull
  public final LinearLayout viewLayout;

  @Bindable
  protected KYCViewModel mKycViewModel;

  protected FragmentKycInfoItemLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView docStatusImage, RPTextView docStatusTxt,
      RPTextView documentDesc, RPTextView documentName, LinearLayout statusDescLayout,
      LinearLayout uploadButtonStatusLayout, ImageView uploadIcon, RPTextView uploadText,
      LinearLayout viewLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.docStatusImage = docStatusImage;
    this.docStatusTxt = docStatusTxt;
    this.documentDesc = documentDesc;
    this.documentName = documentName;
    this.statusDescLayout = statusDescLayout;
    this.uploadButtonStatusLayout = uploadButtonStatusLayout;
    this.uploadIcon = uploadIcon;
    this.uploadText = uploadText;
    this.viewLayout = viewLayout;
  }

  public abstract void setKycViewModel(@Nullable KYCViewModel kycViewModel);

  @Nullable
  public KYCViewModel getKycViewModel() {
    return mKycViewModel;
  }

  @NonNull
  public static FragmentKycInfoItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_kyc_info_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentKycInfoItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentKycInfoItemLayoutBinding>inflateInternal(inflater, R.layout.fragment_kyc_info_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentKycInfoItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_kyc_info_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentKycInfoItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentKycInfoItemLayoutBinding>inflateInternal(inflater, R.layout.fragment_kyc_info_item_layout, null, false, component);
  }

  public static FragmentKycInfoItemLayoutBinding bind(@NonNull View view) {
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
  public static FragmentKycInfoItemLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentKycInfoItemLayoutBinding)bind(component, view, R.layout.fragment_kyc_info_item_layout);
  }
}