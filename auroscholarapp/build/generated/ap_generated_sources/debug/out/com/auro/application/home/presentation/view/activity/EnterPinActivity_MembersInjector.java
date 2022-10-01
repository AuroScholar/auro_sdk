package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EnterPinActivity_MembersInjector implements MembersInjector<EnterPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public EnterPinActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<EnterPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new EnterPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(EnterPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      EnterPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
