package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FriendRequestListDialogFragment_MembersInjector
    implements MembersInjector<FriendRequestListDialogFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public FriendRequestListDialogFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<FriendRequestListDialogFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new FriendRequestListDialogFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(FriendRequestListDialogFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      FriendRequestListDialogFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
