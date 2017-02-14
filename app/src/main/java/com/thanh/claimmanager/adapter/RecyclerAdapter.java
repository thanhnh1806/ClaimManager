package com.thanh.claimmanager.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thanh.claimmanager.R;
import com.thanh.claimmanager.object.Work;

import java.util.ArrayList;

/**
 * Created by thanh_nguyen02 on 14/12/2015.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.WorkViewHolder> {
    ArrayList<Work> works;

    public RecyclerAdapter(ArrayList<Work> works) {
        this.works = works;
    }

    @Override
    public WorkViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_recycle_view, parent, false);
        return new WorkViewHolder(v);
    }

    @Override
    public void onBindViewHolder(WorkViewHolder holder, int position) {
        Work work = works.get(position);
        holder.tvWork.setText(String.valueOf(work.getName()));
        holder.tvDescription.setText(String.valueOf(work.getDescription()));
        holder.imageView.setImageResource(work.getImageResource());
    }

    @Override
    public int getItemCount() {
        return works.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class WorkViewHolder extends RecyclerView.ViewHolder {
        protected TextView tvWork, tvDescription;
        protected ImageView imageView;

        public WorkViewHolder(View v) {
            super(v);
            tvWork = (TextView) v.findViewById(R.id.tvWork);
            tvDescription = (TextView) v.findViewById(R.id.tvDescription);
            imageView = (ImageView) v.findViewById(R.id.imageView);
        }
    }
}
