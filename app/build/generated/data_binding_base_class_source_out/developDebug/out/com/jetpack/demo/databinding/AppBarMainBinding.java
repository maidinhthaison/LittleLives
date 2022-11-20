// Generated by view binder compiler. Do not edit!
package com.jetpack.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.jetpack.demo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppBarMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppCompatButton btnShareFeedback;

  @NonNull
  public final AppCompatImageView imvGridview;

  @NonNull
  public final AppCompatImageView imvProfile;

  @NonNull
  public final Toolbar toolbar;

  private AppBarMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppCompatButton btnShareFeedback, @NonNull AppCompatImageView imvGridview,
      @NonNull AppCompatImageView imvProfile, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.btnShareFeedback = btnShareFeedback;
    this.imvGridview = imvGridview;
    this.imvProfile = imvProfile;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppBarMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppBarMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.app_bar_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppBarMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnShareFeedback;
      AppCompatButton btnShareFeedback = rootView.findViewById(id);
      if (btnShareFeedback == null) {
        break missingId;
      }

      id = R.id.imvGridview;
      AppCompatImageView imvGridview = rootView.findViewById(id);
      if (imvGridview == null) {
        break missingId;
      }

      id = R.id.imvProfile;
      AppCompatImageView imvProfile = rootView.findViewById(id);
      if (imvProfile == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new AppBarMainBinding((CoordinatorLayout) rootView, btnShareFeedback, imvGridview,
          imvProfile, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
