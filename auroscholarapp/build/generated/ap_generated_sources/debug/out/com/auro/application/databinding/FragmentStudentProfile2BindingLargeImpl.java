package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentStudentProfile2BindingLargeImpl extends FragmentStudentProfile2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(77);
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.error_layout});
        sIncludes.setIncludes(2, 
            new String[] {"shimmer_my_classroom_layout"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.shimmer_my_classroom_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 5);
        sViewsWithIds.put(R.id.constantLayoutNew, 6);
        sViewsWithIds.put(R.id.imageView5, 7);
        sViewsWithIds.put(R.id.switchProfile, 8);
        sViewsWithIds.put(R.id.auro_scholar_logo, 9);
        sViewsWithIds.put(R.id.language_layout, 10);
        sViewsWithIds.put(R.id.imageViewNotification, 11);
        sViewsWithIds.put(R.id.imageViewLanguage, 12);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 13);
        sViewsWithIds.put(R.id.linearLayout6, 14);
        sViewsWithIds.put(R.id.RPTextView9, 15);
        sViewsWithIds.put(R.id.RPTextView10, 16);
        sViewsWithIds.put(R.id.parent_layout, 17);
        sViewsWithIds.put(R.id.profile_image, 18);
        sViewsWithIds.put(R.id.profileimage, 19);
        sViewsWithIds.put(R.id.editImage, 20);
        sViewsWithIds.put(R.id.editUserName, 21);
        sViewsWithIds.put(R.id.UserName, 22);
        sViewsWithIds.put(R.id.editUserNameIcon, 23);
        sViewsWithIds.put(R.id.constraintLayout11, 24);
        sViewsWithIds.put(R.id.edit_ProfileName, 25);
        sViewsWithIds.put(R.id.editProfile, 26);
        sViewsWithIds.put(R.id.cancelUserNameIcon, 27);
        sViewsWithIds.put(R.id.grade_layout, 28);
        sViewsWithIds.put(R.id.gradeChnage, 29);
        sViewsWithIds.put(R.id.grade, 30);
        sViewsWithIds.put(R.id.class_student, 31);
        sViewsWithIds.put(R.id.imagevGrade, 32);
        sViewsWithIds.put(R.id.wallet, 33);
        sViewsWithIds.put(R.id.wallet_bal_text, 34);
        sViewsWithIds.put(R.id.relativeLayout, 35);
        sViewsWithIds.put(R.id.linearLayout8, 36);
        sViewsWithIds.put(R.id.tilteachertxt, 37);
        sViewsWithIds.put(R.id.editPhone, 38);
        sViewsWithIds.put(R.id.icteachername, 39);
        sViewsWithIds.put(R.id.username_layout, 40);
        sViewsWithIds.put(R.id.usernametxt, 41);
        sViewsWithIds.put(R.id.editUsername, 42);
        sViewsWithIds.put(R.id.username_check_image, 43);
        sViewsWithIds.put(R.id.usernid_layout, 44);
        sViewsWithIds.put(R.id.useridtxt, 45);
        sViewsWithIds.put(R.id.editUserid, 46);
        sViewsWithIds.put(R.id.userid_check_image, 47);
        sViewsWithIds.put(R.id.inputemailedittext, 48);
        sViewsWithIds.put(R.id.editemail, 49);
        sViewsWithIds.put(R.id.icemail, 50);
        sViewsWithIds.put(R.id.llSppiner, 51);
        sViewsWithIds.put(R.id.tvGender, 52);
        sViewsWithIds.put(R.id.SpinnerGender, 53);
        sViewsWithIds.put(R.id.tvSchoolType, 54);
        sViewsWithIds.put(R.id.SpinnerSchoolType, 55);
        sViewsWithIds.put(R.id.tvBoard, 56);
        sViewsWithIds.put(R.id.SpinnerBoard, 57);
        sViewsWithIds.put(R.id.tvLanguageMedium, 58);
        sViewsWithIds.put(R.id.SpinnerLanguageMedium, 59);
        sViewsWithIds.put(R.id.tvPrivateTution, 60);
        sViewsWithIds.put(R.id.spinnerPrivateTution, 61);
        sViewsWithIds.put(R.id.tvPrivateType, 62);
        sViewsWithIds.put(R.id.spinnerPrivateType, 63);
        sViewsWithIds.put(R.id.privateTypeArrow, 64);
        sViewsWithIds.put(R.id.state_title, 65);
        sViewsWithIds.put(R.id.state_spinner, 66);
        sViewsWithIds.put(R.id.privatestate, 67);
        sViewsWithIds.put(R.id.city_title, 68);
        sViewsWithIds.put(R.id.city_spinner, 69);
        sViewsWithIds.put(R.id.privatecity, 70);
        sViewsWithIds.put(R.id.yourSubjectsLayout, 71);
        sViewsWithIds.put(R.id.yourSubjects, 72);
        sViewsWithIds.put(R.id.edit_subject_icon, 73);
        sViewsWithIds.put(R.id.subjects_recyclerview, 74);
        sViewsWithIds.put(R.id.submitbutton, 75);
        sViewsWithIds.put(R.id.progressBar, 76);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @Nullable
    private final com.auro.application.databinding.ShimmerMyClassroomLayoutBinding mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStudentProfile2BindingLargeImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 77, sIncludes, sViewsWithIds));
    }
    private FragmentStudentProfile2BindingLargeImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[57]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[53]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[59]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[55]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (android.widget.ImageView) bindings[9]
            , null
            , (android.widget.ImageView) bindings[27]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[69]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[68]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (android.widget.RelativeLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[38]
            , (com.google.android.material.textfield.TextInputEditText) bindings[26]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (android.widget.ImageView) bindings[73]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (android.widget.ImageView) bindings[23]
            , (com.google.android.material.textfield.TextInputEditText) bindings[46]
            , (com.google.android.material.textfield.TextInputEditText) bindings[42]
            , (com.google.android.material.textfield.TextInputEditText) bindings[49]
            , null
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[3]
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[30]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.RelativeLayout) bindings[28]
            , (android.widget.ImageView) bindings[50]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[32]
            , (com.google.android.material.textfield.TextInputLayout) bindings[48]
            , (android.widget.LinearLayout) bindings[10]
            , null
            , null
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[36]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[51]
            , (android.widget.RelativeLayout) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[17]
            , (android.widget.ImageView) bindings[64]
            , (android.widget.ImageView) bindings[70]
            , (android.widget.ImageView) bindings[67]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ProgressBar) bindings[76]
            , null
            , (android.widget.RelativeLayout) bindings[35]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[61]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[63]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[66]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[65]
            , (androidx.recyclerview.widget.RecyclerView) bindings[74]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[75]
            , null
            , (android.widget.ImageView) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[37]
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[56]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[52]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[58]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[60]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[62]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[54]
            , null
            , (android.widget.ImageView) bindings[47]
            , (com.google.android.material.textfield.TextInputLayout) bindings[45]
            , (android.widget.ImageView) bindings[43]
            , (android.widget.RelativeLayout) bindings[40]
            , (com.google.android.material.textfield.TextInputLayout) bindings[41]
            , (android.widget.RelativeLayout) bindings[44]
            , (android.widget.RelativeLayout) bindings[33]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[34]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[72]
            , (android.widget.LinearLayout) bindings[71]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
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