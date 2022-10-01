package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubjectPreferencesActivity_MembersInjector
    implements MembersInjector<SubjectPreferencesActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SubjectPreferencesActivity_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SubjectPreferencesActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SubjectPreferencesActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SubjectPreferencesActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      SubjectPreferencesActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
