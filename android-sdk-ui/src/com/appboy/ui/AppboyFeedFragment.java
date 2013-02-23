package com.appboy.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.Appboy;

// TODO(martin) - Eclipse doesn't seem to like Honeycomb Fragments when building against a pre-Honeycomb target. Need
//                to import the project into Eclipse and straighten this out soon.
public class AppboyFeedFragment extends Fragment {
  private static final String TAG = String.format("%s.%s", Constants.APPBOY, AppboyFeedFragment.class.getName());

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Appboy.getInstance(getActivity());
  }

  @Override
  public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {
    return layoutInflater.inflate(R.layout.appboy_feed, container, false);
  }
}