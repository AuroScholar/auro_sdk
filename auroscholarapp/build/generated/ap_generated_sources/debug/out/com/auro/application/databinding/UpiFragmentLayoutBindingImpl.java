package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class UpiFragmentLayoutBindingImpl extends UpiFragmentLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.wallet_text, 1);
        sViewsWithIds.put(R.id.card_view, 2);
        sViewsWithIds.put(R.id.paytm_icon, 3);
        sViewsWithIds.put(R.id.wallet_bal_text, 4);
        sViewsWithIds.put(R.id.editTextHead, 5);
        sViewsWithIds.put(R.id.number_edittext, 6);
        sViewsWithIds.put(R.id.send_button, 7);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UpiFragmentLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private UpiFragmentLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[4]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
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
        flag 0 (0x1L): kycViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}