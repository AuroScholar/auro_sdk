// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.auro.application.R;
import com.auro.application.core.util.uiwidget.RPTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CartWalletItemLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RPTextView amountcost;

  @NonNull
  public final RelativeLayout backgroundBox;

  @NonNull
  public final RPTextView textTitle;

  protected CartWalletItemLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RPTextView amountcost, RelativeLayout backgroundBox, RPTextView textTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amountcost = amountcost;
    this.backgroundBox = backgroundBox;
    this.textTitle = textTitle;
  }

  @NonNull
  public static CartWalletItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cart_wallet_item_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CartWalletItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CartWalletItemLayoutBinding>inflateInternal(inflater, R.layout.cart_wallet_item_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CartWalletItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cart_wallet_item_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CartWalletItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CartWalletItemLayoutBinding>inflateInternal(inflater, R.layout.cart_wallet_item_layout, null, false, component);
  }

  public static CartWalletItemLayoutBinding bind(@NonNull View view) {
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
  public static CartWalletItemLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (CartWalletItemLayoutBinding)bind(component, view, R.layout.cart_wallet_item_layout);
  }
}