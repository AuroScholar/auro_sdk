package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherUserProfileFragment_MembersInjector
    implements MembersInjector<TeacherUserProfileFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public TeacherUserProfileFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TeacherUserProfileFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new TeacherUserProfileFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TeacherUserProfileFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      TeacherUserProfileFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
