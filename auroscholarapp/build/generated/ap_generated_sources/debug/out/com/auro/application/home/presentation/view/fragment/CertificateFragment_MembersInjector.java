package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CertificateFragment_MembersInjector
    implements MembersInjector<CertificateFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public CertificateFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<CertificateFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new CertificateFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(CertificateFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      CertificateFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
