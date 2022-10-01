package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizTestFragment_MembersInjector implements MembersInjector<QuizTestFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public QuizTestFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<QuizTestFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new QuizTestFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(QuizTestFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      QuizTestFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
