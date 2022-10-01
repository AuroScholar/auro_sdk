package com.auro.application.core.application.di.module;

import com.auro.application.core.application.di.component.ViewModelFactory;
import com.auro.application.teacher.domain.TeacherDbUseCase;
import com.auro.application.teacher.domain.TeacherRemoteUseCase;
import com.auro.application.teacher.domain.TeacherUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherModule_ProvideSliderViewModelModelFactoryFactory
    implements Factory<ViewModelFactory> {
  private final TeacherModule module;

  private final Provider<TeacherUseCase> teacherUseCaseProvider;

  private final Provider<TeacherDbUseCase> teacherDbUseCaseProvider;

  private final Provider<TeacherRemoteUseCase> teacherRemoteUseCaseProvider;

  public TeacherModule_ProvideSliderViewModelModelFactoryFactory(
      TeacherModule module,
      Provider<TeacherUseCase> teacherUseCaseProvider,
      Provider<TeacherDbUseCase> teacherDbUseCaseProvider,
      Provider<TeacherRemoteUseCase> teacherRemoteUseCaseProvider) {
    this.module = module;
    this.teacherUseCaseProvider = teacherUseCaseProvider;
    this.teacherDbUseCaseProvider = teacherDbUseCaseProvider;
    this.teacherRemoteUseCaseProvider = teacherRemoteUseCaseProvider;
  }

  @Override
  public ViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideSliderViewModelModelFactory(
            teacherUseCaseProvider.get(),
            teacherDbUseCaseProvider.get(),
            teacherRemoteUseCaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ViewModelFactory> create(
      TeacherModule module,
      Provider<TeacherUseCase> teacherUseCaseProvider,
      Provider<TeacherDbUseCase> teacherDbUseCaseProvider,
      Provider<TeacherRemoteUseCase> teacherRemoteUseCaseProvider) {
    return new TeacherModule_ProvideSliderViewModelModelFactoryFactory(
        module, teacherUseCaseProvider, teacherDbUseCaseProvider, teacherRemoteUseCaseProvider);
  }

  public static ViewModelFactory proxyProvideSliderViewModelModelFactory(
      TeacherModule instance,
      TeacherUseCase teacherUseCase,
      TeacherDbUseCase teacherDbUseCase,
      TeacherRemoteUseCase teacherRemoteUseCase) {
    return instance.provideSliderViewModelModelFactory(
        teacherUseCase, teacherDbUseCase, teacherRemoteUseCase);
  }
}
