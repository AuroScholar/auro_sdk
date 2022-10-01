package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class DemographicFragmentLayoutBindingImpl extends DemographicFragmentLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_header_layout"},
            new int[] {1},
            new int[] {com.auro.application.R.layout.toolbar_header_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.demograph_head, 2);
        sViewsWithIds.put(R.id.tvGender, 3);
        sViewsWithIds.put(R.id.SpinnerGender, 4);
        sViewsWithIds.put(R.id.tvSchoolType, 5);
        sViewsWithIds.put(R.id.SpinnerSchoolType, 6);
        sViewsWithIds.put(R.id.tvBoard, 7);
        sViewsWithIds.put(R.id.SpinnerBoard, 8);
        sViewsWithIds.put(R.id.tvLanguageMedium, 9);
        sViewsWithIds.put(R.id.SpinnerLanguageMedium, 10);
        sViewsWithIds.put(R.id.tvPrivateTution, 11);
        sViewsWithIds.put(R.id.spinnerPrivateTution, 12);
        sViewsWithIds.put(R.id.tvPrivateType, 13);
        sViewsWithIds.put(R.id.spinnerPrivateType, 14);
        sViewsWithIds.put(R.id.privateTypeArrow, 15);
        sViewsWithIds.put(R.id.submitbutton, 16);
        sViewsWithIds.put(R.id.progressBar, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DemographicFragmentLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private DemographicFragmentLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[8]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[4]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[10]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[2]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ProgressBar) bindings[17]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[12]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[14]
            , (android.widget.Button) bindings[16]
            , (com.auro.application.databinding.ToolbarHeaderLayoutBinding) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[3]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        toolbarLayout.invalidateAll();
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbarLayout((com.auro.application.databinding.ToolbarHeaderLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolbarLayout(com.auro.application.databinding.ToolbarHeaderLayoutBinding ToolbarLayout, int fieldId) {
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
        executeBindingsOn(toolbarLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbarLayout
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}