package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompleteStudentProfileWithPinActivity_MembersInjector
    implements MembersInjector<CompleteStudentProfileWithPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public CompleteStudentProfileWithPinActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<CompleteStudentProfileWithPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new CompleteStudentProfileWithPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(CompleteStudentProfileWithPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      CompleteStudentProfileWithPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
