// Generated by data binding compiler. Do not edit!
package com.auro.application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
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
import com.auro.application.home.presentation.viewmodel.StudentProfileViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentParentProfileBinding extends ViewDataBinding {
  @NonNull
  public final RPTextView RPTextView10;

  @NonNull
  public final RPTextView RPTextView9;

  @NonNull
  public final RPTextView RpBootomText;

  @NonNull
  public final ImageView auroScholarLogo;

  @NonNull
  public final ImageView auroScholarLogo7;

  @NonNull
  public final ConstraintLayout constantLayoutNew;

  @NonNull
  public final ImageView editIcon;

  @NonNull
  public final RelativeLayout editImage;

  @NonNull
  public final AutoCompleteTextView etDistict;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etFullName;

  @NonNull
  public final AutoCompleteTextView etGender;

  @NonNull
  public final TextInputEditText etPhoneNumber;

  @NonNull
  public final AutoCompleteTextView etSchoolname;

  @NonNull
  public final AutoCompleteTextView etState;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageViewLanguage;

  @NonNull
  public final ImageView imageViewLanguageMenu;

  @NonNull
  public final ImageView imageViewNotification;

  @NonNull
  public final LinearLayout languageLayout;

  @NonNull
  public final LinearLayout linearLayout10;

  @NonNull
  public final LinearLayout linearLayout11;

  @NonNull
  public final LinearLayout linearLayout6;

  @NonNull
  public final LinearLayout linearLayout9;

  @NonNull
  public final ImageView nextButton;

  @NonNull
  public final ConstraintLayout profileImage;

  @NonNull
  public final ImageView profileimage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final FullScreenProgressBarBinding progressbar;

  @NonNull
  public final RPTextView rpTeacherprofile;

  @NonNull
  public final RPTextView skipForNow;

  @NonNull
  public final RPTextView submitbutton;

  @NonNull
  public final ImageView switchProfile;

  @NonNull
  public final TextInputLayout tiFullName;

  @NonNull
  public final TextInputLayout tiemail;

  @NonNull
  public final TextInputLayout tlDistict;

  @NonNull
  public final TextInputLayout tlGender;

  @NonNull
  public final TextInputLayout tlPhoneNumber;

  @NonNull
  public final TextInputLayout tlSchool;

  @NonNull
  public final TextInputLayout tlState;

  @Bindable
  protected StudentProfileViewModel mParentProfileViewModel;

  protected FragmentParentProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RPTextView RPTextView10, RPTextView RPTextView9, RPTextView RpBootomText,
      ImageView auroScholarLogo, ImageView auroScholarLogo7, ConstraintLayout constantLayoutNew,
      ImageView editIcon, RelativeLayout editImage, AutoCompleteTextView etDistict,
      TextInputEditText etEmail, TextInputEditText etFullName, AutoCompleteTextView etGender,
      TextInputEditText etPhoneNumber, AutoCompleteTextView etSchoolname,
      AutoCompleteTextView etState, ImageView imageView5, ImageView imageView6,
      ImageView imageViewLanguage, ImageView imageViewLanguageMenu, ImageView imageViewNotification,
      LinearLayout languageLayout, LinearLayout linearLayout10, LinearLayout linearLayout11,
      LinearLayout linearLayout6, LinearLayout linearLayout9, ImageView nextButton,
      ConstraintLayout profileImage, ImageView profileimage, ProgressBar progressBar,
      FullScreenProgressBarBinding progressbar, RPTextView rpTeacherprofile, RPTextView skipForNow,
      RPTextView submitbutton, ImageView switchProfile, TextInputLayout tiFullName,
      TextInputLayout tiemail, TextInputLayout tlDistict, TextInputLayout tlGender,
      TextInputLayout tlPhoneNumber, TextInputLayout tlSchool, TextInputLayout tlState) {
    super(_bindingComponent, _root, _localFieldCount);
    this.RPTextView10 = RPTextView10;
    this.RPTextView9 = RPTextView9;
    this.RpBootomText = RpBootomText;
    this.auroScholarLogo = auroScholarLogo;
    this.auroScholarLogo7 = auroScholarLogo7;
    this.constantLayoutNew = constantLayoutNew;
    this.editIcon = editIcon;
    this.editImage = editImage;
    this.etDistict = etDistict;
    this.etEmail = etEmail;
    this.etFullName = etFullName;
    this.etGender = etGender;
    this.etPhoneNumber = etPhoneNumber;
    this.etSchoolname = etSchoolname;
    this.etState = etState;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imageViewLanguage = imageViewLanguage;
    this.imageViewLanguageMenu = imageViewLanguageMenu;
    this.imageViewNotification = imageViewNotification;
    this.languageLayout = languageLayout;
    this.linearLayout10 = linearLayout10;
    this.linearLayout11 = linearLayout11;
    this.linearLayout6 = linearLayout6;
    this.linearLayout9 = linearLayout9;
    this.nextButton = nextButton;
    this.profileImage = profileImage;
    this.profileimage = profileimage;
    this.progressBar = progressBar;
    this.progressbar = progressbar;
    setContainedBinding(this.progressbar);
    this.rpTeacherprofile = rpTeacherprofile;
    this.skipForNow = skipForNow;
    this.submitbutton = submitbutton;
    this.switchProfile = switchProfile;
    this.tiFullName = tiFullName;
    this.tiemail = tiemail;
    this.tlDistict = tlDistict;
    this.tlGender = tlGender;
    this.tlPhoneNumber = tlPhoneNumber;
    this.tlSchool = tlSchool;
    this.tlState = tlState;
  }

  public abstract void setParentProfileViewModel(
      @Nullable StudentProfileViewModel parentProfileViewModel);

  @Nullable
  public StudentProfileViewModel getParentProfileViewModel() {
    return mParentProfileViewModel;
  }

  @NonNull
  public static FragmentParentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_parent_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentParentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentParentProfileBinding>inflateInternal(inflater, R.layout.fragment_parent_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentParentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_parent_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentParentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentParentProfileBinding>inflateInternal(inflater, R.layout.fragment_parent_profile, null, false, component);
  }

  public static FragmentParentProfileBinding bind(@NonNull View view) {
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
  public static FragmentParentProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentParentProfileBinding)bind(component, view, R.layout.fragment_parent_profile);
  }
}