package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtpActivity_MembersInjector implements MembersInjector<OtpActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public OtpActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<OtpActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new OtpActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(OtpActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      OtpActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
