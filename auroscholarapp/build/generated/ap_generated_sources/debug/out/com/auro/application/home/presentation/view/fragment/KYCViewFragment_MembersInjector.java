package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KYCViewFragment_MembersInjector implements MembersInjector<KYCViewFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public KYCViewFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<KYCViewFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new KYCViewFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(KYCViewFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      KYCViewFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
