package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentUserProfileBindingImpl extends FragmentUserProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(36);
        sIncludes.setIncludes(1, 
            new String[] {"full_screen_progress_bar"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.auro_scholar_logo, 3);
        sViewsWithIds.put(R.id.imageView5, 4);
        sViewsWithIds.put(R.id.imageView6, 5);
        sViewsWithIds.put(R.id.backButton, 6);
        sViewsWithIds.put(R.id.linearLayout9, 7);
        sViewsWithIds.put(R.id.rp_teacherprofile, 8);
        sViewsWithIds.put(R.id.profile_image, 9);
        sViewsWithIds.put(R.id.profileimage, 10);
        sViewsWithIds.put(R.id.editImage, 11);
        sViewsWithIds.put(R.id.edit_icon, 12);
        sViewsWithIds.put(R.id.linearLayout10, 13);
        sViewsWithIds.put(R.id.tiFullName, 14);
        sViewsWithIds.put(R.id.etFullName, 15);
        sViewsWithIds.put(R.id.tiemail, 16);
        sViewsWithIds.put(R.id.etEmail, 17);
        sViewsWithIds.put(R.id.tlPhoneNumber, 18);
        sViewsWithIds.put(R.id.etPhoneNumber, 19);
        sViewsWithIds.put(R.id.tlGender, 20);
        sViewsWithIds.put(R.id.etGender, 21);
        sViewsWithIds.put(R.id.tlState, 22);
        sViewsWithIds.put(R.id.etState, 23);
        sViewsWithIds.put(R.id.tlDistict, 24);
        sViewsWithIds.put(R.id.etDistict, 25);
        sViewsWithIds.put(R.id.rel_school, 26);
        sViewsWithIds.put(R.id.txtsearch, 27);
        sViewsWithIds.put(R.id.editsearch, 28);
        sViewsWithIds.put(R.id.btnsearch, 29);
        sViewsWithIds.put(R.id.tlSchool, 30);
        sViewsWithIds.put(R.id.etSchoolname, 31);
        sViewsWithIds.put(R.id.linearLayout11, 32);
        sViewsWithIds.put(R.id.skip_for_now, 33);
        sViewsWithIds.put(R.id.nextButton, 34);
        sViewsWithIds.put(R.id.RpBootomText, 35);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentUserProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[35]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[29]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.RelativeLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[28]
            , (android.widget.AutoCompleteTextView) bindings[25]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (com.google.android.material.textfield.TextInputEditText) bindings[15]
            , (android.widget.AutoCompleteTextView) bindings[21]
            , (com.google.android.material.textfield.TextInputEditText) bindings[19]
            , (android.widget.AutoCompleteTextView) bindings[31]
            , (android.widget.AutoCompleteTextView) bindings[23]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ImageView) bindings[34]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[2]
            , (android.widget.RelativeLayout) bindings[26]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[8]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[33]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[24]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[30]
            , (com.google.android.material.textfield.TextInputLayout) bindings[22]
            , (com.google.android.material.textfield.TextInputLayout) bindings[27]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.progressbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        progressbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (progressbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.studentProfileViewModel == variableId) {
            setStudentProfileViewModel((com.auro.application.home.presentation.viewmodel.StudentProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStudentProfileViewModel(@Nullable com.auro.application.home.presentation.viewmodel.StudentProfileViewModel StudentProfileViewModel) {
        this.mStudentProfileViewModel = StudentProfileViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        progressbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgressbar((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgressbar(com.auro.application.databinding.FullScreenProgressBarBinding Progressbar, int fieldId) {
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
        executeBindingsOn(progressbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): progressbar
        flag 1 (0x2L): studentProfileViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}