package com.auro.application.core.application.di.module;

import com.auro.application.teacher.data.datasource.remote.TeacherRemoteApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TeacherModule_ProvideTeacherRemoteApiFactory
    implements Factory<TeacherRemoteApi> {
  private final TeacherModule module;

  private final Provider<Retrofit> retrofitProvider;

  public TeacherModule_ProvideTeacherRemoteApiFactory(
      TeacherModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public TeacherRemoteApi get() {
    return Preconditions.checkNotNull(
        module.provideTeacherRemoteApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TeacherRemoteApi> create(
      TeacherModule module, Provider<Retrofit> retrofitProvider) {
    return new TeacherModule_ProvideTeacherRemoteApiFactory(module, retrofitProvider);
  }

  public static TeacherRemoteApi proxyProvideTeacherRemoteApi(
      TeacherModule instance, Retrofit retrofit) {
    return instance.provideTeacherRemoteApi(retrofit);
  }
}
