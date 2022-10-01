package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class SendMoneyFragmentLayoutBindingImpl extends SendMoneyFragmentLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.paymenttransfer, 3);
        sViewsWithIds.put(R.id.constantLayout, 4);
        sViewsWithIds.put(R.id.mainTopLayout, 5);
        sViewsWithIds.put(R.id.auro_scholar_logo, 6);
        sViewsWithIds.put(R.id.imageView5, 7);
        sViewsWithIds.put(R.id.cardView2, 8);
        sViewsWithIds.put(R.id.imageView6, 9);
        sViewsWithIds.put(R.id.back_button, 10);
        sViewsWithIds.put(R.id.linearLayout6, 11);
        sViewsWithIds.put(R.id.RPTextView9, 12);
        sViewsWithIds.put(R.id.RPTextView10, 13);
        sViewsWithIds.put(R.id.dine_home_tabs, 14);
        sViewsWithIds.put(R.id.viewPager, 15);
        sViewsWithIds.put(R.id.transparet, 16);
        sViewsWithIds.put(R.id.progressBar_2, 17);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SendMoneyFragmentLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private SendMoneyFragmentLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.tabs.TabLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[2]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.viewpager.widget.ViewPager) bindings[15]
            );
        this.errorConstraint.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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