package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityParentProfileDemoBindingImpl extends ActivityParentProfileDemoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(39);
        sIncludes.setIncludes(1, 
            new String[] {"full_screen_progress_bar"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constantLayoutNew, 3);
        sViewsWithIds.put(R.id.imageView5, 4);
        sViewsWithIds.put(R.id.switchProfile, 5);
        sViewsWithIds.put(R.id.txtaddstudent, 6);
        sViewsWithIds.put(R.id.auro_scholar_logo, 7);
        sViewsWithIds.put(R.id.language_layout, 8);
        sViewsWithIds.put(R.id.imageViewNotification, 9);
        sViewsWithIds.put(R.id.imageViewLanguage, 10);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 11);
        sViewsWithIds.put(R.id.linearLayout9, 12);
        sViewsWithIds.put(R.id.rp_teacherprofile, 13);
        sViewsWithIds.put(R.id.txtviewaccount, 14);
        sViewsWithIds.put(R.id.profile_image, 15);
        sViewsWithIds.put(R.id.profileimage, 16);
        sViewsWithIds.put(R.id.editImage, 17);
        sViewsWithIds.put(R.id.edit_icon, 18);
        sViewsWithIds.put(R.id.linearLayout10, 19);
        sViewsWithIds.put(R.id.tiPin, 20);
        sViewsWithIds.put(R.id.etPin, 21);
        sViewsWithIds.put(R.id.tiFullName, 22);
        sViewsWithIds.put(R.id.etFullName, 23);
        sViewsWithIds.put(R.id.tiemail, 24);
        sViewsWithIds.put(R.id.etEmail, 25);
        sViewsWithIds.put(R.id.tlPhoneNumber, 26);
        sViewsWithIds.put(R.id.etPhoneNumber, 27);
        sViewsWithIds.put(R.id.tlGender, 28);
        sViewsWithIds.put(R.id.etGender, 29);
        sViewsWithIds.put(R.id.tlState, 30);
        sViewsWithIds.put(R.id.etState, 31);
        sViewsWithIds.put(R.id.tlDistict, 32);
        sViewsWithIds.put(R.id.etDistict, 33);
        sViewsWithIds.put(R.id.tlSchool, 34);
        sViewsWithIds.put(R.id.etSchoolname, 35);
        sViewsWithIds.put(R.id.submitbutton, 36);
        sViewsWithIds.put(R.id.progressBar, 37);
        sViewsWithIds.put(R.id.RpBootomText, 38);
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

    public ActivityParentProfileDemoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 39, sIncludes, sViewsWithIds));
    }
    private ActivityParentProfileDemoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[38]
            , (android.widget.ImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.AutoCompleteTextView) bindings[33]
            , (com.google.android.material.textfield.TextInputEditText) bindings[25]
            , (com.google.android.material.textfield.TextInputEditText) bindings[23]
            , (android.widget.AutoCompleteTextView) bindings[29]
            , (com.google.android.material.textfield.TextInputEditText) bindings[27]
            , (com.google.android.material.textfield.TextInputEditText) bindings[21]
            , (android.widget.AutoCompleteTextView) bindings[35]
            , (android.widget.AutoCompleteTextView) bindings[31]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ProgressBar) bindings[37]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[36]
            , (android.widget.ImageView) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[22]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputLayout) bindings[24]
            , (com.google.android.material.textfield.TextInputLayout) bindings[32]
            , (com.google.android.material.textfield.TextInputLayout) bindings[28]
            , (com.google.android.material.textfield.TextInputLayout) bindings[26]
            , (com.google.android.material.textfield.TextInputLayout) bindings[34]
            , (com.google.android.material.textfield.TextInputLayout) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.parentProfileDemoViewModel == variableId) {
            setParentProfileDemoViewModel((com.auro.application.home.presentation.viewmodel.StudentProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setParentProfileDemoViewModel(@Nullable com.auro.application.home.presentation.viewmodel.StudentProfileViewModel ParentProfileDemoViewModel) {
        this.mParentProfileDemoViewModel = ParentProfileDemoViewModel;
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
        flag 1 (0x2L): parentProfileDemoViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}