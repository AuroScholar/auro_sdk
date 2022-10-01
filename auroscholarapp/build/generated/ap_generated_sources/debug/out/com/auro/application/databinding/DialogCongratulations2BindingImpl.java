package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class DialogCongratulations2BindingImpl extends DialogCongratulations2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout6, 1);
        sViewsWithIds.put(R.id.constraintLayout4, 2);
        sViewsWithIds.put(R.id.imageView2, 3);
        sViewsWithIds.put(R.id.RPTextView6, 4);
        sViewsWithIds.put(R.id.constraintLayout5, 5);
        sViewsWithIds.put(R.id.constraintLayout8, 6);
        sViewsWithIds.put(R.id.RPTextView4, 7);
        sViewsWithIds.put(R.id.llyour_score, 8);
        sViewsWithIds.put(R.id.RPTextView5, 9);
        sViewsWithIds.put(R.id.tickerView, 10);
        sViewsWithIds.put(R.id.score_fifty, 11);
        sViewsWithIds.put(R.id.constraintLayout7, 12);
        sViewsWithIds.put(R.id.txtRetakeQuiz, 13);
        sViewsWithIds.put(R.id.txtStartQuiz, 14);
        sViewsWithIds.put(R.id.btnShare, 15);
        sViewsWithIds.put(R.id.backgroundSprincle_11, 16);
        sViewsWithIds.put(R.id.icClose, 17);
        sViewsWithIds.put(R.id.close_button_2, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogCongratulations2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private DialogCongratulations2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[4]
            , (android.widget.ImageView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (android.widget.ImageView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[8]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.robinhood.ticker.TickerView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
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