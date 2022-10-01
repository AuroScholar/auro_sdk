package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class StudentUserLayoutBindingImpl extends StudentUserLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view, 1);
        sViewsWithIds.put(R.id.mainLayout, 2);
        sViewsWithIds.put(R.id.studentImage, 3);
        sViewsWithIds.put(R.id.tvStudentUserName, 4);
        sViewsWithIds.put(R.id.tvStudentName, 5);
        sViewsWithIds.put(R.id.tvStudentGrade, 6);
        sViewsWithIds.put(R.id.tvStudentWallet, 7);
        sViewsWithIds.put(R.id.imgnext, 8);
        sViewsWithIds.put(R.id.txtchangepin, 9);
        sViewsWithIds.put(R.id.card_view_button, 10);
        sViewsWithIds.put(R.id.tvAddStudent, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StudentUserLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private StudentUserLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[4]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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