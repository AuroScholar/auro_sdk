package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class QuizTestNativeLayoutBindingImpl extends QuizTestNativeLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(31);
        sIncludes.setIncludes(1, 
            new String[] {"quiz_header_layout"},
            new int[] {3},
            new int[] {com.auro.application.R.layout.quiz_header_layout});
        sIncludes.setIncludes(2, 
            new String[] {"error_layout"},
            new int[] {4},
            new int[] {com.auro.application.R.layout.error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 5);
        sViewsWithIds.put(R.id.main_content_layout, 6);
        sViewsWithIds.put(R.id.timerProgressbar, 7);
        sViewsWithIds.put(R.id.preview_timer, 8);
        sViewsWithIds.put(R.id.previewView, 9);
        sViewsWithIds.put(R.id.face_texture_view, 10);
        sViewsWithIds.put(R.id.face_image_view, 11);
        sViewsWithIds.put(R.id.timer_layout, 12);
        sViewsWithIds.put(R.id.timer_text, 13);
        sViewsWithIds.put(R.id.parent_scrollview, 14);
        sViewsWithIds.put(R.id.subject_title, 15);
        sViewsWithIds.put(R.id.llquestion, 16);
        sViewsWithIds.put(R.id.ques_text, 17);
        sViewsWithIds.put(R.id.ques_img, 18);
        sViewsWithIds.put(R.id.rvselect_quizOption, 19);
        sViewsWithIds.put(R.id.ans_radiogroup, 20);
        sViewsWithIds.put(R.id.ans_one, 21);
        sViewsWithIds.put(R.id.ans_two, 22);
        sViewsWithIds.put(R.id.ans_three, 23);
        sViewsWithIds.put(R.id.ans_four, 24);
        sViewsWithIds.put(R.id.card_view, 25);
        sViewsWithIds.put(R.id.exit_bt, 26);
        sViewsWithIds.put(R.id.finish_next_bt, 27);
        sViewsWithIds.put(R.id.save_next_bt, 28);
        sViewsWithIds.put(R.id.progressBar, 29);
        sViewsWithIds.put(R.id.Privew, 30);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public QuizTestNativeLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private QuizTestNativeLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[30]
            , (android.widget.RadioButton) bindings[24]
            , (android.widget.RadioButton) bindings[21]
            , (android.widget.RadioGroup) bindings[20]
            , (android.widget.RadioButton) bindings[23]
            , (android.widget.RadioButton) bindings[22]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (com.auro.application.databinding.ErrorLayoutBinding) bindings[4]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[26]
            , (android.widget.ImageView) bindings[11]
            , (android.view.TextureView) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[27]
            , (com.auro.application.databinding.QuizHeaderLayoutBinding) bindings[3]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[29]
            , (android.widget.ImageView) bindings[18]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[28]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[15]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.ProgressBar) bindings[7]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            );
        this.errorConstraint.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        headerTopParent.invalidateAll();
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
        if (headerTopParent.hasPendingBindings()) {
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
        if (BR.QuizTestNativeViewModel == variableId) {
            setQuizTestNativeViewModel((com.auro.application.quiz.presentation.viewmodel.QuizTestNativeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizTestNativeViewModel(@Nullable com.auro.application.quiz.presentation.viewmodel.QuizTestNativeViewModel QuizTestNativeViewModel) {
        this.mQuizTestNativeViewModel = QuizTestNativeViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        headerTopParent.setLifecycleOwner(lifecycleOwner);
        errorLayout.setLifecycleOwner(lifecycleOwner);
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): errorLayout
        flag 1 (0x2L): headerTopParent
        flag 2 (0x3L): QuizTestNativeViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}