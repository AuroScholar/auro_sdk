package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityResetPasswordBindingImpl extends ActivityResetPasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(20);
        sIncludes.setIncludes(0, 
            new String[] {"full_screen_progress_bar"},
            new int[] {1},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.auro_scholar_logo, 2);
        sViewsWithIds.put(R.id.left_corner_image, 3);
        sViewsWithIds.put(R.id.back_button, 4);
        sViewsWithIds.put(R.id.title_first, 5);
        sViewsWithIds.put(R.id.number_edit, 6);
        sViewsWithIds.put(R.id.dialer_recycler_view, 7);
        sViewsWithIds.put(R.id.RPButtonSendOtp, 8);
        sViewsWithIds.put(R.id.terms_conditiond, 9);
        sViewsWithIds.put(R.id.llLoginForm, 10);
        sViewsWithIds.put(R.id.headText, 11);
        sViewsWithIds.put(R.id.passwordlayout, 12);
        sViewsWithIds.put(R.id.etPassword, 13);
        sViewsWithIds.put(R.id.passwordIcon, 14);
        sViewsWithIds.put(R.id.confirmpasswordlayout, 15);
        sViewsWithIds.put(R.id.etconfirmPassword, 16);
        sViewsWithIds.put(R.id.confirmpasswordIcon, 17);
        sViewsWithIds.put(R.id.RPAccept, 18);
        sViewsWithIds.put(R.id.terms_condition, 19);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityResetPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityResetPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[18]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.LinearLayout) bindings[12]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        setContainedBinding(this.progressbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
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
        progressbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgressbar((com.auro.application.databinding.FullScreenProgressBarBinding) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(progressbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): progressbar
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}