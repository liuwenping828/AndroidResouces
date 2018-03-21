package com.lwp.resources.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lwp.resources.DataSources;
import com.lwp.resources.R;

/**
 * Created by Administrator on 2018/3/19.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    private DataSources[] dataSources;
    private Context context;

    public MyRecyclerAdapter(Context context, DataSources[] dataSources) {
        this.dataSources = dataSources;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataSources source = dataSources[position];
        final Class clazz = source.getClazz();
        holder.name.setText(source.getActivityName());
        holder.desc.setText(source.getActivityDesc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, clazz);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSources != null ? dataSources.length : 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView desc;

        public MyViewHolder(View item) {
            super(item);
            name = item.findViewById(R.id.name);
            desc = item.findViewById(R.id.desc);
        }
    }

}
