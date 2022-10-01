package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EnterStudentPinActivity_MembersInjector
    implements MembersInjector<EnterStudentPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public EnterStudentPinActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<EnterStudentPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new EnterStudentPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(EnterStudentPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      EnterStudentPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
