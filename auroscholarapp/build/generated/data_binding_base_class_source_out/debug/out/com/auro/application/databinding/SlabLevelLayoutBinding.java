// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.auro.application.R;
import com.auro.application.util.SeekbarWithIntervals;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SlabLevelLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView levelText;

  @NonNull
  public final ImageView quizInfoImg;

  @NonNull
  public final RecyclerView quizLevelRecycleview;

  @NonNull
  public final CardView resultCv;

  @NonNull
  public final SeekbarWithIntervals seekbarWithIntervals;

  protected SlabLevelLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView levelText, ImageView quizInfoImg, RecyclerView quizLevelRecycleview,
      CardView resultCv, SeekbarWithIntervals seekbarWithIntervals) {
    super(_bindingComponent, _root, _localFieldCount);
    this.levelText = levelText;
    this.quizInfoImg = quizInfoImg;
    this.quizLevelRecycleview = quizLevelRecycleview;
    this.resultCv = resultCv;
    this.seekbarWithIntervals = seekbarWithIntervals;
  }

  @NonNull
  public static SlabLevelLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.slab_level_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SlabLevelLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SlabLevelLayoutBinding>inflateInternal(inflater, R.layout.slab_level_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SlabLevelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.slab_level_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SlabLevelLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SlabLevelLayoutBinding>inflateInternal(inflater, R.layout.slab_level_layout, null, false, component);
  }

  public static SlabLevelLayoutBinding bind(@NonNull View view) {
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
  public static SlabLevelLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (SlabLevelLayoutBinding)bind(component, view, R.layout.slab_level_layout);
  }
}