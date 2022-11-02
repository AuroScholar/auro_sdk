package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentWalletInfoDetailBindingImpl extends FragmentWalletInfoDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 3);
        sViewsWithIds.put(R.id.constantLayout, 4);
        sViewsWithIds.put(R.id.mainTopLayout, 5);
        sViewsWithIds.put(R.id.imageView5, 6);
        sViewsWithIds.put(R.id.auro_scholar_logo, 7);
        sViewsWithIds.put(R.id.cardView2, 8);
        sViewsWithIds.put(R.id.imageView6, 9);
        sViewsWithIds.put(R.id.language_layout, 10);
        sViewsWithIds.put(R.id.imageViewNotification, 11);
        sViewsWithIds.put(R.id.imageViewLanguage, 12);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 13);
        sViewsWithIds.put(R.id.linearLayout6, 14);
        sViewsWithIds.put(R.id.RPTextView9, 15);
        sViewsWithIds.put(R.id.RPTextView10, 16);
        sViewsWithIds.put(R.id.bt_transfer_money, 17);
        sViewsWithIds.put(R.id.RvwalletAmount, 18);
        sViewsWithIds.put(R.id.progressBar_button, 19);
        sViewsWithIds.put(R.id.progressBar, 20);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWalletInfoDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentWalletInfoDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (android.widget.ImageView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.RelativeLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ProgressBar) bindings[20]
            , (android.widget.ProgressBar) bindings[19]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
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
        if (BR.quizViewModel == variableId) {
            setQuizViewModel((com.auro.application.home.presentation.viewmodel.QuizViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizViewModel(@Nullable com.auro.application.home.presentation.viewmodel.QuizViewModel QuizViewModel) {
        this.mQuizViewModel = QuizViewModel;
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
        flag 1 (0x2L): quizViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}