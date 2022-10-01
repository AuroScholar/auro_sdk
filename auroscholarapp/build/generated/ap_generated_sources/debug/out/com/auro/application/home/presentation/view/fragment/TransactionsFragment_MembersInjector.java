package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TransactionsFragment_MembersInjector
    implements MembersInjector<TransactionsFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public TransactionsFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TransactionsFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new TransactionsFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TransactionsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      TransactionsFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}