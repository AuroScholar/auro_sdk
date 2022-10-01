package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PartnersFragment_MembersInjector implements MembersInjector<PartnersFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public PartnersFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PartnersFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new PartnersFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PartnersFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      PartnersFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
