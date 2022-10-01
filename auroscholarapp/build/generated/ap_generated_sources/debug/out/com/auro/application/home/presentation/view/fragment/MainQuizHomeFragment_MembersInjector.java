package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainQuizHomeFragment_MembersInjector
    implements MembersInjector<MainQuizHomeFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public MainQuizHomeFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<MainQuizHomeFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new MainQuizHomeFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(MainQuizHomeFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      MainQuizHomeFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
