package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BookedSlotListFragment_MembersInjector
    implements MembersInjector<BookedSlotListFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public BookedSlotListFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BookedSlotListFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new BookedSlotListFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(BookedSlotListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      BookedSlotListFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
