package com.auro.application.core.application.di.module;

import com.auro.application.teacher.data.datasource.remote.TeacherRemoteApi;
import com.auro.application.teacher.data.repository.TeacherRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherModule_ProvideTeacherRemoteDataSourceImpFactory
    implements Factory<TeacherRepo.TeacherRemoteData> {
  private final TeacherModule module;

  private final Provider<TeacherRemoteApi> teacherRemoteApiProvider;

  public TeacherModule_ProvideTeacherRemoteDataSourceImpFactory(
      TeacherModule module, Provider<TeacherRemoteApi> teacherRemoteApiProvider) {
    this.module = module;
    this.teacherRemoteApiProvider = teacherRemoteApiProvider;
  }

  @Override
  public TeacherRepo.TeacherRemoteData get() {
    return Preconditions.checkNotNull(
        module.provideTeacherRemoteDataSourceImp(teacherRemoteApiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TeacherRepo.TeacherRemoteData> create(
      TeacherModule module, Provider<TeacherRemoteApi> teacherRemoteApiProvider) {
    return new TeacherModule_ProvideTeacherRemoteDataSourceImpFactory(
        module, teacherRemoteApiProvider);
  }

  public static TeacherRepo.TeacherRemoteData proxyProvideTeacherRemoteDataSourceImp(
      TeacherModule instance, TeacherRemoteApi teacherRemoteApi) {
    return instance.provideTeacherRemoteDataSourceImp(teacherRemoteApi);
  }
}
