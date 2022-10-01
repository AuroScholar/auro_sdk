package com.auro.application.core.application.di.module;

import com.auro.application.kyc.data.repository.KycRepo;
import com.auro.application.kyc.domain.KycRemoteUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KycModule_ProvidekycRemoteUseCaseFactory implements Factory<KycRemoteUseCase> {
  private final KycModule module;

  private final Provider<KycRepo.KycRemoteData> kycRemoteDataProvider;

  public KycModule_ProvidekycRemoteUseCaseFactory(
      KycModule module, Provider<KycRepo.KycRemoteData> kycRemoteDataProvider) {
    this.module = module;
    this.kycRemoteDataProvider = kycRemoteDataProvider;
  }

  @Override
  public KycRemoteUseCase get() {
    return Preconditions.checkNotNull(
        module.providekycRemoteUseCase(kycRemoteDataProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<KycRemoteUseCase> create(
      KycModule module, Provider<KycRepo.KycRemoteData> kycRemoteDataProvider) {
    return new KycModule_ProvidekycRemoteUseCaseFactory(module, kycRemoteDataProvider);
  }

  public static KycRemoteUseCase proxyProvidekycRemoteUseCase(
      KycModule instance, KycRepo.KycRemoteData kycRemoteData) {
    return instance.providekycRemoteUseCase(kycRemoteData);
  }
}
