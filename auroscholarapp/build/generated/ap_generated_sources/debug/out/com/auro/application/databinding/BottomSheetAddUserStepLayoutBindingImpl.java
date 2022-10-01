package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class BottomSheetAddUserStepLayoutBindingImpl extends BottomSheetAddUserStepLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"fragment_student_profile_2"},
            new int[] {2},
            new int[] {com.auro.application.R.layout.fragment_student_profile_2});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.View, 3);
        sViewsWithIds.put(R.id.layout_steps, 4);
        sViewsWithIds.put(R.id.tvStudentUserName, 5);
        sViewsWithIds.put(R.id.tvStudentGrade, 6);
        sViewsWithIds.put(R.id.studentList, 7);
        sViewsWithIds.put(R.id.cardView2, 8);
        sViewsWithIds.put(R.id.mainLayout, 9);
        sViewsWithIds.put(R.id.tvStep, 10);
        sViewsWithIds.put(R.id.tvStepDesc, 11);
        sViewsWithIds.put(R.id.img_icon, 12);
        sViewsWithIds.put(R.id.cardView3, 13);
        sViewsWithIds.put(R.id.mainLayout2, 14);
        sViewsWithIds.put(R.id.tvStep2, 15);
        sViewsWithIds.put(R.id.tvStepDesc2, 16);
        sViewsWithIds.put(R.id.img_icon2, 17);
    }
    // views
    @Nullable
    private final com.auro.application.databinding.FragmentStudentProfile2Binding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomSheetAddUserStepLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private BottomSheetAddUserStepLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[6]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            );
        this.container.setTag(null);
        this.mboundView1 = (com.auro.application.databinding.FragmentStudentProfile2Binding) bindings[2];
        setContainedBinding(this.mboundView1);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        mboundView1.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
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
        mboundView1.setLifecycleOwner(lifecycleOwner);
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
        executeBindingsOn(mboundView1);
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