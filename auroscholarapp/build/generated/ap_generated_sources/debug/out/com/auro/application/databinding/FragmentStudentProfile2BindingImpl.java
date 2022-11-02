package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentStudentProfile2BindingImpl extends FragmentStudentProfile2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(104);
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.error_layout});
        sIncludes.setIncludes(2, 
            new String[] {"shimmer_my_classroom_layout"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.shimmer_my_classroom_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipe_refresh_layout, 5);
        sViewsWithIds.put(R.id.mainParentLayout, 6);
        sViewsWithIds.put(R.id.constantLayoutNew, 7);
        sViewsWithIds.put(R.id.imageView5, 8);
        sViewsWithIds.put(R.id.switchProfile, 9);
        sViewsWithIds.put(R.id.auro_scholar_logo, 10);
        sViewsWithIds.put(R.id.language_layout, 11);
        sViewsWithIds.put(R.id.imageViewNotification, 12);
        sViewsWithIds.put(R.id.imageViewLanguage, 13);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 14);
        sViewsWithIds.put(R.id.linearLayout6, 15);
        sViewsWithIds.put(R.id.RPTextView9, 16);
        sViewsWithIds.put(R.id.RPTextView10, 17);
        sViewsWithIds.put(R.id.parent_layout, 18);
        sViewsWithIds.put(R.id.profile_image, 19);
        sViewsWithIds.put(R.id.profileimage, 20);
        sViewsWithIds.put(R.id.editImage, 21);
        sViewsWithIds.put(R.id.editUserName, 22);
        sViewsWithIds.put(R.id.UserName, 23);
        sViewsWithIds.put(R.id.editUserNameIcon, 24);
        sViewsWithIds.put(R.id.constraintLayout11, 25);
        sViewsWithIds.put(R.id.cancelUserNameIcon, 26);
        sViewsWithIds.put(R.id.grade_layout, 27);
        sViewsWithIds.put(R.id.gradeChnage, 28);
        sViewsWithIds.put(R.id.grade, 29);
        sViewsWithIds.put(R.id.class_student, 30);
        sViewsWithIds.put(R.id.imagevGrade, 31);
        sViewsWithIds.put(R.id.wallet, 32);
        sViewsWithIds.put(R.id.wallet_bal_text, 33);
        sViewsWithIds.put(R.id.relativeLayout, 34);
        sViewsWithIds.put(R.id.linearLayout8, 35);
        sViewsWithIds.put(R.id.edit_ProfileName, 36);
        sViewsWithIds.put(R.id.editProfile, 37);
        sViewsWithIds.put(R.id.tilteachertxt, 38);
        sViewsWithIds.put(R.id.editPhone, 39);
        sViewsWithIds.put(R.id.icteachername, 40);
        sViewsWithIds.put(R.id.username_layout, 41);
        sViewsWithIds.put(R.id.usernametxt, 42);
        sViewsWithIds.put(R.id.editUsername, 43);
        sViewsWithIds.put(R.id.username_check_image, 44);
        sViewsWithIds.put(R.id.usernid_layout, 45);
        sViewsWithIds.put(R.id.useridtxt, 46);
        sViewsWithIds.put(R.id.editUserid, 47);
        sViewsWithIds.put(R.id.userid_check_image, 48);
        sViewsWithIds.put(R.id.inputemailedittext, 49);
        sViewsWithIds.put(R.id.editemail, 50);
        sViewsWithIds.put(R.id.icemail, 51);
        sViewsWithIds.put(R.id.llSppiner, 52);
        sViewsWithIds.put(R.id.tvGender, 53);
        sViewsWithIds.put(R.id.SpinnerGender, 54);
        sViewsWithIds.put(R.id.tvSchoolType, 55);
        sViewsWithIds.put(R.id.SpinnerSchoolType, 56);
        sViewsWithIds.put(R.id.tvBoard, 57);
        sViewsWithIds.put(R.id.SpinnerBoard, 58);
        sViewsWithIds.put(R.id.tvLanguageMedium, 59);
        sViewsWithIds.put(R.id.SpinnerLanguageMedium, 60);
        sViewsWithIds.put(R.id.tvPrivateTution, 61);
        sViewsWithIds.put(R.id.spinnerPrivateTution, 62);
        sViewsWithIds.put(R.id.tvPrivateType, 63);
        sViewsWithIds.put(R.id.spinnerPrivateType, 64);
        sViewsWithIds.put(R.id.privateTypeArrow, 65);
        sViewsWithIds.put(R.id.state_title, 66);
        sViewsWithIds.put(R.id.state_spinner, 67);
        sViewsWithIds.put(R.id.privatestate, 68);
        sViewsWithIds.put(R.id.city_title, 69);
        sViewsWithIds.put(R.id.city_spinner, 70);
        sViewsWithIds.put(R.id.privatecity, 71);
        sViewsWithIds.put(R.id.layout_spinner, 72);
        sViewsWithIds.put(R.id.tlStudentGender, 73);
        sViewsWithIds.put(R.id.etStudentGender, 74);
        sViewsWithIds.put(R.id.tlSchooltype, 75);
        sViewsWithIds.put(R.id.etSchooltype, 76);
        sViewsWithIds.put(R.id.tlSchoolboard, 77);
        sViewsWithIds.put(R.id.etSchoolboard, 78);
        sViewsWithIds.put(R.id.tlSchoolmedium, 79);
        sViewsWithIds.put(R.id.etSchoolmedium, 80);
        sViewsWithIds.put(R.id.tltution, 81);
        sViewsWithIds.put(R.id.ettution, 82);
        sViewsWithIds.put(R.id.tltutiontype, 83);
        sViewsWithIds.put(R.id.ettutiontype, 84);
        sViewsWithIds.put(R.id.tlstate, 85);
        sViewsWithIds.put(R.id.etstate, 86);
        sViewsWithIds.put(R.id.tldistrict, 87);
        sViewsWithIds.put(R.id.etdistrict, 88);
        sViewsWithIds.put(R.id.rel_school, 89);
        sViewsWithIds.put(R.id.txtsearch, 90);
        sViewsWithIds.put(R.id.editsearch, 91);
        sViewsWithIds.put(R.id.btnsearch, 92);
        sViewsWithIds.put(R.id.tlSchool, 93);
        sViewsWithIds.put(R.id.etSchoolname, 94);
        sViewsWithIds.put(R.id.tlgrade, 95);
        sViewsWithIds.put(R.id.etgrade, 96);
        sViewsWithIds.put(R.id.yourSubjectsLayout, 97);
        sViewsWithIds.put(R.id.yourSubjects, 98);
        sViewsWithIds.put(R.id.edit_subject_icon, 99);
        sViewsWithIds.put(R.id.subjects_recyclerview, 100);
        sViewsWithIds.put(R.id.submitbutton, 101);
        sViewsWithIds.put(R.id.progressBar, 102);
        sViewsWithIds.put(R.id.layout_setpin, 103);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final com.auro.application.databinding.ShimmerMyClassroomLayoutBinding mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStudentProfile2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 104, sIncludes, sViewsWithIds));
    }
    private FragmentStudentProfile2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[58]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[54]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[60]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[56]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[23]
            , (android.widget.ImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[92]
            , (android.widget.ImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[70]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[69]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (android.widget.RelativeLayout) bindings[21]
            , (com.google.android.material.textfield.TextInputEditText) bindings[39]
            , (com.google.android.material.textfield.TextInputEditText) bindings[37]
            , (com.google.android.material.textfield.TextInputLayout) bindings[36]
            , (android.widget.ImageView) bindings[99]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (android.widget.ImageView) bindings[24]
            , (com.google.android.material.textfield.TextInputEditText) bindings[47]
            , (com.google.android.material.textfield.TextInputEditText) bindings[43]
            , (com.google.android.material.textfield.TextInputEditText) bindings[50]
            , (com.google.android.material.textfield.TextInputEditText) bindings[91]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[3]
            , (android.widget.AutoCompleteTextView) bindings[78]
            , (android.widget.AutoCompleteTextView) bindings[80]
            , (android.widget.AutoCompleteTextView) bindings[94]
            , (android.widget.AutoCompleteTextView) bindings[76]
            , (android.widget.AutoCompleteTextView) bindings[74]
            , (android.widget.AutoCompleteTextView) bindings[88]
            , (android.widget.AutoCompleteTextView) bindings[96]
            , (android.widget.AutoCompleteTextView) bindings[86]
            , (android.widget.AutoCompleteTextView) bindings[82]
            , (android.widget.AutoCompleteTextView) bindings[84]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[29]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.RelativeLayout) bindings[27]
            , (android.widget.ImageView) bindings[51]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[31]
            , (com.google.android.material.textfield.TextInputLayout) bindings[49]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[103]
            , (android.widget.RelativeLayout) bindings[72]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[35]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[52]
            , (android.widget.RelativeLayout) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[18]
            , (android.widget.ImageView) bindings[65]
            , (android.widget.ImageView) bindings[71]
            , (android.widget.ImageView) bindings[68]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ProgressBar) bindings[102]
            , (android.widget.RelativeLayout) bindings[89]
            , (android.widget.RelativeLayout) bindings[34]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[62]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[64]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[67]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[66]
            , (androidx.recyclerview.widget.RecyclerView) bindings[100]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[101]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[38]
            , (com.google.android.material.textfield.TextInputLayout) bindings[93]
            , (com.google.android.material.textfield.TextInputLayout) bindings[77]
            , (com.google.android.material.textfield.TextInputLayout) bindings[79]
            , (com.google.android.material.textfield.TextInputLayout) bindings[75]
            , (com.google.android.material.textfield.TextInputLayout) bindings[73]
            , (com.google.android.material.textfield.TextInputLayout) bindings[87]
            , (com.google.android.material.textfield.TextInputLayout) bindings[95]
            , (com.google.android.material.textfield.TextInputLayout) bindings[85]
            , (com.google.android.material.textfield.TextInputLayout) bindings[81]
            , (com.google.android.material.textfield.TextInputLayout) bindings[83]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[57]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[53]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[59]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[61]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[63]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[55]
            , (com.google.android.material.textfield.TextInputLayout) bindings[90]
            , (android.widget.ImageView) bindings[48]
            , (com.google.android.material.textfield.TextInputLayout) bindings[46]
            , (android.widget.ImageView) bindings[44]
            , (android.widget.RelativeLayout) bindings[41]
            , (com.google.android.material.textfield.TextInputLayout) bindings[42]
            , (android.widget.RelativeLayout) bindings[45]
            , (android.widget.RelativeLayout) bindings[32]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[33]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[98]
            , (android.widget.LinearLayout) bindings[97]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView2 = (com.auro.application.databinding.ShimmerMyClassroomLayoutBinding) bindings[4];
        setContainedBinding(this.mboundView2);
        this.shimmerMyClassroom.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        errorLayout.invalidateAll();
        mboundView2.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (errorLayout.hasPendingBindings()) {
            return true;
        }
        if (mboundView2.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.quizViewModel == variableId) {
            setQuizViewModel((com.auro.application.home.presentation.viewmodel.QuizViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizViewModel(@Nullable com.auro.application.home.presentation.viewmodel.QuizViewModel QuizViewModel) {
        this.mQuizViewModel = QuizViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
        mboundView2.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(errorLayout);
        executeBindingsOn(mboundView2);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): quizViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}