package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PartnersWebviewFragment_MembersInjector
    implements MembersInjector<PartnersWebviewFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public PartnersWebviewFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PartnersWebviewFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new PartnersWebviewFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PartnersWebviewFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      PartnersWebviewFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
