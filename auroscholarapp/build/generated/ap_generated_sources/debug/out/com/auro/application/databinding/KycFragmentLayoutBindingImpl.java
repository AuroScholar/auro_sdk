package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class KycFragmentLayoutBindingImpl extends KycFragmentLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(26);
        sIncludes.setIncludes(1, 
            new String[] {"toolbar_header_layout"},
            new int[] {5},
            new int[] {com.auro.application.R.layout.toolbar_header_layout});
        sIncludes.setIncludes(2, 
            new String[] {"quiz_header_layout"},
            new int[] {6},
            new int[] {com.auro.application.R.layout.quiz_header_layout});
        sIncludes.setIncludes(3, 
            new String[] {"upload_document_step_one", "upload_document_step_two", "quiz_verify_step_four", "upload_document_step_three"},
            new int[] {7, 8, 9, 10},
            new int[] {com.auro.application.R.layout.upload_document_step_one,
                com.auro.application.R.layout.upload_document_step_two,
                com.auro.application.R.layout.quiz_verify_step_four,
                com.auro.application.R.layout.upload_document_step_three});
        sIncludes.setIncludes(4, 
            new String[] {"error_layout"},
            new int[] {11},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nestedScrollView, 12);
        sViewsWithIds.put(R.id.get_scholarship_text, 13);
        sViewsWithIds.put(R.id.warn_msg, 14);
        sViewsWithIds.put(R.id.wallet_bal_text, 15);
        sViewsWithIds.put(R.id.wallet_info, 16);
        sViewsWithIds.put(R.id.view_line, 17);
        sViewsWithIds.put(R.id.document_upload_recyclerview, 18);
        sViewsWithIds.put(R.id.buttonUploadLayout, 19);
        sViewsWithIds.put(R.id.bt_upload_all, 20);
        sViewsWithIds.put(R.id.progressBar, 21);
        sViewsWithIds.put(R.id.bt_modify_all, 22);
        sViewsWithIds.put(R.id.resultImage, 23);
        sViewsWithIds.put(R.id.transparet, 24);
        sViewsWithIds.put(R.id.progressBar_2, 25);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public KycFragmentLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private KycFragmentLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[22]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[11]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (android.widget.ProgressBar) bindings[21]
            , (android.widget.ProgressBar) bindings[25]
            , (android.widget.ImageView) bindings[23]
            , (com.auro.application.databinding.UploadDocumentStepThreeBinding) bindings[10]
            , (com.auro.application.databinding.UploadDocumentStepOneBinding) bindings[7]
            , (com.auro.application.databinding.QuizVerifyStepFourBinding) bindings[9]
            , (com.auro.application.databinding.UploadDocumentStepTwoBinding) bindings[8]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (com.auro.application.databinding.ToolbarHeaderLayoutBinding) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (android.view.View) bindings[17]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[14]
            );
        this.errorConstraint.setTag(null);
        this.kycbackground.setTag(null);
        this.mainParentLayout.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        toolbarLayout.invalidateAll();
        cambridgeHeading.invalidateAll();
        stepOne.invalidateAll();
        stepTwo.invalidateAll();
        stepThree.invalidateAll();
        stepFour.invalidateAll();
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
        if (toolbarLayout.hasPendingBindings()) {
            return true;
        }
        if (cambridgeHeading.hasPendingBindings()) {
            return true;
        }
        if (stepOne.hasPendingBindings()) {
            return true;
        }
        if (stepTwo.hasPendingBindings()) {
            return true;
        }
        if (stepThree.hasPendingBindings()) {
            return true;
        }
        if (stepFour.hasPendingBindings()) {
            return true;
        }
        if (errorLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.kycViewModel == variableId) {
            setKycViewModel((com.auro.application.home.presentation.viewmodel.KYCViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKycViewModel(@Nullable com.auro.application.home.presentation.viewmodel.KYCViewModel KycViewModel) {
        this.mKycViewModel = KycViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbarLayout.setLifecycleOwner(lifecycleOwner);
        cambridgeHeading.setLifecycleOwner(lifecycleOwner);
        stepOne.setLifecycleOwner(lifecycleOwner);
        stepTwo.setLifecycleOwner(lifecycleOwner);
        stepThree.setLifecycleOwner(lifecycleOwner);
        stepFour.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeStepTwo((com.auro.application.databinding.UploadDocumentStepTwoBinding) object, fieldId);
            case 1 :
                return onChangeErrorLayout((com.auro.application.databinding.ErrorLayoutBinding) object, fieldId);
            case 2 :
                return onChangeToolbarLayout((com.auro.application.databinding.ToolbarHeaderLayoutBinding) object, fieldId);
            case 3 :
                return onChangeStepOne((com.auro.application.databinding.UploadDocumentStepOneBinding) object, fieldId);
            case 4 :
                return onChangeCambridgeHeading((com.auro.application.databinding.QuizHeaderLayoutBinding) object, fieldId);
            case 5 :
                return onChangeStepThree((com.auro.application.databinding.QuizVerifyStepFourBinding) object, fieldId);
            case 6 :
                return onChangeStepFour((com.auro.application.databinding.UploadDocumentStepThreeBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeStepTwo(com.auro.application.databinding.UploadDocumentStepTwoBinding StepTwo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeErrorLayout(com.auro.application.databinding.ErrorLayoutBinding ErrorLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolbarLayout(com.auro.application.databinding.ToolbarHeaderLayoutBinding ToolbarLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStepOne(com.auro.application.databinding.UploadDocumentStepOneBinding StepOne, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCambridgeHeading(com.auro.application.databinding.QuizHeaderLayoutBinding CambridgeHeading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStepThree(com.auro.application.databinding.QuizVerifyStepFourBinding StepThree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStepFour(com.auro.application.databinding.UploadDocumentStepThreeBinding StepFour, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        executeBindingsOn(cambridgeHeading);
        executeBindingsOn(stepOne);
        executeBindingsOn(stepTwo);
        executeBindingsOn(stepThree);
        executeBindingsOn(stepFour);
        executeBindingsOn(errorLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): stepTwo
        flag 1 (0x2L): errorLayout
        flag 2 (0x3L): toolbarLayout
        flag 3 (0x4L): stepOne
        flag 4 (0x5L): cambridgeHeading
        flag 5 (0x6L): stepThree
        flag 6 (0x7L): stepFour
        flag 7 (0x8L): kycViewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}