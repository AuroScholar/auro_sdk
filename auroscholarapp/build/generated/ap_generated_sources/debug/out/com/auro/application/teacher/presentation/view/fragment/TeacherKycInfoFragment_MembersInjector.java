package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherKycInfoFragment_MembersInjector
    implements MembersInjector<TeacherKycInfoFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public TeacherKycInfoFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TeacherKycInfoFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new TeacherKycInfoFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TeacherKycInfoFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      TeacherKycInfoFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
