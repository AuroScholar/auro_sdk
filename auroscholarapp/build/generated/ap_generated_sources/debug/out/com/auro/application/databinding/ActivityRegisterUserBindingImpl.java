package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityRegisterUserBindingImpl extends ActivityRegisterUserBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(1, 
            new String[] {"full_screen_progress_bar"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.auro_scholar_logo, 3);
        sViewsWithIds.put(R.id.left_corner_image, 4);
        sViewsWithIds.put(R.id.back_button, 5);
        sViewsWithIds.put(R.id.title_first, 6);
        sViewsWithIds.put(R.id.number_edit, 7);
        sViewsWithIds.put(R.id.dialer_recycler_view, 8);
        sViewsWithIds.put(R.id.RPButtonSendOtp, 9);
        sViewsWithIds.put(R.id.terms_conditiond, 10);
        sViewsWithIds.put(R.id.llLoginForm, 11);
        sViewsWithIds.put(R.id.headText, 12);
        sViewsWithIds.put(R.id.passwordlayout, 13);
        sViewsWithIds.put(R.id.etPassword, 14);
        sViewsWithIds.put(R.id.passwordIcon, 15);
        sViewsWithIds.put(R.id.confirmpasswordlayout, 16);
        sViewsWithIds.put(R.id.etconfirmPassword, 17);
        sViewsWithIds.put(R.id.confirmpasswordIcon, 18);
        sViewsWithIds.put(R.id.RPAccept, 19);
        sViewsWithIds.put(R.id.terms_condition, 20);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.EditText) bindings[7]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[13]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[20]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[6]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
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