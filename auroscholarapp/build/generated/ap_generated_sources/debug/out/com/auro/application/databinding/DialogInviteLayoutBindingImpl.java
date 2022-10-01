package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class DialogInviteLayoutBindingImpl extends DialogInviteLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_layout, 1);
        sViewsWithIds.put(R.id.image, 2);
        sViewsWithIds.put(R.id.icClose, 3);
        sViewsWithIds.put(R.id.txtInviteBy, 4);
        sViewsWithIds.put(R.id.constraintLayout, 5);
        sViewsWithIds.put(R.id.edit_contact, 6);
        sViewsWithIds.put(R.id.icContact, 7);
        sViewsWithIds.put(R.id.btninvite, 8);
        sViewsWithIds.put(R.id.layout_hint, 9);
        sViewsWithIds.put(R.id.txtor, 10);
        sViewsWithIds.put(R.id.txtShareWithOther, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogInviteLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DialogInviteLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[8]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            );
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.InviteFriendViewModel == variableId) {
            setInviteFriendViewModel((com.auro.application.home.presentation.viewmodel.InviteFriendViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInviteFriendViewModel(@Nullable com.auro.application.home.presentation.viewmodel.InviteFriendViewModel InviteFriendViewModel) {
        this.mInviteFriendViewModel = InviteFriendViewModel;
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
        flag 0 (0x1L): InviteFriendViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}