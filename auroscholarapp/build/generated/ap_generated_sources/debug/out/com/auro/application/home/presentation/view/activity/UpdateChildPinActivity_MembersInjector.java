package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateChildPinActivity_MembersInjector
    implements MembersInjector<UpdateChildPinActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public UpdateChildPinActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UpdateChildPinActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new UpdateChildPinActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UpdateChildPinActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      UpdateChildPinActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
