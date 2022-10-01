package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InviteFriendDialog_MembersInjector
    implements MembersInjector<InviteFriendDialog> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public InviteFriendDialog_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<InviteFriendDialog> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new InviteFriendDialog_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(InviteFriendDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      InviteFriendDialog instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
