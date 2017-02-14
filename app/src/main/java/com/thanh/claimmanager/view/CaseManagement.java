package com.thanh.claimmanager.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thanh.claimmanager.R;
import com.thanh.claimmanager.controller.HomeController;

public class CaseManagement extends Fragment {


    public CaseManagement() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_case_management, container, false);
    }


}
