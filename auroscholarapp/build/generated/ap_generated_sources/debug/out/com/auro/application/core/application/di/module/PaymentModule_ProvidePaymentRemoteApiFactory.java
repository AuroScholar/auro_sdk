package com.auro.application.core.application.di.module;

import com.auro.application.payment.data.datasource.remote.PaymentRemoteApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PaymentModule_ProvidePaymentRemoteApiFactory
    implements Factory<PaymentRemoteApi> {
  private final PaymentModule module;

  private final Provider<Retrofit> retrofitProvider;

  public PaymentModule_ProvidePaymentRemoteApiFactory(
      PaymentModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PaymentRemoteApi get() {
    return Preconditions.checkNotNull(
        module.providePaymentRemoteApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PaymentRemoteApi> create(
      PaymentModule module, Provider<Retrofit> retrofitProvider) {
    return new PaymentModule_ProvidePaymentRemoteApiFactory(module, retrofitProvider);
  }

  public static PaymentRemoteApi proxyProvidePaymentRemoteApi(
      PaymentModule instance, Retrofit retrofit) {
    return instance.providePaymentRemoteApi(retrofit);
  }
}
