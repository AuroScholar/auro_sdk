package com.auro.application.core.application.di.module;

import com.auro.application.payment.data.repository.PaymentRepo;
import com.auro.application.payment.domain.PaymentRemoteUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PaymentModule_ProvidePaymentRemoteUseCaseFactory
    implements Factory<PaymentRemoteUseCase> {
  private final PaymentModule module;

  private final Provider<PaymentRepo.PaymentRemoteData> paymentRemoteDataProvider;

  public PaymentModule_ProvidePaymentRemoteUseCaseFactory(
      PaymentModule module, Provider<PaymentRepo.PaymentRemoteData> paymentRemoteDataProvider) {
    this.module = module;
    this.paymentRemoteDataProvider = paymentRemoteDataProvider;
  }

  @Override
  public PaymentRemoteUseCase get() {
    return Preconditions.checkNotNull(
        module.providePaymentRemoteUseCase(paymentRemoteDataProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PaymentRemoteUseCase> create(
      PaymentModule module, Provider<PaymentRepo.PaymentRemoteData> paymentRemoteDataProvider) {
    return new PaymentModule_ProvidePaymentRemoteUseCaseFactory(module, paymentRemoteDataProvider);
  }

  public static PaymentRemoteUseCase proxyProvidePaymentRemoteUseCase(
      PaymentModule instance, PaymentRepo.PaymentRemoteData paymentRemoteData) {
    return instance.providePaymentRemoteUseCase(paymentRemoteData);
  }
}
