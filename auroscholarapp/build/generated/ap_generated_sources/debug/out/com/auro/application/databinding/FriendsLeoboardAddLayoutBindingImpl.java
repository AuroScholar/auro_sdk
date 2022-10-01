package com.auro.application.databinding;
import com.auro.application.R;
import com.auro.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FriendsLeoboardAddLayoutBindingImpl extends FriendsLeoboardAddLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_search_result_mapfragment, 1);
        sViewsWithIds.put(R.id.parent_layout, 2);
        sViewsWithIds.put(R.id.profile_image, 3);
        sViewsWithIds.put(R.id.layout, 4);
        sViewsWithIds.put(R.id.name_text, 5);
        sViewsWithIds.put(R.id.score_text, 6);
        sViewsWithIds.put(R.id.distance, 7);
        sViewsWithIds.put(R.id.invite_button, 8);
        sViewsWithIds.put(R.id.progressBar, 9);
        sViewsWithIds.put(R.id.sent_layout, 10);
        sViewsWithIds.put(R.id.sent_txt, 11);
        sViewsWithIds.put(R.id.invite_button_layout, 12);
        sViewsWithIds.put(R.id.invite_text, 13);
        sViewsWithIds.put(R.id.viewLine, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FriendsLeoboardAddLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FriendsLeoboardAddLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[1]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[7]
            , (android.widget.RelativeLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[13]
            , (android.widget.LinearLayout) bindings[4]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ProgressBar) bindings[9]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            , (com.auro.application.core.util.uiwidget.RPTextView) bindings[11]
            , (android.view.View) bindings[14]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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
        if (BR.quizViewModel == variableId) {
            setQuizViewModel((com.auro.application.home.presentation.viewmodel.QuizViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuizViewModel(@Nullable com.auro.application.home.presentation.viewmodel.QuizViewModel QuizViewModel) {
        this.mQuizViewModel = QuizViewModel;
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
        flag 0 (0x1L): quizViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}