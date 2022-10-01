package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentCreateGroupBindingImpl extends FragmentCreateGroupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(33);
        sIncludes.setIncludes(1, 
            new String[] {"fragment_main_quiz_home_shimmer"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.fragment_main_quiz_home_shimmer});
        sIncludes.setIncludes(2, 
            new String[] {"error_layout"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 5);
        sViewsWithIds.put(R.id.constantLayout, 6);
        sViewsWithIds.put(R.id.imageView5, 7);
        sViewsWithIds.put(R.id.auro_scholar_logo, 8);
        sViewsWithIds.put(R.id.cardView2, 9);
        sViewsWithIds.put(R.id.imageView6, 10);
        sViewsWithIds.put(R.id.language_layout, 11);
        sViewsWithIds.put(R.id.imageViewNotification, 12);
        sViewsWithIds.put(R.id.imageViewLanguage, 13);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 14);
        sViewsWithIds.put(R.id.mainHeadtop, 15);
        sViewsWithIds.put(R.id.RPCreateGroup, 16);
        sViewsWithIds.put(R.id.RPDetailInformation, 17);
        sViewsWithIds.put(R.id.swipeCons, 18);
        sViewsWithIds.put(R.id.groupNameDefine, 19);
        sViewsWithIds.put(R.id.etGroupName, 20);
        sViewsWithIds.put(R.id.backgroundSprincle_11, 21);
        sViewsWithIds.put(R.id.Rlgroup, 22);
        sViewsWithIds.put(R.id.rpChoose_Student, 23);
        sViewsWithIds.put(R.id.linearLayout, 24);
        sViewsWithIds.put(R.id.rv_added_student_list, 25);
        sViewsWithIds.put(R.id.added_list_message, 26);
        sViewsWithIds.put(R.id.viewItem, 27);
        sViewsWithIds.put(R.id.rpStudentList, 28);
        sViewsWithIds.put(R.id.rv_UnknowGroup, 29);
        sViewsWithIds.put(R.id.student_list_message, 30);
        sViewsWithIds.put(R.id.progress_layout, 31);
        sViewsWithIds.put(R.id.progressBar, 32);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.auro.application.databinding.FragmentMainQuizHomeShimmerBinding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCreateGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private FragmentCreateGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (android.widget.RelativeLayout) bindings[22]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[26]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[4]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[20]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.ProgressBar) bindings[32]
            , (android.widget.RelativeLayout) bindings[31]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[23]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[25]
            , (androidx.recyclerview.widget.RecyclerView) bindings[29]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[30]
            , (android.widget.LinearLayout) bindings[18]
            , (android.view.View) bindings[27]
            );
        this.errorConstraint.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView1 = (com.auro.application.databinding.FragmentMainQuizHomeShimmerBinding) bindings[3];
        setContainedBinding(this.mboundView1);
        this.shimmerViewQuiz.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView1.invalidateAll();
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
        if (mboundView1.hasPendingBindings()) {
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
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
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
        executeBindingsOn(mboundView1);
        executeBindingsOn(errorLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}