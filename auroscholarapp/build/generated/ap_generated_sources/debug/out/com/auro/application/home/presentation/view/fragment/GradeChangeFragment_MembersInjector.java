package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GradeChangeFragment_MembersInjector
    implements MembersInjector<GradeChangeFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public GradeChangeFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<GradeChangeFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new GradeChangeFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(GradeChangeFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      GradeChangeFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
