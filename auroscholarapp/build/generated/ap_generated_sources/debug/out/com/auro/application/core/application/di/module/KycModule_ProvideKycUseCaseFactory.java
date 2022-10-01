package com.auro.application.core.application.di.module;

import com.auro.application.kyc.domain.KycUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KycModule_ProvideKycUseCaseFactory implements Factory<KycUseCase> {
  private final KycModule module;

  public KycModule_ProvideKycUseCaseFactory(KycModule module) {
    this.module = module;
  }

  @Override
  public KycUseCase get() {
    return Preconditions.checkNotNull(
        module.provideKycUseCase(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<KycUseCase> create(KycModule module) {
    return new KycModule_ProvideKycUseCaseFactory(module);
  }

  public static KycUseCase proxyProvideKycUseCase(KycModule instance) {
    return instance.provideKycUseCase();
  }
}
