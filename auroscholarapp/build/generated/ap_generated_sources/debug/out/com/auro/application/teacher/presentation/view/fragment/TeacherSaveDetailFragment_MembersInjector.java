package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherSaveDetailFragment_MembersInjector
    implements MembersInjector<TeacherSaveDetailFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public TeacherSaveDetailFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TeacherSaveDetailFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new TeacherSaveDetailFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TeacherSaveDetailFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      TeacherSaveDetailFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
