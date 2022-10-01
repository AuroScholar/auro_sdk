package com.auro.application.core.application.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UtilsModule_ProvideInterceptorFactory
    implements Factory<HttpLoggingInterceptor> {
  private final UtilsModule module;

  public UtilsModule_ProvideInterceptorFactory(UtilsModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return Preconditions.checkNotNull(
        module.provideInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HttpLoggingInterceptor> create(UtilsModule module) {
    return new UtilsModule_ProvideInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor proxyProvideInterceptor(UtilsModule instance) {
    return instance.provideInterceptor();
  }
}
