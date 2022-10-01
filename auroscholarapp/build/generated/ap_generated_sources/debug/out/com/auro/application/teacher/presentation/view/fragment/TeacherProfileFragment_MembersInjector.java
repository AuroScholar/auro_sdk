package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherProfileFragment_MembersInjector
    implements MembersInjector<TeacherProfileFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public TeacherProfileFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TeacherProfileFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new TeacherProfileFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TeacherProfileFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      TeacherProfileFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
