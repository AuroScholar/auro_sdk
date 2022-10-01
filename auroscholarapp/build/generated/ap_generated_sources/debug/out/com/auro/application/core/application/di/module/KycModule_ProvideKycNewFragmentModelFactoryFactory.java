package com.auro.application.core.application.di.module;

import com.auro.application.core.application.di.component.ViewModelFactory;
import com.auro.application.kyc.domain.KycRemoteUseCase;
import com.auro.application.kyc.domain.KycUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KycModule_ProvideKycNewFragmentModelFactoryFactory
    implements Factory<ViewModelFactory> {
  private final KycModule module;

  private final Provider<KycUseCase> kycUseCaseProvider;

  private final Provider<KycRemoteUseCase> kycRemoteUseCaseProvider;

  public KycModule_ProvideKycNewFragmentModelFactoryFactory(
      KycModule module,
      Provider<KycUseCase> kycUseCaseProvider,
      Provider<KycRemoteUseCase> kycRemoteUseCaseProvider) {
    this.module = module;
    this.kycUseCaseProvider = kycUseCaseProvider;
    this.kycRemoteUseCaseProvider = kycRemoteUseCaseProvider;
  }

  @Override
  public ViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideKycNewFragmentModelFactory(
            kycUseCaseProvider.get(), kycRemoteUseCaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ViewModelFactory> create(
      KycModule module,
      Provider<KycUseCase> kycUseCaseProvider,
      Provider<KycRemoteUseCase> kycRemoteUseCaseProvider) {
    return new KycModule_ProvideKycNewFragmentModelFactoryFactory(
        module, kycUseCaseProvider, kycRemoteUseCaseProvider);
  }

  public static ViewModelFactory proxyProvideKycNewFragmentModelFactory(
      KycModule instance, KycUseCase kycUseCase, KycRemoteUseCase KycRemoteUseCase) {
    return instance.provideKycNewFragmentModelFactory(kycUseCase, KycRemoteUseCase);
  }
}
