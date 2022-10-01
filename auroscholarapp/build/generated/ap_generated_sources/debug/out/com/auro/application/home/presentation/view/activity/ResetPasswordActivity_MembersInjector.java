package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResetPasswordActivity_MembersInjector
    implements MembersInjector<ResetPasswordActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public ResetPasswordActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ResetPasswordActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new ResetPasswordActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ResetPasswordActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ResetPasswordActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
