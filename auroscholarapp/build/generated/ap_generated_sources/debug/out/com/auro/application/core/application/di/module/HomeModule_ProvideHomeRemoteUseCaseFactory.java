package com.auro.application.core.application.di.module;

import com.auro.application.home.data.repository.HomeRepo;
import com.auro.application.home.domain.usecase.HomeRemoteUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeModule_ProvideHomeRemoteUseCaseFactory
    implements Factory<HomeRemoteUseCase> {
  private final HomeModule module;

  private final Provider<HomeRepo.DashboardRemoteData> dashboardRemoteDataProvider;

  public HomeModule_ProvideHomeRemoteUseCaseFactory(
      HomeModule module, Provider<HomeRepo.DashboardRemoteData> dashboardRemoteDataProvider) {
    this.module = module;
    this.dashboardRemoteDataProvider = dashboardRemoteDataProvider;
  }

  @Override
  public HomeRemoteUseCase get() {
    return Preconditions.checkNotNull(
        module.provideHomeRemoteUseCase(dashboardRemoteDataProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeRemoteUseCase> create(
      HomeModule module, Provider<HomeRepo.DashboardRemoteData> dashboardRemoteDataProvider) {
    return new HomeModule_ProvideHomeRemoteUseCaseFactory(module, dashboardRemoteDataProvider);
  }

  public static HomeRemoteUseCase proxyProvideHomeRemoteUseCase(
      HomeModule instance, HomeRepo.DashboardRemoteData dashboardRemoteData) {
    return instance.provideHomeRemoteUseCase(dashboardRemoteData);
  }
}
