package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentProfileActivity_MembersInjector
    implements MembersInjector<StudentProfileActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public StudentProfileActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<StudentProfileActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new StudentProfileActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(StudentProfileActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      StudentProfileActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
