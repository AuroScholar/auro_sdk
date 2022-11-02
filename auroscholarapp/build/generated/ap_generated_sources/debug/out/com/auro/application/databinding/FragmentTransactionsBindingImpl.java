package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentTransactionsBindingImpl extends FragmentTransactionsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(26);
        sIncludes.setIncludes(1, 
            new String[] {"user_select_start_quiz_bottom_sheet"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.user_select_start_quiz_bottom_sheet});
        sIncludes.setIncludes(2, 
            new String[] {"error_layout"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constantLayout, 5);
        sViewsWithIds.put(R.id.mainTopLayoout, 6);
        sViewsWithIds.put(R.id.imageView5, 7);
        sViewsWithIds.put(R.id.auro_scholar_logo, 8);
        sViewsWithIds.put(R.id.cardView2, 9);
        sViewsWithIds.put(R.id.imageView6, 10);
        sViewsWithIds.put(R.id.language_layout, 11);
        sViewsWithIds.put(R.id.imageViewNotification, 12);
        sViewsWithIds.put(R.id.imageViewLanguage, 13);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 14);
        sViewsWithIds.put(R.id.linearLayout6, 15);
        sViewsWithIds.put(R.id.RPTextView9, 16);
        sViewsWithIds.put(R.id.RPTextView10, 17);
        sViewsWithIds.put(R.id.month_parent_layout, 18);
        sViewsWithIds.put(R.id.month_title, 19);
        sViewsWithIds.put(R.id.month_spinner, 20);
        sViewsWithIds.put(R.id.subject_parent_layout, 21);
        sViewsWithIds.put(R.id.subject_title, 22);
        sViewsWithIds.put(R.id.subject_spinner, 23);
        sViewsWithIds.put(R.id.monthly_wise_list, 24);
        sViewsWithIds.put(R.id.progressBar_2, 25);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTransactionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentTransactionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (android.widget.ImageView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[18]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[20]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (android.widget.ProgressBar) bindings[25]
            , (com.auro.application.databinding.UserSelectStartQuizBottomSheetBinding) bindings[3]
            , (android.widget.RelativeLayout) bindings[21]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[23]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        this.mainParentLayout.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        setContainedBinding(this.quizSelectionSheet);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        quizSelectionSheet.invalidateAll();
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
        if (quizSelectionSheet.hasPendingBindings()) {
            return true;
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
        quizSelectionSheet.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeQuizSelectionSheet((com.auro.application.databinding.UserSelectStartQuizBottomSheetBinding) object, fieldId);
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
    private boolean onChangeQuizSelectionSheet(com.auro.application.databinding.UserSelectStartQuizBottomSheetBinding QuizSelectionSheet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        executeBindingsOn(quizSelectionSheet);
        executeBindingsOn(errorLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): quizSelectionSheet
        flag 2 (0x3L): quizViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}