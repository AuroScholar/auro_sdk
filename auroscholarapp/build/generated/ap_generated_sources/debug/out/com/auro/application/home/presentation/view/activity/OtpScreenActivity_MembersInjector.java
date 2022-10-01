package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtpScreenActivity_MembersInjector implements MembersInjector<OtpScreenActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public OtpScreenActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<OtpScreenActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new OtpScreenActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(OtpScreenActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      OtpScreenActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
