package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SlideFragment_MembersInjector implements MembersInjector<SlideFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SlideFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SlideFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SlideFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SlideFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      SlideFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
