package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EnterNumberActivity_MembersInjector
    implements MembersInjector<EnterNumberActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public EnterNumberActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<EnterNumberActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new EnterNumberActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(EnterNumberActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      EnterNumberActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
