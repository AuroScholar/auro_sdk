package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FriendsLeaderBoardListFragment_MembersInjector
    implements MembersInjector<FriendsLeaderBoardListFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public FriendsLeaderBoardListFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<FriendsLeaderBoardListFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new FriendsLeaderBoardListFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(FriendsLeaderBoardListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      FriendsLeaderBoardListFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
