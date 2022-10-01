package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public LoginActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new LoginActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      LoginActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
