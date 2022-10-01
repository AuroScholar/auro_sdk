package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpComingBookFragment_MembersInjector
    implements MembersInjector<UpComingBookFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public UpComingBookFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UpComingBookFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new UpComingBookFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UpComingBookFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      UpComingBookFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
