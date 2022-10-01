package com.auro.application.core.application.di.module;

import com.auro.application.home.data.datasource.remote.HomeRemoteApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeModule_ProvideDashBoardApiFactory implements Factory<HomeRemoteApi> {
  private final HomeModule module;

  private final Provider<Retrofit> retrofitProvider;

  public HomeModule_ProvideDashBoardApiFactory(
      HomeModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public HomeRemoteApi get() {
    return Preconditions.checkNotNull(
        module.provideDashBoardApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeRemoteApi> create(
      HomeModule module, Provider<Retrofit> retrofitProvider) {
    return new HomeModule_ProvideDashBoardApiFactory(module, retrofitProvider);
  }

  public static HomeRemoteApi proxyProvideDashBoardApi(HomeModule instance, Retrofit retrofit) {
    return instance.provideDashBoardApi(retrofit);
  }
}
