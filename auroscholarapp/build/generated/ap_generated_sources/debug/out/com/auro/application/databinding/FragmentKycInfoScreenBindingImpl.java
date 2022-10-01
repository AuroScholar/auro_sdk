package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentKycInfoScreenBindingImpl extends FragmentKycInfoScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(34);
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constantLayoutNew, 3);
        sViewsWithIds.put(R.id.imageView5, 4);
        sViewsWithIds.put(R.id.auro_scholar_logo, 5);
        sViewsWithIds.put(R.id.language_layout, 6);
        sViewsWithIds.put(R.id.imageViewNotification, 7);
        sViewsWithIds.put(R.id.imageViewLanguage, 8);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 9);
        sViewsWithIds.put(R.id.nestedScroll, 10);
        sViewsWithIds.put(R.id.RPKycInformation, 11);
        sViewsWithIds.put(R.id.document, 12);
        sViewsWithIds.put(R.id.RPreupload, 13);
        sViewsWithIds.put(R.id.RPTextView15, 14);
        sViewsWithIds.put(R.id.constraintLayout9, 15);
        sViewsWithIds.put(R.id.cardview, 16);
        sViewsWithIds.put(R.id.imageView6, 17);
        sViewsWithIds.put(R.id.teacher_name, 18);
        sViewsWithIds.put(R.id.RpYourKycVerify, 19);
        sViewsWithIds.put(R.id.linearLayout5, 20);
        sViewsWithIds.put(R.id.RpKycVerification, 21);
        sViewsWithIds.put(R.id.onceitsDone, 22);
        sViewsWithIds.put(R.id.relativeLayout1, 23);
        sViewsWithIds.put(R.id.doucmetImage, 24);
        sViewsWithIds.put(R.id.relativeLayout2, 25);
        sViewsWithIds.put(R.id.scannerLayout, 26);
        sViewsWithIds.put(R.id.scannerBar, 27);
        sViewsWithIds.put(R.id.mainFrame, 28);
        sViewsWithIds.put(R.id.RPUploadDocument, 29);
        sViewsWithIds.put(R.id.kyc_recycleview, 30);
        sViewsWithIds.put(R.id.progressBar, 31);
        sViewsWithIds.put(R.id.rogoli, 32);
        sViewsWithIds.put(R.id.mainFrameLayout, 33);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentKycInfoScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentKycInfoScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[29]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[21]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (android.widget.ImageView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.ImageView) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[30]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.FrameLayout) bindings[28]
            , (android.widget.FrameLayout) bindings[33]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (android.widget.ProgressBar) bindings[31]
            , (android.widget.RelativeLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.RelativeLayout) bindings[32]
            , (android.view.View) bindings[27]
            , (android.widget.LinearLayout) bindings[26]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[18]
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
                mDirtyFlags = 0x4L;
        }
        errorLayout.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.kycViewModel == variableId) {
            setKycViewModel((com.auro.application.home.presentation.viewmodel.KYCViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKycViewModel(@Nullable com.auro.application.home.presentation.viewmodel.KYCViewModel KycViewModel) {
        this.mKycViewModel = KycViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): kycViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}