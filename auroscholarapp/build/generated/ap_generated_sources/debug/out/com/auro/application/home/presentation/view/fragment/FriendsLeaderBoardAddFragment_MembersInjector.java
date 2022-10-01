package com.auro.application.home.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FriendsLeaderBoardAddFragment_MembersInjector
    implements MembersInjector<FriendsLeaderBoardAddFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public FriendsLeaderBoardAddFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<FriendsLeaderBoardAddFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new FriendsLeaderBoardAddFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(FriendsLeaderBoardAddFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      FriendsLeaderBoardAddFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
