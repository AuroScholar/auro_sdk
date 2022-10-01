package com.auro.application.core.application.di.module;

import com.auro.application.quiz.domain.QuizNativeUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizModule_ProvideQuizNativeUseCaseFactory
    implements Factory<QuizNativeUseCase> {
  private final QuizModule module;

  public QuizModule_ProvideQuizNativeUseCaseFactory(QuizModule module) {
    this.module = module;
  }

  @Override
  public QuizNativeUseCase get() {
    return Preconditions.checkNotNull(
        module.provideQuizNativeUseCase(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<QuizNativeUseCase> create(QuizModule module) {
    return new QuizModule_ProvideQuizNativeUseCaseFactory(module);
  }

  public static QuizNativeUseCase proxyProvideQuizNativeUseCase(QuizModule instance) {
    return instance.provideQuizNativeUseCase();
  }
}
