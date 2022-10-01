package com.auro.application.home.presentation.view.activity;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChooseGradeActivity_MembersInjector
    implements MembersInjector<ChooseGradeActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public ChooseGradeActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ChooseGradeActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new ChooseGradeActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ChooseGradeActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ChooseGradeActivity instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
