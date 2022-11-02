package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityAppLanguageBindingImpl extends ActivityAppLanguageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(1, 
            new String[] {"user_type_select_bottom_sheet"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.user_type_select_bottom_sheet});
        sIncludes.setIncludes(2, 
            new String[] {"custom_snackbar_progress"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.custom_snackbar_progress});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topLayout, 5);
        sViewsWithIds.put(R.id.imageView5, 6);
        sViewsWithIds.put(R.id.auro_scholar_logo, 7);
        sViewsWithIds.put(R.id.imageView6, 8);
        sViewsWithIds.put(R.id.backButton, 9);
        sViewsWithIds.put(R.id.linearLayout9, 10);
        sViewsWithIds.put(R.id.RPTextView9, 11);
        sViewsWithIds.put(R.id.subHeadingText, 12);
        sViewsWithIds.put(R.id.recyclerViewlang, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAppLanguageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityAppLanguageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (com.auro.application.databinding.CustomSnackbarProgressBinding) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.auro.application.databinding.UserTypeSelectBottomSheetBinding) bindings[3]
            );
        setContainedBinding(this.customProgressLayout);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.progressLayout.setTag(null);
        setContainedBinding(this.userSelectionSheet);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        userSelectionSheet.invalidateAll();
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
        if (userSelectionSheet.hasPendingBindings()) {
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
        if (BR.viewModel == variableId) {
            setViewModel((com.auro.application.home.presentation.viewmodel.AppLanguageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.auro.application.home.presentation.viewmodel.AppLanguageViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        userSelectionSheet.setLifecycleOwner(lifecycleOwner);
        customProgressLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserSelectionSheet((com.auro.application.databinding.UserTypeSelectBottomSheetBinding) object, fieldId);
            case 1 :
                return onChangeCustomProgressLayout((com.auro.application.databinding.CustomSnackbarProgressBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserSelectionSheet(com.auro.application.databinding.UserTypeSelectBottomSheetBinding UserSelectionSheet, int fieldId) {
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
        executeBindingsOn(userSelectionSheet);
        executeBindingsOn(customProgressLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userSelectionSheet
        flag 1 (0x2L): customProgressLayout
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}