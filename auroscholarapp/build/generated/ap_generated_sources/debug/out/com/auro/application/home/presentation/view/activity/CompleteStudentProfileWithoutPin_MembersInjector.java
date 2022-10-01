package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompleteStudentProfileWithoutPin_MembersInjector
    implements MembersInjector<CompleteStudentProfileWithoutPin> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public CompleteStudentProfileWithoutPin_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<CompleteStudentProfileWithoutPin> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new CompleteStudentProfileWithoutPin_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(CompleteStudentProfileWithoutPin instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      CompleteStudentProfileWithoutPin instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
