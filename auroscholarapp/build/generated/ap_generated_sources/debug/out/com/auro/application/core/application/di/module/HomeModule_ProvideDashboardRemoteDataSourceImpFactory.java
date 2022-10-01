package com.auro.application.core.application.di.module;

import com.auro.application.home.data.datasource.remote.HomeRemoteApi;
import com.auro.application.home.data.repository.HomeRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeModule_ProvideDashboardRemoteDataSourceImpFactory
    implements Factory<HomeRepo.DashboardRemoteData> {
  private final HomeModule module;

  private final Provider<HomeRemoteApi> homeRemoteApiProvider;

  public HomeModule_ProvideDashboardRemoteDataSourceImpFactory(
      HomeModule module, Provider<HomeRemoteApi> homeRemoteApiProvider) {
    this.module = module;
    this.homeRemoteApiProvider = homeRemoteApiProvider;
  }

  @Override
  public HomeRepo.DashboardRemoteData get() {
    return Preconditions.checkNotNull(
        module.provideDashboardRemoteDataSourceImp(homeRemoteApiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeRepo.DashboardRemoteData> create(
      HomeModule module, Provider<HomeRemoteApi> homeRemoteApiProvider) {
    return new HomeModule_ProvideDashboardRemoteDataSourceImpFactory(module, homeRemoteApiProvider);
  }

  public static HomeRepo.DashboardRemoteData proxyProvideDashboardRemoteDataSourceImp(
      HomeModule instance, HomeRemoteApi homeRemoteApi) {
    return instance.provideDashboardRemoteDataSourceImp(homeRemoteApi);
  }
}
