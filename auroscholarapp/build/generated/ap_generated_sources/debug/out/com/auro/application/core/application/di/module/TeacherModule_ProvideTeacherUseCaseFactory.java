package com.auro.application.core.application.di.module;

import com.auro.application.teacher.domain.TeacherUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherModule_ProvideTeacherUseCaseFactory implements Factory<TeacherUseCase> {
  private final TeacherModule module;

  public TeacherModule_ProvideTeacherUseCaseFactory(TeacherModule module) {
    this.module = module;
  }

  @Override
  public TeacherUseCase get() {
    return Preconditions.checkNotNull(
        module.provideTeacherUseCase(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TeacherUseCase> create(TeacherModule module) {
    return new TeacherModule_ProvideTeacherUseCaseFactory(module);
  }

  public static TeacherUseCase proxyProvideTeacherUseCase(TeacherModule instance) {
    return instance.provideTeacherUseCase();
  }
}
