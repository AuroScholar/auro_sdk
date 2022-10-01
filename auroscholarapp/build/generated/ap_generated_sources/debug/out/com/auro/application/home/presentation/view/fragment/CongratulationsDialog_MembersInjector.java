package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CongratulationsDialog_MembersInjector
    implements MembersInjector<CongratulationsDialog> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public CongratulationsDialog_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<CongratulationsDialog> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new CongratulationsDialog_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(CongratulationsDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      CongratulationsDialog instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}