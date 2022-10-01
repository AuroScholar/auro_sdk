package com.auro.application.core.application.di.module;

import com.auro.application.home.domain.usecase.HomeUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeModule_ProvideDashboardUseCaseFactory implements Factory<HomeUseCase> {
  private final HomeModule module;

  public HomeModule_ProvideDashboardUseCaseFactory(HomeModule module) {
    this.module = module;
  }

  @Override
  public HomeUseCase get() {
    return Preconditions.checkNotNull(
        module.provideDashboardUseCase(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeUseCase> create(HomeModule module) {
    return new HomeModule_ProvideDashboardUseCaseFactory(module);
  }

  public static HomeUseCase proxyProvideDashboardUseCase(HomeModule instance) {
    return instance.provideDashboardUseCase();
  }
}
