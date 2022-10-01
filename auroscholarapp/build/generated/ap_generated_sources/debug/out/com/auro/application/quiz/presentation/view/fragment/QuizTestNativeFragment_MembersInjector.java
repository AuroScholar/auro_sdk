package com.auro.application.quiz.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizTestNativeFragment_MembersInjector
    implements MembersInjector<QuizTestNativeFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public QuizTestNativeFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<QuizTestNativeFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new QuizTestNativeFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(QuizTestNativeFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      QuizTestNativeFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
