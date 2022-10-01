package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import com.auro.application.home.data.datasource.remote.HomeRemoteApi;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final Provider<HomeRemoteApi> remoteApiProvider;

  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public HomeActivity_MembersInjector(
      Provider<HomeRemoteApi> remoteApiProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.remoteApiProvider = remoteApiProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<HomeActivity> create(
      Provider<HomeRemoteApi> remoteApiProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new HomeActivity_MembersInjector(remoteApiProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(HomeActivity instance) {
    injectRemoteApi(instance, remoteApiProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectRemoteApi(HomeActivity instance, HomeRemoteApi remoteApi) {
    instance.remoteApi = remoteApi;
  }

  public static void injectViewModelFactory(
      HomeActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
