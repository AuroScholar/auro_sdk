package com.auro.application.core.application.di.module;

import com.auro.application.quiz.data.repository.QuizRepo;
import com.auro.application.quiz.domain.QuizNativeRemoteUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizModule_ProvideQuizNativeRemoteUseCaseFactory
    implements Factory<QuizNativeRemoteUseCase> {
  private final QuizModule module;

  private final Provider<QuizRepo.QuizRemoteData> quizRemoteDataProvider;

  public QuizModule_ProvideQuizNativeRemoteUseCaseFactory(
      QuizModule module, Provider<QuizRepo.QuizRemoteData> quizRemoteDataProvider) {
    this.module = module;
    this.quizRemoteDataProvider = quizRemoteDataProvider;
  }

  @Override
  public QuizNativeRemoteUseCase get() {
    return Preconditions.checkNotNull(
        module.provideQuizNativeRemoteUseCase(quizRemoteDataProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<QuizNativeRemoteUseCase> create(
      QuizModule module, Provider<QuizRepo.QuizRemoteData> quizRemoteDataProvider) {
    return new QuizModule_ProvideQuizNativeRemoteUseCaseFactory(module, quizRemoteDataProvider);
  }

  public static QuizNativeRemoteUseCase proxyProvideQuizNativeRemoteUseCase(
      QuizModule instance, QuizRepo.QuizRemoteData quizRemoteData) {
    return instance.provideQuizNativeRemoteUseCase(quizRemoteData);
  }
}
