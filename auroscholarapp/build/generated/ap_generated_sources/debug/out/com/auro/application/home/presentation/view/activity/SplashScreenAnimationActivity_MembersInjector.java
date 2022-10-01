package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashScreenAnimationActivity_MembersInjector
    implements MembersInjector<SplashScreenAnimationActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SplashScreenAnimationActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SplashScreenAnimationActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SplashScreenAnimationActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SplashScreenAnimationActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      SplashScreenAnimationActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
