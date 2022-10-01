package com.auro.application.core.application.di.module;

import com.auro.application.kyc.data.datasource.remote.KycRemoteApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KycModule_ProvideKycRemoteApiFactory implements Factory<KycRemoteApi> {
  private final KycModule module;

  private final Provider<Retrofit> retrofitProvider;

  public KycModule_ProvideKycRemoteApiFactory(
      KycModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public KycRemoteApi get() {
    return Preconditions.checkNotNull(
        module.provideKycRemoteApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<KycRemoteApi> create(
      KycModule module, Provider<Retrofit> retrofitProvider) {
    return new KycModule_ProvideKycRemoteApiFactory(module, retrofitProvider);
  }

  public static KycRemoteApi proxyProvideKycRemoteApi(KycModule instance, Retrofit retrofit) {
    return instance.provideKycRemoteApi(retrofit);
  }
}
