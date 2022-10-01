package com.auro.application.core.application.di.module;

import com.auro.application.teacher.data.repository.TeacherRepo;
import com.auro.application.teacher.domain.TeacherDbUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherModule_ProvideTeacherDbUseCaseFactory
    implements Factory<TeacherDbUseCase> {
  private final TeacherModule module;

  private final Provider<TeacherRepo.TeacherDbData> teacherDbDataProvider;

  public TeacherModule_ProvideTeacherDbUseCaseFactory(
      TeacherModule module, Provider<TeacherRepo.TeacherDbData> teacherDbDataProvider) {
    this.module = module;
    this.teacherDbDataProvider = teacherDbDataProvider;
  }

  @Override
  public TeacherDbUseCase get() {
    return Preconditions.checkNotNull(
        module.provideTeacherDbUseCase(teacherDbDataProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TeacherDbUseCase> create(
      TeacherModule module, Provider<TeacherRepo.TeacherDbData> teacherDbDataProvider) {
    return new TeacherModule_ProvideTeacherDbUseCaseFactory(module, teacherDbDataProvider);
  }

  public static TeacherDbUseCase proxyProvideTeacherDbUseCase(
      TeacherModule instance, TeacherRepo.TeacherDbData teacherDbData) {
    return instance.provideTeacherDbUseCase(teacherDbData);
  }
}
