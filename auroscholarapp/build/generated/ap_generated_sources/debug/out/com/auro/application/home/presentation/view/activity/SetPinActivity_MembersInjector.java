package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SetPinActivity_MembersInjector implements MembersInjector<SetPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SetPinActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SetPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SetPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SetPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      SetPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
