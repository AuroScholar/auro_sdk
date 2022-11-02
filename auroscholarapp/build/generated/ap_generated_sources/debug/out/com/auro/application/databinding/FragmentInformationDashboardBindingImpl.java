package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentInformationDashboardBindingImpl extends FragmentInformationDashboardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(38);
        sIncludes.setIncludes(0, 
            new String[] {"full_screen_progress_bar"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 4);
        sViewsWithIds.put(R.id.floatingActionButton, 5);
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
        sViewsWithIds.put(R.id.RPinformation, 16);
        sViewsWithIds.put(R.id.RPDetailInformation, 17);
        sViewsWithIds.put(R.id.swipeCons, 18);
        sViewsWithIds.put(R.id.linearLayout12, 19);
        sViewsWithIds.put(R.id.view_pager, 20);
        sViewsWithIds.put(R.id.tabs, 21);
        sViewsWithIds.put(R.id.rlBook_my_seat, 22);
        sViewsWithIds.put(R.id.RpDahboardtitle, 23);
        sViewsWithIds.put(R.id.total_student_quiz, 24);
        sViewsWithIds.put(R.id.RpTotalStudent, 25);
        sViewsWithIds.put(R.id.tv_total_student, 26);
        sViewsWithIds.put(R.id.Rpscholar, 27);
        sViewsWithIds.put(R.id.tv_total_winning, 28);
        sViewsWithIds.put(R.id.RptestReport, 29);
        sViewsWithIds.put(R.id.test_report, 30);
        sViewsWithIds.put(R.id.linearLayout13, 31);
        sViewsWithIds.put(R.id.Rpmarks, 32);
        sViewsWithIds.put(R.id.RptotalMMarks, 33);
        sViewsWithIds.put(R.id.linearLayout5, 34);
        sViewsWithIds.put(R.id.RpoptainMarks, 35);
        sViewsWithIds.put(R.id.RptotalMMarksobtain, 36);
        sViewsWithIds.put(R.id.rv_wallet_teachet, 37);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentInformationDashboardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private FragmentInformationDashboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[23]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[25]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[32]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[35]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[27]
            , (android.widget.LinearLayout) bindings[29]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[33]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[36]
            , (android.widget.ImageView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[2]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[4]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[3]
            , (android.widget.RelativeLayout) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[37]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (com.google.android.material.tabs.TabLayout) bindings[21]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[30]
            , (android.widget.LinearLayout) bindings[24]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[26]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[28]
            , (com.auro.application.util.AutoScrollViewPager) bindings[20]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        setContainedBinding(this.progressbar);
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
        if (errorLayout.hasPendingBindings()) {
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
        errorLayout.setLifecycleOwner(lifecycleOwner);
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
        executeBindingsOn(errorLayout);
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