package com.tawabsoft.taxi.rider;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.tawabsoft.taxi.rider.databinding.ActivityAddressesBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivityCouponBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivityEditProfileBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivityLookingBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivityMainBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivityPromotionsBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivityRiderLoginBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivitySplashBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ActivityTravelBindingImpl;
import com.tawabsoft.taxi.rider.databinding.FragmentEditAddressBindingImpl;
import com.tawabsoft.taxi.rider.databinding.FragmentReviewBindingImpl;
import com.tawabsoft.taxi.rider.databinding.FragmentTravelDriverBindingImpl;
import com.tawabsoft.taxi.rider.databinding.FragmentTravelReviewBindingImpl;
import com.tawabsoft.taxi.rider.databinding.FragmentTravelStatsBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ItemAddressBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ItemCouponBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ItemPromotionBindingImpl;
import com.tawabsoft.taxi.rider.databinding.ItemServiceBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDRESSES = 1;

  private static final int LAYOUT_ACTIVITYCOUPON = 2;

  private static final int LAYOUT_ACTIVITYEDITPROFILE = 3;

  private static final int LAYOUT_ACTIVITYLOOKING = 4;

  private static final int LAYOUT_ACTIVITYMAIN = 5;

  private static final int LAYOUT_ACTIVITYPROMOTIONS = 6;

  private static final int LAYOUT_ACTIVITYRIDERLOGIN = 7;

  private static final int LAYOUT_ACTIVITYSPLASH = 8;

  private static final int LAYOUT_ACTIVITYTRAVEL = 9;

  private static final int LAYOUT_FRAGMENTEDITADDRESS = 10;

  private static final int LAYOUT_FRAGMENTREVIEW = 11;

  private static final int LAYOUT_FRAGMENTTRAVELDRIVER = 12;

  private static final int LAYOUT_FRAGMENTTRAVELREVIEW = 13;

  private static final int LAYOUT_FRAGMENTTRAVELSTATS = 14;

  private static final int LAYOUT_ITEMADDRESS = 15;

  private static final int LAYOUT_ITEMCOUPON = 16;

  private static final int LAYOUT_ITEMPROMOTION = 17;

  private static final int LAYOUT_ITEMSERVICE = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_addresses, LAYOUT_ACTIVITYADDRESSES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_coupon, LAYOUT_ACTIVITYCOUPON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_looking, LAYOUT_ACTIVITYLOOKING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_promotions, LAYOUT_ACTIVITYPROMOTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_rider_login, LAYOUT_ACTIVITYRIDERLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.activity_travel, LAYOUT_ACTIVITYTRAVEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.fragment_edit_address, LAYOUT_FRAGMENTEDITADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.fragment_review, LAYOUT_FRAGMENTREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.fragment_travel_driver, LAYOUT_FRAGMENTTRAVELDRIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.fragment_travel_review, LAYOUT_FRAGMENTTRAVELREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.fragment_travel_stats, LAYOUT_FRAGMENTTRAVELSTATS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.item_address, LAYOUT_ITEMADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.item_coupon, LAYOUT_ITEMCOUPON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.item_promotion, LAYOUT_ITEMPROMOTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.rider.R.layout.item_service, LAYOUT_ITEMSERVICE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDRESSES: {
          if ("layout/activity_addresses_0".equals(tag)) {
            return new ActivityAddressesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_addresses is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCOUPON: {
          if ("layout/activity_coupon_0".equals(tag)) {
            return new ActivityCouponBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_coupon is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITPROFILE: {
          if ("layout/activity_edit_profile_0".equals(tag)) {
            return new ActivityEditProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOOKING: {
          if ("layout/activity_looking_0".equals(tag)) {
            return new ActivityLookingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_looking is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROMOTIONS: {
          if ("layout/activity_promotions_0".equals(tag)) {
            return new ActivityPromotionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_promotions is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRIDERLOGIN: {
          if ("layout/activity_rider_login_0".equals(tag)) {
            return new ActivityRiderLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_rider_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTRAVEL: {
          if ("layout/activity_travel_0".equals(tag)) {
            return new ActivityTravelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_travel is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITADDRESS: {
          if ("layout/fragment_edit_address_0".equals(tag)) {
            return new FragmentEditAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_address is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREVIEW: {
          if ("layout/fragment_review_0".equals(tag)) {
            return new FragmentReviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_review is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRAVELDRIVER: {
          if ("layout/fragment_travel_driver_0".equals(tag)) {
            return new FragmentTravelDriverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_travel_driver is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRAVELREVIEW: {
          if ("layout/fragment_travel_review_0".equals(tag)) {
            return new FragmentTravelReviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_travel_review is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRAVELSTATS: {
          if ("layout/fragment_travel_stats_0".equals(tag)) {
            return new FragmentTravelStatsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_travel_stats is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMADDRESS: {
          if ("layout/item_address_0".equals(tag)) {
            return new ItemAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_address is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOUPON: {
          if ("layout/item_coupon_0".equals(tag)) {
            return new ItemCouponBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_coupon is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROMOTION: {
          if ("layout/item_promotion_0".equals(tag)) {
            return new ItemPromotionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_promotion is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSERVICE: {
          if ("layout/item_service_0".equals(tag)) {
            return new ItemServiceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_service is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.tawabsoft.taxi.common.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "address");
      sKeys.put(2, "converter");
      sKeys.put(3, "driver");
      sKeys.put(4, "item");
      sKeys.put(5, "loadingMode");
      sKeys.put(6, "mode");
      sKeys.put(7, "request");
      sKeys.put(8, "user");
      sKeys.put(9, "waitingForPayment");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/activity_addresses_0", com.tawabsoft.taxi.rider.R.layout.activity_addresses);
      sKeys.put("layout/activity_coupon_0", com.tawabsoft.taxi.rider.R.layout.activity_coupon);
      sKeys.put("layout/activity_edit_profile_0", com.tawabsoft.taxi.rider.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_looking_0", com.tawabsoft.taxi.rider.R.layout.activity_looking);
      sKeys.put("layout/activity_main_0", com.tawabsoft.taxi.rider.R.layout.activity_main);
      sKeys.put("layout/activity_promotions_0", com.tawabsoft.taxi.rider.R.layout.activity_promotions);
      sKeys.put("layout/activity_rider_login_0", com.tawabsoft.taxi.rider.R.layout.activity_rider_login);
      sKeys.put("layout/activity_splash_0", com.tawabsoft.taxi.rider.R.layout.activity_splash);
      sKeys.put("layout/activity_travel_0", com.tawabsoft.taxi.rider.R.layout.activity_travel);
      sKeys.put("layout/fragment_edit_address_0", com.tawabsoft.taxi.rider.R.layout.fragment_edit_address);
      sKeys.put("layout/fragment_review_0", com.tawabsoft.taxi.rider.R.layout.fragment_review);
      sKeys.put("layout/fragment_travel_driver_0", com.tawabsoft.taxi.rider.R.layout.fragment_travel_driver);
      sKeys.put("layout/fragment_travel_review_0", com.tawabsoft.taxi.rider.R.layout.fragment_travel_review);
      sKeys.put("layout/fragment_travel_stats_0", com.tawabsoft.taxi.rider.R.layout.fragment_travel_stats);
      sKeys.put("layout/item_address_0", com.tawabsoft.taxi.rider.R.layout.item_address);
      sKeys.put("layout/item_coupon_0", com.tawabsoft.taxi.rider.R.layout.item_coupon);
      sKeys.put("layout/item_promotion_0", com.tawabsoft.taxi.rider.R.layout.item_promotion);
      sKeys.put("layout/item_service_0", com.tawabsoft.taxi.rider.R.layout.item_service);
    }
  }
}
