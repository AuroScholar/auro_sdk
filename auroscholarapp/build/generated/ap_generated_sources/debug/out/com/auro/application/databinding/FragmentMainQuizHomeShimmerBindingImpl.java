package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentMainQuizHomeShimmerBindingImpl extends FragmentMainQuizHomeShimmerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constantLayout, 1);
        sViewsWithIds.put(R.id.imageView5, 2);
        sViewsWithIds.put(R.id.cardView2, 3);
        sViewsWithIds.put(R.id.imageView6, 4);
        sViewsWithIds.put(R.id.imageViewNotification, 5);
        sViewsWithIds.put(R.id.imageViewLanguage, 6);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 7);
        sViewsWithIds.put(R.id.linearLayout6, 8);
        sViewsWithIds.put(R.id.RPTextView9, 9);
        sViewsWithIds.put(R.id.RPTextView10, 10);
        sViewsWithIds.put(R.id.RPTextView11, 11);
        sViewsWithIds.put(R.id.quiz_layout_one, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainQuizHomeShimmerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentMainQuizHomeShimmerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[12]
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
        flag 0 (0x1L): quizViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}