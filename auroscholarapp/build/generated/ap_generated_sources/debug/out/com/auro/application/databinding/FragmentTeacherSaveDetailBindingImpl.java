package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentTeacherSaveDetailBindingImpl extends FragmentTeacherSaveDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_header_layout", "quiz_header_layout"},
            new int[] {1, 2},
            new int[] {com.auro.application.R.layout.toolbar_header_layout,
                com.auro.application.R.layout.quiz_header_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.RPTextView, 3);
        sViewsWithIds.put(R.id.linearLayout, 4);
        sViewsWithIds.put(R.id.linearLayout2, 5);
        sViewsWithIds.put(R.id.tilteachertxt, 6);
        sViewsWithIds.put(R.id.icteachername, 7);
        sViewsWithIds.put(R.id.tiledittext, 8);
        sViewsWithIds.put(R.id.icemail, 9);
        sViewsWithIds.put(R.id.tilmobiletxt, 10);
        sViewsWithIds.put(R.id.icmobilenumber, 11);
        sViewsWithIds.put(R.id.button, 12);
        sViewsWithIds.put(R.id.RPTextView3, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTeacherSaveDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentTeacherSaveDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[3]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[2]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.auro.application.databinding.ToolbarHeaderLayoutBinding) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        toolbarLayout.invalidateAll();
        headerParent.invalidateAll();
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
        if (headerParent.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.teacherSaveDetailViewModel == variableId) {
            setTeacherSaveDetailViewModel((com.auro.application.teacher.presentation.viewmodel.TeacherSaveDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTeacherSaveDetailViewModel(@Nullable com.auro.application.teacher.presentation.viewmodel.TeacherSaveDetailViewModel TeacherSaveDetailViewModel) {
        this.mTeacherSaveDetailViewModel = TeacherSaveDetailViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbarLayout.setLifecycleOwner(lifecycleOwner);
        headerParent.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHeaderParent((com.auro.application.databinding.QuizHeaderLayoutBinding) object, fieldId);
            case 1 :
                return onChangeToolbarLayout((com.auro.application.databinding.ToolbarHeaderLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHeaderParent(com.auro.application.databinding.QuizHeaderLayoutBinding HeaderParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolbarLayout(com.auro.application.databinding.ToolbarHeaderLayoutBinding ToolbarLayout, int fieldId) {
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
        executeBindingsOn(toolbarLayout);
        executeBindingsOn(headerParent);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): headerParent
        flag 1 (0x2L): toolbarLayout
        flag 2 (0x3L): teacherSaveDetailViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}