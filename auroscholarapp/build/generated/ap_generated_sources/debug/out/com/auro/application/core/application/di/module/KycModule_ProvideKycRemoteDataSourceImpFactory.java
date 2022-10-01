package com.auro.application.core.application.di.module;

import com.auro.application.kyc.data.datasource.remote.KycRemoteApi;
import com.auro.application.kyc.data.repository.KycRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KycModule_ProvideKycRemoteDataSourceImpFactory
    implements Factory<KycRepo.KycRemoteData> {
  private final KycModule module;

  private final Provider<KycRemoteApi> kycRemoteApiProvider;

  public KycModule_ProvideKycRemoteDataSourceImpFactory(
      KycModule module, Provider<KycRemoteApi> kycRemoteApiProvider) {
    this.module = module;
    this.kycRemoteApiProvider = kycRemoteApiProvider;
  }

  @Override
  public KycRepo.KycRemoteData get() {
    return Preconditions.checkNotNull(
        module.provideKycRemoteDataSourceImp(kycRemoteApiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<KycRepo.KycRemoteData> create(
      KycModule module, Provider<KycRemoteApi> kycRemoteApiProvider) {
    return new KycModule_ProvideKycRemoteDataSourceImpFactory(module, kycRemoteApiProvider);
  }

  public static KycRepo.KycRemoteData proxyProvideKycRemoteDataSourceImp(
      KycModule instance, KycRemoteApi kycRemoteApi) {
    return instance.provideKycRemoteDataSourceImp(kycRemoteApi);
  }
}
