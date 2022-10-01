package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class CameraFragmentLayoutBindingImpl extends CameraFragmentLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.preview, 1);
        sViewsWithIds.put(R.id.faceOverlay, 2);
        sViewsWithIds.put(R.id.textCamra, 3);
        sViewsWithIds.put(R.id.capture_button_secondary_container, 4);
        sViewsWithIds.put(R.id.capture_button, 5);
        sViewsWithIds.put(R.id.stillshot, 6);
        sViewsWithIds.put(R.id.loading_spinner, 7);
        sViewsWithIds.put(R.id.flash_container, 8);
        sViewsWithIds.put(R.id.flash_toggle, 9);
        sViewsWithIds.put(R.id.switch_orientation_container, 10);
        sViewsWithIds.put(R.id.switch_orientation, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CameraFragmentLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private CameraFragmentLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.auro.application.util.camera.CameraOverlay) bindings[2]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.ProgressBar) bindings[7]
            , (com.auro.application.util.camera.CameraSurfacePreview) bindings[1]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}