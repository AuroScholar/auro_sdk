package com.auro.application.kyc.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KycNewScreenFragment_MembersInjector
    implements MembersInjector<KycNewScreenFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public KycNewScreenFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<KycNewScreenFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new KycNewScreenFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(KycNewScreenFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      KycNewScreenFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}