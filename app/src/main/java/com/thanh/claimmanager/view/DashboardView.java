package com.thanh.claimmanager.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thanh.claimmanager.R;
import com.thanh.claimmanager.controller.HomeController;

public class DashboardView extends Fragment {


    public DashboardView() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dashboard_view, container, false);
        return v;
    }


}
