package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WalletInfoDetailFragment_MembersInjector
    implements MembersInjector<WalletInfoDetailFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public WalletInfoDetailFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<WalletInfoDetailFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new WalletInfoDetailFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(WalletInfoDetailFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      WalletInfoDetailFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
