package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SetParentPinActivity_MembersInjector
    implements MembersInjector<SetParentPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SetParentPinActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SetParentPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SetParentPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SetParentPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      SetParentPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
