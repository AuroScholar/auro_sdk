package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EnterParentPinActivity_MembersInjector
    implements MembersInjector<EnterParentPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public EnterParentPinActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<EnterParentPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new EnterParentPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(EnterParentPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      EnterParentPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
