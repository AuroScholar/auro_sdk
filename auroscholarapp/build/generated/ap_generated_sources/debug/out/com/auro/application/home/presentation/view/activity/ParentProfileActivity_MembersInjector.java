package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ParentProfileActivity_MembersInjector
    implements MembersInjector<ParentProfileActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public ParentProfileActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ParentProfileActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new ParentProfileActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ParentProfileActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ParentProfileActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
