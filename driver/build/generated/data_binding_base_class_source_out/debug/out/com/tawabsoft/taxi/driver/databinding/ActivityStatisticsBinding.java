// Generated by data binding compiler. Do not edit!
package com.tawabsoft.taxi.driver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.db.williamchart.view.LineChartView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import com.tawabsoft.taxi.common.models.Driver;
import com.tawabsoft.taxi.driver.R;
import com.tylersuehr.esr.EmptyStateRecyclerView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityStatisticsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final MaterialButton buttonPaymentRequest;

  @NonNull
  public final LineChartView chart;

  @NonNull
  public final MaterialCardView chartCard;

  @NonNull
  public final MaterialTextView distanceLabel;

  @NonNull
  public final MaterialTextView distanceText;

  @NonNull
  public final EmptyStateRecyclerView emptyState;

  @NonNull
  public final MaterialCardView incomeCard;

  @NonNull
  public final MaterialTextView incomeLabel;

  @NonNull
  public final MaterialTextView incomeText;

  @NonNull
  public final MaterialCardView ratingCard;

  @NonNull
  public final MaterialCardView serviceCard;

  @NonNull
  public final MaterialTextView serviceLabel;

  @NonNull
  public final MaterialTextView serviceText;

  @NonNull
  public final TabItem tabDaily;

  @NonNull
  public final TabLayout tabDate;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected Driver mDriver;

  protected ActivityStatisticsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBarLayout, MaterialButton buttonPaymentRequest, LineChartView chart,
      MaterialCardView chartCard, MaterialTextView distanceLabel, MaterialTextView distanceText,
      EmptyStateRecyclerView emptyState, MaterialCardView incomeCard, MaterialTextView incomeLabel,
      MaterialTextView incomeText, MaterialCardView ratingCard, MaterialCardView serviceCard,
      MaterialTextView serviceLabel, MaterialTextView serviceText, TabItem tabDaily,
      TabLayout tabDate, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.buttonPaymentRequest = buttonPaymentRequest;
    this.chart = chart;
    this.chartCard = chartCard;
    this.distanceLabel = distanceLabel;
    this.distanceText = distanceText;
    this.emptyState = emptyState;
    this.incomeCard = incomeCard;
    this.incomeLabel = incomeLabel;
    this.incomeText = incomeText;
    this.ratingCard = ratingCard;
    this.serviceCard = serviceCard;
    this.serviceLabel = serviceLabel;
    this.serviceText = serviceText;
    this.tabDaily = tabDaily;
    this.tabDate = tabDate;
    this.toolbar = toolbar;
  }

  public abstract void setDriver(@Nullable Driver driver);

  @Nullable
  public Driver getDriver() {
    return mDriver;
  }

  @NonNull
  public static ActivityStatisticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_statistics, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityStatisticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityStatisticsBinding>inflateInternal(inflater, R.layout.activity_statistics, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityStatisticsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_statistics, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityStatisticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityStatisticsBinding>inflateInternal(inflater, R.layout.activity_statistics, null, false, component);
  }

  public static ActivityStatisticsBinding bind(@NonNull View view) {
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
  public static ActivityStatisticsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityStatisticsBinding)bind(component, view, R.layout.activity_statistics);
  }
}