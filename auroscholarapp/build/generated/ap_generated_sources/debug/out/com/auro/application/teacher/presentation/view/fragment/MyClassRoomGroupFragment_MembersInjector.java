package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyClassRoomGroupFragment_MembersInjector
    implements MembersInjector<MyClassRoomGroupFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public MyClassRoomGroupFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<MyClassRoomGroupFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new MyClassRoomGroupFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(MyClassRoomGroupFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      MyClassRoomGroupFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
