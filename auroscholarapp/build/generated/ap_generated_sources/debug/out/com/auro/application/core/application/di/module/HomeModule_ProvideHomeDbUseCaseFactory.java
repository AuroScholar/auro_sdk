package com.auro.application.core.application.di.module;

import com.auro.application.home.data.repository.HomeRepo;
import com.auro.application.home.domain.usecase.HomeDbUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeModule_ProvideHomeDbUseCaseFactory implements Factory<HomeDbUseCase> {
  private final HomeModule module;

  private final Provider<HomeRepo.DashboardDbData> homeDbDashboardProvider;

  public HomeModule_ProvideHomeDbUseCaseFactory(
      HomeModule module, Provider<HomeRepo.DashboardDbData> homeDbDashboardProvider) {
    this.module = module;
    this.homeDbDashboardProvider = homeDbDashboardProvider;
  }

  @Override
  public HomeDbUseCase get() {
    return Preconditions.checkNotNull(
        module.provideHomeDbUseCase(homeDbDashboardProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeDbUseCase> create(
      HomeModule module, Provider<HomeRepo.DashboardDbData> homeDbDashboardProvider) {
    return new HomeModule_ProvideHomeDbUseCaseFactory(module, homeDbDashboardProvider);
  }

  public static HomeDbUseCase proxyProvideHomeDbUseCase(
      HomeModule instance, HomeRepo.DashboardDbData homeDbDashboard) {
    return instance.provideHomeDbUseCase(homeDbDashboard);
  }
}
