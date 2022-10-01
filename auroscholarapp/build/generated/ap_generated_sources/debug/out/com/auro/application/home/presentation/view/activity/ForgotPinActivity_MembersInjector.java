package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ForgotPinActivity_MembersInjector implements MembersInjector<ForgotPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public ForgotPinActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ForgotPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new ForgotPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ForgotPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ForgotPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
