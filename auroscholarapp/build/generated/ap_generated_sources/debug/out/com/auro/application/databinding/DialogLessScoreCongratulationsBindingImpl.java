package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class DialogLessScoreCongratulationsBindingImpl extends DialogLessScoreCongratulationsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout6, 1);
        sViewsWithIds.put(R.id.imgtryagain, 2);
        sViewsWithIds.put(R.id.constraintLayout5, 3);
        sViewsWithIds.put(R.id.constraintLayout8, 4);
        sViewsWithIds.put(R.id.backgroundSprincle, 5);
        sViewsWithIds.put(R.id.RPTextView4, 6);
        sViewsWithIds.put(R.id.llyour_score, 7);
        sViewsWithIds.put(R.id.RPTextView5, 8);
        sViewsWithIds.put(R.id.tickerView, 9);
        sViewsWithIds.put(R.id.txt_you, 10);
        sViewsWithIds.put(R.id.constraintLayout7, 11);
        sViewsWithIds.put(R.id.txtRetakeQuiz, 12);
        sViewsWithIds.put(R.id.txtStartQuiz, 13);
        sViewsWithIds.put(R.id.btntutor, 14);
        sViewsWithIds.put(R.id.btnShare, 15);
        sViewsWithIds.put(R.id.icClose, 16);
        sViewsWithIds.put(R.id.close_button_2, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogLessScoreCongratulationsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private DialogLessScoreCongratulationsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            , (android.widget.ImageView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[16]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[7]
            , (com.robinhood.ticker.TickerView) bindings[9]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
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