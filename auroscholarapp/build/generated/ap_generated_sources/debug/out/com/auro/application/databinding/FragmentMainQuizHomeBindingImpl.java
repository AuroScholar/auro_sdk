package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentMainQuizHomeBindingImpl extends FragmentMainQuizHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(34);
        sIncludes.setIncludes(1, 
            new String[] {"user_select_start_quiz_bottom_sheet"},
            new int[] {6},
            new int[] {com.auro.application.R.layout.user_select_start_quiz_bottom_sheet});
        sIncludes.setIncludes(2, 
            new String[] {"slab_level_layout"},
            new int[] {5},
            new int[] {com.auro.application.R.layout.slab_level_layout});
        sIncludes.setIncludes(3, 
            new String[] {"fragment_main_quiz_home_shimmer"},
            new int[] {7},
            new int[] {com.auro.application.R.layout.fragment_main_quiz_home_shimmer});
        sIncludes.setIncludes(4, 
            new String[] {"error_layout"},
            new int[] {8},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constantLayout, 9);
        sViewsWithIds.put(R.id.topHeader_layout, 10);
        sViewsWithIds.put(R.id.imageView5, 11);
        sViewsWithIds.put(R.id.auro_scholar_logo, 12);
        sViewsWithIds.put(R.id.cardView2, 13);
        sViewsWithIds.put(R.id.imageView6, 14);
        sViewsWithIds.put(R.id.language_layout, 15);
        sViewsWithIds.put(R.id.imageViewNotification, 16);
        sViewsWithIds.put(R.id.imageViewLanguage, 17);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 18);
        sViewsWithIds.put(R.id.linearLayout6, 19);
        sViewsWithIds.put(R.id.MonthLayout, 20);
        sViewsWithIds.put(R.id.RPTextView9, 21);
        sViewsWithIds.put(R.id.RPTextView10, 22);
        sViewsWithIds.put(R.id.walleticon, 23);
        sViewsWithIds.put(R.id.wallet_bal_text, 24);
        sViewsWithIds.put(R.id.relativeLayout, 25);
        sViewsWithIds.put(R.id.RPTextView11, 26);
        sViewsWithIds.put(R.id.swipe_refresh_layout, 27);
        sViewsWithIds.put(R.id.recyclerViewMenu, 28);
        sViewsWithIds.put(R.id.auro_scholar_bottom, 29);
        sViewsWithIds.put(R.id.privacy_policy, 30);
        sViewsWithIds.put(R.id.terms_of_use, 31);
        sViewsWithIds.put(R.id.imageChat, 32);
        sViewsWithIds.put(R.id.float_chat, 33);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final com.auro.application.databinding.FragmentMainQuizHomeShimmerBinding mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainQuizHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentMainQuizHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.LinearLayout) bindings[20]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[26]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[21]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[8]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[33]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.RelativeLayout) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[30]
            , (com.auro.application.databinding.UserSelectStartQuizBottomSheetBinding) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (android.widget.RelativeLayout) bindings[25]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[3]
            , (com.auro.application.databinding.SlabLevelLayoutBinding) bindings[5]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[27]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[24]
            , (android.widget.RelativeLayout) bindings[23]
            );
        this.errorConstraint.setTag(null);
        this.mainParentLayout.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.auro.application.databinding.FragmentMainQuizHomeShimmerBinding) bindings[7];
        setContainedBinding(this.mboundView3);
        this.shimmerViewQuiz.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        slabLayout.invalidateAll();
        quizSelectionSheet.invalidateAll();
        mboundView3.invalidateAll();
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
        if (slabLayout.hasPendingBindings()) {
            return true;
        }
        if (quizSelectionSheet.hasPendingBindings()) {
            return true;
        }
        if (mboundView3.hasPendingBindings()) {
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
        slabLayout.setLifecycleOwner(lifecycleOwner);
        quizSelectionSheet.setLifecycleOwner(lifecycleOwner);
        mboundView3.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeQuizSelectionSheet((com.auro.application.databinding.UserSelectStartQuizBottomSheetBinding) object, fieldId);
            case 2 :
                return onChangeSlabLayout((com.auro.application.databinding.SlabLevelLayoutBinding) object, fieldId);
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
    private boolean onChangeSlabLayout(com.auro.application.databinding.SlabLevelLayoutBinding SlabLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        executeBindingsOn(slabLayout);
        executeBindingsOn(quizSelectionSheet);
        executeBindingsOn(mboundView3);
        executeBindingsOn(errorLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): quizSelectionSheet
        flag 2 (0x3L): slabLayout
        flag 3 (0x4L): quizViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}