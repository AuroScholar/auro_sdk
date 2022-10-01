package com.auro.application.kyc.presentation.view.fragment;

import com.auro.application.core.application.di.component.ViewModelFactory;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UploadDocumentFragment_MembersInjector
    implements MembersInjector<UploadDocumentFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public UploadDocumentFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UploadDocumentFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new UploadDocumentFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UploadDocumentFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      UploadDocumentFragment instance, ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
