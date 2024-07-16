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
import com.example.waetherjava.Domains.Hurly;
import com.example.waetherjava.R;

import java.time.Instant;
import java.util.ArrayList;

public class HurlyAdapter extends RecyclerView.Adapter<HurlyAdapter.viewHolder> {

    ArrayList<Hurly> items;
    Context context;

    public HurlyAdapter(ArrayList<Hurly> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public HurlyAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,parent,false);
        context= parent.getContext();
        return new viewHolder(inflate);
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void onBindViewHolder(@NonNull HurlyAdapter.viewHolder holder, int position) {

        holder.hourTxt.setText(items.get(position).getHour());
        holder.tempTxt.setText(items.get(position).getTemp()+"°");

        int drawableResourceId=holder.itemView.getResources().getIdentifier(items.get(position).getPickpath(),"drawable",holder.itemView.getContext().getOpPackageName());


        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView hourTxt,tempTxt;
        ImageView pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            hourTxt=itemView.findViewById(R.id.hourTxt);
            tempTxt=itemView.findViewById(R.id.tempTxt);
            pic=itemView.findViewById(R.id.pic);

        }
    }
}
