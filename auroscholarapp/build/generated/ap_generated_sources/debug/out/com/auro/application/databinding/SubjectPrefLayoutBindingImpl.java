package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class SubjectPrefLayoutBindingImpl extends SubjectPrefLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 3);
        sViewsWithIds.put(R.id.constantLayout, 4);
        sViewsWithIds.put(R.id.imageView5, 5);
        sViewsWithIds.put(R.id.auro_scholar_logo, 6);
        sViewsWithIds.put(R.id.ic_close, 7);
        sViewsWithIds.put(R.id.linearLayout6, 8);
        sViewsWithIds.put(R.id.RPTextView9, 9);
        sViewsWithIds.put(R.id.RPTextView10, 10);
        sViewsWithIds.put(R.id.subject_recyclerview, 11);
        sViewsWithIds.put(R.id.bt_continue, 12);
        sViewsWithIds.put(R.id.progressBar_button, 13);
        sViewsWithIds.put(R.id.progressBar_2, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SubjectPrefLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private SubjectPrefLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[2]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[14]
            , (android.widget.ProgressBar) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
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