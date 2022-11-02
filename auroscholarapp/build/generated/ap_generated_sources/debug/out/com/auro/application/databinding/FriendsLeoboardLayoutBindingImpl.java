package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FriendsLeoboardLayoutBindingImpl extends FriendsLeoboardLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(23);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_header_layout"},
            new int[] {5},
            new int[] {com.auro.application.R.layout.toolbar_header_layout});
        sIncludes.setIncludes(1, 
            new String[] {"full_screen_progress_bar"},
            new int[] {9},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(2, 
            new String[] {"quiz_header_layout"},
            new int[] {6},
            new int[] {com.auro.application.R.layout.quiz_header_layout});
        sIncludes.setIncludes(3, 
            new String[] {"quiz_header_layout"},
            new int[] {7},
            new int[] {com.auro.application.R.layout.quiz_header_layout});
        sIncludes.setIncludes(4, 
            new String[] {"error_layout"},
            new int[] {8},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.friendleaderboard, 10);
        sViewsWithIds.put(R.id.main_parent_layout, 11);
        sViewsWithIds.put(R.id.friend_board_bg, 12);
        sViewsWithIds.put(R.id.friends_board_text, 13);
        sViewsWithIds.put(R.id.invite_button, 14);
        sViewsWithIds.put(R.id.invite_text, 15);
        sViewsWithIds.put(R.id.fb_icon, 16);
        sViewsWithIds.put(R.id.tvShowFriendRequests, 17);
        sViewsWithIds.put(R.id.tvRequestCount, 18);
        sViewsWithIds.put(R.id.dine_home_tabs, 19);
        sViewsWithIds.put(R.id.viewPager, 20);
        sViewsWithIds.put(R.id.transparet, 21);
        sViewsWithIds.put(R.id.progressBar_2, 22);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FriendsLeoboardLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FriendsLeoboardLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.google.android.material.tabs.TabLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[8]
            , (android.widget.ImageView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[6]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.ProgressBar) bindings[22]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[9]
            , (com.auro.application.databinding.ToolbarHeaderLayoutBinding) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageView) bindings[17]
            , (androidx.viewpager.widget.ViewPager) bindings[20]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        this.friendBgImgLayout.setTag(null);
        setContainedBinding(this.headerParent);
        setContainedBinding(this.headerTopParent);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        setContainedBinding(this.progressbar);
        setContainedBinding(this.toolbarLayout);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        toolbarLayout.invalidateAll();
        headerParent.invalidateAll();
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
        toolbarLayout.setLifecycleOwner(lifecycleOwner);
        headerParent.setLifecycleOwner(lifecycleOwner);
        headerTopParent.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
        progressbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHeaderParent((com.auro.application.databinding.QuizHeaderLayoutBinding) object, fieldId);
            case 1 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 2 :
                return onChangeToolbarLayout((com.auro.application.databinding.ToolbarHeaderLayoutBinding) object, fieldId);
            case 3 :
                return onChangeProgressbar((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
            case 4 :
                return onChangeHeaderTopParent((com.auro.application.databinding.QuizHeaderLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHeaderParent(com.auro.application.databinding.QuizHeaderLayoutBinding HeaderParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeErrorLayout(com.auro.application.databinding.ErrorLayoutBinding ErrorLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolbarLayout(com.auro.application.databinding.ToolbarHeaderLayoutBinding ToolbarLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProgressbar(com.auro.application.databinding.FullScreenProgressBarBinding Progressbar, int fieldId) {
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
        executeBindingsOn(headerTopParent);
        executeBindingsOn(errorLayout);
        executeBindingsOn(progressbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): headerParent
        flag 1 (0x2L): errorLayout
        flag 2 (0x3L): toolbarLayout
        flag 3 (0x4L): progressbar
        flag 4 (0x5L): headerTopParent
        flag 5 (0x6L): quizViewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}