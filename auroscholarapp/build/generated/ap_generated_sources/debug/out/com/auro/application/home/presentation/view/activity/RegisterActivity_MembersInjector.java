package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public RegisterActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new RegisterActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      RegisterActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
