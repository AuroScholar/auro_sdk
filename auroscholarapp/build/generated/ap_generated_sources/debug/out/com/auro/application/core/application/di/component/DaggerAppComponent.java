package com.auro.application.core.application.di.component;

import com.auro.application.core.application.AuroApp;
import com.auro.application.core.application.di.module.AppModule;
import com.auro.application.core.application.di.module.HomeModule;
import com.auro.application.core.application.di.module.HomeModule_PartnersWebviewFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideAppLanguageViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideCertificateFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideCompleteStudentProfileWithPinViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideCongratulationsDialogViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideDashBoardApiFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideDashBoardMainViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideDashboardDbDataSourceImpFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideDashboardRemoteDataSourceImpFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideDashboardUseCaseFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideDemographicFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideEnterNumberActivityViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideEnterPinViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideForgotPinActivityViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideFriendRequestListDialogFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideFriendsLeaderBoardAddFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideFriendsLeaderBoardFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideFriendsLeaderBoardListFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideGradeChangeDialogViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideHomeDbUseCaseFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideHomeRemoteUseCaseFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideInviteFriendDialogViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideKYCViewFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideKYCViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideLoginActivityViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideMainQuizViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideOtpActivityViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideOtpScreenActivityViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvidePartnersViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideQuizTestFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideRegisterActivityViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideResetPasswordViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideSetPinViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideSplashScreenAnimationViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideStudentKycInfoViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideStudentProfileViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideStudentUploadDocumentFragmentFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideSubjectPreferencesFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideTeacherDashboardViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideTransactionsFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideUserProfileModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideValidateStudentActivityViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideWalletAmountViewModelFactoryFactory;
import com.auro.application.core.application.di.module.HomeModule_ProvideWalletChooseGradeViewModelFactoryFactory;
import com.auro.application.core.application.di.module.KycModule;
import com.auro.application.core.application.di.module.KycModule_ProvideKycNewFragmentModelFactoryFactory;
import com.auro.application.core.application.di.module.KycModule_ProvideKycRemoteApiFactory;
import com.auro.application.core.application.di.module.KycModule_ProvideKycRemoteDataSourceImpFactory;
import com.auro.application.core.application.di.module.KycModule_ProvideKycUseCaseFactory;
import com.auro.application.core.application.di.module.KycModule_ProvidekycRemoteUseCaseFactory;
import com.auro.application.core.application.di.module.PaymentModule;
import com.auro.application.core.application.di.module.PaymentModule_ProvideBankFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.PaymentModule_ProvidePaymentRemoteApiFactory;
import com.auro.application.core.application.di.module.PaymentModule_ProvidePaymentRemoteDataSourceImpFactory;
import com.auro.application.core.application.di.module.PaymentModule_ProvidePaymentRemoteUseCaseFactory;
import com.auro.application.core.application.di.module.PaymentModule_ProvidePaymentUseCaseFactory;
import com.auro.application.core.application.di.module.PaymentModule_ProvideSendMoneyFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.QuizModule;
import com.auro.application.core.application.di.module.QuizModule_ProvideDashBoardApiFactory;
import com.auro.application.core.application.di.module.QuizModule_ProvideQuizNativeRemoteUseCaseFactory;
import com.auro.application.core.application.di.module.QuizModule_ProvideQuizNativeUseCaseFactory;
import com.auro.application.core.application.di.module.QuizModule_ProvideQuizRemoteDataSourceImpFactory;
import com.auro.application.core.application.di.module.QuizModule_ProvideQuizTestNativeFragmentModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule;
import com.auro.application.core.application.di.module.TeacherModule_ProvideBookSlotFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideBookedSlotListViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideCreateGroupViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideHomeActivityModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideInformationDashboardDialogModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideMyClassRoomGroupViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideSliderViewModelModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherDbDataSourceImpFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherDbUseCaseFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherKycInfoFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherProfileViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherRemoteApiFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherRemoteDataSourceImpFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherRemoteUseCaseFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherSaveDetailViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideTeacherUseCaseFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideUpCommingBookFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideUpCommingTimeSlotViewModelFactoryFactory;
import com.auro.application.core.application.di.module.TeacherModule_ProvideUploadDocumentFragmentViewModelFactoryFactory;
import com.auro.application.core.application.di.module.UtilsModule;
import com.auro.application.core.application.di.module.UtilsModule_GetRequestHeaderFactory;
import com.auro.application.core.application.di.module.UtilsModule_ProvideGsonFactory;
import com.auro.application.core.application.di.module.UtilsModule_ProvideInterceptorFactory;
import com.auro.application.core.application.di.module.UtilsModule_ProvideRetrofitFactory;
import com.auro.application.home.data.datasource.remote.HomeRemoteApi;
import com.auro.application.home.data.repository.HomeRepo;
import com.auro.application.home.domain.usecase.HomeDbUseCase;
import com.auro.application.home.domain.usecase.HomeRemoteUseCase;
import com.auro.application.home.domain.usecase.HomeUseCase;
import com.auro.application.home.presentation.view.activity.AppLanguageActivity;
import com.auro.application.home.presentation.view.activity.AppLanguageActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.ChooseGradeActivity;
import com.auro.application.home.presentation.view.activity.ChooseGradeActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.CompleteStudentProfileWithPinActivity;
import com.auro.application.home.presentation.view.activity.CompleteStudentProfileWithPinActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.DashBoardMainActivity;
import com.auro.application.home.presentation.view.activity.DashBoardMainActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.EnterNumberActivity;
import com.auro.application.home.presentation.view.activity.EnterNumberActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.EnterPinActivity;
import com.auro.application.home.presentation.view.activity.EnterPinActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.ForgotPinActivity;
import com.auro.application.home.presentation.view.activity.ForgotPinActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.HomeActivity;
import com.auro.application.home.presentation.view.activity.HomeActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.LoginActivity;
import com.auro.application.home.presentation.view.activity.LoginActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.OtpActivity;
import com.auro.application.home.presentation.view.activity.OtpActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.OtpScreenActivity;
import com.auro.application.home.presentation.view.activity.OtpScreenActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.RegisterActivity;
import com.auro.application.home.presentation.view.activity.RegisterActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.ResetPasswordActivity;
import com.auro.application.home.presentation.view.activity.ResetPasswordActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.SetPinActivity;
import com.auro.application.home.presentation.view.activity.SetPinActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.SplashScreenAnimationActivity;
import com.auro.application.home.presentation.view.activity.SplashScreenAnimationActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.TeacherDashboardActivity;
import com.auro.application.home.presentation.view.activity.TeacherDashboardActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.UserProfileActivity;
import com.auro.application.home.presentation.view.activity.UserProfileActivity_MembersInjector;
import com.auro.application.home.presentation.view.activity.ValidateStudentActivity;
import com.auro.application.home.presentation.view.activity.ValidateStudentActivity_MembersInjector;
import com.auro.application.home.presentation.view.fragment.CertificateFragment;
import com.auro.application.home.presentation.view.fragment.CertificateFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.CongratulationsDialog;
import com.auro.application.home.presentation.view.fragment.CongratulationsDialog_MembersInjector;
import com.auro.application.home.presentation.view.fragment.ConsgratuationLessScoreDialog;
import com.auro.application.home.presentation.view.fragment.ConsgratuationLessScoreDialog_MembersInjector;
import com.auro.application.home.presentation.view.fragment.DemographicFragment;
import com.auro.application.home.presentation.view.fragment.DemographicFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.FriendRequestListDialogFragment;
import com.auro.application.home.presentation.view.fragment.FriendRequestListDialogFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.FriendsLeaderBoardAddFragment;
import com.auro.application.home.presentation.view.fragment.FriendsLeaderBoardAddFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.FriendsLeaderBoardFragment;
import com.auro.application.home.presentation.view.fragment.FriendsLeaderBoardFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.FriendsLeaderBoardListFragment;
import com.auro.application.home.presentation.view.fragment.FriendsLeaderBoardListFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.GradeChangeFragment;
import com.auro.application.home.presentation.view.fragment.GradeChangeFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.InviteFriendDialog;
import com.auro.application.home.presentation.view.fragment.InviteFriendDialog_MembersInjector;
import com.auro.application.home.presentation.view.fragment.KYCFragment;
import com.auro.application.home.presentation.view.fragment.KYCFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.KYCViewFragment;
import com.auro.application.home.presentation.view.fragment.KYCViewFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.MainQuizHomeFragment;
import com.auro.application.home.presentation.view.fragment.MainQuizHomeFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.PartnersFragment;
import com.auro.application.home.presentation.view.fragment.PartnersFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.PartnersWebviewFragment;
import com.auro.application.home.presentation.view.fragment.PartnersWebviewFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.PrivacyPolicyFragment;
import com.auro.application.home.presentation.view.fragment.QuizTestFragment;
import com.auro.application.home.presentation.view.fragment.QuizTestFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.StudentKycInfoFragment;
import com.auro.application.home.presentation.view.fragment.StudentKycInfoFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.StudentProfileFragment;
import com.auro.application.home.presentation.view.fragment.StudentProfileFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.StudentUploadDocumentFragment;
import com.auro.application.home.presentation.view.fragment.StudentUploadDocumentFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.SubjectPreferencesActivity;
import com.auro.application.home.presentation.view.fragment.SubjectPreferencesActivity_MembersInjector;
import com.auro.application.home.presentation.view.fragment.TransactionsFragment;
import com.auro.application.home.presentation.view.fragment.TransactionsFragment_MembersInjector;
import com.auro.application.home.presentation.view.fragment.WalletInfoDetailFragment;
import com.auro.application.home.presentation.view.fragment.WalletInfoDetailFragment_MembersInjector;
import com.auro.application.kyc.data.datasource.remote.KycRemoteApi;
import com.auro.application.kyc.data.repository.KycRepo;
import com.auro.application.kyc.domain.KycRemoteUseCase;
import com.auro.application.kyc.domain.KycUseCase;
import com.auro.application.kyc.presentation.view.fragment.KycNewScreenFragment;
import com.auro.application.kyc.presentation.view.fragment.KycNewScreenFragment_MembersInjector;
import com.auro.application.kyc.presentation.view.fragment.UploadDocumentFragment;
import com.auro.application.kyc.presentation.view.fragment.UploadDocumentFragment_MembersInjector;
import com.auro.application.payment.data.datasource.remote.PaymentRemoteApi;
import com.auro.application.payment.data.repository.PaymentRepo;
import com.auro.application.payment.domain.PaymentRemoteUseCase;
import com.auro.application.payment.domain.PaymentUseCase;
import com.auro.application.payment.presentation.view.fragment.BankFragment;
import com.auro.application.payment.presentation.view.fragment.BankFragment_MembersInjector;
import com.auro.application.payment.presentation.view.fragment.PaytmFragment;
import com.auro.application.payment.presentation.view.fragment.PaytmFragment_MembersInjector;
import com.auro.application.payment.presentation.view.fragment.SendMoneyFragment;
import com.auro.application.payment.presentation.view.fragment.SendMoneyFragment_MembersInjector;
import com.auro.application.payment.presentation.view.fragment.UPIFragment;
import com.auro.application.payment.presentation.view.fragment.UPIFragment_MembersInjector;
import com.auro.application.quiz.data.datasource.remote.QuizRemoteApi;
import com.auro.application.quiz.data.repository.QuizRepo;
import com.auro.application.quiz.domain.QuizNativeRemoteUseCase;
import com.auro.application.quiz.domain.QuizNativeUseCase;
import com.auro.application.quiz.presentation.view.fragment.QuizTestNativeFragment;
import com.auro.application.quiz.presentation.view.fragment.QuizTestNativeFragment_MembersInjector;
import com.auro.application.teacher.data.datasource.remote.TeacherRemoteApi;
import com.auro.application.teacher.data.repository.TeacherRepo;
import com.auro.application.teacher.domain.TeacherDbUseCase;
import com.auro.application.teacher.domain.TeacherRemoteUseCase;
import com.auro.application.teacher.domain.TeacherUseCase;
import com.auro.application.teacher.presentation.view.activity.TeacherProfileActivity;
import com.auro.application.teacher.presentation.view.activity.TeacherProfileActivity_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.BookSlotFragment;
import com.auro.application.teacher.presentation.view.fragment.BookSlotFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.BookedSlotListFragment;
import com.auro.application.teacher.presentation.view.fragment.BookedSlotListFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.CreateGroupFragment;
import com.auro.application.teacher.presentation.view.fragment.CreateGroupFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.InformationDashboardFragment;
import com.auro.application.teacher.presentation.view.fragment.InformationDashboardFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.MyClassRoomGroupFragment;
import com.auro.application.teacher.presentation.view.fragment.MyClassRoomGroupFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.SlideFragment;
import com.auro.application.teacher.presentation.view.fragment.SlideFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.TeacherKycInfoFragment;
import com.auro.application.teacher.presentation.view.fragment.TeacherKycInfoFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.TeacherProfileFragment;
import com.auro.application.teacher.presentation.view.fragment.TeacherProfileFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.TeacherSaveDetailFragment;
import com.auro.application.teacher.presentation.view.fragment.TeacherSaveDetailFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.TeacherUserProfileFragment;
import com.auro.application.teacher.presentation.view.fragment.TeacherUserProfileFragment_MembersInjector;
import com.auro.application.teacher.presentation.view.fragment.UpComingBookFragment;
import com.auro.application.teacher.presentation.view.fragment.UpComingBookFragment_MembersInjector;
import com.auro.application.util.alert_dialog.UpComingTimeSlotDialog;
import com.auro.application.util.alert_dialog.UpComingTimeSlotDialog_MembersInjector;
import com.google.gson.Gson;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<HomeUseCase> provideDashboardUseCaseProvider;

  private Provider<HomeRepo.DashboardDbData> provideDashboardDbDataSourceImpProvider;

  private Provider<HomeDbUseCase> provideHomeDbUseCaseProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<HttpLoggingInterceptor> provideInterceptorProvider;

  private Provider<OkHttpClient> getRequestHeaderProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<HomeRemoteApi> provideDashBoardApiProvider;

  private Provider<HomeRepo.DashboardRemoteData> provideDashboardRemoteDataSourceImpProvider;

  private Provider<HomeRemoteUseCase> provideHomeRemoteUseCaseProvider;

  private Provider<ViewModelFactory> provideStudentKycInfoViewModelFactoryProvider;

  private Provider<TeacherUseCase> provideTeacherUseCaseProvider;

  private Provider<TeacherRepo.TeacherDbData> provideTeacherDbDataSourceImpProvider;

  private Provider<TeacherDbUseCase> provideTeacherDbUseCaseProvider;

  private Provider<TeacherRemoteApi> provideTeacherRemoteApiProvider;

  private Provider<TeacherRepo.TeacherRemoteData> provideTeacherRemoteDataSourceImpProvider;

  private Provider<TeacherRemoteUseCase> provideTeacherRemoteUseCaseProvider;

  private Provider<ViewModelFactory> provideTeacherKycInfoFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideStudentUploadDocumentFragmentFactoryProvider;

  private Provider<ViewModelFactory> provideEnterPinViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideRegisterActivityViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideForgotPinActivityViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideValidateStudentActivityViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideEnterNumberActivityViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideOtpActivityViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideBookSlotFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> providePartnersViewModelFactoryProvider;

  private Provider<ViewModelFactory> PartnersWebviewFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideSubjectPreferencesFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideCertificateFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideKYCViewFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideQuizTestFragmentViewModelFactoryProvider;

  private Provider<PaymentUseCase> providePaymentUseCaseProvider;

  private Provider<PaymentRemoteApi> providePaymentRemoteApiProvider;

  private Provider<PaymentRepo.PaymentRemoteData> providePaymentRemoteDataSourceImpProvider;

  private Provider<PaymentRemoteUseCase> providePaymentRemoteUseCaseProvider;

  private Provider<ViewModelFactory> provideBankFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideSendMoneyFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideOtpScreenActivityViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideGradeChangeDialogViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideFriendsLeaderBoardFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideFriendsLeaderBoardAddFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideFriendsLeaderBoardListFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideInviteFriendDialogViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideCongratulationsDialogViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideTransactionsFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideTeacherSaveDetailViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideTeacherProfileViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideFriendRequestListDialogFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideKYCViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideHomeActivityModelFactoryProvider;

  private Provider<ViewModelFactory> provideDemographicFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideStudentProfileViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideWalletAmountViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideLoginActivityViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideWalletChooseGradeViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideCompleteStudentProfileWithPinViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideAppLanguageViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideDashBoardMainViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideMainQuizViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideUserProfileModelFactoryProvider;

  private Provider<ViewModelFactory> provideSplashScreenAnimationViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideInformationDashboardDialogModelFactoryProvider;

  private Provider<ViewModelFactory> provideTeacherDashboardViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideSliderViewModelModelFactoryProvider;

  private Provider<ViewModelFactory> provideCreateGroupViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideMyClassRoomGroupViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideBookedSlotListViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideUpCommingBookFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideResetPasswordViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideTeacherModelFactoryProvider;

  private Provider<QuizNativeUseCase> provideQuizNativeUseCaseProvider;

  private Provider<QuizRemoteApi> provideDashBoardApiProvider2;

  private Provider<QuizRepo.QuizRemoteData> provideQuizRemoteDataSourceImpProvider;

  private Provider<QuizNativeRemoteUseCase> provideQuizNativeRemoteUseCaseProvider;

  private Provider<ViewModelFactory> provideQuizTestNativeFragmentModelFactoryProvider;

  private Provider<KycUseCase> provideKycUseCaseProvider;

  private Provider<KycRemoteApi> provideKycRemoteApiProvider;

  private Provider<KycRepo.KycRemoteData> provideKycRemoteDataSourceImpProvider;

  private Provider<KycRemoteUseCase> providekycRemoteUseCaseProvider;

  private Provider<ViewModelFactory> provideKycNewFragmentModelFactoryProvider;

  private Provider<ViewModelFactory> provideSetPinViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideUploadDocumentFragmentViewModelFactoryProvider;

  private Provider<ViewModelFactory> provideUpCommingTimeSlotViewModelFactoryProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideDashboardUseCaseProvider =
        DoubleCheck.provider(HomeModule_ProvideDashboardUseCaseFactory.create(builder.homeModule));
    this.provideDashboardDbDataSourceImpProvider =
        DoubleCheck.provider(
            HomeModule_ProvideDashboardDbDataSourceImpFactory.create(builder.homeModule));
    this.provideHomeDbUseCaseProvider =
        DoubleCheck.provider(
            HomeModule_ProvideHomeDbUseCaseFactory.create(
                builder.homeModule, provideDashboardDbDataSourceImpProvider));
    this.provideGsonProvider =
        DoubleCheck.provider(UtilsModule_ProvideGsonFactory.create(builder.utilsModule));
    this.provideInterceptorProvider =
        DoubleCheck.provider(UtilsModule_ProvideInterceptorFactory.create(builder.utilsModule));
    this.getRequestHeaderProvider =
        DoubleCheck.provider(
            UtilsModule_GetRequestHeaderFactory.create(
                builder.utilsModule, provideInterceptorProvider));
    this.provideRetrofitProvider =
        DoubleCheck.provider(
            UtilsModule_ProvideRetrofitFactory.create(
                builder.utilsModule, provideGsonProvider, getRequestHeaderProvider));
    this.provideDashBoardApiProvider =
        DoubleCheck.provider(
            HomeModule_ProvideDashBoardApiFactory.create(
                builder.homeModule, provideRetrofitProvider));
    this.provideDashboardRemoteDataSourceImpProvider =
        DoubleCheck.provider(
            HomeModule_ProvideDashboardRemoteDataSourceImpFactory.create(
                builder.homeModule, provideDashBoardApiProvider));
    this.provideHomeRemoteUseCaseProvider =
        DoubleCheck.provider(
            HomeModule_ProvideHomeRemoteUseCaseFactory.create(
                builder.homeModule, provideDashboardRemoteDataSourceImpProvider));
    this.provideStudentKycInfoViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideStudentKycInfoViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideTeacherUseCaseProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherUseCaseFactory.create(builder.teacherModule));
    this.provideTeacherDbDataSourceImpProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherDbDataSourceImpFactory.create(builder.teacherModule));
    this.provideTeacherDbUseCaseProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherDbUseCaseFactory.create(
                builder.teacherModule, provideTeacherDbDataSourceImpProvider));
    this.provideTeacherRemoteApiProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherRemoteApiFactory.create(
                builder.teacherModule, provideRetrofitProvider));
    this.provideTeacherRemoteDataSourceImpProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherRemoteDataSourceImpFactory.create(
                builder.teacherModule, provideTeacherRemoteApiProvider));
    this.provideTeacherRemoteUseCaseProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherRemoteUseCaseFactory.create(
                builder.teacherModule, provideTeacherRemoteDataSourceImpProvider));
    this.provideTeacherKycInfoFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherKycInfoFragmentViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideStudentUploadDocumentFragmentFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideStudentUploadDocumentFragmentFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideEnterPinViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideEnterPinViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideRegisterActivityViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideRegisterActivityViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideForgotPinActivityViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideForgotPinActivityViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideValidateStudentActivityViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideValidateStudentActivityViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideEnterNumberActivityViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideEnterNumberActivityViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideOtpActivityViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideOtpActivityViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideBookSlotFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideBookSlotFragmentViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.providePartnersViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvidePartnersViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.PartnersWebviewFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_PartnersWebviewFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideSubjectPreferencesFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideSubjectPreferencesFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideCertificateFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideCertificateFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideKYCViewFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideKYCViewFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideQuizTestFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideQuizTestFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.providePaymentUseCaseProvider =
        DoubleCheck.provider(
            PaymentModule_ProvidePaymentUseCaseFactory.create(builder.paymentModule));
    this.providePaymentRemoteApiProvider =
        DoubleCheck.provider(
            PaymentModule_ProvidePaymentRemoteApiFactory.create(
                builder.paymentModule, provideRetrofitProvider));
    this.providePaymentRemoteDataSourceImpProvider =
        DoubleCheck.provider(
            PaymentModule_ProvidePaymentRemoteDataSourceImpFactory.create(
                builder.paymentModule, providePaymentRemoteApiProvider));
    this.providePaymentRemoteUseCaseProvider =
        DoubleCheck.provider(
            PaymentModule_ProvidePaymentRemoteUseCaseFactory.create(
                builder.paymentModule, providePaymentRemoteDataSourceImpProvider));
    this.provideBankFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            PaymentModule_ProvideBankFragmentViewModelFactoryFactory.create(
                builder.paymentModule,
                providePaymentUseCaseProvider,
                providePaymentRemoteUseCaseProvider));
    this.provideSendMoneyFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            PaymentModule_ProvideSendMoneyFragmentViewModelFactoryFactory.create(
                builder.paymentModule,
                providePaymentUseCaseProvider,
                providePaymentRemoteUseCaseProvider));
    this.provideOtpScreenActivityViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideOtpScreenActivityViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideGradeChangeDialogViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideGradeChangeDialogViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideFriendsLeaderBoardFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideFriendsLeaderBoardFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideFriendsLeaderBoardAddFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideFriendsLeaderBoardAddFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideFriendsLeaderBoardListFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideFriendsLeaderBoardListFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideInviteFriendDialogViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideInviteFriendDialogViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideCongratulationsDialogViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideCongratulationsDialogViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideTransactionsFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideTransactionsFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideTeacherSaveDetailViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherSaveDetailViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideTeacherProfileViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherProfileViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideFriendRequestListDialogFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideFriendRequestListDialogFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideKYCViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideKYCViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideHomeActivityModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideHomeActivityModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideDemographicFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideDemographicFragmentViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideStudentProfileViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideStudentProfileViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideWalletAmountViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideWalletAmountViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideLoginActivityViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideLoginActivityViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideWalletChooseGradeViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideWalletChooseGradeViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideCompleteStudentProfileWithPinViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideCompleteStudentProfileWithPinViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideAppLanguageViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideAppLanguageViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideDashBoardMainViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideDashBoardMainViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideMainQuizViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideMainQuizViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideUserProfileModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideUserProfileModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideSplashScreenAnimationViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideSplashScreenAnimationViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideInformationDashboardDialogModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideInformationDashboardDialogModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideTeacherDashboardViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideTeacherDashboardViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideSliderViewModelModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideSliderViewModelModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideCreateGroupViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideCreateGroupViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideMyClassRoomGroupViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideMyClassRoomGroupViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideBookedSlotListViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideBookedSlotListViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideUpCommingBookFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideUpCommingBookFragmentViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideResetPasswordViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideResetPasswordViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideTeacherModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideTeacherModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideQuizNativeUseCaseProvider =
        DoubleCheck.provider(QuizModule_ProvideQuizNativeUseCaseFactory.create(builder.quizModule));
    this.provideDashBoardApiProvider2 =
        DoubleCheck.provider(
            QuizModule_ProvideDashBoardApiFactory.create(
                builder.quizModule, provideRetrofitProvider));
    this.provideQuizRemoteDataSourceImpProvider =
        DoubleCheck.provider(
            QuizModule_ProvideQuizRemoteDataSourceImpFactory.create(
                builder.quizModule, provideDashBoardApiProvider2));
    this.provideQuizNativeRemoteUseCaseProvider =
        DoubleCheck.provider(
            QuizModule_ProvideQuizNativeRemoteUseCaseFactory.create(
                builder.quizModule, provideQuizRemoteDataSourceImpProvider));
    this.provideQuizTestNativeFragmentModelFactoryProvider =
        DoubleCheck.provider(
            QuizModule_ProvideQuizTestNativeFragmentModelFactoryFactory.create(
                builder.quizModule,
                provideQuizNativeUseCaseProvider,
                provideQuizNativeRemoteUseCaseProvider));
    this.provideKycUseCaseProvider =
        DoubleCheck.provider(KycModule_ProvideKycUseCaseFactory.create(builder.kycModule));
    this.provideKycRemoteApiProvider =
        DoubleCheck.provider(
            KycModule_ProvideKycRemoteApiFactory.create(
                builder.kycModule, provideRetrofitProvider));
    this.provideKycRemoteDataSourceImpProvider =
        DoubleCheck.provider(
            KycModule_ProvideKycRemoteDataSourceImpFactory.create(
                builder.kycModule, provideKycRemoteApiProvider));
    this.providekycRemoteUseCaseProvider =
        DoubleCheck.provider(
            KycModule_ProvidekycRemoteUseCaseFactory.create(
                builder.kycModule, provideKycRemoteDataSourceImpProvider));
    this.provideKycNewFragmentModelFactoryProvider =
        DoubleCheck.provider(
            KycModule_ProvideKycNewFragmentModelFactoryFactory.create(
                builder.kycModule, provideKycUseCaseProvider, providekycRemoteUseCaseProvider));
    this.provideSetPinViewModelFactoryProvider =
        DoubleCheck.provider(
            HomeModule_ProvideSetPinViewModelFactoryFactory.create(
                builder.homeModule,
                provideDashboardUseCaseProvider,
                provideHomeDbUseCaseProvider,
                provideHomeRemoteUseCaseProvider));
    this.provideUploadDocumentFragmentViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideUploadDocumentFragmentViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
    this.provideUpCommingTimeSlotViewModelFactoryProvider =
        DoubleCheck.provider(
            TeacherModule_ProvideUpCommingTimeSlotViewModelFactoryFactory.create(
                builder.teacherModule,
                provideTeacherUseCaseProvider,
                provideTeacherDbUseCaseProvider,
                provideTeacherRemoteUseCaseProvider));
  }

  @Override
  public void injectAppContext(AuroApp reciprociApp) {}

  @Override
  public void doInjection(StudentKycInfoFragment fragment) {
    injectStudentKycInfoFragment(fragment);
  }

  @Override
  public void doInjection(TeacherKycInfoFragment fragment) {
    injectTeacherKycInfoFragment(fragment);
  }

  @Override
  public void doInjection(StudentUploadDocumentFragment fragment) {
    injectStudentUploadDocumentFragment(fragment);
  }

  @Override
  public void doInjection(EnterPinActivity enterPinActivity) {
    injectEnterPinActivity(enterPinActivity);
  }

  @Override
  public void doInjection(RegisterActivity activity) {
    injectRegisterActivity(activity);
  }

  @Override
  public void doInjection(ForgotPinActivity activity) {
    injectForgotPinActivity(activity);
  }

  @Override
  public void doInjection(ValidateStudentActivity activity) {
    injectValidateStudentActivity(activity);
  }

  @Override
  public void doInjection(EnterNumberActivity activity) {
    injectEnterNumberActivity(activity);
  }

  @Override
  public void doInjection(OtpActivity otpActivity) {
    injectOtpActivity(otpActivity);
  }

  @Override
  public void doInjection(BookSlotFragment fragment) {
    injectBookSlotFragment(fragment);
  }

  @Override
  public void doInjection(PartnersFragment fragment) {
    injectPartnersFragment(fragment);
  }

  @Override
  public void doInjection(PartnersWebviewFragment fragment) {
    injectPartnersWebviewFragment(fragment);
  }

  @Override
  public void doInjection(SubjectPreferencesActivity fragment) {
    injectSubjectPreferencesActivity(fragment);
  }

  @Override
  public void doInjection(CertificateFragment cardFragment) {
    injectCertificateFragment(cardFragment);
  }

  @Override
  public void doInjection(KYCViewFragment cardFragment) {
    injectKYCViewFragment(cardFragment);
  }

  @Override
  public void doInjection(QuizTestFragment fragment) {
    injectQuizTestFragment(fragment);
  }

  @Override
  public void doInjection(BankFragment fragment) {
    injectBankFragment(fragment);
  }

  @Override
  public void doInjection(PaytmFragment fragment) {
    injectPaytmFragment(fragment);
  }

  @Override
  public void doInjection(OtpScreenActivity loginScreenActivity) {
    injectOtpScreenActivity(loginScreenActivity);
  }

  @Override
  public void doInjection(GradeChangeFragment dialog) {
    injectGradeChangeFragment(dialog);
  }

  @Override
  public void doInjection(PrivacyPolicyFragment privacyPolicyFragment) {}

  @Override
  public void doInjection(FriendsLeaderBoardFragment friendsLeaderBoardFragment) {
    injectFriendsLeaderBoardFragment(friendsLeaderBoardFragment);
  }

  @Override
  public void doInjection(FriendsLeaderBoardAddFragment friendsLeaderBoardAddFragment) {
    injectFriendsLeaderBoardAddFragment(friendsLeaderBoardAddFragment);
  }

  @Override
  public void doInjection(FriendsLeaderBoardListFragment friendsLeaderBoardListFragment) {
    injectFriendsLeaderBoardListFragment(friendsLeaderBoardListFragment);
  }

  @Override
  public void doInjection(InviteFriendDialog inviteFriendDialog) {
    injectInviteFriendDialog(inviteFriendDialog);
  }

  @Override
  public void doInjection(CongratulationsDialog congratulationsDialog) {
    injectCongratulationsDialog(congratulationsDialog);
  }

  @Override
  public void doInjection(TransactionsFragment transactionsFragment) {
    injectTransactionsFragment(transactionsFragment);
  }

  @Override
  public void doInjection(TeacherSaveDetailFragment fragment) {
    injectTeacherSaveDetailFragment(fragment);
  }

  @Override
  public void doInjection(TeacherProfileFragment fragment) {
    injectTeacherProfileFragment(fragment);
  }

  @Override
  public void doInjection(ConsgratuationLessScoreDialog dialog) {
    injectConsgratuationLessScoreDialog(dialog);
  }

  @Override
  public void doInjection(FriendRequestListDialogFragment fragment) {
    injectFriendRequestListDialogFragment(fragment);
  }

  @Override
  public void doInjection(KYCFragment fragment) {
    injectKYCFragment(fragment);
  }

  @Override
  public void doInjection(HomeActivity homeActivity) {
    injectHomeActivity(homeActivity);
  }

  @Override
  public void doInjection(UPIFragment fragment) {
    injectUPIFragment(fragment);
  }

  @Override
  public void doInjection(SendMoneyFragment fragment) {
    injectSendMoneyFragment(fragment);
  }

  @Override
  public void doInjection(DemographicFragment fragment) {
    injectDemographicFragment(fragment);
  }

  @Override
  public void doInjection(StudentProfileFragment fragment) {
    injectStudentProfileFragment(fragment);
  }

  @Override
  public void doInjection(WalletInfoDetailFragment fragment) {
    injectWalletInfoDetailFragment(fragment);
  }

  @Override
  public void doInjection(LoginActivity loginActivity) {
    injectLoginActivity(loginActivity);
  }

  @Override
  public void doInjection(ChooseGradeActivity activity) {
    injectChooseGradeActivity(activity);
  }

  @Override
  public void doInjection(CompleteStudentProfileWithPinActivity activity) {
    injectCompleteStudentProfileWithPinActivity(activity);
  }

  @Override
  public void doInjection(AppLanguageActivity activity) {
    injectAppLanguageActivity(activity);
  }

  @Override
  public void doInjection(DashBoardMainActivity activity) {
    injectDashBoardMainActivity(activity);
  }

  @Override
  public void doInjection(MainQuizHomeFragment activity) {
    injectMainQuizHomeFragment(activity);
  }

  @Override
  public void doInjection(UserProfileActivity fragment) {
    injectUserProfileActivity(fragment);
  }

  @Override
  public void doInjection(SplashScreenAnimationActivity activity) {
    injectSplashScreenAnimationActivity(activity);
  }

  @Override
  public void doInjection(InformationDashboardFragment activity) {
    injectInformationDashboardFragment(activity);
  }

  @Override
  public void doInjection(TeacherDashboardActivity activity) {
    injectTeacherDashboardActivity(activity);
  }

  @Override
  public void doInjection(SlideFragment fragment) {
    injectSlideFragment(fragment);
  }

  @Override
  public void doInjection(CreateGroupFragment fragment) {
    injectCreateGroupFragment(fragment);
  }

  @Override
  public void doInjection(MyClassRoomGroupFragment fragment) {
    injectMyClassRoomGroupFragment(fragment);
  }

  @Override
  public void doInjection(BookedSlotListFragment fragment) {
    injectBookedSlotListFragment(fragment);
  }

  @Override
  public void doInjection(UpComingBookFragment fragment) {
    injectUpComingBookFragment(fragment);
  }

  @Override
  public void doInjection(ResetPasswordActivity activity) {
    injectResetPasswordActivity(activity);
  }

  @Override
  public void doInjection(TeacherProfileActivity activity) {
    injectTeacherProfileActivity(activity);
  }

  @Override
  public void doInjection(QuizTestNativeFragment activity) {
    injectQuizTestNativeFragment(activity);
  }

  @Override
  public void doInjection(KycNewScreenFragment fragment) {
    injectKycNewScreenFragment(fragment);
  }

  @Override
  public void doInjection(TeacherUserProfileFragment fragment) {
    injectTeacherUserProfileFragment(fragment);
  }

  @Override
  public void doInjection(SetPinActivity activity) {
    injectSetPinActivity(activity);
  }

  @Override
  public void doInjection(UploadDocumentFragment fragment) {
    injectUploadDocumentFragment(fragment);
  }

  @Override
  public void doInjection(UpComingTimeSlotDialog fragment) {
    injectUpComingTimeSlotDialog(fragment);
  }

  private StudentKycInfoFragment injectStudentKycInfoFragment(StudentKycInfoFragment instance) {
    StudentKycInfoFragment_MembersInjector.injectViewModelFactory(
        instance, provideStudentKycInfoViewModelFactoryProvider.get());
    return instance;
  }

  private TeacherKycInfoFragment injectTeacherKycInfoFragment(TeacherKycInfoFragment instance) {
    TeacherKycInfoFragment_MembersInjector.injectViewModelFactory(
        instance, provideTeacherKycInfoFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private StudentUploadDocumentFragment injectStudentUploadDocumentFragment(
      StudentUploadDocumentFragment instance) {
    StudentUploadDocumentFragment_MembersInjector.injectViewModelFactory(
        instance, provideStudentUploadDocumentFragmentFactoryProvider.get());
    return instance;
  }

  private EnterPinActivity injectEnterPinActivity(EnterPinActivity instance) {
    EnterPinActivity_MembersInjector.injectViewModelFactory(
        instance, provideEnterPinViewModelFactoryProvider.get());
    return instance;
  }

  private RegisterActivity injectRegisterActivity(RegisterActivity instance) {
    RegisterActivity_MembersInjector.injectViewModelFactory(
        instance, provideRegisterActivityViewModelFactoryProvider.get());
    return instance;
  }

  private ForgotPinActivity injectForgotPinActivity(ForgotPinActivity instance) {
    ForgotPinActivity_MembersInjector.injectViewModelFactory(
        instance, provideForgotPinActivityViewModelFactoryProvider.get());
    return instance;
  }

  private ValidateStudentActivity injectValidateStudentActivity(ValidateStudentActivity instance) {
    ValidateStudentActivity_MembersInjector.injectViewModelFactory(
        instance, provideValidateStudentActivityViewModelFactoryProvider.get());
    return instance;
  }

  private EnterNumberActivity injectEnterNumberActivity(EnterNumberActivity instance) {
    EnterNumberActivity_MembersInjector.injectViewModelFactory(
        instance, provideEnterNumberActivityViewModelFactoryProvider.get());
    return instance;
  }

  private OtpActivity injectOtpActivity(OtpActivity instance) {
    OtpActivity_MembersInjector.injectViewModelFactory(
        instance, provideOtpActivityViewModelFactoryProvider.get());
    return instance;
  }

  private BookSlotFragment injectBookSlotFragment(BookSlotFragment instance) {
    BookSlotFragment_MembersInjector.injectViewModelFactory(
        instance, provideBookSlotFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private PartnersFragment injectPartnersFragment(PartnersFragment instance) {
    PartnersFragment_MembersInjector.injectViewModelFactory(
        instance, providePartnersViewModelFactoryProvider.get());
    return instance;
  }

  private PartnersWebviewFragment injectPartnersWebviewFragment(PartnersWebviewFragment instance) {
    PartnersWebviewFragment_MembersInjector.injectViewModelFactory(
        instance, PartnersWebviewFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private SubjectPreferencesActivity injectSubjectPreferencesActivity(
      SubjectPreferencesActivity instance) {
    SubjectPreferencesActivity_MembersInjector.injectViewModelFactory(
        instance, provideSubjectPreferencesFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private CertificateFragment injectCertificateFragment(CertificateFragment instance) {
    CertificateFragment_MembersInjector.injectViewModelFactory(
        instance, provideCertificateFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private KYCViewFragment injectKYCViewFragment(KYCViewFragment instance) {
    KYCViewFragment_MembersInjector.injectViewModelFactory(
        instance, provideKYCViewFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private QuizTestFragment injectQuizTestFragment(QuizTestFragment instance) {
    QuizTestFragment_MembersInjector.injectViewModelFactory(
        instance, provideQuizTestFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private BankFragment injectBankFragment(BankFragment instance) {
    BankFragment_MembersInjector.injectViewModelFactory(
        instance, provideBankFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private PaytmFragment injectPaytmFragment(PaytmFragment instance) {
    PaytmFragment_MembersInjector.injectViewModelFactory(
        instance, provideSendMoneyFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private OtpScreenActivity injectOtpScreenActivity(OtpScreenActivity instance) {
    OtpScreenActivity_MembersInjector.injectViewModelFactory(
        instance, provideOtpScreenActivityViewModelFactoryProvider.get());
    return instance;
  }

  private GradeChangeFragment injectGradeChangeFragment(GradeChangeFragment instance) {
    GradeChangeFragment_MembersInjector.injectViewModelFactory(
        instance, provideGradeChangeDialogViewModelFactoryProvider.get());
    return instance;
  }

  private FriendsLeaderBoardFragment injectFriendsLeaderBoardFragment(
      FriendsLeaderBoardFragment instance) {
    FriendsLeaderBoardFragment_MembersInjector.injectViewModelFactory(
        instance, provideFriendsLeaderBoardFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private FriendsLeaderBoardAddFragment injectFriendsLeaderBoardAddFragment(
      FriendsLeaderBoardAddFragment instance) {
    FriendsLeaderBoardAddFragment_MembersInjector.injectViewModelFactory(
        instance, provideFriendsLeaderBoardAddFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private FriendsLeaderBoardListFragment injectFriendsLeaderBoardListFragment(
      FriendsLeaderBoardListFragment instance) {
    FriendsLeaderBoardListFragment_MembersInjector.injectViewModelFactory(
        instance, provideFriendsLeaderBoardListFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private InviteFriendDialog injectInviteFriendDialog(InviteFriendDialog instance) {
    InviteFriendDialog_MembersInjector.injectViewModelFactory(
        instance, provideInviteFriendDialogViewModelFactoryProvider.get());
    return instance;
  }

  private CongratulationsDialog injectCongratulationsDialog(CongratulationsDialog instance) {
    CongratulationsDialog_MembersInjector.injectViewModelFactory(
        instance, provideCongratulationsDialogViewModelFactoryProvider.get());
    return instance;
  }

  private TransactionsFragment injectTransactionsFragment(TransactionsFragment instance) {
    TransactionsFragment_MembersInjector.injectViewModelFactory(
        instance, provideTransactionsFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private TeacherSaveDetailFragment injectTeacherSaveDetailFragment(
      TeacherSaveDetailFragment instance) {
    TeacherSaveDetailFragment_MembersInjector.injectViewModelFactory(
        instance, provideTeacherSaveDetailViewModelFactoryProvider.get());
    return instance;
  }

  private TeacherProfileFragment injectTeacherProfileFragment(TeacherProfileFragment instance) {
    TeacherProfileFragment_MembersInjector.injectViewModelFactory(
        instance, provideTeacherProfileViewModelFactoryProvider.get());
    return instance;
  }

  private ConsgratuationLessScoreDialog injectConsgratuationLessScoreDialog(
      ConsgratuationLessScoreDialog instance) {
    ConsgratuationLessScoreDialog_MembersInjector.injectViewModelFactory(
        instance, provideCongratulationsDialogViewModelFactoryProvider.get());
    return instance;
  }

  private FriendRequestListDialogFragment injectFriendRequestListDialogFragment(
      FriendRequestListDialogFragment instance) {
    FriendRequestListDialogFragment_MembersInjector.injectViewModelFactory(
        instance, provideFriendRequestListDialogFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private KYCFragment injectKYCFragment(KYCFragment instance) {
    KYCFragment_MembersInjector.injectViewModelFactory(
        instance, provideKYCViewModelFactoryProvider.get());
    return instance;
  }

  private HomeActivity injectHomeActivity(HomeActivity instance) {
    HomeActivity_MembersInjector.injectRemoteApi(instance, provideDashBoardApiProvider.get());
    HomeActivity_MembersInjector.injectViewModelFactory(
        instance, provideHomeActivityModelFactoryProvider.get());
    return instance;
  }

  private UPIFragment injectUPIFragment(UPIFragment instance) {
    UPIFragment_MembersInjector.injectViewModelFactory(
        instance, provideSendMoneyFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private SendMoneyFragment injectSendMoneyFragment(SendMoneyFragment instance) {
    SendMoneyFragment_MembersInjector.injectViewModelFactory(
        instance, provideSendMoneyFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private DemographicFragment injectDemographicFragment(DemographicFragment instance) {
    DemographicFragment_MembersInjector.injectViewModelFactory(
        instance, provideDemographicFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private StudentProfileFragment injectStudentProfileFragment(StudentProfileFragment instance) {
    StudentProfileFragment_MembersInjector.injectViewModelFactory(
        instance, provideStudentProfileViewModelFactoryProvider.get());
    return instance;
  }

  private WalletInfoDetailFragment injectWalletInfoDetailFragment(
      WalletInfoDetailFragment instance) {
    WalletInfoDetailFragment_MembersInjector.injectViewModelFactory(
        instance, provideWalletAmountViewModelFactoryProvider.get());
    return instance;
  }

  private LoginActivity injectLoginActivity(LoginActivity instance) {
    LoginActivity_MembersInjector.injectViewModelFactory(
        instance, provideLoginActivityViewModelFactoryProvider.get());
    return instance;
  }

  private ChooseGradeActivity injectChooseGradeActivity(ChooseGradeActivity instance) {
    ChooseGradeActivity_MembersInjector.injectViewModelFactory(
        instance, provideWalletChooseGradeViewModelFactoryProvider.get());
    return instance;
  }

  private CompleteStudentProfileWithPinActivity injectCompleteStudentProfileWithPinActivity(
      CompleteStudentProfileWithPinActivity instance) {
    CompleteStudentProfileWithPinActivity_MembersInjector.injectViewModelFactory(
        instance, provideCompleteStudentProfileWithPinViewModelFactoryProvider.get());
    return instance;
  }

  private AppLanguageActivity injectAppLanguageActivity(AppLanguageActivity instance) {
    AppLanguageActivity_MembersInjector.injectViewModelFactory(
        instance, provideAppLanguageViewModelFactoryProvider.get());
    return instance;
  }

  private DashBoardMainActivity injectDashBoardMainActivity(DashBoardMainActivity instance) {
    DashBoardMainActivity_MembersInjector.injectViewModelFactory(
        instance, provideDashBoardMainViewModelFactoryProvider.get());
    return instance;
  }

  private MainQuizHomeFragment injectMainQuizHomeFragment(MainQuizHomeFragment instance) {
    MainQuizHomeFragment_MembersInjector.injectViewModelFactory(
        instance, provideMainQuizViewModelFactoryProvider.get());
    return instance;
  }

  private UserProfileActivity injectUserProfileActivity(UserProfileActivity instance) {
    UserProfileActivity_MembersInjector.injectViewModelFactory(
        instance, provideUserProfileModelFactoryProvider.get());
    return instance;
  }

  private SplashScreenAnimationActivity injectSplashScreenAnimationActivity(
      SplashScreenAnimationActivity instance) {
    SplashScreenAnimationActivity_MembersInjector.injectViewModelFactory(
        instance, provideSplashScreenAnimationViewModelFactoryProvider.get());
    return instance;
  }

  private InformationDashboardFragment injectInformationDashboardFragment(
      InformationDashboardFragment instance) {
    InformationDashboardFragment_MembersInjector.injectViewModelFactory(
        instance, provideInformationDashboardDialogModelFactoryProvider.get());
    return instance;
  }

  private TeacherDashboardActivity injectTeacherDashboardActivity(
      TeacherDashboardActivity instance) {
    TeacherDashboardActivity_MembersInjector.injectRemoteApi(
        instance, provideDashBoardApiProvider.get());
    TeacherDashboardActivity_MembersInjector.injectViewModelFactory(
        instance, provideTeacherDashboardViewModelFactoryProvider.get());
    return instance;
  }

  private SlideFragment injectSlideFragment(SlideFragment instance) {
    SlideFragment_MembersInjector.injectViewModelFactory(
        instance, provideSliderViewModelModelFactoryProvider.get());
    return instance;
  }

  private CreateGroupFragment injectCreateGroupFragment(CreateGroupFragment instance) {
    CreateGroupFragment_MembersInjector.injectViewModelFactory(
        instance, provideCreateGroupViewModelFactoryProvider.get());
    return instance;
  }

  private MyClassRoomGroupFragment injectMyClassRoomGroupFragment(
      MyClassRoomGroupFragment instance) {
    MyClassRoomGroupFragment_MembersInjector.injectViewModelFactory(
        instance, provideMyClassRoomGroupViewModelFactoryProvider.get());
    return instance;
  }

  private BookedSlotListFragment injectBookedSlotListFragment(BookedSlotListFragment instance) {
    BookedSlotListFragment_MembersInjector.injectViewModelFactory(
        instance, provideBookedSlotListViewModelFactoryProvider.get());
    return instance;
  }

  private UpComingBookFragment injectUpComingBookFragment(UpComingBookFragment instance) {
    UpComingBookFragment_MembersInjector.injectViewModelFactory(
        instance, provideUpCommingBookFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private ResetPasswordActivity injectResetPasswordActivity(ResetPasswordActivity instance) {
    ResetPasswordActivity_MembersInjector.injectViewModelFactory(
        instance, provideResetPasswordViewModelFactoryProvider.get());
    return instance;
  }

  private TeacherProfileActivity injectTeacherProfileActivity(TeacherProfileActivity instance) {
    TeacherProfileActivity_MembersInjector.injectViewModelFactory(
        instance, provideTeacherModelFactoryProvider.get());
    return instance;
  }

  private QuizTestNativeFragment injectQuizTestNativeFragment(QuizTestNativeFragment instance) {
    QuizTestNativeFragment_MembersInjector.injectViewModelFactory(
        instance, provideQuizTestNativeFragmentModelFactoryProvider.get());
    return instance;
  }

  private KycNewScreenFragment injectKycNewScreenFragment(KycNewScreenFragment instance) {
    KycNewScreenFragment_MembersInjector.injectViewModelFactory(
        instance, provideKycNewFragmentModelFactoryProvider.get());
    return instance;
  }

  private TeacherUserProfileFragment injectTeacherUserProfileFragment(
      TeacherUserProfileFragment instance) {
    TeacherUserProfileFragment_MembersInjector.injectViewModelFactory(
        instance, provideTeacherModelFactoryProvider.get());
    return instance;
  }

  private SetPinActivity injectSetPinActivity(SetPinActivity instance) {
    SetPinActivity_MembersInjector.injectViewModelFactory(
        instance, provideSetPinViewModelFactoryProvider.get());
    return instance;
  }

  private UploadDocumentFragment injectUploadDocumentFragment(UploadDocumentFragment instance) {
    UploadDocumentFragment_MembersInjector.injectViewModelFactory(
        instance, provideUploadDocumentFragmentViewModelFactoryProvider.get());
    return instance;
  }

  private UpComingTimeSlotDialog injectUpComingTimeSlotDialog(UpComingTimeSlotDialog instance) {
    UpComingTimeSlotDialog_MembersInjector.injectViewModelFactory(
        instance, provideUpCommingTimeSlotViewModelFactoryProvider.get());
    return instance;
  }

  public static final class Builder {
    private HomeModule homeModule;

    private UtilsModule utilsModule;

    private TeacherModule teacherModule;

    private PaymentModule paymentModule;

    private QuizModule quizModule;

    private KycModule kycModule;

    private Builder() {}

    public AppComponent build() {
      if (homeModule == null) {
        this.homeModule = new HomeModule();
      }
      if (utilsModule == null) {
        this.utilsModule = new UtilsModule();
      }
      if (teacherModule == null) {
        this.teacherModule = new TeacherModule();
      }
      if (paymentModule == null) {
        this.paymentModule = new PaymentModule();
      }
      if (quizModule == null) {
        this.quizModule = new QuizModule();
      }
      if (kycModule == null) {
        this.kycModule = new KycModule();
      }
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder utilsModule(UtilsModule utilsModule) {
      this.utilsModule = Preconditions.checkNotNull(utilsModule);
      return this;
    }

    public Builder homeModule(HomeModule homeModule) {
      this.homeModule = Preconditions.checkNotNull(homeModule);
      return this;
    }

    public Builder teacherModule(TeacherModule teacherModule) {
      this.teacherModule = Preconditions.checkNotNull(teacherModule);
      return this;
    }

    public Builder paymentModule(PaymentModule paymentModule) {
      this.paymentModule = Preconditions.checkNotNull(paymentModule);
      return this;
    }

    public Builder quizModule(QuizModule quizModule) {
      this.quizModule = Preconditions.checkNotNull(quizModule);
      return this;
    }

    public Builder kycModule(KycModule kycModule) {
      this.kycModule = Preconditions.checkNotNull(kycModule);
      return this;
    }
  }
}
