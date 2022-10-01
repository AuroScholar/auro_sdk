package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentKycNewScreenBindingImpl extends FragmentKycNewScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constantLayoutNew, 1);
        sViewsWithIds.put(R.id.imageView5, 2);
        sViewsWithIds.put(R.id.auro_scholar_logo, 3);
        sViewsWithIds.put(R.id.language_layout, 4);
        sViewsWithIds.put(R.id.imageViewNotification, 5);
        sViewsWithIds.put(R.id.imageViewLanguage, 6);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 7);
        sViewsWithIds.put(R.id.nestedScroll, 8);
        sViewsWithIds.put(R.id.RPTextView14, 9);
        sViewsWithIds.put(R.id.RPTextView15, 10);
        sViewsWithIds.put(R.id.constraintLayout9, 11);
        sViewsWithIds.put(R.id.profile_image, 12);
        sViewsWithIds.put(R.id.linearLayout5, 13);
        sViewsWithIds.put(R.id.relativeLayout1, 14);
        sViewsWithIds.put(R.id.doucmetImage, 15);
        sViewsWithIds.put(R.id.relativeLayout2, 16);
        sViewsWithIds.put(R.id.scannerLayout, 17);
        sViewsWithIds.put(R.id.scannerBar, 18);
        sViewsWithIds.put(R.id.RPTextView16, 19);
        sViewsWithIds.put(R.id.linearLayout7, 20);
        sViewsWithIds.put(R.id.document, 21);
        sViewsWithIds.put(R.id.rogoli, 22);
        sViewsWithIds.put(R.id.mainFrame, 23);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentKycNewScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentKycNewScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (android.widget.ImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.FrameLayout) bindings[23]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.view.View) bindings[18]
            , (android.widget.LinearLayout) bindings[17]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.TeacherKycViewModel == variableId) {
            setTeacherKycViewModel((com.auro.application.home.presentation.viewmodel.KYCViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTeacherKycViewModel(@Nullable com.auro.application.home.presentation.viewmodel.KYCViewModel TeacherKycViewModel) {
        this.mTeacherKycViewModel = TeacherKycViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): TeacherKycViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}