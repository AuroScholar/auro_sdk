package com.auro.application.core.application.di.module;

import com.auro.application.payment.data.datasource.remote.PaymentRemoteApi;
import com.auro.application.payment.data.repository.PaymentRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PaymentModule_ProvidePaymentRemoteDataSourceImpFactory
    implements Factory<PaymentRepo.PaymentRemoteData> {
  private final PaymentModule module;

  private final Provider<PaymentRemoteApi> paymentRemoteApiProvider;

  public PaymentModule_ProvidePaymentRemoteDataSourceImpFactory(
      PaymentModule module, Provider<PaymentRemoteApi> paymentRemoteApiProvider) {
    this.module = module;
    this.paymentRemoteApiProvider = paymentRemoteApiProvider;
  }

  @Override
  public PaymentRepo.PaymentRemoteData get() {
    return Preconditions.checkNotNull(
        module.providePaymentRemoteDataSourceImp(paymentRemoteApiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PaymentRepo.PaymentRemoteData> create(
      PaymentModule module, Provider<PaymentRemoteApi> paymentRemoteApiProvider) {
    return new PaymentModule_ProvidePaymentRemoteDataSourceImpFactory(
        module, paymentRemoteApiProvider);
  }

  public static PaymentRepo.PaymentRemoteData proxyProvidePaymentRemoteDataSourceImp(
      PaymentModule instance, PaymentRemoteApi paymentRemoteApi) {
    return instance.providePaymentRemoteDataSourceImp(paymentRemoteApi);
  }
}
