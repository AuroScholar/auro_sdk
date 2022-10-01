package com.auro.application.core.application.di.module;

import com.auro.application.teacher.data.repository.TeacherRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherModule_ProvideTeacherDbDataSourceImpFactory
    implements Factory<TeacherRepo.TeacherDbData> {
  private final TeacherModule module;

  public TeacherModule_ProvideTeacherDbDataSourceImpFactory(TeacherModule module) {
    this.module = module;
  }

  @Override
  public TeacherRepo.TeacherDbData get() {
    return Preconditions.checkNotNull(
        module.provideTeacherDbDataSourceImp(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TeacherRepo.TeacherDbData> create(TeacherModule module) {
    return new TeacherModule_ProvideTeacherDbDataSourceImpFactory(module);
  }

  public static TeacherRepo.TeacherDbData proxyProvideTeacherDbDataSourceImp(
      TeacherModule instance) {
    return instance.provideTeacherDbDataSourceImp();
  }
}
