package com.auro.application.payment.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BankFragment_MembersInjector implements MembersInjector<BankFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public BankFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BankFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new BankFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(BankFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      BankFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
