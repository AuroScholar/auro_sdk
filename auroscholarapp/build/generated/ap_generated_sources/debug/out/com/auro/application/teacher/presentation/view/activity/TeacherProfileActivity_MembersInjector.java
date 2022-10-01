package com.auro.application.teacher.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherProfileActivity_MembersInjector
    implements MembersInjector<TeacherProfileActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public TeacherProfileActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TeacherProfileActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new TeacherProfileActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TeacherProfileActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      TeacherProfileActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
