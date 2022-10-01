package com.auro.application.payment.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SendMoneyFragment_MembersInjector implements MembersInjector<SendMoneyFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SendMoneyFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SendMoneyFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SendMoneyFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SendMoneyFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      SendMoneyFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
