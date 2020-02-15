package com.example.trending;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DevAdapter extends RecyclerView.Adapter<DevAdapter.VH>{
    private Context context;
    private List<String> mDatas;

    public DevAdapter(Context context,List<String> data){
        this.context = context;
        this.mDatas = data;

    }
    public DevAdapter.VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.dev_item_layout,null);

        return new DevAdapter.VH(view);
    }

    @Override
    public void onBindViewHolder(DevAdapter.VH holder, int position) {

        holder.textView.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public static class VH extends RecyclerView.ViewHolder{
        TextView textView;
        public VH( View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.name);
        }




    }

}

