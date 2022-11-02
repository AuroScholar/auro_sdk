package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentParentProfileBindingImpl extends FragmentParentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(43);
        sIncludes.setIncludes(1, 
            new String[] {"full_screen_progress_bar"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constantLayoutNew, 3);
        sViewsWithIds.put(R.id.switchProfile, 4);
        sViewsWithIds.put(R.id.auro_scholar_logo7, 5);
        sViewsWithIds.put(R.id.language_layout, 6);
        sViewsWithIds.put(R.id.imageViewNotification, 7);
        sViewsWithIds.put(R.id.imageViewLanguage, 8);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 9);
        sViewsWithIds.put(R.id.linearLayout6, 10);
        sViewsWithIds.put(R.id.RPTextView9, 11);
        sViewsWithIds.put(R.id.RPTextView10, 12);
        sViewsWithIds.put(R.id.auro_scholar_logo, 13);
        sViewsWithIds.put(R.id.imageView5, 14);
        sViewsWithIds.put(R.id.imageView6, 15);
        sViewsWithIds.put(R.id.linearLayout9, 16);
        sViewsWithIds.put(R.id.rp_teacherprofile, 17);
        sViewsWithIds.put(R.id.profile_image, 18);
        sViewsWithIds.put(R.id.profileimage, 19);
        sViewsWithIds.put(R.id.editImage, 20);
        sViewsWithIds.put(R.id.edit_icon, 21);
        sViewsWithIds.put(R.id.linearLayout10, 22);
        sViewsWithIds.put(R.id.tiFullName, 23);
        sViewsWithIds.put(R.id.etFullName, 24);
        sViewsWithIds.put(R.id.tiemail, 25);
        sViewsWithIds.put(R.id.etEmail, 26);
        sViewsWithIds.put(R.id.tlPhoneNumber, 27);
        sViewsWithIds.put(R.id.etPhoneNumber, 28);
        sViewsWithIds.put(R.id.tlGender, 29);
        sViewsWithIds.put(R.id.etGender, 30);
        sViewsWithIds.put(R.id.tlState, 31);
        sViewsWithIds.put(R.id.etState, 32);
        sViewsWithIds.put(R.id.tlDistict, 33);
        sViewsWithIds.put(R.id.etDistict, 34);
        sViewsWithIds.put(R.id.tlSchool, 35);
        sViewsWithIds.put(R.id.etSchoolname, 36);
        sViewsWithIds.put(R.id.submitbutton, 37);
        sViewsWithIds.put(R.id.progressBar, 38);
        sViewsWithIds.put(R.id.linearLayout11, 39);
        sViewsWithIds.put(R.id.skip_for_now, 40);
        sViewsWithIds.put(R.id.nextButton, 41);
        sViewsWithIds.put(R.id.RpBootomText, 42);
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

    public FragmentParentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private FragmentParentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[42]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.RelativeLayout) bindings[20]
            , (android.widget.AutoCompleteTextView) bindings[34]
            , (com.google.android.material.textfield.TextInputEditText) bindings[26]
            , (com.google.android.material.textfield.TextInputEditText) bindings[24]
            , (android.widget.AutoCompleteTextView) bindings[30]
            , (com.google.android.material.textfield.TextInputEditText) bindings[28]
            , (android.widget.AutoCompleteTextView) bindings[36]
            , (android.widget.AutoCompleteTextView) bindings[32]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.ImageView) bindings[41]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ProgressBar) bindings[38]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[40]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[37]
            , (android.widget.ImageView) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (com.google.android.material.textfield.TextInputLayout) bindings[33]
            , (com.google.android.material.textfield.TextInputLayout) bindings[29]
            , (com.google.android.material.textfield.TextInputLayout) bindings[27]
            , (com.google.android.material.textfield.TextInputLayout) bindings[35]
            , (com.google.android.material.textfield.TextInputLayout) bindings[31]
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
        if (BR.parentProfileViewModel == variableId) {
            setParentProfileViewModel((com.auro.application.home.presentation.viewmodel.StudentProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setParentProfileViewModel(@Nullable com.auro.application.home.presentation.viewmodel.StudentProfileViewModel ParentProfileViewModel) {
        this.mParentProfileViewModel = ParentProfileViewModel;
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
        flag 1 (0x2L): parentProfileViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}