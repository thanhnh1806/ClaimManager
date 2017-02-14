package com.thanh.claimmanager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thanh.claimmanager.view.CaseManagement;
import com.thanh.claimmanager.view.DashboardView;
import com.thanh.claimmanager.view.FormsView;
import com.thanh.claimmanager.view.HomeView;
import com.thanh.claimmanager.view.MapView;

/**
 * Created by thanh_nguyen02 on 13/12/2015.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeView();
            case 1:
                return new DashboardView();
            case 2:
                return new CaseManagement();
            case 3:
                return new MapView();
            case 4:
                return new FormsView();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
