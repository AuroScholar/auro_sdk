package com.auro.application.core.application.di.module;

import com.auro.application.core.application.di.component.ViewModelFactory;
import com.auro.application.payment.domain.PaymentRemoteUseCase;
import com.auro.application.payment.domain.PaymentUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PaymentModule_ProvideBankFragmentViewModelFactoryFactory
    implements Factory<ViewModelFactory> {
  private final PaymentModule module;

  private final Provider<PaymentUseCase> paymentUseCaseProvider;

  private final Provider<PaymentRemoteUseCase> paymentRemoteUseCaseProvider;

  public PaymentModule_ProvideBankFragmentViewModelFactoryFactory(
      PaymentModule module,
      Provider<PaymentUseCase> paymentUseCaseProvider,
      Provider<PaymentRemoteUseCase> paymentRemoteUseCaseProvider) {
    this.module = module;
    this.paymentUseCaseProvider = paymentUseCaseProvider;
    this.paymentRemoteUseCaseProvider = paymentRemoteUseCaseProvider;
  }

  @Override
  public ViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideBankFragmentViewModelFactory(
            paymentUseCaseProvider.get(), paymentRemoteUseCaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ViewModelFactory> create(
      PaymentModule module,
      Provider<PaymentUseCase> paymentUseCaseProvider,
      Provider<PaymentRemoteUseCase> paymentRemoteUseCaseProvider) {
    return new PaymentModule_ProvideBankFragmentViewModelFactoryFactory(
        module, paymentUseCaseProvider, paymentRemoteUseCaseProvider);
  }

  public static ViewModelFactory proxyProvideBankFragmentViewModelFactory(
      PaymentModule instance,
      PaymentUseCase paymentUseCase,
      PaymentRemoteUseCase paymentRemoteUseCase) {
    return instance.provideBankFragmentViewModelFactory(paymentUseCase, paymentRemoteUseCase);
  }
}
