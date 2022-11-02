package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentTeacherProfileBindingImpl extends FragmentTeacherProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(43);
        sIncludes.setIncludes(1, 
            new String[] {"quiz_header_layout"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.quiz_header_layout});
        sIncludes.setIncludes(2, 
            new String[] {"error_layout"},
            new int[] {5},
            new int[] {com.auro.application.R.layout.error_layout});
        sIncludes.setIncludes(3, 
            new String[] {"shimmer_my_classroom_layout"},
            new int[] {6},
            new int[] {com.auro.application.R.layout.shimmer_my_classroom_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 7);
        sViewsWithIds.put(R.id.main_parent_layout, 8);
        sViewsWithIds.put(R.id.linearLayout3, 9);
        sViewsWithIds.put(R.id.points, 10);
        sViewsWithIds.put(R.id.wallet_bal, 11);
        sViewsWithIds.put(R.id.logoutButton, 12);
        sViewsWithIds.put(R.id.RPTextView2, 13);
        sViewsWithIds.put(R.id.parent_layout_two, 14);
        sViewsWithIds.put(R.id.linearLayout2, 15);
        sViewsWithIds.put(R.id.tilteachertxt, 16);
        sViewsWithIds.put(R.id.editteachername, 17);
        sViewsWithIds.put(R.id.icteachername, 18);
        sViewsWithIds.put(R.id.inputemailedittext, 19);
        sViewsWithIds.put(R.id.editemail, 20);
        sViewsWithIds.put(R.id.icemail, 21);
        sViewsWithIds.put(R.id.tilmobiletxt, 22);
        sViewsWithIds.put(R.id.editPhoneNumber, 23);
        sViewsWithIds.put(R.id.icmobilenumber, 24);
        sViewsWithIds.put(R.id.txtClasses, 25);
        sViewsWithIds.put(R.id.recycleViewclass, 26);
        sViewsWithIds.put(R.id.view, 27);
        sViewsWithIds.put(R.id.txtSubject, 28);
        sViewsWithIds.put(R.id.recycleViewsubject, 29);
        sViewsWithIds.put(R.id.view1, 30);
        sViewsWithIds.put(R.id.llschool, 31);
        sViewsWithIds.put(R.id.schooltxt, 32);
        sViewsWithIds.put(R.id.editSchoolName, 33);
        sViewsWithIds.put(R.id.icschoolname, 34);
        sViewsWithIds.put(R.id.llstate, 35);
        sViewsWithIds.put(R.id.state_title, 36);
        sViewsWithIds.put(R.id.state_spinner, 37);
        sViewsWithIds.put(R.id.city_title, 38);
        sViewsWithIds.put(R.id.city_spinner, 39);
        sViewsWithIds.put(R.id.cityView, 40);
        sViewsWithIds.put(R.id.button, 41);
        sViewsWithIds.put(R.id.progressBar, 42);
    }
    // views
    @Nullable
    private final com.auro.application.databinding.ShimmerMyClassroomLayoutBinding mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTeacherProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private FragmentTeacherProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (android.widget.ImageView) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[41]
            , (android.widget.Spinner) bindings[39]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[38]
            , (android.view.View) bindings[40]
            , (com.google.android.material.textfield.TextInputEditText) bindings[23]
            , (com.google.android.material.textfield.TextInputEditText) bindings[33]
            , (com.google.android.material.textfield.TextInputEditText) bindings[20]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[5]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[4]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[35]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[10]
            , (android.widget.ProgressBar) bindings[42]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (androidx.recyclerview.widget.RecyclerView) bindings[29]
            , (com.google.android.material.textfield.TextInputLayout) bindings[32]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[3]
            , (android.widget.Spinner) bindings[37]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[36]
            , (com.google.android.material.textfield.TextInputLayout) bindings[22]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[25]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[28]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[30]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            );
        this.errorConstraint.setTag(null);
        setContainedBinding(this.errorLayout);
        setContainedBinding(this.headerTopParent);
        this.mboundView3 = (com.auro.application.databinding.ShimmerMyClassroomLayoutBinding) bindings[6];
        setContainedBinding(this.mboundView3);
        this.parentLayoutOne.setTag(null);
        this.shimmerMyClassroom.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        headerTopParent.invalidateAll();
        errorLayout.invalidateAll();
        mboundView3.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (headerTopParent.hasPendingBindings()) {
            return true;
        }
        if (errorLayout.hasPendingBindings()) {
            return true;
        }
        if (mboundView3.hasPendingBindings()) {
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
        headerTopParent.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
        mboundView3.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeHeaderTopParent((com.auro.application.databinding.QuizHeaderLayoutBinding) object, fieldId);
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
    private boolean onChangeHeaderTopParent(com.auro.application.databinding.QuizHeaderLayoutBinding HeaderTopParent, int fieldId) {
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
        executeBindingsOn(headerTopParent);
        executeBindingsOn(errorLayout);
        executeBindingsOn(mboundView3);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): headerTopParent
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}