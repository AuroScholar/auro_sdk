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
public final class TeacherDashboardActivity_MembersInjector
    implements MembersInjector<TeacherDashboardActivity> {
  private final Provider<HomeRemoteApi> remoteApiProvider;

  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public TeacherDashboardActivity_MembersInjector(
      Provider<HomeRemoteApi> remoteApiProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.remoteApiProvider = remoteApiProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TeacherDashboardActivity> create(
      Provider<HomeRemoteApi> remoteApiProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new TeacherDashboardActivity_MembersInjector(
        remoteApiProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TeacherDashboardActivity instance) {
    injectRemoteApi(instance, remoteApiProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectRemoteApi(TeacherDashboardActivity instance, HomeRemoteApi remoteApi) {
    instance.remoteApi = remoteApi;
  }

  public static void injectViewModelFactory(
      TeacherDashboardActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
