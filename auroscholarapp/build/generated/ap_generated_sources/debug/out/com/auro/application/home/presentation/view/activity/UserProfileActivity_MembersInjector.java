package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserProfileActivity_MembersInjector
    implements MembersInjector<UserProfileActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public UserProfileActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UserProfileActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new UserProfileActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UserProfileActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      UserProfileActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
