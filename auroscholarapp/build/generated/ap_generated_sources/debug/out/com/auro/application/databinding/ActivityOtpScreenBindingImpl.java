package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityOtpScreenBindingImpl extends ActivityOtpScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(0, 
            new String[] {"full_screen_progress_bar"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sIncludes.setIncludes(1, 
            new String[] {"back_new_button"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.back_new_button});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView4, 4);
        sViewsWithIds.put(R.id.text_Eduction, 5);
        sViewsWithIds.put(R.id.view, 6);
        sViewsWithIds.put(R.id.llOtp, 7);
        sViewsWithIds.put(R.id.textOtpShow, 8);
        sViewsWithIds.put(R.id.otp_view, 9);
        sViewsWithIds.put(R.id.RPButtonConfirm, 10);
        sViewsWithIds.put(R.id.timer_layout, 11);
        sViewsWithIds.put(R.id.clock_icon, 12);
        sViewsWithIds.put(R.id.timer_text, 13);
        sViewsWithIds.put(R.id.code_editMobileno, 14);
        sViewsWithIds.put(R.id.code_valid_text, 15);
        sViewsWithIds.put(R.id.resendText, 16);
        sViewsWithIds.put(R.id.RPTextView7, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOtpScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityOtpScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPButton) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (com.auro.application.databinding.BackNewButtonBinding) bindings[2]
            , (android.widget.ImageView) bindings[12]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (android.widget.ImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[7]
            , (in.aabhasjindal.otptextview.OtpTextView) bindings[9]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[3]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (android.view.View) bindings[6]
            );
        setContainedBinding(this.backButton);
        this.layoutDesgin.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        setContainedBinding(this.progressbar);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.auro.application.home.presentation.viewmodel.OtpScreenViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.auro.application.home.presentation.viewmodel.OtpScreenViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}