package com.tacme.news.databinding;
import com.tacme.news.R;
import com.tacme.news.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMvvmNewsListBindingImpl extends FragmentMvvmNewsListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRefreshLayout, 2);
        sViewsWithIds.put(R.id.recyclerView, 3);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMvvmNewsListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentMvvmNewsListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[2]
            );
        this.listContainerLinearLayout.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.mvvmNews == variableId) {
            setMvvmNews((com.tacme.news.viewmodels.mvvm.NewsMVVMListViewModel) variable);
        }
        else if (BR.isEmpty == variableId) {
            setIsEmpty((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMvvmNews(@Nullable com.tacme.news.viewmodels.mvvm.NewsMVVMListViewModel MvvmNews) {
        this.mMvvmNews = MvvmNews;
    }
    public void setIsEmpty(boolean IsEmpty) {
        this.mIsEmpty = IsEmpty;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isEmpty);
        super.requestRebind();
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
        boolean isEmpty = mIsEmpty;
        int isEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = 0;

        if ((dirtyFlags & 0x6L) != 0) {

            if((dirtyFlags & 0x6L) != 0) {
                if(isEmpty) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read isEmpty ? android.view.View.GONE : android.view.View.VISIBLE
                isEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = ((isEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.listContainerLinearLayout.setVisibility(isEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mvvmNews
        flag 1 (0x2L): isEmpty
        flag 2 (0x3L): null
        flag 3 (0x4L): isEmpty ? android.view.View.GONE : android.view.View.VISIBLE
        flag 4 (0x5L): isEmpty ? android.view.View.GONE : android.view.View.VISIBLE
    flag mapping end*/
    //end
}