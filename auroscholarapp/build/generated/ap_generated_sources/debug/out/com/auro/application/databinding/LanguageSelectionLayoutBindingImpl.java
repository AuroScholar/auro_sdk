package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class LanguageSelectionLayoutBindingImpl extends LanguageSelectionLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout3, 1);
        sViewsWithIds.put(R.id.constraintLayout2, 2);
        sViewsWithIds.put(R.id.txtSelect, 3);
        sViewsWithIds.put(R.id.rvselect_message, 4);
        sViewsWithIds.put(R.id.selection_layout, 5);
        sViewsWithIds.put(R.id.recyclerViewlang, 6);
        sViewsWithIds.put(R.id.button, 7);
        sViewsWithIds.put(R.id.close_button, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LanguageSelectionLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private LanguageSelectionLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
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
        if (BR.selectYourMessageDialogModel == variableId) {
            setSelectYourMessageDialogModel((com.auro.application.teacher.presentation.viewmodel.SelectYourMessageDialogModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectYourMessageDialogModel(@Nullable com.auro.application.teacher.presentation.viewmodel.SelectYourMessageDialogModel SelectYourMessageDialogModel) {
        this.mSelectYourMessageDialogModel = SelectYourMessageDialogModel;
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
        flag 0 (0x1L): selectYourMessageDialogModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}