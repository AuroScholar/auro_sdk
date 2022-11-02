package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentStudentUpdateProfileBindingImpl extends FragmentStudentUpdateProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(124);
        sIncludes.setIncludes(1, 
            new String[] {"activity_set_pin"},
            new int[] {5},
            new int[] {com.auro.application.R.layout.activity_set_pin});
        sIncludes.setIncludes(2, 
            new String[] {"full_screen_progress_bar"},
            new int[] {6},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(3, 
            new String[] {"error_layout"},
            new int[] {7},
            new int[] {com.auro.application.R.layout.error_layout});
        sIncludes.setIncludes(4, 
            new String[] {"shimmer_my_classroom_layout"},
            new int[] {8},
            new int[] {com.auro.application.R.layout.shimmer_my_classroom_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 9);
        sViewsWithIds.put(R.id.constantLayoutNew, 10);
        sViewsWithIds.put(R.id.imageView5, 11);
        sViewsWithIds.put(R.id.switchProfile, 12);
        sViewsWithIds.put(R.id.auro_scholar_logo, 13);
        sViewsWithIds.put(R.id.language_layout, 14);
        sViewsWithIds.put(R.id.imageViewNotification, 15);
        sViewsWithIds.put(R.id.imageViewLanguage, 16);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 17);
        sViewsWithIds.put(R.id.linearLayout6, 18);
        sViewsWithIds.put(R.id.RPTextView9, 19);
        sViewsWithIds.put(R.id.RPTextView10, 20);
        sViewsWithIds.put(R.id.parent_layout, 21);
        sViewsWithIds.put(R.id.profile_image, 22);
        sViewsWithIds.put(R.id.profileimage, 23);
        sViewsWithIds.put(R.id.editImage, 24);
        sViewsWithIds.put(R.id.editUserName, 25);
        sViewsWithIds.put(R.id.editUserNameIcon, 26);
        sViewsWithIds.put(R.id.constraintLayout11, 27);
        sViewsWithIds.put(R.id.edit_ProfileName, 28);
        sViewsWithIds.put(R.id.editProfile, 29);
        sViewsWithIds.put(R.id.cancelUserNameIcon, 30);
        sViewsWithIds.put(R.id.grade_layout, 31);
        sViewsWithIds.put(R.id.gradeChnage, 32);
        sViewsWithIds.put(R.id.grade, 33);
        sViewsWithIds.put(R.id.class_student, 34);
        sViewsWithIds.put(R.id.imagevGrade, 35);
        sViewsWithIds.put(R.id.wallet, 36);
        sViewsWithIds.put(R.id.wallet_bal_text, 37);
        sViewsWithIds.put(R.id.relativeLayout, 38);
        sViewsWithIds.put(R.id.linearLayout8, 39);
        sViewsWithIds.put(R.id.tiaddusername, 40);
        sViewsWithIds.put(R.id.edtusername, 41);
        sViewsWithIds.put(R.id.tilteachertxt, 42);
        sViewsWithIds.put(R.id.editPhone, 43);
        sViewsWithIds.put(R.id.icteachername, 44);
        sViewsWithIds.put(R.id.username_layout, 45);
        sViewsWithIds.put(R.id.usernametxt, 46);
        sViewsWithIds.put(R.id.editUsername, 47);
        sViewsWithIds.put(R.id.username_check_image, 48);
        sViewsWithIds.put(R.id.usernid_layout, 49);
        sViewsWithIds.put(R.id.useridtxt, 50);
        sViewsWithIds.put(R.id.editUserid, 51);
        sViewsWithIds.put(R.id.userid_check_image, 52);
        sViewsWithIds.put(R.id.inputemailedittext, 53);
        sViewsWithIds.put(R.id.editemail, 54);
        sViewsWithIds.put(R.id.icemail, 55);
        sViewsWithIds.put(R.id.layout_spinner, 56);
        sViewsWithIds.put(R.id.tlStudentGender, 57);
        sViewsWithIds.put(R.id.etStudentGender, 58);
        sViewsWithIds.put(R.id.tlSchooltype, 59);
        sViewsWithIds.put(R.id.etSchooltype, 60);
        sViewsWithIds.put(R.id.tlSchoolboard, 61);
        sViewsWithIds.put(R.id.etSchoolboard, 62);
        sViewsWithIds.put(R.id.tlSchoolmedium, 63);
        sViewsWithIds.put(R.id.etSchoolmedium, 64);
        sViewsWithIds.put(R.id.tltution, 65);
        sViewsWithIds.put(R.id.ettution, 66);
        sViewsWithIds.put(R.id.tltutiontype, 67);
        sViewsWithIds.put(R.id.ettutiontype, 68);
        sViewsWithIds.put(R.id.tlstate, 69);
        sViewsWithIds.put(R.id.etstate, 70);
        sViewsWithIds.put(R.id.tldistrict, 71);
        sViewsWithIds.put(R.id.etdistrict, 72);
        sViewsWithIds.put(R.id.rel_school, 73);
        sViewsWithIds.put(R.id.txtsearch, 74);
        sViewsWithIds.put(R.id.editsearch, 75);
        sViewsWithIds.put(R.id.btnsearch, 76);
        sViewsWithIds.put(R.id.tlschool, 77);
        sViewsWithIds.put(R.id.etschool, 78);
        sViewsWithIds.put(R.id.tlgrade, 79);
        sViewsWithIds.put(R.id.etgrade, 80);
        sViewsWithIds.put(R.id.llSppiner, 81);
        sViewsWithIds.put(R.id.tvGender, 82);
        sViewsWithIds.put(R.id.SpinnerGender, 83);
        sViewsWithIds.put(R.id.tlSchool, 84);
        sViewsWithIds.put(R.id.etSchoolname, 85);
        sViewsWithIds.put(R.id.tvSchoolType, 86);
        sViewsWithIds.put(R.id.SpinnerSchoolType, 87);
        sViewsWithIds.put(R.id.tvBoard, 88);
        sViewsWithIds.put(R.id.SpinnerBoard, 89);
        sViewsWithIds.put(R.id.tvLanguageMedium, 90);
        sViewsWithIds.put(R.id.SpinnerLanguageMedium, 91);
        sViewsWithIds.put(R.id.tvPrivateTution, 92);
        sViewsWithIds.put(R.id.spinnerPrivateTution, 93);
        sViewsWithIds.put(R.id.tvPrivateType, 94);
        sViewsWithIds.put(R.id.spinnerPrivateType, 95);
        sViewsWithIds.put(R.id.privateTypeArrow, 96);
        sViewsWithIds.put(R.id.state_title, 97);
        sViewsWithIds.put(R.id.state_spinner, 98);
        sViewsWithIds.put(R.id.privatestate, 99);
        sViewsWithIds.put(R.id.city_title, 100);
        sViewsWithIds.put(R.id.city_spinner, 101);
        sViewsWithIds.put(R.id.privatecity, 102);
        sViewsWithIds.put(R.id.yourSubjectsLayout, 103);
        sViewsWithIds.put(R.id.yourSubjects, 104);
        sViewsWithIds.put(R.id.edit_subject_icon, 105);
        sViewsWithIds.put(R.id.subjects_recyclerview, 106);
        sViewsWithIds.put(R.id.submitbutton, 107);
        sViewsWithIds.put(R.id.progressBar, 108);
        sViewsWithIds.put(R.id.auro_scholar_logo1, 109);
        sViewsWithIds.put(R.id.left_corner_image, 110);
        sViewsWithIds.put(R.id.back_button, 111);
        sViewsWithIds.put(R.id.title_first, 112);
        sViewsWithIds.put(R.id.tvEnterSetBelowNumnber, 113);
        sViewsWithIds.put(R.id.mobile_number_text, 114);
        sViewsWithIds.put(R.id.set_user_name, 115);
        sViewsWithIds.put(R.id.mobileLayout, 116);
        sViewsWithIds.put(R.id.etUsername, 117);
        sViewsWithIds.put(R.id.set_pin_text, 118);
        sViewsWithIds.put(R.id.pin_view, 119);
        sViewsWithIds.put(R.id.confirm_pin_text, 120);
        sViewsWithIds.put(R.id.confirm_pin, 121);
        sViewsWithIds.put(R.id.btdonenew, 122);
        sViewsWithIds.put(R.id.terms_condition, 123);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @Nullable
    private final com.auro.application.databinding.ShimmerMyClassroomLayoutBinding mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStudentUpdateProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 124, sIncludes, sViewsWithIds));
    }
    private FragmentStudentUpdateProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[20]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[89]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[83]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[91]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[87]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[109]
            , (android.widget.ImageView) bindings[111]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[122]
            , (androidx.appcompat.widget.AppCompatButton) bindings[76]
            , (android.widget.ImageView) bindings[30]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[101]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[100]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[34]
            , (com.chaos.view.PinView) bindings[121]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[120]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (android.widget.RelativeLayout) bindings[24]
            , (com.google.android.material.textfield.TextInputEditText) bindings[43]
            , (com.google.android.material.textfield.TextInputEditText) bindings[29]
            , (com.google.android.material.textfield.TextInputLayout) bindings[28]
            , (android.widget.ImageView) bindings[105]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (android.widget.ImageView) bindings[26]
            , (com.google.android.material.textfield.TextInputEditText) bindings[51]
            , (com.google.android.material.textfield.TextInputEditText) bindings[47]
            , (com.google.android.material.textfield.TextInputEditText) bindings[54]
            , (com.google.android.material.textfield.TextInputEditText) bindings[75]
            , (com.google.android.material.textfield.TextInputEditText) bindings[41]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[7]
            , (android.widget.AutoCompleteTextView) bindings[62]
            , (android.widget.AutoCompleteTextView) bindings[64]
            , (android.widget.AutoCompleteTextView) bindings[85]
            , (android.widget.AutoCompleteTextView) bindings[60]
            , (android.widget.AutoCompleteTextView) bindings[58]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[117]
            , (android.widget.AutoCompleteTextView) bindings[72]
            , (android.widget.AutoCompleteTextView) bindings[80]
            , (android.widget.AutoCompleteTextView) bindings[78]
            , (android.widget.AutoCompleteTextView) bindings[70]
            , (android.widget.AutoCompleteTextView) bindings[66]
            , (android.widget.AutoCompleteTextView) bindings[68]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[33]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.RelativeLayout) bindings[31]
            , (android.widget.ImageView) bindings[55]
            , (android.widget.ImageView) bindings[44]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[35]
            , (com.google.android.material.textfield.TextInputLayout) bindings[53]
            , (android.widget.LinearLayout) bindings[14]
            , (com.auro.application.databinding.ActivitySetPinBinding) bindings[5]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[56]
            , (android.widget.ImageView) bindings[110]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[39]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[81]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[116]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[114]
            , (androidx.core.widget.NestedScrollView) bindings[21]
            , (com.chaos.view.PinView) bindings[119]
            , (android.widget.ImageView) bindings[96]
            , (android.widget.ImageView) bindings[102]
            , (android.widget.ImageView) bindings[99]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ProgressBar) bindings[108]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[6]
            , (android.widget.RelativeLayout) bindings[73]
            , (android.widget.RelativeLayout) bindings[38]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[118]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[115]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[93]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[95]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[98]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[97]
            , (androidx.recyclerview.widget.RecyclerView) bindings[106]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[107]
            , (android.widget.ImageView) bindings[12]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[123]
            , (com.google.android.material.textfield.TextInputLayout) bindings[40]
            , (com.google.android.material.textfield.TextInputLayout) bindings[42]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[112]
            , (com.google.android.material.textfield.TextInputLayout) bindings[84]
            , (com.google.android.material.textfield.TextInputLayout) bindings[61]
            , (com.google.android.material.textfield.TextInputLayout) bindings[63]
            , (com.google.android.material.textfield.TextInputLayout) bindings[59]
            , (com.google.android.material.textfield.TextInputLayout) bindings[57]
            , (com.google.android.material.textfield.TextInputLayout) bindings[71]
            , (com.google.android.material.textfield.TextInputLayout) bindings[79]
            , (com.google.android.material.textfield.TextInputLayout) bindings[77]
            , (com.google.android.material.textfield.TextInputLayout) bindings[69]
            , (com.google.android.material.textfield.TextInputLayout) bindings[65]
            , (com.google.android.material.textfield.TextInputLayout) bindings[67]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[88]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[113]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[82]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[90]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[92]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[94]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[86]
            , (com.google.android.material.textfield.TextInputLayout) bindings[74]
            , (android.widget.ImageView) bindings[52]
            , (com.google.android.material.textfield.TextInputLayout) bindings[50]
            , (android.widget.ImageView) bindings[48]
            , (android.widget.RelativeLayout) bindings[45]
            , (com.google.android.material.textfield.TextInputLayout) bindings[46]
            , (android.widget.RelativeLayout) bindings[49]
            , (android.widget.RelativeLayout) bindings[36]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[37]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[104]
            , (android.widget.LinearLayout) bindings[103]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        setContainedBinding(this.layoutOnlystudent);
        this.layoutSetpin.setTag(null);
        this.layoutSetusernamepin.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView4 = (com.auro.application.databinding.ShimmerMyClassroomLayoutBinding) bindings[8];
        setContainedBinding(this.mboundView4);
        setContainedBinding(this.progressbar);
        this.shimmerMyClassroom.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        layoutOnlystudent.invalidateAll();
        progressbar.invalidateAll();
        errorLayout.invalidateAll();
        mboundView4.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutOnlystudent.hasPendingBindings()) {
            return true;
        }
        if (progressbar.hasPendingBindings()) {
            return true;
        }
        if (errorLayout.hasPendingBindings()) {
            return true;
        }
        if (mboundView4.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.completeStudentProfileWithPinViewModel == variableId) {
            setCompleteStudentProfileWithPinViewModel((com.auro.application.home.presentation.viewmodel.CompleteStudentProfileWithPinViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCompleteStudentProfileWithPinViewModel(@Nullable com.auro.application.home.presentation.viewmodel.CompleteStudentProfileWithPinViewModel CompleteStudentProfileWithPinViewModel) {
        this.mCompleteStudentProfileWithPinViewModel = CompleteStudentProfileWithPinViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutOnlystudent.setLifecycleOwner(lifecycleOwner);
        progressbar.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
        mboundView4.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeProgressbar((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
            case 2 :
                return onChangeLayoutOnlystudent((com.auro.application.databinding.ActivitySetPinBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeErrorLayout(com.auro.application.databinding.ErrorLayoutBinding ErrorLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProgressbar(com.auro.application.databinding.FullScreenProgressBarBinding Progressbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutOnlystudent(com.auro.application.databinding.ActivitySetPinBinding LayoutOnlystudent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(layoutOnlystudent);
        executeBindingsOn(progressbar);
        executeBindingsOn(errorLayout);
        executeBindingsOn(mboundView4);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): progressbar
        flag 2 (0x3L): layoutOnlystudent
        flag 3 (0x4L): completeStudentProfileWithPinViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}