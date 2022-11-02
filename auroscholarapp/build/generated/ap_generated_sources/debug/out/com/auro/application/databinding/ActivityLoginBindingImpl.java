package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(24);
        sIncludes.setIncludes(1, 
            new String[] {"full_screen_progress_bar"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.full_screen_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.coordinatorLayout, 3);
        sViewsWithIds.put(R.id.auro_scholar_logo, 4);
        sViewsWithIds.put(R.id.left_corner_image, 5);
        sViewsWithIds.put(R.id.back_button, 6);
        sViewsWithIds.put(R.id.title_first, 7);
        sViewsWithIds.put(R.id.llLoginForm, 8);
        sViewsWithIds.put(R.id.layout_heading_one, 9);
        sViewsWithIds.put(R.id.heading_two, 10);
        sViewsWithIds.put(R.id.mobileLayout, 11);
        sViewsWithIds.put(R.id.etMobileNumber, 12);
        sViewsWithIds.put(R.id.passwordlayout, 13);
        sViewsWithIds.put(R.id.etPassword, 14);
        sViewsWithIds.put(R.id.passwordIcon, 15);
        sViewsWithIds.put(R.id.pinlayout, 16);
        sViewsWithIds.put(R.id.etPin, 17);
        sViewsWithIds.put(R.id.pinIcon, 18);
        sViewsWithIds.put(R.id.RPAccept, 19);
        sViewsWithIds.put(R.id.forgotPassword, 20);
        sViewsWithIds.put(R.id.loginWithOtp, 21);
        sViewsWithIds.put(R.id.setpassword, 22);
        sViewsWithIds.put(R.id.terms_condition, 23);
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

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[3]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[12]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPEditText) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[20]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[8]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[21]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[16]
            , (com.auro.application.databinding.FullScreenProgressBarBinding) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[23]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[7]
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