package com.thanh.claimmanager.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thanh.claimmanager.R;
import com.thanh.claimmanager.adapter.RecyclerAdapter;
import com.thanh.claimmanager.object.Work;

import java.util.ArrayList;

public class HomeView extends Fragment {

    public HomeView() {

    }

    private Context context;
    private RecyclerView rvListWork;
    private LinearLayoutManager mManager;
    private RecyclerAdapter adapter;
    private ArrayList<Work> works;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getContext();
        View v = inflater.inflate(R.layout.fragment_home_view, container, false);

        works = new ArrayList<>();
        works.add(new Work("Form", R.drawable.drawer_avartar, "Claim Management Forms"));
        works.add(new Work("Reporting", R.drawable.drawer_avartar, "You do not currently have access to this function"));
        works.add(new Work("Mail", R.drawable.drawer_avartar, "Email, Calendar, Tasks, Contacts"));
        works.add(new Work("Send Files", R.drawable.drawer_avartar, "Upload picture, video & scans"));
        works.add(new Work("Case Management", R.drawable.drawer_avartar, "TWO Legal Portal"));
        works.add(new Work("Maps", R.drawable.drawer_avartar, "Staff Location, Directions, routes & Mileage Calculator"));
        works.add(new Work("Form", R.drawable.drawer_avartar, "Claim Management Forms"));
        works.add(new Work("Reporting", R.drawable.drawer_avartar, "You do not currently have access to this function"));
        works.add(new Work("Mail", R.drawable.drawer_avartar, "Email, Calendar, Tasks, Contacts"));
        works.add(new Work("Send Files", R.drawable.drawer_avartar, "Upload picture, video & scans"));
        works.add(new Work("Case Management", R.drawable.drawer_avartar, "TWO Legal Portal"));
        works.add(new Work("Maps", R.drawable.drawer_avartar, "Staff Location, Directions, routes & Mileage Calculator"));

        rvListWork = (RecyclerView) v.findViewById(R.id.rvListWork);
        rvListWork.setHasFixedSize(true);
        mManager = new LinearLayoutManager(context);
        rvListWork.setLayoutManager(mManager);
        adapter = new RecyclerAdapter(works);
        rvListWork.setAdapter(adapter);

        return v;
    }


}
