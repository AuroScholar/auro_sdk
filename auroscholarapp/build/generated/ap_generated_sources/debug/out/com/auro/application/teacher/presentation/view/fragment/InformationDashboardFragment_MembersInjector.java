package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InformationDashboardFragment_MembersInjector
    implements MembersInjector<InformationDashboardFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public InformationDashboardFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<InformationDashboardFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new InformationDashboardFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(InformationDashboardFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      InformationDashboardFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
