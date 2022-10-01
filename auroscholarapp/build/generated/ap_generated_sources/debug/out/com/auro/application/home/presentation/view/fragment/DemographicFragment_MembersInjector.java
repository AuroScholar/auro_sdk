package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DemographicFragment_MembersInjector
    implements MembersInjector<DemographicFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public DemographicFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<DemographicFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new DemographicFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(DemographicFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      DemographicFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
