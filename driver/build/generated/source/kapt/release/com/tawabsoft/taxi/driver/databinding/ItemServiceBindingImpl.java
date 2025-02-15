package com.tawabsoft.taxi.driver.databinding;
import com.tawabsoft.taxi.driver.R;
import com.tawabsoft.taxi.driver.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemServiceBindingImpl extends ItemServiceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checkbox, 5);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemServiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemServiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.title.setTag(null);
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
        if (BR.service == variableId) {
            setService((com.tawabsoft.taxi.common.models.Service) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setService(@Nullable com.tawabsoft.taxi.common.models.Service Service) {
        this.mService = Service;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.service);
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
        java.lang.String stringValueOfServiceBaseFare = null;
        double servicePerHundredMeters = 0.0;
        java.lang.String serviceTitle = null;
        double serviceBaseFare = 0.0;
        java.lang.String stringValueOfServicePerHundredMeters = null;
        com.tawabsoft.taxi.common.models.Media serviceMedia = null;
        com.tawabsoft.taxi.common.models.Service service = mService;

        if ((dirtyFlags & 0x3L) != 0) {



                if (service != null) {
                    // read service.perHundredMeters
                    servicePerHundredMeters = service.getPerHundredMeters();
                    // read service.title
                    serviceTitle = service.getTitle();
                    // read service.baseFare
                    serviceBaseFare = service.getBaseFare();
                    // read service.media
                    serviceMedia = service.getMedia();
                }


                // read String.valueOf(service.perHundredMeters)
                stringValueOfServicePerHundredMeters = java.lang.String.valueOf(servicePerHundredMeters);
                // read String.valueOf(service.baseFare)
                stringValueOfServiceBaseFare = java.lang.String.valueOf(serviceBaseFare);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.tawabsoft.taxi.common.utils.DataBinder.setMedia(this.mboundView1, serviceMedia);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, stringValueOfServiceBaseFare);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, stringValueOfServicePerHundredMeters);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, serviceTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): service
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}