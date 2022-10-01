package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FriendsLeoboardListLayoutBindingImpl extends FriendsLeoboardListLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(30);
        sIncludes.setIncludes(0, 
            new String[] {"full_screen_progress_bar"},
            new int[] {11},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(1, 
            new String[] {"toolbar_header_layout"},
            new int[] {6},
            new int[] {com.auro.application.R.layout.toolbar_header_layout});
        sIncludes.setIncludes(2, 
            new String[] {"quiz_header_layout"},
            new int[] {7},
            new int[] {com.auro.application.R.layout.quiz_header_layout});
        sIncludes.setIncludes(3, 
            new String[] {"quiz_home_shimmer_layout"},
            new int[] {8},
            new int[] {com.auro.application.R.layout.quiz_home_shimmer_layout});
        sIncludes.setIncludes(4, 
            new String[] {"quiz_header_layout"},
            new int[] {9},
            new int[] {com.auro.application.R.layout.quiz_header_layout});
        sIncludes.setIncludes(5, 
            new String[] {"error_layout"},
            new int[] {10},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_parent_layout, 12);
        sViewsWithIds.put(R.id.friend_board_bg, 13);
        sViewsWithIds.put(R.id.friends_board_text, 14);
        sViewsWithIds.put(R.id.invite_button, 15);
        sViewsWithIds.put(R.id.invite_text, 16);
        sViewsWithIds.put(R.id.fb_icon, 17);
        sViewsWithIds.put(R.id.board_list_layout, 18);
        sViewsWithIds.put(R.id.friends_list, 19);
        sViewsWithIds.put(R.id.no_friend_layout, 20);
        sViewsWithIds.put(R.id.RpFriendsKeBina, 21);
        sViewsWithIds.put(R.id.invite_now, 22);
        sViewsWithIds.put(R.id.txtreffereduser, 23);
        sViewsWithIds.put(R.id.recyclerview_reffered, 24);
        sViewsWithIds.put(R.id.txtrefferaluser, 25);
        sViewsWithIds.put(R.id.recyclerview_refferal, 26);
        sViewsWithIds.put(R.id.progressBar, 27);
        sViewsWithIds.put(R.id.invite_progress, 28);
        sViewsWithIds.put(R.id.progressBar_2, 29);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final com.auro.application.databinding.QuizHomeShimmerLayoutBinding mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FriendsLeoboardListLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private FriendsLeoboardListLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[10]
            , (android.widget.ImageView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[7]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.ProgressBar) bindings[27]
            , (android.widget.ProgressBar) bindings[29]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[3]
            , (com.auro.application.databinding.ToolbarHeaderLayoutBinding) bindings[6]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[23]
            );
        this.errorConstraint.setTag(null);
        this.friendBgImgLayout.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.auro.application.databinding.QuizHomeShimmerLayoutBinding) bindings[8];
        setContainedBinding(this.mboundView3);
        this.shimmerViewQuiz.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        toolbarLayout.invalidateAll();
        headerParent.invalidateAll();
        mboundView3.invalidateAll();
        headerTopParent.invalidateAll();
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
        if (toolbarLayout.hasPendingBindings()) {
            return true;
        }
        if (headerParent.hasPendingBindings()) {
            return true;
        }
        if (mboundView3.hasPendingBindings()) {
            return true;
        }
        if (headerTopParent.hasPendingBindings()) {
            return true;
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
        toolbarLayout.setLifecycleOwner(lifecycleOwner);
        headerParent.setLifecycleOwner(lifecycleOwner);
        mboundView3.setLifecycleOwner(lifecycleOwner);
        headerTopParent.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
        progressbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeToolbarLayout((com.auro.application.databinding.ToolbarHeaderLayoutBinding) object, fieldId);
            case 2 :
                return onChangeProgressbar((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
            case 3 :
                return onChangeHeaderParent((com.auro.application.databinding.QuizHeaderLayoutBinding) object, fieldId);
            case 4 :
                return onChangeHeaderTopParent((com.auro.application.databinding.QuizHeaderLayoutBinding) object, fieldId);
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
    private boolean onChangeToolbarLayout(com.auro.application.databinding.ToolbarHeaderLayoutBinding ToolbarLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProgressbar(com.auro.application.databinding.FullScreenProgressBarBinding Progressbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHeaderParent(com.auro.application.databinding.QuizHeaderLayoutBinding HeaderParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHeaderTopParent(com.auro.application.databinding.QuizHeaderLayoutBinding HeaderTopParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        executeBindingsOn(toolbarLayout);
        executeBindingsOn(headerParent);
        executeBindingsOn(mboundView3);
        executeBindingsOn(headerTopParent);
        executeBindingsOn(errorLayout);
        executeBindingsOn(progressbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): toolbarLayout
        flag 2 (0x3L): progressbar
        flag 3 (0x4L): headerParent
        flag 4 (0x5L): headerTopParent
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}