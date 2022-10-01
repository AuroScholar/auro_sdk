package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentClassRoomGroupBindingImpl extends FragmentClassRoomGroupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(31);
        sIncludes.setIncludes(0, 
            new String[] {"full_screen_progress_bar"},
            new int[] {5},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.error_layout});
        sIncludes.setIncludes(2, 
            new String[] {"full_screen_progress_class"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.full_screen_progress_class});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainParentLayout, 6);
        sViewsWithIds.put(R.id.constantLayout, 7);
        sViewsWithIds.put(R.id.imageView5, 8);
        sViewsWithIds.put(R.id.auro_scholar_logo, 9);
        sViewsWithIds.put(R.id.cardView2, 10);
        sViewsWithIds.put(R.id.imageView6, 11);
        sViewsWithIds.put(R.id.language_layout, 12);
        sViewsWithIds.put(R.id.imageViewNotification, 13);
        sViewsWithIds.put(R.id.imageViewLanguage, 14);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 15);
        sViewsWithIds.put(R.id.mainHeadtop, 16);
        sViewsWithIds.put(R.id.RPmyClassRoom, 17);
        sViewsWithIds.put(R.id.RPDetailInformation, 18);
        sViewsWithIds.put(R.id.whats_app_layout, 19);
        sViewsWithIds.put(R.id.txtShareWithOther, 20);
        sViewsWithIds.put(R.id.swipeCons, 21);
        sViewsWithIds.put(R.id.rpStudentList, 22);
        sViewsWithIds.put(R.id.llstudent, 23);
        sViewsWithIds.put(R.id.RpRecent, 24);
        sViewsWithIds.put(R.id.rvItemPic, 25);
        sViewsWithIds.put(R.id.RpGroup, 26);
        sViewsWithIds.put(R.id.bt_add_group, 27);
        sViewsWithIds.put(R.id.rpChoose_Student, 28);
        sViewsWithIds.put(R.id.rv_choose_student, 29);
        sViewsWithIds.put(R.id.student_list_message, 30);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.auro.application.databinding.FullScreenProgressClassBinding mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentClassRoomGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentClassRoomGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[18]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[26]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[24]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[27]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[3]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[6]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[28]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[29]
            , (androidx.recyclerview.widget.RecyclerView) bindings[25]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[30]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.TextView) bindings[20]
            , (android.widget.LinearLayout) bindings[19]
            );
        this.errorConstraint.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView2 = (com.auro.application.databinding.FullScreenProgressClassBinding) bindings[4];
        setContainedBinding(this.mboundView2);
        this.shimmerMyClassroom.setTag(null);
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
        mboundView2.invalidateAll();
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
        if (mboundView2.hasPendingBindings()) {
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
        mboundView2.setLifecycleOwner(lifecycleOwner);
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
        executeBindingsOn(mboundView2);
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