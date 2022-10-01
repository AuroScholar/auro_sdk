package com.auro.application.core.application.di.module;

import com.auro.application.quiz.data.datasource.remote.QuizRemoteApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizModule_ProvideDashBoardApiFactory implements Factory<QuizRemoteApi> {
  private final QuizModule module;

  private final Provider<Retrofit> retrofitProvider;

  public QuizModule_ProvideDashBoardApiFactory(
      QuizModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public QuizRemoteApi get() {
    return Preconditions.checkNotNull(
        module.provideDashBoardApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<QuizRemoteApi> create(
      QuizModule module, Provider<Retrofit> retrofitProvider) {
    return new QuizModule_ProvideDashBoardApiFactory(module, retrofitProvider);
  }

  public static QuizRemoteApi proxyProvideDashBoardApi(QuizModule instance, Retrofit retrofit) {
    return instance.provideDashBoardApi(retrofit);
  }
}
