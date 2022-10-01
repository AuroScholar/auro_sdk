package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FullScreenProgressClassBindingImpl extends FullScreenProgressClassBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.parent_layout_one, 1);
        sViewsWithIds.put(R.id.txt_myclassroom, 2);
        sViewsWithIds.put(R.id.constantLayout, 3);
        sViewsWithIds.put(R.id.imageView5, 4);
        sViewsWithIds.put(R.id.auro_scholar_logo, 5);
        sViewsWithIds.put(R.id.cardView2, 6);
        sViewsWithIds.put(R.id.imageView6, 7);
        sViewsWithIds.put(R.id.language_layout, 8);
        sViewsWithIds.put(R.id.imageViewNotification, 9);
        sViewsWithIds.put(R.id.imageViewLanguage, 10);
        sViewsWithIds.put(R.id.imageViewLanguageMenu, 11);
        sViewsWithIds.put(R.id.mainHeadtop, 12);
        sViewsWithIds.put(R.id.RPTextView11, 13);
        sViewsWithIds.put(R.id.RPDetailInformation, 14);
        sViewsWithIds.put(R.id.swipeCons, 15);
        sViewsWithIds.put(R.id.llstudent, 16);
        sViewsWithIds.put(R.id.rvItemPic, 17);
        sViewsWithIds.put(R.id.bt_add_group, 18);
        sViewsWithIds.put(R.id.rpChoose_Student, 19);
        sViewsWithIds.put(R.id.rv_choose_student, 20);
        sViewsWithIds.put(R.id.student_list_message, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FullScreenProgressClassBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FullScreenProgressClassBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[18]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[19]
            , (android.widget.LinearLayout) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[21]
            , (android.widget.LinearLayout) bindings[15]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[2]
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