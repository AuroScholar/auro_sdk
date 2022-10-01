package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentTeacherNewprofileBindingImpl extends FragmentTeacherNewprofileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(43);
        sIncludes.setIncludes(0, 
            new String[] {"full_screen_progress_bar"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 4);
        sViewsWithIds.put(R.id.auro_scholar_logo, 5);
        sViewsWithIds.put(R.id.imageView5, 6);
        sViewsWithIds.put(R.id.imageView6, 7);
        sViewsWithIds.put(R.id.linearLayout9, 8);
        sViewsWithIds.put(R.id.rp_teacherprofile, 9);
        sViewsWithIds.put(R.id.logout, 10);
        sViewsWithIds.put(R.id.profile_image, 11);
        sViewsWithIds.put(R.id.profileimage, 12);
        sViewsWithIds.put(R.id.editImage, 13);
        sViewsWithIds.put(R.id.edit_icon, 14);
        sViewsWithIds.put(R.id.linearLayout10, 15);
        sViewsWithIds.put(R.id.tiFullName, 16);
        sViewsWithIds.put(R.id.etFullName, 17);
        sViewsWithIds.put(R.id.tlPhoneNumber, 18);
        sViewsWithIds.put(R.id.etPhoneNumber, 19);
        sViewsWithIds.put(R.id.tlEmail, 20);
        sViewsWithIds.put(R.id.etEmailNumber, 21);
        sViewsWithIds.put(R.id.txtClasses, 22);
        sViewsWithIds.put(R.id.recycleViewclass, 23);
        sViewsWithIds.put(R.id.view, 24);
        sViewsWithIds.put(R.id.txtSubject, 25);
        sViewsWithIds.put(R.id.recycleViewsubject, 26);
        sViewsWithIds.put(R.id.view1, 27);
        sViewsWithIds.put(R.id.tlSchool, 28);
        sViewsWithIds.put(R.id.etSchoolName, 29);
        sViewsWithIds.put(R.id.tlGender, 30);
        sViewsWithIds.put(R.id.etGenderDrop, 31);
        sViewsWithIds.put(R.id.tlState, 32);
        sViewsWithIds.put(R.id.etState, 33);
        sViewsWithIds.put(R.id.tlDistict, 34);
        sViewsWithIds.put(R.id.etDistict, 35);
        sViewsWithIds.put(R.id.linearLayout11, 36);
        sViewsWithIds.put(R.id.skip_for_now, 37);
        sViewsWithIds.put(R.id.nextButton, 38);
        sViewsWithIds.put(R.id.saveImagebutton, 39);
        sViewsWithIds.put(R.id.button, 40);
        sViewsWithIds.put(R.id.progressBar, 41);
        sViewsWithIds.put(R.id.RpBootomText, 42);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTeacherNewprofileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private FragmentTeacherNewprofileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[42]
            , (android.widget.ImageView) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[40]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.RelativeLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[2]
            , (android.widget.AutoCompleteTextView) bindings[35]
            , (com.google.android.material.textfield.TextInputEditText) bindings[21]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (android.widget.AutoCompleteTextView) bindings[31]
            , (com.google.android.material.textfield.TextInputEditText) bindings[19]
            , (android.widget.AutoCompleteTextView) bindings[29]
            , (android.widget.AutoCompleteTextView) bindings[33]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[8]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.ImageView) bindings[38]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ProgressBar) bindings[41]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (android.widget.RelativeLayout) bindings[39]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[37]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[34]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputLayout) bindings[30]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[28]
            , (com.google.android.material.textfield.TextInputLayout) bindings[32]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[25]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[27]
            );
        this.errorConstraint.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        errorLayout.invalidateAll();
        progressbarLayout.invalidateAll();
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
        if (progressbarLayout.hasPendingBindings()) {
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
        errorLayout.setLifecycleOwner(lifecycleOwner);
        progressbarLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeProgressbarLayout((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
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
    private boolean onChangeProgressbarLayout(com.auro.application.databinding.FullScreenProgressBarBinding ProgressbarLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        executeBindingsOn(progressbarLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): progressbarLayout
        flag 2 (0x3L): studentProfileViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}