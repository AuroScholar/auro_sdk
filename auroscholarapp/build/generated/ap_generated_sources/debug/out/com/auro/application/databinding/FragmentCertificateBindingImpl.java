package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentCertificateBindingImpl extends FragmentCertificateBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(22);
        sIncludes.setIncludes(1, 
            new String[] {"error_layout"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.certificate, 3);
        sViewsWithIds.put(R.id.constantLayout, 4);
        sViewsWithIds.put(R.id.imageView5, 5);
        sViewsWithIds.put(R.id.auro_scholar_logo, 6);
        sViewsWithIds.put(R.id.cardView2, 7);
        sViewsWithIds.put(R.id.imageView6, 8);
        sViewsWithIds.put(R.id.language_layout, 9);
        sViewsWithIds.put(R.id.imageViewNotification, 10);
        sViewsWithIds.put(R.id.imageViewLanguage, 11);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 12);
        sViewsWithIds.put(R.id.head_layout, 13);
        sViewsWithIds.put(R.id.tooltip_layout, 14);
        sViewsWithIds.put(R.id.get_scholarship_text, 15);
        sViewsWithIds.put(R.id.score_text, 16);
        sViewsWithIds.put(R.id.download_icon, 17);
        sViewsWithIds.put(R.id.certificate_recyclerView, 18);
        sViewsWithIds.put(R.id.transparet, 19);
        sViewsWithIds.put(R.id.progressBar_2, 20);
        sViewsWithIds.put(R.id.progressBar, 21);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCertificateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentCertificateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.LinearLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[2]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ProgressBar) bindings[21]
            , (android.widget.ProgressBar) bindings[20]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            );
        this.errorConstraint.setTag(null);
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
        errorLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (errorLayout.hasPendingBindings()) {
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
        errorLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeErrorLayout(com.auro.application.databinding.ErrorLayoutBinding ErrorLayout, int fieldId) {
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
        executeBindingsOn(errorLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}