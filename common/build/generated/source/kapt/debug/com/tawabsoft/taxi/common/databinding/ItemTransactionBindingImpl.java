package com.tawabsoft.taxi.common.databinding;
import com.tawabsoft.taxi.common.R;
import com.tawabsoft.taxi.common.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTransactionBindingImpl extends ItemTransactionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraint_header, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTransactionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemTransactionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.cardTransaction.setTag(null);
        this.textAmount.setTag(null);
        this.textTime.setTag(null);
        this.textTitle.setTag(null);
        this.titleDay.setTag(null);
        this.titleMonth.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.tawabsoft.taxi.common.models.Transaction) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.tawabsoft.taxi.common.models.Transaction Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
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
        int itemAmountInt0TextAmountAndroidColorAccentGreenTextAmountAndroidColorAccentOrange = 0;
        com.tawabsoft.taxi.common.models.Transaction item = mItem;
        java.lang.String itemTransactionType = null;
        java.lang.String itemMonth = null;
        boolean itemAmountInt0 = false;
        java.lang.String itemDocumentNumber = null;
        java.lang.String itemDay = null;
        java.lang.String textTimeAndroidStringTransactionNumberItemDocumentNumber = null;
        double itemAmount = 0.0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.transactionType
                    itemTransactionType = item.getTransactionType();
                    // read item.month
                    itemMonth = item.getMonth();
                    // read item.documentNumber
                    itemDocumentNumber = item.getDocumentNumber();
                    // read item.day
                    itemDay = item.getDay();
                    // read item.amount
                    itemAmount = item.getAmount();
                }


                // read @android:string/transaction_number
                textTimeAndroidStringTransactionNumberItemDocumentNumber = textTime.getResources().getString(R.string.transaction_number, itemDocumentNumber);
                // read item.amount >= 0
                itemAmountInt0 = (itemAmount) >= (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(itemAmountInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read item.amount >= 0 ? @android:color/accent_green : @android:color/accent_orange
                itemAmountInt0TextAmountAndroidColorAccentGreenTextAmountAndroidColorAccentOrange = ((itemAmountInt0) ? (getColorFromResource(textAmount, R.color.accent_green)) : (getColorFromResource(textAmount, R.color.accent_orange)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.textAmount.setTextColor(itemAmountInt0TextAmountAndroidColorAccentGreenTextAmountAndroidColorAccentOrange);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTime, textTimeAndroidStringTransactionNumberItemDocumentNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTitle, itemTransactionType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleDay, itemDay);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleMonth, itemMonth);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
        flag 2 (0x3L): item.amount >= 0 ? @android:color/accent_green : @android:color/accent_orange
        flag 3 (0x4L): item.amount >= 0 ? @android:color/accent_green : @android:color/accent_orange
    flag mapping end*/
    //end
}