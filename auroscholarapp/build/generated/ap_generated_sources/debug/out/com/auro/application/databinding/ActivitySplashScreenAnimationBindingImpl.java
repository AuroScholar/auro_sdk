package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivitySplashScreenAnimationBindingImpl extends ActivitySplashScreenAnimationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(0, 
            new String[] {"splash_header_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.splash_header_layout});
        sIncludes.setIncludes(1, 
            new String[] {"custom_snackbar_progress"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.custom_snackbar_progress});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivFirstCircle, 4);
        sViewsWithIds.put(R.id.ivSecondCircle, 5);
        sViewsWithIds.put(R.id.ivStar, 6);
        sViewsWithIds.put(R.id.ivBooks, 7);
        sViewsWithIds.put(R.id.ivChildren, 8);
        sViewsWithIds.put(R.id.tvDesinBy, 9);
        sViewsWithIds.put(R.id.auro_scholar_logo, 10);
        sViewsWithIds.put(R.id.tvquiz, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySplashScreenAnimationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivitySplashScreenAnimationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[10]
            , (com.auro.application.databinding.CustomSnackbarProgressBinding) bindings[3]
            , (com.auro.application.databinding.SplashHeaderLayoutBinding) bindings[2]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.RelativeLayout) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.progressLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        headerTopParent.invalidateAll();
        customProgressLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (headerTopParent.hasPendingBindings()) {
            return true;
        }
        if (customProgressLayout.hasPendingBindings()) {
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
        headerTopParent.setLifecycleOwner(lifecycleOwner);
        customProgressLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHeaderTopParent((com.auro.application.databinding.SplashHeaderLayoutBinding) object, fieldId);
            case 1 :
                return onChangeCustomProgressLayout((com.auro.application.databinding.CustomSnackbarProgressBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHeaderTopParent(com.auro.application.databinding.SplashHeaderLayoutBinding HeaderTopParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCustomProgressLayout(com.auro.application.databinding.CustomSnackbarProgressBinding CustomProgressLayout, int fieldId) {
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
        executeBindingsOn(headerTopParent);
        executeBindingsOn(customProgressLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): headerTopParent
        flag 1 (0x2L): customProgressLayout
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}