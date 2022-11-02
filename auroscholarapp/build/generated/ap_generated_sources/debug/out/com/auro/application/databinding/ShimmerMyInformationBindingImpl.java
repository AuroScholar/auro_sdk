package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ShimmerMyInformationBindingImpl extends ShimmerMyInformationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(35);
        sIncludes.setIncludes(1, 
            new String[] {"full_screen_progress_bar"},
            new int[] {8},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(2, 
            new String[] {"fragment_main_quiz_home_shimmer"},
            new int[] {5},
            new int[] {com.auro.application.R.layout.fragment_main_quiz_home_shimmer});
        sIncludes.setIncludes(3, 
            new String[] {"error_layout"},
            new int[] {6},
            new int[] {com.auro.application.R.layout.error_layout});
        sIncludes.setIncludes(4, 
            new String[] {"shimmer_my_classroom_layout"},
            new int[] {7},
            new int[] {com.auro.application.R.layout.shimmer_my_classroom_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 9);
        sViewsWithIds.put(R.id.constantLayout, 10);
        sViewsWithIds.put(R.id.imageView5, 11);
        sViewsWithIds.put(R.id.language_layout, 12);
        sViewsWithIds.put(R.id.mainHeadtop, 13);
        sViewsWithIds.put(R.id.RPTextView11, 14);
        sViewsWithIds.put(R.id.RPDetailInformation, 15);
        sViewsWithIds.put(R.id.swipeCons, 16);
        sViewsWithIds.put(R.id.linearLayout12, 17);
        sViewsWithIds.put(R.id.view_pager, 18);
        sViewsWithIds.put(R.id.tabs, 19);
        sViewsWithIds.put(R.id.rlBook_my_seat, 20);
        sViewsWithIds.put(R.id.RpDahboardtitle, 21);
        sViewsWithIds.put(R.id.total_student_quiz, 22);
        sViewsWithIds.put(R.id.RpTotalStudent, 23);
        sViewsWithIds.put(R.id.tv_total_student, 24);
        sViewsWithIds.put(R.id.Rpscholar, 25);
        sViewsWithIds.put(R.id.tv_total_winning, 26);
        sViewsWithIds.put(R.id.RptestReport, 27);
        sViewsWithIds.put(R.id.test_report, 28);
        sViewsWithIds.put(R.id.linearLayout13, 29);
        sViewsWithIds.put(R.id.Rpmarks, 30);
        sViewsWithIds.put(R.id.RptotalMMarks, 31);
        sViewsWithIds.put(R.id.linearLayout5, 32);
        sViewsWithIds.put(R.id.RpoptainMarks, 33);
        sViewsWithIds.put(R.id.RptotalMMarksobtain, 34);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @Nullable
    private final com.auro.application.databinding.FragmentMainQuizHomeShimmerBinding mboundView2;
    @Nullable
    private final com.auro.application.databinding.ShimmerMyClassroomLayoutBinding mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ShimmerMyInformationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private ShimmerMyInformationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[21]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[23]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[30]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[33]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[25]
            , (android.widget.LinearLayout) bindings[27]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[31]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[34]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[9]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[8]
            , (android.widget.RelativeLayout) bindings[20]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[4]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (com.google.android.material.tabs.TabLayout) bindings[19]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[28]
            , (android.widget.LinearLayout) bindings[22]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[24]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[26]
            , (com.auro.application.util.AutoScrollViewPager) bindings[18]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.auro.application.databinding.FragmentMainQuizHomeShimmerBinding) bindings[5];
        setContainedBinding(this.mboundView2);
        this.mboundView4 = (com.auro.application.databinding.ShimmerMyClassroomLayoutBinding) bindings[7];
        setContainedBinding(this.mboundView4);
        setContainedBinding(this.progressbar);
        this.shimmerMyClassroom.setTag(null);
        this.shimmerViewQuiz.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView2.invalidateAll();
        errorLayout.invalidateAll();
        mboundView4.invalidateAll();
        progressbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView2.hasPendingBindings()) {
            return true;
        }
        if (errorLayout.hasPendingBindings()) {
            return true;
        }
        if (mboundView4.hasPendingBindings()) {
            return true;
        }
        if (progressbar.hasPendingBindings()) {
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
        mboundView2.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
        mboundView4.setLifecycleOwner(lifecycleOwner);
        progressbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeProgressbar((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
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
    private boolean onChangeProgressbar(com.auro.application.databinding.FullScreenProgressBarBinding Progressbar, int fieldId) {
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
        executeBindingsOn(mboundView2);
        executeBindingsOn(errorLayout);
        executeBindingsOn(mboundView4);
        executeBindingsOn(progressbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): progressbar
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}