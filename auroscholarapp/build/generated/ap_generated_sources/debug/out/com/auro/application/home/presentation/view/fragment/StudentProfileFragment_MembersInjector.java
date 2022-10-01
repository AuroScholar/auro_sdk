package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentProfileFragment_MembersInjector
    implements MembersInjector<StudentProfileFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public StudentProfileFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<StudentProfileFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new StudentProfileFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(StudentProfileFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      StudentProfileFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
