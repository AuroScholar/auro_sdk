package com.auro.application;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.auro.application.databinding.ActivityAppLanguageBindingImpl;
import com.auro.application.databinding.ActivityChooseGradeBindingImpl;
import com.auro.application.databinding.ActivityDashBoardMainBindingImpl;
import com.auro.application.databinding.ActivityDashboardBindingImpl;
import com.auro.application.databinding.ActivityEnterPinBindingImpl;
import com.auro.application.databinding.ActivityForgotPinBindingImpl;
import com.auro.application.databinding.ActivityLoginBindingImpl;
import com.auro.application.databinding.ActivityOtpBindingImpl;
import com.auro.application.databinding.ActivityOtpScreenBindingImpl;
import com.auro.application.databinding.ActivityParentProfileDemoBindingImpl;
import com.auro.application.databinding.ActivityRealTimeFaceDetectionBindingImpl;
import com.auro.application.databinding.ActivityRegisterUserBindingImpl;
import com.auro.application.databinding.ActivityResetPasswordBindingImpl;
import com.auro.application.databinding.ActivitySetPinBindingImpl;
import com.auro.application.databinding.ActivitySplashScreenAnimationBindingImpl;
import com.auro.application.databinding.ActivitySplashScreenAnimationBindingLargeImpl;
import com.auro.application.databinding.ActivityTeacherDashboardBindingImpl;
import com.auro.application.databinding.ActivityValidateLoginBindingImpl;
import com.auro.application.databinding.ActivityWebBindingImpl;
import com.auro.application.databinding.AddStudentDialogBindingImpl;
import com.auro.application.databinding.AddStudentStepItemLayoutBindingImpl;
import com.auro.application.databinding.AddedStudentLayoutBindingImpl;
import com.auro.application.databinding.AmParentDialogBindingImpl;
import com.auro.application.databinding.AskChoiceNumberBindingImpl;
import com.auro.application.databinding.AskDetailLayoutBindingImpl;
import com.auro.application.databinding.AskNameLayoutBindingImpl;
import com.auro.application.databinding.BackNewButtonBindingImpl;
import com.auro.application.databinding.BankFragmentLayoutBindingImpl;
import com.auro.application.databinding.BookedSlotsItemLayoutBindingImpl;
import com.auro.application.databinding.BottomSheetAddUserStepLayoutBindingImpl;
import com.auro.application.databinding.BottomSheetPersistentBindingImpl;
import com.auro.application.databinding.BottomStudentListBindingImpl;
import com.auro.application.databinding.CameraFragmentLayoutBindingImpl;
import com.auro.application.databinding.CartWalletItemLayoutBindingImpl;
import com.auro.application.databinding.CertificateDialogBindingImpl;
import com.auro.application.databinding.ClassItemLayoutBindingImpl;
import com.auro.application.databinding.CustomActionSnackbarBindingImpl;
import com.auro.application.databinding.CustomDialerItemLayoutBindingImpl;
import com.auro.application.databinding.CustomKycDialogBindingImpl;
import com.auro.application.databinding.CustomProgressDialogBindingImpl;
import com.auro.application.databinding.CustomSnackbarBindingImpl;
import com.auro.application.databinding.CustomSnackbarProgressBindingImpl;
import com.auro.application.databinding.CustomUiSnackbarBindingImpl;
import com.auro.application.databinding.DemographicFragmentLayoutBindingImpl;
import com.auro.application.databinding.DialogCongratulations2BindingImpl;
import com.auro.application.databinding.DialogCustomBindingImpl;
import com.auro.application.databinding.DialogInviteLayoutBindingImpl;
import com.auro.application.databinding.DialogLessScoreCongratulationsBindingImpl;
import com.auro.application.databinding.DialogMemoryStatusBindingImpl;
import com.auro.application.databinding.DialogPaymentTransferBindingImpl;
import com.auro.application.databinding.DocumentUploadItemLayoutBindingImpl;
import com.auro.application.databinding.EnterNumberActivityLayoutBindingImpl;
import com.auro.application.databinding.ErrorLayoutBindingImpl;
import com.auro.application.databinding.ExitSelectionLayoutBindingImpl;
import com.auro.application.databinding.FragmentBookSlotBindingImpl;
import com.auro.application.databinding.FragmentBookedSlotListBindingImpl;
import com.auro.application.databinding.FragmentCertificateBindingImpl;
import com.auro.application.databinding.FragmentCertificateItemBindingImpl;
import com.auro.application.databinding.FragmentClassRoomGroupBindingImpl;
import com.auro.application.databinding.FragmentCreateGroupBindingImpl;
import com.auro.application.databinding.FragmentEditParentprofileBindingImpl;
import com.auro.application.databinding.FragmentFriendListDialogBindingImpl;
import com.auro.application.databinding.FragmentGradeChangeDialogBindingImpl;
import com.auro.application.databinding.FragmentInformationDashboardBindingImpl;
import com.auro.application.databinding.FragmentKycInfoItemLayoutBindingImpl;
import com.auro.application.databinding.FragmentKycInfoScreenBindingImpl;
import com.auro.application.databinding.FragmentKycNewScreenBindingImpl;
import com.auro.application.databinding.FragmentMainQuizHomeBindingImpl;
import com.auro.application.databinding.FragmentMainQuizHomeBindingLargeImpl;
import com.auro.application.databinding.FragmentMainQuizHomeShimmerBindingImpl;
import com.auro.application.databinding.FragmentParentProfileBindingImpl;
import com.auro.application.databinding.FragmentSliderBindingImpl;
import com.auro.application.databinding.FragmentStudentProfile2BindingImpl;
import com.auro.application.databinding.FragmentStudentProfile2BindingLargeImpl;
import com.auro.application.databinding.FragmentStudentUpdateProfileBindingImpl;
import com.auro.application.databinding.FragmentStudentUpdateProfileWithoutPinBindingImpl;
import com.auro.application.databinding.FragmentTeacherNewprofileBindingImpl;
import com.auro.application.databinding.FragmentTeacherProfileBindingImpl;
import com.auro.application.databinding.FragmentTeacherSaveDetailBindingImpl;
import com.auro.application.databinding.FragmentTransactionsBindingImpl;
import com.auro.application.databinding.FragmentUpCommingBookBindingImpl;
import com.auro.application.databinding.FragmentUploadDocumentBindingImpl;
import com.auro.application.databinding.FragmentUserProfileBindingImpl;
import com.auro.application.databinding.FragmentWalletInfoDetailBindingImpl;
import com.auro.application.databinding.FriendRequestItemLayoutBindingImpl;
import com.auro.application.databinding.FriendsBoardItemLayoutBindingImpl;
import com.auro.application.databinding.FriendsInviteItemLayoutBindingImpl;
import com.auro.application.databinding.FriendsLeoboardAddLayoutBindingImpl;
import com.auro.application.databinding.FriendsLeoboardLayoutBindingImpl;
import com.auro.application.databinding.FriendsLeoboardListLayoutBindingImpl;
import com.auro.application.databinding.FullScreenProgressBarBindingImpl;
import com.auro.application.databinding.FullScreenProgressClassBindingImpl;
import com.auro.application.databinding.GradeChnageItemLayoutBindingImpl;
import com.auro.application.databinding.GradeCongDialogBindingImpl;
import com.auro.application.databinding.GroupStudentListItemBindingImpl;
import com.auro.application.databinding.HorizantalImageItemLayoutBindingImpl;
import com.auro.application.databinding.InstructionDialogCustomBindingImpl;
import com.auro.application.databinding.KycFragmentLayoutBindingImpl;
import com.auro.application.databinding.LanguageItemLayoutBindingImpl;
import com.auro.application.databinding.LanguageSelectionLayoutBindingImpl;
import com.auro.application.databinding.LoginDiscalimerDialogLayoutBindingImpl;
import com.auro.application.databinding.MonthWiseItemLayoutBindingImpl;
import com.auro.application.databinding.NavigationContentLayoutBindingImpl;
import com.auro.application.databinding.NavigationDashboardLayoutBindingImpl;
import com.auro.application.databinding.NavigationDashboardLayoutBindingLargeImpl;
import com.auro.application.databinding.NoticeDialogLayoutBindingImpl;
import com.auro.application.databinding.PartnerDetailDialogBindingImpl;
import com.auro.application.databinding.PartnersItemLayoutBindingImpl;
import com.auro.application.databinding.PartnersLayoutBindingImpl;
import com.auro.application.databinding.PassportItemLayoutBindingImpl;
import com.auro.application.databinding.PassportQuizDetailLayoutBindingImpl;
import com.auro.application.databinding.PassportQuizItemLayoutBindingImpl;
import com.auro.application.databinding.PassportQuizLayoutBindingImpl;
import com.auro.application.databinding.PassportSpinnerItemBindingImpl;
import com.auro.application.databinding.PaymentOtpDialogBindingImpl;
import com.auro.application.databinding.PaytmFragmentLayoutBindingImpl;
import com.auro.application.databinding.QuizDocUploadLayoutBindingImpl;
import com.auro.application.databinding.QuizHeaderLayoutBindingImpl;
import com.auro.application.databinding.QuizHomeShimmerLayoutBindingImpl;
import com.auro.application.databinding.QuizTestLayoutBindingImpl;
import com.auro.application.databinding.QuizTestNativeLayoutBindingImpl;
import com.auro.application.databinding.QuizVerifyStepFourBindingImpl;
import com.auro.application.databinding.RatingLevelLayoutBindingImpl;
import com.auro.application.databinding.ReferralPopUpBindingImpl;
import com.auro.application.databinding.ReferralReferredUserDetailsLayoutBindingImpl;
import com.auro.application.databinding.ScholarshipInfoBottomsheetBindingImpl;
import com.auro.application.databinding.ScholarshipItemLayoutBindingImpl;
import com.auro.application.databinding.ScholarshipQuizItemLayoutBindingImpl;
import com.auro.application.databinding.ScholashipStatusLayoutBindingImpl;
import com.auro.application.databinding.SelectSubjectItemLayoutBindingImpl;
import com.auro.application.databinding.SelectSubjectItemLayoutBindingLargeImpl;
import com.auro.application.databinding.SendMessageImageLayoutBindingImpl;
import com.auro.application.databinding.SendMoneyFragmentLayoutBindingImpl;
import com.auro.application.databinding.SendQuizItemLayoutBindingImpl;
import com.auro.application.databinding.ShimmerMyClassroomLayoutBindingImpl;
import com.auro.application.databinding.ShimmerMyInformationBindingImpl;
import com.auro.application.databinding.SlabLevelLayoutBindingImpl;
import com.auro.application.databinding.SplashHeaderLayoutBindingImpl;
import com.auro.application.databinding.StartQuizItemLayoutBindingImpl;
import com.auro.application.databinding.StateSpinnerItemBindingImpl;
import com.auro.application.databinding.StateSpinnerItemBindingLargeImpl;
import com.auro.application.databinding.StudentKycInfoLayoutBindingImpl;
import com.auro.application.databinding.StudentUserLayoutBindingImpl;
import com.auro.application.databinding.SubjectPrefLayoutBindingImpl;
import com.auro.application.databinding.SubjectsPrefItemLayoutBindingImpl;
import com.auro.application.databinding.TeacherProgressItemLayoutBindingImpl;
import com.auro.application.databinding.ToolbarHeaderLayoutBindingImpl;
import com.auro.application.databinding.UpcomingItemLayoutBindingImpl;
import com.auro.application.databinding.UpcomingTimeItemLayoutBindingImpl;
import com.auro.application.databinding.UpdateConfirmFragmentBindingImpl;
import com.auro.application.databinding.UpdateConfirmTimeDialogBindingImpl;
import com.auro.application.databinding.UpdateDialogCustomBindingImpl;
import com.auro.application.databinding.UpiFragmentLayoutBindingImpl;
import com.auro.application.databinding.UploadDocumentStepOneBindingImpl;
import com.auro.application.databinding.UploadDocumentStepThreeBindingImpl;
import com.auro.application.databinding.UploadDocumentStepTwoBindingImpl;
import com.auro.application.databinding.UserNotRegisteredDialogLayoutBindingImpl;
import com.auro.application.databinding.UserSelectGradeBottomSheetBindingImpl;
import com.auro.application.databinding.UserSelectStartQuizBottomSheetBindingImpl;
import com.auro.application.databinding.UserTypeSelectBottomSheetBindingImpl;
import com.auro.application.databinding.ViewchildaccountActivityBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAPPLANGUAGE = 1;

  private static final int LAYOUT_ACTIVITYCHOOSEGRADE = 2;

  private static final int LAYOUT_ACTIVITYDASHBOARDMAIN = 3;

  private static final int LAYOUT_ACTIVITYDASHBOARD = 4;

  private static final int LAYOUT_ACTIVITYENTERPIN = 5;

  private static final int LAYOUT_ACTIVITYFORGOTPIN = 6;

  private static final int LAYOUT_ACTIVITYLOGIN = 7;

  private static final int LAYOUT_ACTIVITYOTP = 8;

  private static final int LAYOUT_ACTIVITYOTPSCREEN = 9;

  private static final int LAYOUT_ACTIVITYPARENTPROFILEDEMO = 10;

  private static final int LAYOUT_ACTIVITYREALTIMEFACEDETECTION = 11;

  private static final int LAYOUT_ACTIVITYREGISTERUSER = 12;

  private static final int LAYOUT_ACTIVITYRESETPASSWORD = 13;

  private static final int LAYOUT_ACTIVITYSETPIN = 14;

  private static final int LAYOUT_ACTIVITYSPLASHSCREENANIMATION = 15;

  private static final int LAYOUT_ACTIVITYTEACHERDASHBOARD = 16;

  private static final int LAYOUT_ACTIVITYVALIDATELOGIN = 17;

  private static final int LAYOUT_ACTIVITYWEB = 18;

  private static final int LAYOUT_ADDSTUDENTDIALOG = 19;

  private static final int LAYOUT_ADDSTUDENTSTEPITEMLAYOUT = 20;

  private static final int LAYOUT_ADDEDSTUDENTLAYOUT = 21;

  private static final int LAYOUT_AMPARENTDIALOG = 22;

  private static final int LAYOUT_ASKCHOICENUMBER = 23;

  private static final int LAYOUT_ASKDETAILLAYOUT = 24;

  private static final int LAYOUT_ASKNAMELAYOUT = 25;

  private static final int LAYOUT_BACKNEWBUTTON = 26;

  private static final int LAYOUT_BANKFRAGMENTLAYOUT = 27;

  private static final int LAYOUT_BOOKEDSLOTSITEMLAYOUT = 28;

  private static final int LAYOUT_BOTTOMSHEETADDUSERSTEPLAYOUT = 29;

  private static final int LAYOUT_BOTTOMSHEETPERSISTENT = 30;

  private static final int LAYOUT_BOTTOMSTUDENTLIST = 31;

  private static final int LAYOUT_CAMERAFRAGMENTLAYOUT = 32;

  private static final int LAYOUT_CARTWALLETITEMLAYOUT = 33;

  private static final int LAYOUT_CERTIFICATEDIALOG = 34;

  private static final int LAYOUT_CLASSITEMLAYOUT = 35;

  private static final int LAYOUT_CUSTOMACTIONSNACKBAR = 36;

  private static final int LAYOUT_CUSTOMDIALERITEMLAYOUT = 37;

  private static final int LAYOUT_CUSTOMKYCDIALOG = 38;

  private static final int LAYOUT_CUSTOMPROGRESSDIALOG = 39;

  private static final int LAYOUT_CUSTOMSNACKBAR = 40;

  private static final int LAYOUT_CUSTOMSNACKBARPROGRESS = 41;

  private static final int LAYOUT_CUSTOMUISNACKBAR = 42;

  private static final int LAYOUT_DEMOGRAPHICFRAGMENTLAYOUT = 43;

  private static final int LAYOUT_DIALOGCONGRATULATIONS2 = 44;

  private static final int LAYOUT_DIALOGCUSTOM = 45;

  private static final int LAYOUT_DIALOGINVITELAYOUT = 46;

  private static final int LAYOUT_DIALOGLESSSCORECONGRATULATIONS = 47;

  private static final int LAYOUT_DIALOGMEMORYSTATUS = 48;

  private static final int LAYOUT_DIALOGPAYMENTTRANSFER = 49;

  private static final int LAYOUT_DOCUMENTUPLOADITEMLAYOUT = 50;

  private static final int LAYOUT_ENTERNUMBERACTIVITYLAYOUT = 51;

  private static final int LAYOUT_ERRORLAYOUT = 52;

  private static final int LAYOUT_EXITSELECTIONLAYOUT = 53;

  private static final int LAYOUT_FRAGMENTBOOKSLOT = 54;

  private static final int LAYOUT_FRAGMENTBOOKEDSLOTLIST = 55;

  private static final int LAYOUT_FRAGMENTCERTIFICATE = 56;

  private static final int LAYOUT_FRAGMENTCERTIFICATEITEM = 57;

  private static final int LAYOUT_FRAGMENTCLASSROOMGROUP = 58;

  private static final int LAYOUT_FRAGMENTCREATEGROUP = 59;

  private static final int LAYOUT_FRAGMENTEDITPARENTPROFILE = 60;

  private static final int LAYOUT_FRAGMENTFRIENDLISTDIALOG = 61;

  private static final int LAYOUT_FRAGMENTGRADECHANGEDIALOG = 62;

  private static final int LAYOUT_FRAGMENTINFORMATIONDASHBOARD = 63;

  private static final int LAYOUT_FRAGMENTKYCINFOITEMLAYOUT = 64;

  private static final int LAYOUT_FRAGMENTKYCINFOSCREEN = 65;

  private static final int LAYOUT_FRAGMENTKYCNEWSCREEN = 66;

  private static final int LAYOUT_FRAGMENTMAINQUIZHOME = 67;

  private static final int LAYOUT_FRAGMENTMAINQUIZHOMESHIMMER = 68;

  private static final int LAYOUT_FRAGMENTPARENTPROFILE = 69;

  private static final int LAYOUT_FRAGMENTSLIDER = 70;

  private static final int LAYOUT_FRAGMENTSTUDENTPROFILE2 = 71;

  private static final int LAYOUT_FRAGMENTSTUDENTUPDATEPROFILE = 72;

  private static final int LAYOUT_FRAGMENTSTUDENTUPDATEPROFILEWITHOUTPIN = 73;

  private static final int LAYOUT_FRAGMENTTEACHERNEWPROFILE = 74;

  private static final int LAYOUT_FRAGMENTTEACHERPROFILE = 75;

  private static final int LAYOUT_FRAGMENTTEACHERSAVEDETAIL = 76;

  private static final int LAYOUT_FRAGMENTTRANSACTIONS = 77;

  private static final int LAYOUT_FRAGMENTUPCOMMINGBOOK = 78;

  private static final int LAYOUT_FRAGMENTUPLOADDOCUMENT = 79;

  private static final int LAYOUT_FRAGMENTUSERPROFILE = 80;

  private static final int LAYOUT_FRAGMENTWALLETINFODETAIL = 81;

  private static final int LAYOUT_FRIENDREQUESTITEMLAYOUT = 82;

  private static final int LAYOUT_FRIENDSBOARDITEMLAYOUT = 83;

  private static final int LAYOUT_FRIENDSINVITEITEMLAYOUT = 84;

  private static final int LAYOUT_FRIENDSLEOBOARDADDLAYOUT = 85;

  private static final int LAYOUT_FRIENDSLEOBOARDLAYOUT = 86;

  private static final int LAYOUT_FRIENDSLEOBOARDLISTLAYOUT = 87;

  private static final int LAYOUT_FULLSCREENPROGRESSBAR = 88;

  private static final int LAYOUT_FULLSCREENPROGRESSCLASS = 89;

  private static final int LAYOUT_GRADECHNAGEITEMLAYOUT = 90;

  private static final int LAYOUT_GRADECONGDIALOG = 91;

  private static final int LAYOUT_GROUPSTUDENTLISTITEM = 92;

  private static final int LAYOUT_HORIZANTALIMAGEITEMLAYOUT = 93;

  private static final int LAYOUT_INSTRUCTIONDIALOGCUSTOM = 94;

  private static final int LAYOUT_KYCFRAGMENTLAYOUT = 95;

  private static final int LAYOUT_LANGUAGEITEMLAYOUT = 96;

  private static final int LAYOUT_LANGUAGESELECTIONLAYOUT = 97;

  private static final int LAYOUT_LOGINDISCALIMERDIALOGLAYOUT = 98;

  private static final int LAYOUT_MONTHWISEITEMLAYOUT = 99;

  private static final int LAYOUT_NAVIGATIONCONTENTLAYOUT = 100;

  private static final int LAYOUT_NAVIGATIONDASHBOARDLAYOUT = 101;

  private static final int LAYOUT_NOTICEDIALOGLAYOUT = 102;

  private static final int LAYOUT_PARTNERDETAILDIALOG = 103;

  private static final int LAYOUT_PARTNERSITEMLAYOUT = 104;

  private static final int LAYOUT_PARTNERSLAYOUT = 105;

  private static final int LAYOUT_PASSPORTITEMLAYOUT = 106;

  private static final int LAYOUT_PASSPORTQUIZDETAILLAYOUT = 107;

  private static final int LAYOUT_PASSPORTQUIZITEMLAYOUT = 108;

  private static final int LAYOUT_PASSPORTQUIZLAYOUT = 109;

  private static final int LAYOUT_PASSPORTSPINNERITEM = 110;

  private static final int LAYOUT_PAYMENTOTPDIALOG = 111;

  private static final int LAYOUT_PAYTMFRAGMENTLAYOUT = 112;

  private static final int LAYOUT_QUIZDOCUPLOADLAYOUT = 113;

  private static final int LAYOUT_QUIZHEADERLAYOUT = 114;

  private static final int LAYOUT_QUIZHOMESHIMMERLAYOUT = 115;

  private static final int LAYOUT_QUIZTESTLAYOUT = 116;

  private static final int LAYOUT_QUIZTESTNATIVELAYOUT = 117;

  private static final int LAYOUT_QUIZVERIFYSTEPFOUR = 118;

  private static final int LAYOUT_RATINGLEVELLAYOUT = 119;

  private static final int LAYOUT_REFERRALPOPUP = 120;

  private static final int LAYOUT_REFERRALREFERREDUSERDETAILSLAYOUT = 121;

  private static final int LAYOUT_SCHOLARSHIPINFOBOTTOMSHEET = 122;

  private static final int LAYOUT_SCHOLARSHIPITEMLAYOUT = 123;

  private static final int LAYOUT_SCHOLARSHIPQUIZITEMLAYOUT = 124;

  private static final int LAYOUT_SCHOLASHIPSTATUSLAYOUT = 125;

  private static final int LAYOUT_SELECTSUBJECTITEMLAYOUT = 126;

  private static final int LAYOUT_SENDMESSAGEIMAGELAYOUT = 127;

  private static final int LAYOUT_SENDMONEYFRAGMENTLAYOUT = 128;

  private static final int LAYOUT_SENDQUIZITEMLAYOUT = 129;

  private static final int LAYOUT_SHIMMERMYCLASSROOMLAYOUT = 130;

  private static final int LAYOUT_SHIMMERMYINFORMATION = 131;

  private static final int LAYOUT_SLABLEVELLAYOUT = 132;

  private static final int LAYOUT_SPLASHHEADERLAYOUT = 133;

  private static final int LAYOUT_STARTQUIZITEMLAYOUT = 134;

  private static final int LAYOUT_STATESPINNERITEM = 135;

  private static final int LAYOUT_STUDENTKYCINFOLAYOUT = 136;

  private static final int LAYOUT_STUDENTUSERLAYOUT = 137;

  private static final int LAYOUT_SUBJECTPREFLAYOUT = 138;

  private static final int LAYOUT_SUBJECTSPREFITEMLAYOUT = 139;

  private static final int LAYOUT_TEACHERPROGRESSITEMLAYOUT = 140;

  private static final int LAYOUT_TOOLBARHEADERLAYOUT = 141;

  private static final int LAYOUT_UPCOMINGITEMLAYOUT = 142;

  private static final int LAYOUT_UPCOMINGTIMEITEMLAYOUT = 143;

  private static final int LAYOUT_UPDATECONFIRMFRAGMENT = 144;

  private static final int LAYOUT_UPDATECONFIRMTIMEDIALOG = 145;

  private static final int LAYOUT_UPDATEDIALOGCUSTOM = 146;

  private static final int LAYOUT_UPIFRAGMENTLAYOUT = 147;

  private static final int LAYOUT_UPLOADDOCUMENTSTEPONE = 148;

  private static final int LAYOUT_UPLOADDOCUMENTSTEPTHREE = 149;

  private static final int LAYOUT_UPLOADDOCUMENTSTEPTWO = 150;

  private static final int LAYOUT_USERNOTREGISTEREDDIALOGLAYOUT = 151;

  private static final int LAYOUT_USERSELECTGRADEBOTTOMSHEET = 152;

  private static final int LAYOUT_USERSELECTSTARTQUIZBOTTOMSHEET = 153;

  private static final int LAYOUT_USERTYPESELECTBOTTOMSHEET = 154;

  private static final int LAYOUT_VIEWCHILDACCOUNTACTIVITY = 155;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(155);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_app_language, LAYOUT_ACTIVITYAPPLANGUAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_choose_grade, LAYOUT_ACTIVITYCHOOSEGRADE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_dash_board_main, LAYOUT_ACTIVITYDASHBOARDMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_enter_pin, LAYOUT_ACTIVITYENTERPIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_forgot_pin, LAYOUT_ACTIVITYFORGOTPIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_otp, LAYOUT_ACTIVITYOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_otp_screen, LAYOUT_ACTIVITYOTPSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_parent_profile_demo, LAYOUT_ACTIVITYPARENTPROFILEDEMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_real_time_face_detection, LAYOUT_ACTIVITYREALTIMEFACEDETECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_register_user, LAYOUT_ACTIVITYREGISTERUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_reset_password, LAYOUT_ACTIVITYRESETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_set_pin, LAYOUT_ACTIVITYSETPIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_splash_screen_animation, LAYOUT_ACTIVITYSPLASHSCREENANIMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_teacher_dashboard, LAYOUT_ACTIVITYTEACHERDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_validate_login, LAYOUT_ACTIVITYVALIDATELOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.activity_web, LAYOUT_ACTIVITYWEB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.add_student_dialog, LAYOUT_ADDSTUDENTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.add_student_step_item_layout, LAYOUT_ADDSTUDENTSTEPITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.added_student_layout, LAYOUT_ADDEDSTUDENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.am_parent_dialog, LAYOUT_AMPARENTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.ask_choice_number, LAYOUT_ASKCHOICENUMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.ask_detail_layout, LAYOUT_ASKDETAILLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.ask_name_layout, LAYOUT_ASKNAMELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.back_new_button, LAYOUT_BACKNEWBUTTON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.bank_fragment_layout, LAYOUT_BANKFRAGMENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.booked_slots_item_layout, LAYOUT_BOOKEDSLOTSITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.bottom_sheet_add_user_step_layout, LAYOUT_BOTTOMSHEETADDUSERSTEPLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.bottom_sheet_persistent, LAYOUT_BOTTOMSHEETPERSISTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.bottom_student_list, LAYOUT_BOTTOMSTUDENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.camera_fragment_layout, LAYOUT_CAMERAFRAGMENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.cart_wallet_item_layout, LAYOUT_CARTWALLETITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.certificate_dialog, LAYOUT_CERTIFICATEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.class_item_layout, LAYOUT_CLASSITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.custom_action_snackbar, LAYOUT_CUSTOMACTIONSNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.custom_dialer_item_layout, LAYOUT_CUSTOMDIALERITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.custom_kyc_dialog, LAYOUT_CUSTOMKYCDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.custom_progress_dialog, LAYOUT_CUSTOMPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.custom_snackbar, LAYOUT_CUSTOMSNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.custom_snackbar_progress, LAYOUT_CUSTOMSNACKBARPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.custom_ui_snackbar, LAYOUT_CUSTOMUISNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.demographic_fragment_layout, LAYOUT_DEMOGRAPHICFRAGMENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.dialog_congratulations_2, LAYOUT_DIALOGCONGRATULATIONS2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.dialog_custom, LAYOUT_DIALOGCUSTOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.dialog_invite_layout, LAYOUT_DIALOGINVITELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.dialog_less_score_congratulations, LAYOUT_DIALOGLESSSCORECONGRATULATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.dialog_memory_status, LAYOUT_DIALOGMEMORYSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.dialog_payment_transfer, LAYOUT_DIALOGPAYMENTTRANSFER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.document_upload_item_layout, LAYOUT_DOCUMENTUPLOADITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.enter_number_activity_layout, LAYOUT_ENTERNUMBERACTIVITYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.error_layout, LAYOUT_ERRORLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.exit_selection_layout, LAYOUT_EXITSELECTIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_book_slot, LAYOUT_FRAGMENTBOOKSLOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_booked_slot_list, LAYOUT_FRAGMENTBOOKEDSLOTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_certificate, LAYOUT_FRAGMENTCERTIFICATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_certificate_item, LAYOUT_FRAGMENTCERTIFICATEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_class_room_group, LAYOUT_FRAGMENTCLASSROOMGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_create_group, LAYOUT_FRAGMENTCREATEGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_edit_parentprofile, LAYOUT_FRAGMENTEDITPARENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_friend_list_dialog, LAYOUT_FRAGMENTFRIENDLISTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_grade_change_dialog, LAYOUT_FRAGMENTGRADECHANGEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_information_dashboard, LAYOUT_FRAGMENTINFORMATIONDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_kyc_info_item_layout, LAYOUT_FRAGMENTKYCINFOITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_kyc_info_screen, LAYOUT_FRAGMENTKYCINFOSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_kyc_new_screen, LAYOUT_FRAGMENTKYCNEWSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_main_quiz_home, LAYOUT_FRAGMENTMAINQUIZHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_main_quiz_home_shimmer, LAYOUT_FRAGMENTMAINQUIZHOMESHIMMER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_parent_profile, LAYOUT_FRAGMENTPARENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_slider, LAYOUT_FRAGMENTSLIDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_student_profile_2, LAYOUT_FRAGMENTSTUDENTPROFILE2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_student_update_profile, LAYOUT_FRAGMENTSTUDENTUPDATEPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_student_update_profile_without_pin, LAYOUT_FRAGMENTSTUDENTUPDATEPROFILEWITHOUTPIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_teacher_newprofile, LAYOUT_FRAGMENTTEACHERNEWPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_teacher_profile, LAYOUT_FRAGMENTTEACHERPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_teacher_save_detail, LAYOUT_FRAGMENTTEACHERSAVEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_transactions, LAYOUT_FRAGMENTTRANSACTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_up_comming_book, LAYOUT_FRAGMENTUPCOMMINGBOOK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_upload_document, LAYOUT_FRAGMENTUPLOADDOCUMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_user_profile, LAYOUT_FRAGMENTUSERPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.fragment_wallet_info_detail, LAYOUT_FRAGMENTWALLETINFODETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.friend_request_item_layout, LAYOUT_FRIENDREQUESTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.friends_board_item_layout, LAYOUT_FRIENDSBOARDITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.friends_invite_item_layout, LAYOUT_FRIENDSINVITEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.friends_leoboard_add_layout, LAYOUT_FRIENDSLEOBOARDADDLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.friends_leoboard_layout, LAYOUT_FRIENDSLEOBOARDLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.friends_leoboard_list_layout, LAYOUT_FRIENDSLEOBOARDLISTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.full_screen_progress_bar, LAYOUT_FULLSCREENPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.full_screen_progress_class, LAYOUT_FULLSCREENPROGRESSCLASS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.grade_chnage_item_layout, LAYOUT_GRADECHNAGEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.grade_cong_dialog, LAYOUT_GRADECONGDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.group_student_list_item, LAYOUT_GROUPSTUDENTLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.horizantal_image_item_layout, LAYOUT_HORIZANTALIMAGEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.instruction_dialog_custom, LAYOUT_INSTRUCTIONDIALOGCUSTOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.kyc_fragment_layout, LAYOUT_KYCFRAGMENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.language_item_layout, LAYOUT_LANGUAGEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.language_selection_layout, LAYOUT_LANGUAGESELECTIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.login_discalimer_dialog_layout, LAYOUT_LOGINDISCALIMERDIALOGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.month_wise_item_layout, LAYOUT_MONTHWISEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.navigation_content_layout, LAYOUT_NAVIGATIONCONTENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.navigation_dashboard_layout, LAYOUT_NAVIGATIONDASHBOARDLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.notice_dialog_layout, LAYOUT_NOTICEDIALOGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.partner_detail_dialog, LAYOUT_PARTNERDETAILDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.partners_item_layout, LAYOUT_PARTNERSITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.partners_layout, LAYOUT_PARTNERSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.passport_item_layout, LAYOUT_PASSPORTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.passport_quiz_detail_layout, LAYOUT_PASSPORTQUIZDETAILLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.passport_quiz_item_layout, LAYOUT_PASSPORTQUIZITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.passport_quiz_layout, LAYOUT_PASSPORTQUIZLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.passport_spinner_item, LAYOUT_PASSPORTSPINNERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.payment_otp_dialog, LAYOUT_PAYMENTOTPDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.paytm_fragment_layout, LAYOUT_PAYTMFRAGMENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.quiz_doc_upload_layout, LAYOUT_QUIZDOCUPLOADLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.quiz_header_layout, LAYOUT_QUIZHEADERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.quiz_home_shimmer_layout, LAYOUT_QUIZHOMESHIMMERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.quiz_test_layout, LAYOUT_QUIZTESTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.quiz_test_native_layout, LAYOUT_QUIZTESTNATIVELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.quiz_verify_step_four, LAYOUT_QUIZVERIFYSTEPFOUR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.rating_level_layout, LAYOUT_RATINGLEVELLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.referral_pop_up, LAYOUT_REFERRALPOPUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.referral_referred_user_details_layout, LAYOUT_REFERRALREFERREDUSERDETAILSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.scholarship_info_bottomsheet, LAYOUT_SCHOLARSHIPINFOBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.scholarship_item_layout, LAYOUT_SCHOLARSHIPITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.scholarship_quiz_item_layout, LAYOUT_SCHOLARSHIPQUIZITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.scholaship_status_layout, LAYOUT_SCHOLASHIPSTATUSLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.select_subject_item_layout, LAYOUT_SELECTSUBJECTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.send_message_image_layout, LAYOUT_SENDMESSAGEIMAGELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.send_money_fragment_layout, LAYOUT_SENDMONEYFRAGMENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.send_quiz_item_layout, LAYOUT_SENDQUIZITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.shimmer_my_classroom_layout, LAYOUT_SHIMMERMYCLASSROOMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.shimmer_my_information, LAYOUT_SHIMMERMYINFORMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.slab_level_layout, LAYOUT_SLABLEVELLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.splash_header_layout, LAYOUT_SPLASHHEADERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.start_quiz_item_layout, LAYOUT_STARTQUIZITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.state_spinner_item, LAYOUT_STATESPINNERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.student_kyc_info_layout, LAYOUT_STUDENTKYCINFOLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.student_user_layout, LAYOUT_STUDENTUSERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.subject_pref_layout, LAYOUT_SUBJECTPREFLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.subjects_pref_item_layout, LAYOUT_SUBJECTSPREFITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.teacher_progress_item_layout, LAYOUT_TEACHERPROGRESSITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.toolbar_header_layout, LAYOUT_TOOLBARHEADERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.upcoming_item_layout, LAYOUT_UPCOMINGITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.upcoming_time_item_layout, LAYOUT_UPCOMINGTIMEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.update_confirm_fragment, LAYOUT_UPDATECONFIRMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.update_confirm_time_dialog, LAYOUT_UPDATECONFIRMTIMEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.update_dialog_custom, LAYOUT_UPDATEDIALOGCUSTOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.upi_fragment_layout, LAYOUT_UPIFRAGMENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.upload_document_step_one, LAYOUT_UPLOADDOCUMENTSTEPONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.upload_document_step_three, LAYOUT_UPLOADDOCUMENTSTEPTHREE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.upload_document_step_two, LAYOUT_UPLOADDOCUMENTSTEPTWO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.user_not_registered_dialog_layout, LAYOUT_USERNOTREGISTEREDDIALOGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.user_select_grade_bottom_sheet, LAYOUT_USERSELECTGRADEBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.user_select_start_quiz_bottom_sheet, LAYOUT_USERSELECTSTARTQUIZBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.user_type_select_bottom_sheet, LAYOUT_USERTYPESELECTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.auro.application.R.layout.viewchildaccount_activity, LAYOUT_VIEWCHILDACCOUNTACTIVITY);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYAPPLANGUAGE: {
        if ("layout/activity_app_language_0".equals(tag)) {
          return new ActivityAppLanguageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_app_language is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHOOSEGRADE: {
        if ("layout/activity_choose_grade_0".equals(tag)) {
          return new ActivityChooseGradeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_choose_grade is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDASHBOARDMAIN: {
        if ("layout/activity_dash_board_main_0".equals(tag)) {
          return new ActivityDashBoardMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_dash_board_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDASHBOARD: {
        if ("layout/activity_dashboard_0".equals(tag)) {
          return new ActivityDashboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYENTERPIN: {
        if ("layout/activity_enter_pin_0".equals(tag)) {
          return new ActivityEnterPinBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_enter_pin is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFORGOTPIN: {
        if ("layout/activity_forgot_pin_0".equals(tag)) {
          return new ActivityForgotPinBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_forgot_pin is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYLOGIN: {
        if ("layout/activity_login_0".equals(tag)) {
          return new ActivityLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYOTP: {
        if ("layout/activity_otp_0".equals(tag)) {
          return new ActivityOtpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_otp is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYOTPSCREEN: {
        if ("layout/activity_otp_screen_0".equals(tag)) {
          return new ActivityOtpScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_otp_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPARENTPROFILEDEMO: {
        if ("layout/activity_parent_profile_demo_0".equals(tag)) {
          return new ActivityParentProfileDemoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_parent_profile_demo is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREALTIMEFACEDETECTION: {
        if ("layout/activity_real_time_face_detection_0".equals(tag)) {
          return new ActivityRealTimeFaceDetectionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_real_time_face_detection is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREGISTERUSER: {
        if ("layout/activity_register_user_0".equals(tag)) {
          return new ActivityRegisterUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_register_user is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRESETPASSWORD: {
        if ("layout/activity_reset_password_0".equals(tag)) {
          return new ActivityResetPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_reset_password is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSETPIN: {
        if ("layout/activity_set_pin_0".equals(tag)) {
          return new ActivitySetPinBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_set_pin is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSPLASHSCREENANIMATION: {
        if ("layout/activity_splash_screen_animation_0".equals(tag)) {
          return new ActivitySplashScreenAnimationBindingImpl(component, view);
        }
        if ("layout-large/activity_splash_screen_animation_0".equals(tag)) {
          return new ActivitySplashScreenAnimationBindingLargeImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_splash_screen_animation is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTEACHERDASHBOARD: {
        if ("layout/activity_teacher_dashboard_0".equals(tag)) {
          return new ActivityTeacherDashboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_teacher_dashboard is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVALIDATELOGIN: {
        if ("layout/activity_validate_login_0".equals(tag)) {
          return new ActivityValidateLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_validate_login is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWEB: {
        if ("layout/activity_web_0".equals(tag)) {
          return new ActivityWebBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_web is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDSTUDENTDIALOG: {
        if ("layout/add_student_dialog_0".equals(tag)) {
          return new AddStudentDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_student_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDSTUDENTSTEPITEMLAYOUT: {
        if ("layout/add_student_step_item_layout_0".equals(tag)) {
          return new AddStudentStepItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_student_step_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDEDSTUDENTLAYOUT: {
        if ("layout/added_student_layout_0".equals(tag)) {
          return new AddedStudentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for added_student_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_AMPARENTDIALOG: {
        if ("layout/am_parent_dialog_0".equals(tag)) {
          return new AmParentDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for am_parent_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_ASKCHOICENUMBER: {
        if ("layout/ask_choice_number_0".equals(tag)) {
          return new AskChoiceNumberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ask_choice_number is invalid. Received: " + tag);
      }
      case  LAYOUT_ASKDETAILLAYOUT: {
        if ("layout/ask_detail_layout_0".equals(tag)) {
          return new AskDetailLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ask_detail_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ASKNAMELAYOUT: {
        if ("layout/ask_name_layout_0".equals(tag)) {
          return new AskNameLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ask_name_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_BACKNEWBUTTON: {
        if ("layout/back_new_button_0".equals(tag)) {
          return new BackNewButtonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for back_new_button is invalid. Received: " + tag);
      }
      case  LAYOUT_BANKFRAGMENTLAYOUT: {
        if ("layout/bank_fragment_layout_0".equals(tag)) {
          return new BankFragmentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bank_fragment_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_BOOKEDSLOTSITEMLAYOUT: {
        if ("layout/booked_slots_item_layout_0".equals(tag)) {
          return new BookedSlotsItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for booked_slots_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETADDUSERSTEPLAYOUT: {
        if ("layout/bottom_sheet_add_user_step_layout_0".equals(tag)) {
          return new BottomSheetAddUserStepLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_sheet_add_user_step_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETPERSISTENT: {
        if ("layout/bottom_sheet_persistent_0".equals(tag)) {
          return new BottomSheetPersistentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_sheet_persistent is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSTUDENTLIST: {
        if ("layout/bottom_student_list_0".equals(tag)) {
          return new BottomStudentListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_student_list is invalid. Received: " + tag);
      }
      case  LAYOUT_CAMERAFRAGMENTLAYOUT: {
        if ("layout/camera_fragment_layout_0".equals(tag)) {
          return new CameraFragmentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for camera_fragment_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CARTWALLETITEMLAYOUT: {
        if ("layout/cart_wallet_item_layout_0".equals(tag)) {
          return new CartWalletItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for cart_wallet_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CERTIFICATEDIALOG: {
        if ("layout/certificate_dialog_0".equals(tag)) {
          return new CertificateDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for certificate_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_CLASSITEMLAYOUT: {
        if ("layout/class_item_layout_0".equals(tag)) {
          return new ClassItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for class_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMACTIONSNACKBAR: {
        if ("layout/custom_action_snackbar_0".equals(tag)) {
          return new CustomActionSnackbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_action_snackbar is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMDIALERITEMLAYOUT: {
        if ("layout/custom_dialer_item_layout_0".equals(tag)) {
          return new CustomDialerItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_dialer_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMKYCDIALOG: {
        if ("layout/custom_kyc_dialog_0".equals(tag)) {
          return new CustomKycDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_kyc_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMPROGRESSDIALOG: {
        if ("layout/custom_progress_dialog_0".equals(tag)) {
          return new CustomProgressDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_progress_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMSNACKBAR: {
        if ("layout/custom_snackbar_0".equals(tag)) {
          return new CustomSnackbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_snackbar is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMSNACKBARPROGRESS: {
        if ("layout/custom_snackbar_progress_0".equals(tag)) {
          return new CustomSnackbarProgressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_snackbar_progress is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMUISNACKBAR: {
        if ("layout/custom_ui_snackbar_0".equals(tag)) {
          return new CustomUiSnackbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_ui_snackbar is invalid. Received: " + tag);
      }
      case  LAYOUT_DEMOGRAPHICFRAGMENTLAYOUT: {
        if ("layout/demographic_fragment_layout_0".equals(tag)) {
          return new DemographicFragmentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for demographic_fragment_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCONGRATULATIONS2: {
        if ("layout/dialog_congratulations_2_0".equals(tag)) {
          return new DialogCongratulations2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_congratulations_2 is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCUSTOM: {
        if ("layout/dialog_custom_0".equals(tag)) {
          return new DialogCustomBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_custom is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGINVITELAYOUT: {
        if ("layout/dialog_invite_layout_0".equals(tag)) {
          return new DialogInviteLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_invite_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGLESSSCORECONGRATULATIONS: {
        if ("layout/dialog_less_score_congratulations_0".equals(tag)) {
          return new DialogLessScoreCongratulationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_less_score_congratulations is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGMEMORYSTATUS: {
        if ("layout/dialog_memory_status_0".equals(tag)) {
          return new DialogMemoryStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_memory_status is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGPAYMENTTRANSFER: {
        if ("layout/dialog_payment_transfer_0".equals(tag)) {
          return new DialogPaymentTransferBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_payment_transfer is invalid. Received: " + tag);
      }
      case  LAYOUT_DOCUMENTUPLOADITEMLAYOUT: {
        if ("layout/document_upload_item_layout_0".equals(tag)) {
          return new DocumentUploadItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for document_upload_item_layout is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ENTERNUMBERACTIVITYLAYOUT: {
        if ("layout/enter_number_activity_layout_0".equals(tag)) {
          return new EnterNumberActivityLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for enter_number_activity_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_ERRORLAYOUT: {
        if ("layout/error_layout_0".equals(tag)) {
          return new ErrorLayoutBindingImpl(component, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for error_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_EXITSELECTIONLAYOUT: {
        if ("layout/exit_selection_layout_0".equals(tag)) {
          return new ExitSelectionLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for exit_selection_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBOOKSLOT: {
        if ("layout/fragment_book_slot_0".equals(tag)) {
          return new FragmentBookSlotBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_book_slot is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBOOKEDSLOTLIST: {
        if ("layout/fragment_booked_slot_list_0".equals(tag)) {
          return new FragmentBookedSlotListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_booked_slot_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCERTIFICATE: {
        if ("layout/fragment_certificate_0".equals(tag)) {
          return new FragmentCertificateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_certificate is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCERTIFICATEITEM: {
        if ("layout/fragment_certificate_item_0".equals(tag)) {
          return new FragmentCertificateItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_certificate_item is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCLASSROOMGROUP: {
        if ("layout/fragment_class_room_group_0".equals(tag)) {
          return new FragmentClassRoomGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_class_room_group is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCREATEGROUP: {
        if ("layout/fragment_create_group_0".equals(tag)) {
          return new FragmentCreateGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_create_group is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEDITPARENTPROFILE: {
        if ("layout-large/fragment_edit_parentprofile_0".equals(tag)) {
          return new FragmentEditParentprofileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_edit_parentprofile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFRIENDLISTDIALOG: {
        if ("layout/fragment_friend_list_dialog_0".equals(tag)) {
          return new FragmentFriendListDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_friend_list_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTGRADECHANGEDIALOG: {
        if ("layout/fragment_grade_change_dialog_0".equals(tag)) {
          return new FragmentGradeChangeDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_grade_change_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTINFORMATIONDASHBOARD: {
        if ("layout/fragment_information_dashboard_0".equals(tag)) {
          return new FragmentInformationDashboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_information_dashboard is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTKYCINFOITEMLAYOUT: {
        if ("layout/fragment_kyc_info_item_layout_0".equals(tag)) {
          return new FragmentKycInfoItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_kyc_info_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTKYCINFOSCREEN: {
        if ("layout/fragment_kyc_info_screen_0".equals(tag)) {
          return new FragmentKycInfoScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_kyc_info_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTKYCNEWSCREEN: {
        if ("layout/fragment_kyc_new_screen_0".equals(tag)) {
          return new FragmentKycNewScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_kyc_new_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMAINQUIZHOME: {
        if ("layout/fragment_main_quiz_home_0".equals(tag)) {
          return new FragmentMainQuizHomeBindingImpl(component, view);
        }
        if ("layout-large/fragment_main_quiz_home_0".equals(tag)) {
          return new FragmentMainQuizHomeBindingLargeImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_main_quiz_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMAINQUIZHOMESHIMMER: {
        if ("layout/fragment_main_quiz_home_shimmer_0".equals(tag)) {
          return new FragmentMainQuizHomeShimmerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_main_quiz_home_shimmer is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPARENTPROFILE: {
        if ("layout/fragment_parent_profile_0".equals(tag)) {
          return new FragmentParentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_parent_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSLIDER: {
        if ("layout/fragment_slider_0".equals(tag)) {
          return new FragmentSliderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_slider is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTUDENTPROFILE2: {
        if ("layout/fragment_student_profile_2_0".equals(tag)) {
          return new FragmentStudentProfile2BindingImpl(component, view);
        }
        if ("layout-large/fragment_student_profile_2_0".equals(tag)) {
          return new FragmentStudentProfile2BindingLargeImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_student_profile_2 is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTUDENTUPDATEPROFILE: {
        if ("layout/fragment_student_update_profile_0".equals(tag)) {
          return new FragmentStudentUpdateProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_student_update_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTUDENTUPDATEPROFILEWITHOUTPIN: {
        if ("layout/fragment_student_update_profile_without_pin_0".equals(tag)) {
          return new FragmentStudentUpdateProfileWithoutPinBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_student_update_profile_without_pin is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTEACHERNEWPROFILE: {
        if ("layout/fragment_teacher_newprofile_0".equals(tag)) {
          return new FragmentTeacherNewprofileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_teacher_newprofile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTEACHERPROFILE: {
        if ("layout/fragment_teacher_profile_0".equals(tag)) {
          return new FragmentTeacherProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_teacher_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTEACHERSAVEDETAIL: {
        if ("layout/fragment_teacher_save_detail_0".equals(tag)) {
          return new FragmentTeacherSaveDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_teacher_save_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTRANSACTIONS: {
        if ("layout/fragment_transactions_0".equals(tag)) {
          return new FragmentTransactionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_transactions is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUPCOMMINGBOOK: {
        if ("layout/fragment_up_comming_book_0".equals(tag)) {
          return new FragmentUpCommingBookBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_up_comming_book is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUPLOADDOCUMENT: {
        if ("layout/fragment_upload_document_0".equals(tag)) {
          return new FragmentUploadDocumentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_upload_document is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUSERPROFILE: {
        if ("layout/fragment_user_profile_0".equals(tag)) {
          return new FragmentUserProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_user_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTWALLETINFODETAIL: {
        if ("layout/fragment_wallet_info_detail_0".equals(tag)) {
          return new FragmentWalletInfoDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_wallet_info_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_FRIENDREQUESTITEMLAYOUT: {
        if ("layout/friend_request_item_layout_0".equals(tag)) {
          return new FriendRequestItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friend_request_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRIENDSBOARDITEMLAYOUT: {
        if ("layout/friends_board_item_layout_0".equals(tag)) {
          return new FriendsBoardItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friends_board_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRIENDSINVITEITEMLAYOUT: {
        if ("layout/friends_invite_item_layout_0".equals(tag)) {
          return new FriendsInviteItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friends_invite_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRIENDSLEOBOARDADDLAYOUT: {
        if ("layout/friends_leoboard_add_layout_0".equals(tag)) {
          return new FriendsLeoboardAddLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friends_leoboard_add_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRIENDSLEOBOARDLAYOUT: {
        if ("layout/friends_leoboard_layout_0".equals(tag)) {
          return new FriendsLeoboardLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friends_leoboard_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRIENDSLEOBOARDLISTLAYOUT: {
        if ("layout/friends_leoboard_list_layout_0".equals(tag)) {
          return new FriendsLeoboardListLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for friends_leoboard_list_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FULLSCREENPROGRESSBAR: {
        if ("layout/full_screen_progress_bar_0".equals(tag)) {
          return new FullScreenProgressBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for full_screen_progress_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_FULLSCREENPROGRESSCLASS: {
        if ("layout/full_screen_progress_class_0".equals(tag)) {
          return new FullScreenProgressClassBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for full_screen_progress_class is invalid. Received: " + tag);
      }
      case  LAYOUT_GRADECHNAGEITEMLAYOUT: {
        if ("layout/grade_chnage_item_layout_0".equals(tag)) {
          return new GradeChnageItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for grade_chnage_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_GRADECONGDIALOG: {
        if ("layout/grade_cong_dialog_0".equals(tag)) {
          return new GradeCongDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for grade_cong_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_GROUPSTUDENTLISTITEM: {
        if ("layout/group_student_list_item_0".equals(tag)) {
          return new GroupStudentListItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for group_student_list_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HORIZANTALIMAGEITEMLAYOUT: {
        if ("layout/horizantal_image_item_layout_0".equals(tag)) {
          return new HorizantalImageItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for horizantal_image_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_INSTRUCTIONDIALOGCUSTOM: {
        if ("layout/instruction_dialog_custom_0".equals(tag)) {
          return new InstructionDialogCustomBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for instruction_dialog_custom is invalid. Received: " + tag);
      }
      case  LAYOUT_KYCFRAGMENTLAYOUT: {
        if ("layout/kyc_fragment_layout_0".equals(tag)) {
          return new KycFragmentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for kyc_fragment_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_LANGUAGEITEMLAYOUT: {
        if ("layout/language_item_layout_0".equals(tag)) {
          return new LanguageItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for language_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_LANGUAGESELECTIONLAYOUT: {
        if ("layout/language_selection_layout_0".equals(tag)) {
          return new LanguageSelectionLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for language_selection_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_LOGINDISCALIMERDIALOGLAYOUT: {
        if ("layout/login_discalimer_dialog_layout_0".equals(tag)) {
          return new LoginDiscalimerDialogLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for login_discalimer_dialog_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_MONTHWISEITEMLAYOUT: {
        if ("layout/month_wise_item_layout_0".equals(tag)) {
          return new MonthWiseItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for month_wise_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_NAVIGATIONCONTENTLAYOUT: {
        if ("layout/navigation_content_layout_0".equals(tag)) {
          return new NavigationContentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for navigation_content_layout is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_NAVIGATIONDASHBOARDLAYOUT: {
        if ("layout-large/navigation_dashboard_layout_0".equals(tag)) {
          return new NavigationDashboardLayoutBindingLargeImpl(component, view);
        }
        if ("layout/navigation_dashboard_layout_0".equals(tag)) {
          return new NavigationDashboardLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for navigation_dashboard_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_NOTICEDIALOGLAYOUT: {
        if ("layout/notice_dialog_layout_0".equals(tag)) {
          return new NoticeDialogLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for notice_dialog_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PARTNERDETAILDIALOG: {
        if ("layout/partner_detail_dialog_0".equals(tag)) {
          return new PartnerDetailDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for partner_detail_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_PARTNERSITEMLAYOUT: {
        if ("layout/partners_item_layout_0".equals(tag)) {
          return new PartnersItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for partners_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PARTNERSLAYOUT: {
        if ("layout/partners_layout_0".equals(tag)) {
          return new PartnersLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for partners_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PASSPORTITEMLAYOUT: {
        if ("layout/passport_item_layout_0".equals(tag)) {
          return new PassportItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for passport_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PASSPORTQUIZDETAILLAYOUT: {
        if ("layout/passport_quiz_detail_layout_0".equals(tag)) {
          return new PassportQuizDetailLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for passport_quiz_detail_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PASSPORTQUIZITEMLAYOUT: {
        if ("layout/passport_quiz_item_layout_0".equals(tag)) {
          return new PassportQuizItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for passport_quiz_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PASSPORTQUIZLAYOUT: {
        if ("layout/passport_quiz_layout_0".equals(tag)) {
          return new PassportQuizLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for passport_quiz_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_PASSPORTSPINNERITEM: {
        if ("layout/passport_spinner_item_0".equals(tag)) {
          return new PassportSpinnerItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for passport_spinner_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTOTPDIALOG: {
        if ("layout/payment_otp_dialog_0".equals(tag)) {
          return new PaymentOtpDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_otp_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYTMFRAGMENTLAYOUT: {
        if ("layout/paytm_fragment_layout_0".equals(tag)) {
          return new PaytmFragmentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for paytm_fragment_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_QUIZDOCUPLOADLAYOUT: {
        if ("layout/quiz_doc_upload_layout_0".equals(tag)) {
          return new QuizDocUploadLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for quiz_doc_upload_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_QUIZHEADERLAYOUT: {
        if ("layout/quiz_header_layout_0".equals(tag)) {
          return new QuizHeaderLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for quiz_header_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_QUIZHOMESHIMMERLAYOUT: {
        if ("layout/quiz_home_shimmer_layout_0".equals(tag)) {
          return new QuizHomeShimmerLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for quiz_home_shimmer_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_QUIZTESTLAYOUT: {
        if ("layout/quiz_test_layout_0".equals(tag)) {
          return new QuizTestLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for quiz_test_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_QUIZTESTNATIVELAYOUT: {
        if ("layout/quiz_test_native_layout_0".equals(tag)) {
          return new QuizTestNativeLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for quiz_test_native_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_QUIZVERIFYSTEPFOUR: {
        if ("layout/quiz_verify_step_four_0".equals(tag)) {
          return new QuizVerifyStepFourBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for quiz_verify_step_four is invalid. Received: " + tag);
      }
      case  LAYOUT_RATINGLEVELLAYOUT: {
        if ("layout/rating_level_layout_0".equals(tag)) {
          return new RatingLevelLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for rating_level_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_REFERRALPOPUP: {
        if ("layout/referral_pop_up_0".equals(tag)) {
          return new ReferralPopUpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for referral_pop_up is invalid. Received: " + tag);
      }
      case  LAYOUT_REFERRALREFERREDUSERDETAILSLAYOUT: {
        if ("layout/referral_referred_user_details_layout_0".equals(tag)) {
          return new ReferralReferredUserDetailsLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for referral_referred_user_details_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SCHOLARSHIPINFOBOTTOMSHEET: {
        if ("layout/scholarship_info_bottomsheet_0".equals(tag)) {
          return new ScholarshipInfoBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for scholarship_info_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_SCHOLARSHIPITEMLAYOUT: {
        if ("layout/scholarship_item_layout_0".equals(tag)) {
          return new ScholarshipItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for scholarship_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SCHOLARSHIPQUIZITEMLAYOUT: {
        if ("layout/scholarship_quiz_item_layout_0".equals(tag)) {
          return new ScholarshipQuizItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for scholarship_quiz_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SCHOLASHIPSTATUSLAYOUT: {
        if ("layout/scholaship_status_layout_0".equals(tag)) {
          return new ScholashipStatusLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for scholaship_status_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SELECTSUBJECTITEMLAYOUT: {
        if ("layout-large/select_subject_item_layout_0".equals(tag)) {
          return new SelectSubjectItemLayoutBindingLargeImpl(component, view);
        }
        if ("layout/select_subject_item_layout_0".equals(tag)) {
          return new SelectSubjectItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for select_subject_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SENDMESSAGEIMAGELAYOUT: {
        if ("layout/send_message_image_layout_0".equals(tag)) {
          return new SendMessageImageLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for send_message_image_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SENDMONEYFRAGMENTLAYOUT: {
        if ("layout/send_money_fragment_layout_0".equals(tag)) {
          return new SendMoneyFragmentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for send_money_fragment_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SENDQUIZITEMLAYOUT: {
        if ("layout/send_quiz_item_layout_0".equals(tag)) {
          return new SendQuizItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for send_quiz_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERMYCLASSROOMLAYOUT: {
        if ("layout/shimmer_my_classroom_layout_0".equals(tag)) {
          return new ShimmerMyClassroomLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_my_classroom_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERMYINFORMATION: {
        if ("layout/shimmer_my_information_0".equals(tag)) {
          return new ShimmerMyInformationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_my_information is invalid. Received: " + tag);
      }
      case  LAYOUT_SLABLEVELLAYOUT: {
        if ("layout/slab_level_layout_0".equals(tag)) {
          return new SlabLevelLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for slab_level_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SPLASHHEADERLAYOUT: {
        if ("layout/splash_header_layout_0".equals(tag)) {
          return new SplashHeaderLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for splash_header_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_STARTQUIZITEMLAYOUT: {
        if ("layout/start_quiz_item_layout_0".equals(tag)) {
          return new StartQuizItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for start_quiz_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_STATESPINNERITEM: {
        if ("layout/state_spinner_item_0".equals(tag)) {
          return new StateSpinnerItemBindingImpl(component, view);
        }
        if ("layout-large/state_spinner_item_0".equals(tag)) {
          return new StateSpinnerItemBindingLargeImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for state_spinner_item is invalid. Received: " + tag);
      }
      case  LAYOUT_STUDENTKYCINFOLAYOUT: {
        if ("layout/student_kyc_info_layout_0".equals(tag)) {
          return new StudentKycInfoLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for student_kyc_info_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_STUDENTUSERLAYOUT: {
        if ("layout/student_user_layout_0".equals(tag)) {
          return new StudentUserLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for student_user_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBJECTPREFLAYOUT: {
        if ("layout/subject_pref_layout_0".equals(tag)) {
          return new SubjectPrefLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subject_pref_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBJECTSPREFITEMLAYOUT: {
        if ("layout/subjects_pref_item_layout_0".equals(tag)) {
          return new SubjectsPrefItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subjects_pref_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_TEACHERPROGRESSITEMLAYOUT: {
        if ("layout/teacher_progress_item_layout_0".equals(tag)) {
          return new TeacherProgressItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for teacher_progress_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_TOOLBARHEADERLAYOUT: {
        if ("layout/toolbar_header_layout_0".equals(tag)) {
          return new ToolbarHeaderLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for toolbar_header_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_UPCOMINGITEMLAYOUT: {
        if ("layout/upcoming_item_layout_0".equals(tag)) {
          return new UpcomingItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upcoming_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_UPCOMINGTIMEITEMLAYOUT: {
        if ("layout/upcoming_time_item_layout_0".equals(tag)) {
          return new UpcomingTimeItemLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upcoming_time_item_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_UPDATECONFIRMFRAGMENT: {
        if ("layout/update_confirm_fragment_0".equals(tag)) {
          return new UpdateConfirmFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for update_confirm_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_UPDATECONFIRMTIMEDIALOG: {
        if ("layout/update_confirm_time_dialog_0".equals(tag)) {
          return new UpdateConfirmTimeDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for update_confirm_time_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_UPDATEDIALOGCUSTOM: {
        if ("layout/update_dialog_custom_0".equals(tag)) {
          return new UpdateDialogCustomBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for update_dialog_custom is invalid. Received: " + tag);
      }
      case  LAYOUT_UPIFRAGMENTLAYOUT: {
        if ("layout/upi_fragment_layout_0".equals(tag)) {
          return new UpiFragmentLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upi_fragment_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_UPLOADDOCUMENTSTEPONE: {
        if ("layout/upload_document_step_one_0".equals(tag)) {
          return new UploadDocumentStepOneBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upload_document_step_one is invalid. Received: " + tag);
      }
      case  LAYOUT_UPLOADDOCUMENTSTEPTHREE: {
        if ("layout/upload_document_step_three_0".equals(tag)) {
          return new UploadDocumentStepThreeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upload_document_step_three is invalid. Received: " + tag);
      }
      case  LAYOUT_UPLOADDOCUMENTSTEPTWO: {
        if ("layout/upload_document_step_two_0".equals(tag)) {
          return new UploadDocumentStepTwoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upload_document_step_two is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding3(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_USERNOTREGISTEREDDIALOGLAYOUT: {
        if ("layout/user_not_registered_dialog_layout_0".equals(tag)) {
          return new UserNotRegisteredDialogLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for user_not_registered_dialog_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_USERSELECTGRADEBOTTOMSHEET: {
        if ("layout/user_select_grade_bottom_sheet_0".equals(tag)) {
          return new UserSelectGradeBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for user_select_grade_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_USERSELECTSTARTQUIZBOTTOMSHEET: {
        if ("layout/user_select_start_quiz_bottom_sheet_0".equals(tag)) {
          return new UserSelectStartQuizBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for user_select_start_quiz_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_USERTYPESELECTBOTTOMSHEET: {
        if ("layout/user_type_select_bottom_sheet_0".equals(tag)) {
          return new UserTypeSelectBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for user_type_select_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWCHILDACCOUNTACTIVITY: {
        if ("layout/viewchildaccount_activity_0".equals(tag)) {
          return new ViewchildaccountActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for viewchildaccount_activity is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
        case 2: {
          return internalGetViewDataBinding2(component, view, localizedLayoutId, tag);
        }
        case 3: {
          return internalGetViewDataBinding3(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_ERRORLAYOUT: {
          if("layout/error_layout_0".equals(tag)) {
            return new ErrorLayoutBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for error_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(15);

    static {
      sKeys.put(1, "CongratulationsDialogViewModel");
      sKeys.put(2, "GradeChangeViewModel");
      sKeys.put(3, "InviteFriendViewModel");
      sKeys.put(4, "QuizTestNativeViewModel");
      sKeys.put(5, "TeacherKycViewModel");
      sKeys.put(0, "_all");
      sKeys.put(6, "completeStudentProfileWithPinViewModel");
      sKeys.put(7, "kycViewModel");
      sKeys.put(8, "parentProfileDemoViewModel");
      sKeys.put(9, "parentProfileViewModel");
      sKeys.put(10, "quizViewModel");
      sKeys.put(11, "selectYourMessageDialogModel");
      sKeys.put(12, "studentProfileViewModel");
      sKeys.put(13, "teacherSaveDetailViewModel");
      sKeys.put(14, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(161);

    static {
      sKeys.put("layout/activity_app_language_0", com.auro.application.R.layout.activity_app_language);
      sKeys.put("layout/activity_choose_grade_0", com.auro.application.R.layout.activity_choose_grade);
      sKeys.put("layout/activity_dash_board_main_0", com.auro.application.R.layout.activity_dash_board_main);
      sKeys.put("layout/activity_dashboard_0", com.auro.application.R.layout.activity_dashboard);
      sKeys.put("layout/activity_enter_pin_0", com.auro.application.R.layout.activity_enter_pin);
      sKeys.put("layout/activity_forgot_pin_0", com.auro.application.R.layout.activity_forgot_pin);
      sKeys.put("layout/activity_login_0", com.auro.application.R.layout.activity_login);
      sKeys.put("layout/activity_otp_0", com.auro.application.R.layout.activity_otp);
      sKeys.put("layout/activity_otp_screen_0", com.auro.application.R.layout.activity_otp_screen);
      sKeys.put("layout/activity_parent_profile_demo_0", com.auro.application.R.layout.activity_parent_profile_demo);
      sKeys.put("layout/activity_real_time_face_detection_0", com.auro.application.R.layout.activity_real_time_face_detection);
      sKeys.put("layout/activity_register_user_0", com.auro.application.R.layout.activity_register_user);
      sKeys.put("layout/activity_reset_password_0", com.auro.application.R.layout.activity_reset_password);
      sKeys.put("layout/activity_set_pin_0", com.auro.application.R.layout.activity_set_pin);
      sKeys.put("layout/activity_splash_screen_animation_0", com.auro.application.R.layout.activity_splash_screen_animation);
      sKeys.put("layout-large/activity_splash_screen_animation_0", com.auro.application.R.layout.activity_splash_screen_animation);
      sKeys.put("layout/activity_teacher_dashboard_0", com.auro.application.R.layout.activity_teacher_dashboard);
      sKeys.put("layout/activity_validate_login_0", com.auro.application.R.layout.activity_validate_login);
      sKeys.put("layout/activity_web_0", com.auro.application.R.layout.activity_web);
      sKeys.put("layout/add_student_dialog_0", com.auro.application.R.layout.add_student_dialog);
      sKeys.put("layout/add_student_step_item_layout_0", com.auro.application.R.layout.add_student_step_item_layout);
      sKeys.put("layout/added_student_layout_0", com.auro.application.R.layout.added_student_layout);
      sKeys.put("layout/am_parent_dialog_0", com.auro.application.R.layout.am_parent_dialog);
      sKeys.put("layout/ask_choice_number_0", com.auro.application.R.layout.ask_choice_number);
      sKeys.put("layout/ask_detail_layout_0", com.auro.application.R.layout.ask_detail_layout);
      sKeys.put("layout/ask_name_layout_0", com.auro.application.R.layout.ask_name_layout);
      sKeys.put("layout/back_new_button_0", com.auro.application.R.layout.back_new_button);
      sKeys.put("layout/bank_fragment_layout_0", com.auro.application.R.layout.bank_fragment_layout);
      sKeys.put("layout/booked_slots_item_layout_0", com.auro.application.R.layout.booked_slots_item_layout);
      sKeys.put("layout/bottom_sheet_add_user_step_layout_0", com.auro.application.R.layout.bottom_sheet_add_user_step_layout);
      sKeys.put("layout/bottom_sheet_persistent_0", com.auro.application.R.layout.bottom_sheet_persistent);
      sKeys.put("layout/bottom_student_list_0", com.auro.application.R.layout.bottom_student_list);
      sKeys.put("layout/camera_fragment_layout_0", com.auro.application.R.layout.camera_fragment_layout);
      sKeys.put("layout/cart_wallet_item_layout_0", com.auro.application.R.layout.cart_wallet_item_layout);
      sKeys.put("layout/certificate_dialog_0", com.auro.application.R.layout.certificate_dialog);
      sKeys.put("layout/class_item_layout_0", com.auro.application.R.layout.class_item_layout);
      sKeys.put("layout/custom_action_snackbar_0", com.auro.application.R.layout.custom_action_snackbar);
      sKeys.put("layout/custom_dialer_item_layout_0", com.auro.application.R.layout.custom_dialer_item_layout);
      sKeys.put("layout/custom_kyc_dialog_0", com.auro.application.R.layout.custom_kyc_dialog);
      sKeys.put("layout/custom_progress_dialog_0", com.auro.application.R.layout.custom_progress_dialog);
      sKeys.put("layout/custom_snackbar_0", com.auro.application.R.layout.custom_snackbar);
      sKeys.put("layout/custom_snackbar_progress_0", com.auro.application.R.layout.custom_snackbar_progress);
      sKeys.put("layout/custom_ui_snackbar_0", com.auro.application.R.layout.custom_ui_snackbar);
      sKeys.put("layout/demographic_fragment_layout_0", com.auro.application.R.layout.demographic_fragment_layout);
      sKeys.put("layout/dialog_congratulations_2_0", com.auro.application.R.layout.dialog_congratulations_2);
      sKeys.put("layout/dialog_custom_0", com.auro.application.R.layout.dialog_custom);
      sKeys.put("layout/dialog_invite_layout_0", com.auro.application.R.layout.dialog_invite_layout);
      sKeys.put("layout/dialog_less_score_congratulations_0", com.auro.application.R.layout.dialog_less_score_congratulations);
      sKeys.put("layout/dialog_memory_status_0", com.auro.application.R.layout.dialog_memory_status);
      sKeys.put("layout/dialog_payment_transfer_0", com.auro.application.R.layout.dialog_payment_transfer);
      sKeys.put("layout/document_upload_item_layout_0", com.auro.application.R.layout.document_upload_item_layout);
      sKeys.put("layout/enter_number_activity_layout_0", com.auro.application.R.layout.enter_number_activity_layout);
      sKeys.put("layout/error_layout_0", com.auro.application.R.layout.error_layout);
      sKeys.put("layout/exit_selection_layout_0", com.auro.application.R.layout.exit_selection_layout);
      sKeys.put("layout/fragment_book_slot_0", com.auro.application.R.layout.fragment_book_slot);
      sKeys.put("layout/fragment_booked_slot_list_0", com.auro.application.R.layout.fragment_booked_slot_list);
      sKeys.put("layout/fragment_certificate_0", com.auro.application.R.layout.fragment_certificate);
      sKeys.put("layout/fragment_certificate_item_0", com.auro.application.R.layout.fragment_certificate_item);
      sKeys.put("layout/fragment_class_room_group_0", com.auro.application.R.layout.fragment_class_room_group);
      sKeys.put("layout/fragment_create_group_0", com.auro.application.R.layout.fragment_create_group);
      sKeys.put("layout-large/fragment_edit_parentprofile_0", com.auro.application.R.layout.fragment_edit_parentprofile);
      sKeys.put("layout/fragment_friend_list_dialog_0", com.auro.application.R.layout.fragment_friend_list_dialog);
      sKeys.put("layout/fragment_grade_change_dialog_0", com.auro.application.R.layout.fragment_grade_change_dialog);
      sKeys.put("layout/fragment_information_dashboard_0", com.auro.application.R.layout.fragment_information_dashboard);
      sKeys.put("layout/fragment_kyc_info_item_layout_0", com.auro.application.R.layout.fragment_kyc_info_item_layout);
      sKeys.put("layout/fragment_kyc_info_screen_0", com.auro.application.R.layout.fragment_kyc_info_screen);
      sKeys.put("layout/fragment_kyc_new_screen_0", com.auro.application.R.layout.fragment_kyc_new_screen);
      sKeys.put("layout/fragment_main_quiz_home_0", com.auro.application.R.layout.fragment_main_quiz_home);
      sKeys.put("layout-large/fragment_main_quiz_home_0", com.auro.application.R.layout.fragment_main_quiz_home);
      sKeys.put("layout/fragment_main_quiz_home_shimmer_0", com.auro.application.R.layout.fragment_main_quiz_home_shimmer);
      sKeys.put("layout/fragment_parent_profile_0", com.auro.application.R.layout.fragment_parent_profile);
      sKeys.put("layout/fragment_slider_0", com.auro.application.R.layout.fragment_slider);
      sKeys.put("layout/fragment_student_profile_2_0", com.auro.application.R.layout.fragment_student_profile_2);
      sKeys.put("layout-large/fragment_student_profile_2_0", com.auro.application.R.layout.fragment_student_profile_2);
      sKeys.put("layout/fragment_student_update_profile_0", com.auro.application.R.layout.fragment_student_update_profile);
      sKeys.put("layout/fragment_student_update_profile_without_pin_0", com.auro.application.R.layout.fragment_student_update_profile_without_pin);
      sKeys.put("layout/fragment_teacher_newprofile_0", com.auro.application.R.layout.fragment_teacher_newprofile);
      sKeys.put("layout/fragment_teacher_profile_0", com.auro.application.R.layout.fragment_teacher_profile);
      sKeys.put("layout/fragment_teacher_save_detail_0", com.auro.application.R.layout.fragment_teacher_save_detail);
      sKeys.put("layout/fragment_transactions_0", com.auro.application.R.layout.fragment_transactions);
      sKeys.put("layout/fragment_up_comming_book_0", com.auro.application.R.layout.fragment_up_comming_book);
      sKeys.put("layout/fragment_upload_document_0", com.auro.application.R.layout.fragment_upload_document);
      sKeys.put("layout/fragment_user_profile_0", com.auro.application.R.layout.fragment_user_profile);
      sKeys.put("layout/fragment_wallet_info_detail_0", com.auro.application.R.layout.fragment_wallet_info_detail);
      sKeys.put("layout/friend_request_item_layout_0", com.auro.application.R.layout.friend_request_item_layout);
      sKeys.put("layout/friends_board_item_layout_0", com.auro.application.R.layout.friends_board_item_layout);
      sKeys.put("layout/friends_invite_item_layout_0", com.auro.application.R.layout.friends_invite_item_layout);
      sKeys.put("layout/friends_leoboard_add_layout_0", com.auro.application.R.layout.friends_leoboard_add_layout);
      sKeys.put("layout/friends_leoboard_layout_0", com.auro.application.R.layout.friends_leoboard_layout);
      sKeys.put("layout/friends_leoboard_list_layout_0", com.auro.application.R.layout.friends_leoboard_list_layout);
      sKeys.put("layout/full_screen_progress_bar_0", com.auro.application.R.layout.full_screen_progress_bar);
      sKeys.put("layout/full_screen_progress_class_0", com.auro.application.R.layout.full_screen_progress_class);
      sKeys.put("layout/grade_chnage_item_layout_0", com.auro.application.R.layout.grade_chnage_item_layout);
      sKeys.put("layout/grade_cong_dialog_0", com.auro.application.R.layout.grade_cong_dialog);
      sKeys.put("layout/group_student_list_item_0", com.auro.application.R.layout.group_student_list_item);
      sKeys.put("layout/horizantal_image_item_layout_0", com.auro.application.R.layout.horizantal_image_item_layout);
      sKeys.put("layout/instruction_dialog_custom_0", com.auro.application.R.layout.instruction_dialog_custom);
      sKeys.put("layout/kyc_fragment_layout_0", com.auro.application.R.layout.kyc_fragment_layout);
      sKeys.put("layout/language_item_layout_0", com.auro.application.R.layout.language_item_layout);
      sKeys.put("layout/language_selection_layout_0", com.auro.application.R.layout.language_selection_layout);
      sKeys.put("layout/login_discalimer_dialog_layout_0", com.auro.application.R.layout.login_discalimer_dialog_layout);
      sKeys.put("layout/month_wise_item_layout_0", com.auro.application.R.layout.month_wise_item_layout);
      sKeys.put("layout/navigation_content_layout_0", com.auro.application.R.layout.navigation_content_layout);
      sKeys.put("layout-large/navigation_dashboard_layout_0", com.auro.application.R.layout.navigation_dashboard_layout);
      sKeys.put("layout/navigation_dashboard_layout_0", com.auro.application.R.layout.navigation_dashboard_layout);
      sKeys.put("layout/notice_dialog_layout_0", com.auro.application.R.layout.notice_dialog_layout);
      sKeys.put("layout/partner_detail_dialog_0", com.auro.application.R.layout.partner_detail_dialog);
      sKeys.put("layout/partners_item_layout_0", com.auro.application.R.layout.partners_item_layout);
      sKeys.put("layout/partners_layout_0", com.auro.application.R.layout.partners_layout);
      sKeys.put("layout/passport_item_layout_0", com.auro.application.R.layout.passport_item_layout);
      sKeys.put("layout/passport_quiz_detail_layout_0", com.auro.application.R.layout.passport_quiz_detail_layout);
      sKeys.put("layout/passport_quiz_item_layout_0", com.auro.application.R.layout.passport_quiz_item_layout);
      sKeys.put("layout/passport_quiz_layout_0", com.auro.application.R.layout.passport_quiz_layout);
      sKeys.put("layout/passport_spinner_item_0", com.auro.application.R.layout.passport_spinner_item);
      sKeys.put("layout/payment_otp_dialog_0", com.auro.application.R.layout.payment_otp_dialog);
      sKeys.put("layout/paytm_fragment_layout_0", com.auro.application.R.layout.paytm_fragment_layout);
      sKeys.put("layout/quiz_doc_upload_layout_0", com.auro.application.R.layout.quiz_doc_upload_layout);
      sKeys.put("layout/quiz_header_layout_0", com.auro.application.R.layout.quiz_header_layout);
      sKeys.put("layout/quiz_home_shimmer_layout_0", com.auro.application.R.layout.quiz_home_shimmer_layout);
      sKeys.put("layout/quiz_test_layout_0", com.auro.application.R.layout.quiz_test_layout);
      sKeys.put("layout/quiz_test_native_layout_0", com.auro.application.R.layout.quiz_test_native_layout);
      sKeys.put("layout/quiz_verify_step_four_0", com.auro.application.R.layout.quiz_verify_step_four);
      sKeys.put("layout/rating_level_layout_0", com.auro.application.R.layout.rating_level_layout);
      sKeys.put("layout/referral_pop_up_0", com.auro.application.R.layout.referral_pop_up);
      sKeys.put("layout/referral_referred_user_details_layout_0", com.auro.application.R.layout.referral_referred_user_details_layout);
      sKeys.put("layout/scholarship_info_bottomsheet_0", com.auro.application.R.layout.scholarship_info_bottomsheet);
      sKeys.put("layout/scholarship_item_layout_0", com.auro.application.R.layout.scholarship_item_layout);
      sKeys.put("layout/scholarship_quiz_item_layout_0", com.auro.application.R.layout.scholarship_quiz_item_layout);
      sKeys.put("layout/scholaship_status_layout_0", com.auro.application.R.layout.scholaship_status_layout);
      sKeys.put("layout-large/select_subject_item_layout_0", com.auro.application.R.layout.select_subject_item_layout);
      sKeys.put("layout/select_subject_item_layout_0", com.auro.application.R.layout.select_subject_item_layout);
      sKeys.put("layout/send_message_image_layout_0", com.auro.application.R.layout.send_message_image_layout);
      sKeys.put("layout/send_money_fragment_layout_0", com.auro.application.R.layout.send_money_fragment_layout);
      sKeys.put("layout/send_quiz_item_layout_0", com.auro.application.R.layout.send_quiz_item_layout);
      sKeys.put("layout/shimmer_my_classroom_layout_0", com.auro.application.R.layout.shimmer_my_classroom_layout);
      sKeys.put("layout/shimmer_my_information_0", com.auro.application.R.layout.shimmer_my_information);
      sKeys.put("layout/slab_level_layout_0", com.auro.application.R.layout.slab_level_layout);
      sKeys.put("layout/splash_header_layout_0", com.auro.application.R.layout.splash_header_layout);
      sKeys.put("layout/start_quiz_item_layout_0", com.auro.application.R.layout.start_quiz_item_layout);
      sKeys.put("layout/state_spinner_item_0", com.auro.application.R.layout.state_spinner_item);
      sKeys.put("layout-large/state_spinner_item_0", com.auro.application.R.layout.state_spinner_item);
      sKeys.put("layout/student_kyc_info_layout_0", com.auro.application.R.layout.student_kyc_info_layout);
      sKeys.put("layout/student_user_layout_0", com.auro.application.R.layout.student_user_layout);
      sKeys.put("layout/subject_pref_layout_0", com.auro.application.R.layout.subject_pref_layout);
      sKeys.put("layout/subjects_pref_item_layout_0", com.auro.application.R.layout.subjects_pref_item_layout);
      sKeys.put("layout/teacher_progress_item_layout_0", com.auro.application.R.layout.teacher_progress_item_layout);
      sKeys.put("layout/toolbar_header_layout_0", com.auro.application.R.layout.toolbar_header_layout);
      sKeys.put("layout/upcoming_item_layout_0", com.auro.application.R.layout.upcoming_item_layout);
      sKeys.put("layout/upcoming_time_item_layout_0", com.auro.application.R.layout.upcoming_time_item_layout);
      sKeys.put("layout/update_confirm_fragment_0", com.auro.application.R.layout.update_confirm_fragment);
      sKeys.put("layout/update_confirm_time_dialog_0", com.auro.application.R.layout.update_confirm_time_dialog);
      sKeys.put("layout/update_dialog_custom_0", com.auro.application.R.layout.update_dialog_custom);
      sKeys.put("layout/upi_fragment_layout_0", com.auro.application.R.layout.upi_fragment_layout);
      sKeys.put("layout/upload_document_step_one_0", com.auro.application.R.layout.upload_document_step_one);
      sKeys.put("layout/upload_document_step_three_0", com.auro.application.R.layout.upload_document_step_three);
      sKeys.put("layout/upload_document_step_two_0", com.auro.application.R.layout.upload_document_step_two);
      sKeys.put("layout/user_not_registered_dialog_layout_0", com.auro.application.R.layout.user_not_registered_dialog_layout);
      sKeys.put("layout/user_select_grade_bottom_sheet_0", com.auro.application.R.layout.user_select_grade_bottom_sheet);
      sKeys.put("layout/user_select_start_quiz_bottom_sheet_0", com.auro.application.R.layout.user_select_start_quiz_bottom_sheet);
      sKeys.put("layout/user_type_select_bottom_sheet_0", com.auro.application.R.layout.user_type_select_bottom_sheet);
      sKeys.put("layout/viewchildaccount_activity_0", com.auro.application.R.layout.viewchildaccount_activity);
    }
  }
}
