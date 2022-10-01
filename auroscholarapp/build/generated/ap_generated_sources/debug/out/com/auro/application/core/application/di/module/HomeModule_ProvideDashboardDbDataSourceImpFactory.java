package com.auro.application.core.application.di.module;

import com.auro.application.home.data.repository.HomeRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeModule_ProvideDashboardDbDataSourceImpFactory
    implements Factory<HomeRepo.DashboardDbData> {
  private final HomeModule module;

  public HomeModule_ProvideDashboardDbDataSourceImpFactory(HomeModule module) {
    this.module = module;
  }

  @Override
  public HomeRepo.DashboardDbData get() {
    return Preconditions.checkNotNull(
        module.provideDashboardDbDataSourceImp(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeRepo.DashboardDbData> create(HomeModule module) {
    return new HomeModule_ProvideDashboardDbDataSourceImpFactory(module);
  }

  public static HomeRepo.DashboardDbData proxyProvideDashboardDbDataSourceImp(HomeModule instance) {
    return instance.provideDashboardDbDataSourceImp();
  }
}
