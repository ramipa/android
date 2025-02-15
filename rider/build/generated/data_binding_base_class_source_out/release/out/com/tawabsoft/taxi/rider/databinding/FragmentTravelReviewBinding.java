// Generated by data binding compiler. Do not edit!
package com.tawabsoft.taxi.rider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.tawabsoft.taxi.rider.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTravelReviewBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton buttonSaveReview;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextInputEditText reviewText;

  @NonNull
  public final TextInputLayout reviewTextLayout;

  protected FragmentTravelReviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton buttonSaveReview, RatingBar ratingBar, TextInputEditText reviewText,
      TextInputLayout reviewTextLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonSaveReview = buttonSaveReview;
    this.ratingBar = ratingBar;
    this.reviewText = reviewText;
    this.reviewTextLayout = reviewTextLayout;
  }

  @NonNull
  public static FragmentTravelReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_travel_review, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTravelReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTravelReviewBinding>inflateInternal(inflater, R.layout.fragment_travel_review, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTravelReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_travel_review, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTravelReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTravelReviewBinding>inflateInternal(inflater, R.layout.fragment_travel_review, null, false, component);
  }

  public static FragmentTravelReviewBinding bind(@NonNull View view) {
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
  public static FragmentTravelReviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTravelReviewBinding)bind(component, view, R.layout.fragment_travel_review);
  }
}
