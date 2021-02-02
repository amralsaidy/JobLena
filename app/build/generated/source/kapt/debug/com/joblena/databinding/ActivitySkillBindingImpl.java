package com.joblena.databinding;
import com.joblena.R;
import com.joblena.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivitySkillBindingImpl extends ActivitySkillBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.process_btn, 1);
        sViewsWithIds.put(R.id.viewpager, 2);
        sViewsWithIds.put(R.id.techincal_btn, 3);
        sViewsWithIds.put(R.id.softskills_btn, 4);
        sViewsWithIds.put(R.id.language_btn, 5);
        sViewsWithIds.put(R.id.preferences_btn, 6);
        sViewsWithIds.put(R.id.layout_buttons, 7);
        sViewsWithIds.put(R.id.next_btn, 8);
        sViewsWithIds.put(R.id.publish_btn, 9);
        sViewsWithIds.put(R.id.previous_btn, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySkillBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivitySkillBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (com.joblena.app.common.NoSwipeViewPager) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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