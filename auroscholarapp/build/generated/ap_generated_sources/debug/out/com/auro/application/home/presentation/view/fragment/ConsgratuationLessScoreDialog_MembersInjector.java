package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConsgratuationLessScoreDialog_MembersInjector
    implements MembersInjector<ConsgratuationLessScoreDialog> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public ConsgratuationLessScoreDialog_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ConsgratuationLessScoreDialog> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new ConsgratuationLessScoreDialog_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ConsgratuationLessScoreDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ConsgratuationLessScoreDialog instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
