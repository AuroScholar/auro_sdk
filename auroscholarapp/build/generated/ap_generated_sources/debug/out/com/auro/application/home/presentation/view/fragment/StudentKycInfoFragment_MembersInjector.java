package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentKycInfoFragment_MembersInjector
    implements MembersInjector<StudentKycInfoFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public StudentKycInfoFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<StudentKycInfoFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new StudentKycInfoFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(StudentKycInfoFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      StudentKycInfoFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
