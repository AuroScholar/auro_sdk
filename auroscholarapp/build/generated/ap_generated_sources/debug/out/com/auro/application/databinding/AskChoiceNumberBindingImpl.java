package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class AskChoiceNumberBindingImpl extends AskChoiceNumberBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout6, 1);
        sViewsWithIds.put(R.id.title_first, 2);
        sViewsWithIds.put(R.id.phone_verify_text, 3);
        sViewsWithIds.put(R.id.RPButtonSendOtp, 4);
        sViewsWithIds.put(R.id.or, 5);
        sViewsWithIds.put(R.id.RPButtonChangeNumber, 6);
        sViewsWithIds.put(R.id.icClose, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AskChoiceNumberBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AskChoiceNumberBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[3]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[2]
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
        if (BR.CongratulationsDialogViewModel == variableId) {
            setCongratulationsDialogViewModel((com.auro.application.home.presentation.viewmodel.CongratulationsDialogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCongratulationsDialogViewModel(@Nullable com.auro.application.home.presentation.viewmodel.CongratulationsDialogViewModel CongratulationsDialogViewModel) {
        this.mCongratulationsDialogViewModel = CongratulationsDialogViewModel;
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
        flag 0 (0x1L): CongratulationsDialogViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}