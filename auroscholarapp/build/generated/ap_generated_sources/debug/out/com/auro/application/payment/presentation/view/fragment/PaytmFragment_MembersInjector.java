package com.auro.application.payment.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PaytmFragment_MembersInjector implements MembersInjector<PaytmFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public PaytmFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PaytmFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new PaytmFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PaytmFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      PaytmFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
