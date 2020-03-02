package com.example.trending;


import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import static com.example.trending.MainActivity.list;
import static com.example.trending.MainActivity.zt;

public class RecOneAdapter extends RecyclerView.Adapter<RecOneAdapter.VH>{
  public Context context;


public RecOneAdapter(Context context){
    this.context = context;


        }
@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.res_item_layout,null);

        return new VH(view);
        }

@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
@Override
public void onBindViewHolder( VH holder, int position) {


    if(zt==true)
    {

        holder.author.setText((CharSequence) list.get(position).getAuthor());
        holder.name.setText(list.get(position).getName());
      holder.description.setText(list.get(position).getDescription());
        holder.language.setText( list.get(position).getLanguage());
        holder.num_one.setText(String.valueOf(list.get(position).getStars()));
        holder.num_two.setText( String.valueOf(list.get(position).getForks()));
        holder.image.setImageURI(list.get(position).getAvatar());







        try {
           if(list.get(position).getLanguage()==null==false){




               holder.cir.setBackground(holder.drawable);
               holder.cir.setVisibility(ImageView.VISIBLE);
               holder.drawable.setColor(Color.parseColor(list.get(position).getLanguageColor()));


           }
           else  {

               holder.cir.setVisibility(ImageView.GONE);

               }

       }catch (Exception e){}




    }
        }

@Override
public int getItemCount() {

    if(zt==true)
        return list.size();
    else
        return 15;
        }

public static class VH extends RecyclerView.ViewHolder{

    TextView author;
    TextView name;
    TextView description;
    TextView language;
    TextView num_one;
    TextView num_two;
    SimpleDraweeView image;

   GradientDrawable drawable;
    ImageView cir;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public VH(View itemView) {
        super(itemView);
        author = (TextView) itemView.findViewById(R.id.author);
        name = (TextView) itemView.findViewById(R.id.name);
        description=(TextView)itemView.findViewById(R.id.description);
       language = (TextView) itemView.findViewById(R.id.language);
        num_one=(TextView)itemView.findViewById(R.id.num_one);
        num_two=(TextView)itemView.findViewById(R.id.num_two);
        image=(SimpleDraweeView)itemView.findViewById(R.id.avatur);
   drawable=(GradientDrawable) itemView.getResources().getDrawable(R.drawable.circle_three);
      cir=(ImageView)itemView.findViewById(R.id.cir);


    }




}

    }



