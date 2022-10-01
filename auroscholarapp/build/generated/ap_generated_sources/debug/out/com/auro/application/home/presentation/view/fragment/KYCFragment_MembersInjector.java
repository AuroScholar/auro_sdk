package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KYCFragment_MembersInjector implements MembersInjector<KYCFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public KYCFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<KYCFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new KYCFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(KYCFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      KYCFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
