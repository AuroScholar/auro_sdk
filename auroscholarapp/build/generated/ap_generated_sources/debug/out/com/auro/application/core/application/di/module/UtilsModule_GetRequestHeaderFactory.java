package com.auro.application.core.application.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UtilsModule_GetRequestHeaderFactory implements Factory<OkHttpClient> {
  private final UtilsModule module;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public UtilsModule_GetRequestHeaderFactory(
      UtilsModule module, Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.module = module;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.getRequestHeader(httpLoggingInterceptorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      UtilsModule module, Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new UtilsModule_GetRequestHeaderFactory(module, httpLoggingInterceptorProvider);
  }

  public static OkHttpClient proxyGetRequestHeader(
      UtilsModule instance, HttpLoggingInterceptor httpLoggingInterceptor) {
    return instance.getRequestHeader(httpLoggingInterceptor);
  }
}
