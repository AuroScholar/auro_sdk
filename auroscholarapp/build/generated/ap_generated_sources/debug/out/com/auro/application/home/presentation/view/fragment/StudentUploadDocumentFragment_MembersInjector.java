package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentUploadDocumentFragment_MembersInjector
    implements MembersInjector<StudentUploadDocumentFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public StudentUploadDocumentFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<StudentUploadDocumentFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new StudentUploadDocumentFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(StudentUploadDocumentFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      StudentUploadDocumentFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
