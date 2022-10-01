package com.auro.application.core.application.di.module;

import com.auro.application.core.application.di.component.ViewModelFactory;
import com.auro.application.quiz.domain.QuizNativeRemoteUseCase;
import com.auro.application.quiz.domain.QuizNativeUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuizModule_ProvideQuizTestNativeFragmentModelFactoryFactory
    implements Factory<ViewModelFactory> {
  private final QuizModule module;

  private final Provider<QuizNativeUseCase> quizNativeUseCaseProvider;

  private final Provider<QuizNativeRemoteUseCase> quizNativeRemoteUseCaseProvider;

  public QuizModule_ProvideQuizTestNativeFragmentModelFactoryFactory(
      QuizModule module,
      Provider<QuizNativeUseCase> quizNativeUseCaseProvider,
      Provider<QuizNativeRemoteUseCase> quizNativeRemoteUseCaseProvider) {
    this.module = module;
    this.quizNativeUseCaseProvider = quizNativeUseCaseProvider;
    this.quizNativeRemoteUseCaseProvider = quizNativeRemoteUseCaseProvider;
  }

  @Override
  public ViewModelFactory get() {
    return Preconditions.checkNotNull(
        module.provideQuizTestNativeFragmentModelFactory(
            quizNativeUseCaseProvider.get(), quizNativeRemoteUseCaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ViewModelFactory> create(
      QuizModule module,
      Provider<QuizNativeUseCase> quizNativeUseCaseProvider,
      Provider<QuizNativeRemoteUseCase> quizNativeRemoteUseCaseProvider) {
    return new QuizModule_ProvideQuizTestNativeFragmentModelFactoryFactory(
        module, quizNativeUseCaseProvider, quizNativeRemoteUseCaseProvider);
  }

  public static ViewModelFactory proxyProvideQuizTestNativeFragmentModelFactory(
      QuizModule instance,
      QuizNativeUseCase quizNativeUseCase,
      QuizNativeRemoteUseCase quizNativeRemoteUseCase) {
    return instance.provideQuizTestNativeFragmentModelFactory(
        quizNativeUseCase, quizNativeRemoteUseCase);
  }
}
