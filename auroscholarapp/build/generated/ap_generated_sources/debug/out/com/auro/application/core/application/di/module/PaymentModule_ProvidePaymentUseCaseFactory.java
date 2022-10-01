package com.auro.application.core.application.di.module;

import com.auro.application.payment.domain.PaymentUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PaymentModule_ProvidePaymentUseCaseFactory implements Factory<PaymentUseCase> {
  private final PaymentModule module;

  public PaymentModule_ProvidePaymentUseCaseFactory(PaymentModule module) {
    this.module = module;
  }

  @Override
  public PaymentUseCase get() {
    return Preconditions.checkNotNull(
        module.providePaymentUseCase(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PaymentUseCase> create(PaymentModule module) {
    return new PaymentModule_ProvidePaymentUseCaseFactory(module);
  }

  public static PaymentUseCase proxyProvidePaymentUseCase(PaymentModule instance) {
    return instance.providePaymentUseCase();
  }
}
