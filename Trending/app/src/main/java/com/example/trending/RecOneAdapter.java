package com.example.trending;


import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import static com.example.trending.MainActivity.list;
import static com.example.trending.MainActivity.zt;

public class RecOneAdapter extends RecyclerView.Adapter<RecOneAdapter.VH>{
  public Context context;


public RecOneAdapter(Context context){
    this.context = context;


        }
public VH onCreateViewHolder( ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.res_item_layout,null);

        return new VH(view);
        }

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
        //int color= Color.parseColor(list.get(position).getLanguageColor());

        //holder.drawable.setColor(color);


      //GradientDrawable drawable= (GradientDrawable) context.getResources().getDrawable(R.drawable.circle_two);
     //  drawable.setColor(Color.parseColor("#000000"));

     //drawable.setColor(Color.parseColor(list.get(1).getLanguageColor().toString()));
      //  holder.drawable.setColor(Color.parseColor("#3572A5"));
        //String color=list.get(0).getLanguageColor();
       // String color2="\""+color+"\"";
        //drawable.setColor(Color.parseColor(color2));
       /*for(int i=0;i<=list.size();i++){
            if(list.get(position).getLanguage().length()==0){

              //  String s=list.get(position).getLanguageColor();
               drawable.setColor(Color.parseColor("#000000"));
               // holder.drawable.setColor(Color.parseColor(s));
            }


        }*/
        //drawable.setColor(Color.parseColor("list.get(position).getLanguageColor()"));
        //list.get(position).getLanguageColor()

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
    //Drawable drawable;

    public VH( View itemView) {
        super(itemView);
        author = (TextView) itemView.findViewById(R.id.author);
        name = (TextView) itemView.findViewById(R.id.name);
        description=(TextView)itemView.findViewById(R.id.description);
       language = (TextView) itemView.findViewById(R.id.language);
        num_one=(TextView)itemView.findViewById(R.id.num_one);
        num_two=(TextView)itemView.findViewById(R.id.num_two);
        image=(SimpleDraweeView)itemView.findViewById(R.id.avatur);
      drawable=(GradientDrawable) itemView.getResources().getDrawable(R.drawable.circle_three);


    }




}

    }



