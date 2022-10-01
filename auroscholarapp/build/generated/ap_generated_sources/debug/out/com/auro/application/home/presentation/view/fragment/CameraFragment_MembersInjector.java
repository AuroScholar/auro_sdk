package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CameraFragment_MembersInjector implements MembersInjector<CameraFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public CameraFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<CameraFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new CameraFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(CameraFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      CameraFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
