package com.auro.application.core.application.di.module;

import com.auro.application.teacher.data.repository.TeacherRepo;
import com.auro.application.teacher.domain.TeacherRemoteUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherModule_ProvideTeacherRemoteUseCaseFactory
    implements Factory<TeacherRemoteUseCase> {
  private final TeacherModule module;

  private final Provider<TeacherRepo.TeacherRemoteData> teacherRemoteDataProvider;

  public TeacherModule_ProvideTeacherRemoteUseCaseFactory(
      TeacherModule module, Provider<TeacherRepo.TeacherRemoteData> teacherRemoteDataProvider) {
    this.module = module;
    this.teacherRemoteDataProvider = teacherRemoteDataProvider;
  }

  @Override
  public TeacherRemoteUseCase get() {
    return Preconditions.checkNotNull(
        module.provideTeacherRemoteUseCase(teacherRemoteDataProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TeacherRemoteUseCase> create(
      TeacherModule module, Provider<TeacherRepo.TeacherRemoteData> teacherRemoteDataProvider) {
    return new TeacherModule_ProvideTeacherRemoteUseCaseFactory(module, teacherRemoteDataProvider);
  }

  public static TeacherRemoteUseCase proxyProvideTeacherRemoteUseCase(
      TeacherModule instance, TeacherRepo.TeacherRemoteData teacherRemoteData) {
    return instance.provideTeacherRemoteUseCase(teacherRemoteData);
  }
}
