package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentGradeChangeDialogBindingImpl extends FragmentGradeChangeDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(0, 
            new String[] {"back_new_button", "full_screen_progress_bar"},
            new int[] {1, 2},
            new int[] {com.auro.application.R.layout.back_new_button,
                com.auro.application.R.layout.full_screen_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView4, 3);
        sViewsWithIds.put(R.id.text_Eduction, 4);
        sViewsWithIds.put(R.id.view, 5);
        sViewsWithIds.put(R.id.layoutClass, 6);
        sViewsWithIds.put(R.id.SpinnerClass, 7);
        sViewsWithIds.put(R.id.btn_yes, 8);
        sViewsWithIds.put(R.id.tv_title, 9);
        sViewsWithIds.put(R.id.tv_message, 10);
        sViewsWithIds.put(R.id.lin_lay_btn, 11);
        sViewsWithIds.put(R.id.btn_no, 12);
        sViewsWithIds.put(R.id.btn_yesConfirm, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGradeChangeDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentGradeChangeDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[7]
            , (com.auro.application.databinding.BackNewButtonBinding) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (com.auro.application.core.util.uiwidget.RPButton) bindings[8]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (android.widget.ImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[11]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[4]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (android.view.View) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        backButton.invalidateAll();
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
        if (backButton.hasPendingBindings()) {
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
        if (BR.GradeChangeViewModel == variableId) {
            setGradeChangeViewModel((com.auro.application.home.presentation.viewmodel.GradeChangeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGradeChangeViewModel(@Nullable com.auro.application.home.presentation.viewmodel.GradeChangeViewModel GradeChangeViewModel) {
        this.mGradeChangeViewModel = GradeChangeViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        backButton.setLifecycleOwner(lifecycleOwner);
        progressbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgressbar((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
            case 1 :
                return onChangeBackButton((com.auro.application.databinding.BackNewButtonBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgressbar(com.auro.application.databinding.FullScreenProgressBarBinding Progressbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBackButton(com.auro.application.databinding.BackNewButtonBinding BackButton, int fieldId) {
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
        executeBindingsOn(backButton);
        executeBindingsOn(progressbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): progressbar
        flag 1 (0x2L): backButton
        flag 2 (0x3L): GradeChangeViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}