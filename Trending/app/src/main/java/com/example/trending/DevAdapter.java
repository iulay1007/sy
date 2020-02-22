package com.example.trending;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import static com.example.trending.FragmentTwo.list2;
import static com.example.trending.FragmentTwo.zt2;


public class DevAdapter extends RecyclerView.Adapter<DevAdapter.VH>{
    private Context context;


    public DevAdapter(Context context){
        this.context = context;


    }
    public DevAdapter.VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.dev_item_layout,null);

        return new DevAdapter.VH(view);
    }

    @Override
    public void onBindViewHolder(DevAdapter.VH holder, int position) {

       if(zt2==true)
       {

           holder.username.setText(list2.get(position).getUsername());
           holder.name.setText(list2.get(position).getName());
           holder.url.setText(list2.get(position).getUrl());
           holder.image2.setImageURI((list2.get(position).getAvatar()));

       }
    }

    @Override
    public int getItemCount() {
        if(zt2==true)
            return list2.size();
        else
            return 15;

    }

    public static class VH extends RecyclerView.ViewHolder{
        TextView username;
        TextView name;
        TextView url;
        SimpleDraweeView image2;
        public VH( View itemView) {
            super(itemView);
            username = (TextView) itemView.findViewById(R.id.username);
            name = (TextView) itemView.findViewById(R.id.name);
            url=(TextView)itemView.findViewById(R.id.url);
            image2=(SimpleDraweeView)itemView.findViewById(R.id.avatur);
        }




    }

}

