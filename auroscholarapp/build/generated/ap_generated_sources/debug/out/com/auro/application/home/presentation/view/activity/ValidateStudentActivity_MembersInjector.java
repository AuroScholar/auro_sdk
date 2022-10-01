package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ValidateStudentActivity_MembersInjector
    implements MembersInjector<ValidateStudentActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public ValidateStudentActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ValidateStudentActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new ValidateStudentActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ValidateStudentActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ValidateStudentActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
