package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DashBoardMainActivity_MembersInjector
    implements MembersInjector<DashBoardMainActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public DashBoardMainActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<DashBoardMainActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new DashBoardMainActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(DashBoardMainActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      DashBoardMainActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
