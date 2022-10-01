package com.auro.application.util.alert_dialog;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpComingTimeSlotDialog_MembersInjector
    implements MembersInjector<UpComingTimeSlotDialog> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public UpComingTimeSlotDialog_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UpComingTimeSlotDialog> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new UpComingTimeSlotDialog_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UpComingTimeSlotDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      UpComingTimeSlotDialog instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
