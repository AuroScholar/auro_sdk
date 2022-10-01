package com.auro.application.teacher.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateGroupFragment_MembersInjector
    implements MembersInjector<CreateGroupFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public CreateGroupFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<CreateGroupFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new CreateGroupFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(CreateGroupFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      CreateGroupFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
