package com.auro.application.payment.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UPIFragment_MembersInjector implements MembersInjector<UPIFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public UPIFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UPIFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new UPIFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UPIFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      UPIFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
