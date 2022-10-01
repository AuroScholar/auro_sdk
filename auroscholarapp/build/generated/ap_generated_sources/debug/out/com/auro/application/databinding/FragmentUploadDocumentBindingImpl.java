package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentUploadDocumentBindingImpl extends FragmentUploadDocumentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.upload_parent_layout, 1);
        sViewsWithIds.put(R.id.profileImage, 2);
        sViewsWithIds.put(R.id.document_title, 3);
        sViewsWithIds.put(R.id.txtsupport, 4);
        sViewsWithIds.put(R.id.selectDocumentLayout, 5);
        sViewsWithIds.put(R.id.relativeLayout3, 6);
        sViewsWithIds.put(R.id.imageType, 7);
        sViewsWithIds.put(R.id.txttype, 8);
        sViewsWithIds.put(R.id.choose_file, 9);
        sViewsWithIds.put(R.id.upload_icon, 10);
        sViewsWithIds.put(R.id.uploadingLayout, 11);
        sViewsWithIds.put(R.id.relativeLayoutNew, 12);
        sViewsWithIds.put(R.id.imageTypeBlue, 13);
        sViewsWithIds.put(R.id.RPTextView17New, 14);
        sViewsWithIds.put(R.id.file_name_txt, 15);
        sViewsWithIds.put(R.id.txt_progress, 16);
        sViewsWithIds.put(R.id.pbProcessing, 17);
        sViewsWithIds.put(R.id.imageView, 18);
        sViewsWithIds.put(R.id.closeButton, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUploadDocumentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentUploadDocumentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[9]
            , (android.widget.ImageView) bindings[19]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[3]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[17]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[4]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[8]
            , (android.widget.ImageView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.widget.LinearLayout) bindings[11]
            );
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