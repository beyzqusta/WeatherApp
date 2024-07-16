package com.example.waetherjava.Adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.waetherjava.Domains.FutureDomains;
import com.example.waetherjava.Domains.Hurly;
import com.example.waetherjava.R;

import java.util.ArrayList;

public class FutureAdapter extends RecyclerView.Adapter<FutureAdapter.viewHolder> {

    ArrayList<FutureDomains> items;
    Context context;

    public FutureAdapter(ArrayList<FutureDomains> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public FutureAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewfuture,parent,false);
        context= parent.getContext();
        return new viewHolder(inflate);
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void onBindViewHolder(@NonNull FutureAdapter.viewHolder holder, int position) {

        holder.dayTxt.setText(items.get(position).getDay());
        holder.statusTxt.setText(items.get(position).getStatus());
        holder.lowTxt.setText(items.get(position).getLowTemp()+"°");
        holder.highTxt.setText(items.get(position).getHighTemp()+"°");


        int drawableResourceId=holder.itemView.getResources().getIdentifier(items.get(position).getPickPath(),"drawable",holder.itemView.getContext().getOpPackageName());


        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView dayTxt,statusTxt,lowTxt,highTxt;
        ImageView pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            dayTxt=itemView.findViewById(R.id.dayTxt);
            statusTxt=itemView.findViewById(R.id.statusTxt);
            lowTxt=itemView.findViewById(R.id.lowTxt);
            highTxt=itemView.findViewById(R.id.highTxt);
            pic=itemView.findViewById(R.id.pic);

        }
    }
}
