// Generated by data binding compiler. Do not edit!
package com.tawabsoft.taxi.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardInputWidget;
import com.tawabsoft.taxi.common.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityChargeAccountBinding extends ViewDataBinding {
  @NonNull
  public final AutoCompleteTextView balanceAutocomplete;

  @NonNull
  public final CardInputWidget cardInput;

  @NonNull
  public final MaterialButton chargeAddFirst;

  @NonNull
  public final MaterialButton chargeAddSecond;

  @NonNull
  public final MaterialButton chargeAddThird;

  @NonNull
  public final MaterialButton checkoutButton;

  @NonNull
  public final TextInputLayout layoutBalance;

  @NonNull
  public final LinearLayout layoutCharges;

  @NonNull
  public final LinearLayout layoutMethods;

  @NonNull
  public final MaterialButtonToggleGroup paymentToggleLayout;

  @NonNull
  public final TextInputLayout priceTextLayout;

  @NonNull
  public final ProgressBar progressBalance;

  @NonNull
  public final ProgressBar progressCharge;

  @NonNull
  public final ProgressBar progressMethods;

  @NonNull
  public final TextInputEditText textAmount;

  @NonNull
  public final TextView titleMethod;

  @Bindable
  protected Boolean mLoadingMode;

  @Bindable
  protected Boolean mWaitingForPayment;

  protected ActivityChargeAccountBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AutoCompleteTextView balanceAutocomplete, CardInputWidget cardInput,
      MaterialButton chargeAddFirst, MaterialButton chargeAddSecond, MaterialButton chargeAddThird,
      MaterialButton checkoutButton, TextInputLayout layoutBalance, LinearLayout layoutCharges,
      LinearLayout layoutMethods, MaterialButtonToggleGroup paymentToggleLayout,
      TextInputLayout priceTextLayout, ProgressBar progressBalance, ProgressBar progressCharge,
      ProgressBar progressMethods, TextInputEditText textAmount, TextView titleMethod) {
    super(_bindingComponent, _root, _localFieldCount);
    this.balanceAutocomplete = balanceAutocomplete;
    this.cardInput = cardInput;
    this.chargeAddFirst = chargeAddFirst;
    this.chargeAddSecond = chargeAddSecond;
    this.chargeAddThird = chargeAddThird;
    this.checkoutButton = checkoutButton;
    this.layoutBalance = layoutBalance;
    this.layoutCharges = layoutCharges;
    this.layoutMethods = layoutMethods;
    this.paymentToggleLayout = paymentToggleLayout;
    this.priceTextLayout = priceTextLayout;
    this.progressBalance = progressBalance;
    this.progressCharge = progressCharge;
    this.progressMethods = progressMethods;
    this.textAmount = textAmount;
    this.titleMethod = titleMethod;
  }

  public abstract void setLoadingMode(@Nullable Boolean loadingMode);

  @Nullable
  public Boolean getLoadingMode() {
    return mLoadingMode;
  }

  public abstract void setWaitingForPayment(@Nullable Boolean waitingForPayment);

  @Nullable
  public Boolean getWaitingForPayment() {
    return mWaitingForPayment;
  }

  @NonNull
  public static ActivityChargeAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_charge_account, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChargeAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityChargeAccountBinding>inflateInternal(inflater, R.layout.activity_charge_account, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityChargeAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_charge_account, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChargeAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityChargeAccountBinding>inflateInternal(inflater, R.layout.activity_charge_account, null, false, component);
  }

  public static ActivityChargeAccountBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityChargeAccountBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityChargeAccountBinding)bind(component, view, R.layout.activity_charge_account);
  }
}