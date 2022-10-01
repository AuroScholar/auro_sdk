package com.auro.application.core.application.di.module;

import com.auro.application.quiz.data.datasource.remote.QuizRemoteApi;
import com.auro.application.quiz.data.repository.QuizRepo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizModule_ProvideQuizRemoteDataSourceImpFactory
    implements Factory<QuizRepo.QuizRemoteData> {
  private final QuizModule module;

  private final Provider<QuizRemoteApi> quizRemoteApiProvider;

  public QuizModule_ProvideQuizRemoteDataSourceImpFactory(
      QuizModule module, Provider<QuizRemoteApi> quizRemoteApiProvider) {
    this.module = module;
    this.quizRemoteApiProvider = quizRemoteApiProvider;
  }

  @Override
  public QuizRepo.QuizRemoteData get() {
    return Preconditions.checkNotNull(
        module.provideQuizRemoteDataSourceImp(quizRemoteApiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<QuizRepo.QuizRemoteData> create(
      QuizModule module, Provider<QuizRemoteApi> quizRemoteApiProvider) {
    return new QuizModule_ProvideQuizRemoteDataSourceImpFactory(module, quizRemoteApiProvider);
  }

  public static QuizRepo.QuizRemoteData proxyProvideQuizRemoteDataSourceImp(
      QuizModule instance, QuizRemoteApi quizRemoteApi) {
    return instance.provideQuizRemoteDataSourceImp(quizRemoteApi);
  }
}
