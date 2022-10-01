package com.auro.application.core.application.di.module;

import com.auro.application.core.application.di.component.ViewModelFactory;
import com.auro.application.home.domain.usecase.HomeDbUseCase;
import com.auro.application.home.domain.usecase.HomeRemoteUseCase;
import com.auro.application.home.domain.usecase.HomeUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeModule_ProvideRegisterActivityViewModelFactoryFactory
    implements Factory<ViewModelFactory> {
  private final HomeModule module;

  private final Provider<HomeUseCase> homeUseCaseProvider;

  private final Provider<HomeDbUseCase> homeDbUseCaseProvider;

  private final Provider<HomeRemoteUseCase> homeRemoteUseCaseProvider;

  public HomeModule_ProvideRegisterActivityViewModelFactoryFactory(
      HomeModule module,
      Provider<HomeUseCase> homeUseCaseProvider,
      Provider<HomeDbUseCase> homeDbUseCaseProvider,
      Provider<HomeRemoteUseCase> homeRemoteUseCaseProvider) {
    this.module = module;
    this.homeUseCaseProvider = homeUseCaseProvider;
    this.homeDbUseCaseProvider = homeDbUseCaseProvider;
    this.homeRemoteUseCaseProvider = homeRemoteUseCaseProvider;
  }

  @Override
  public ViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideRegisterActivityViewModelFactory(
            homeUseCaseProvider.get(),
            homeDbUseCaseProvider.get(),
            homeRemoteUseCaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ViewModelFactory> create(
      HomeModule module,
      Provider<HomeUseCase> homeUseCaseProvider,
      Provider<HomeDbUseCase> homeDbUseCaseProvider,
      Provider<HomeRemoteUseCase> homeRemoteUseCaseProvider) {
    return new HomeModule_ProvideRegisterActivityViewModelFactoryFactory(
        module, homeUseCaseProvider, homeDbUseCaseProvider, homeRemoteUseCaseProvider);
  }

  public static ViewModelFactory proxyProvideRegisterActivityViewModelFactory(
      HomeModule instance,
      HomeUseCase homeUseCase,
      HomeDbUseCase homeDbUseCase,
      HomeRemoteUseCase homeRemoteUseCase) {
    return instance.provideRegisterActivityViewModelFactory(
        homeUseCase, homeDbUseCase, homeRemoteUseCase);
  }
}
