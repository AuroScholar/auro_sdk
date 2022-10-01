package com.auro.application.home.presentation.view.fragment;

import com.auro.application.databinding.ActivityParentProfileDemoBinding;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ParentProfileFragment_MembersInjector
    implements MembersInjector<ParentProfileFragment> {
  private final Provider<ActivityParentProfileDemoBinding> bindingProvider;

  public ParentProfileFragment_MembersInjector(
      Provider<ActivityParentProfileDemoBinding> bindingProvider) {
    this.bindingProvider = bindingProvider;
  }

  public static MembersInjector<ParentProfileFragment> create(
      Provider<ActivityParentProfileDemoBinding> bindingProvider) {
    return new ParentProfileFragment_MembersInjector(bindingProvider);
  }

  @Override
  public void injectMembers(ParentProfileFragment instance) {
    injectBinding(instance, bindingProvider.get());
  }

  public static void injectBinding(
      ParentProfileFragment instance, ActivityParentProfileDemoBinding binding) {
    instance.binding = binding;
  }
}
