package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppLanguageActivity_MembersInjector
    implements MembersInjector<AppLanguageActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public AppLanguageActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AppLanguageActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new AppLanguageActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AppLanguageActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      AppLanguageActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
