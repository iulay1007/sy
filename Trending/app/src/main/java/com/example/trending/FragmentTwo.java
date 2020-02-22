package com.example.trending;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class FragmentTwo extends Fragment {
    private View view;
    private RecyclerView recyclerView;
    private DevAdapter mAdapter;
    private ArrayList<String> mDatas;
    private Async2 mAsync;
    public static List<jsondate2> list2=new ArrayList<>();
    public static boolean zt2;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_dev_layout, container, false);



        mAsync=new Async2();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
            mAsync.execute();
        }
        recyclerView =(RecyclerView)view.findViewById(R.id.rec_dev);

        recyclerView.setAdapter(mAdapter = new DevAdapter(getActivity()));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        return view;
    }


    @SuppressLint("NewApi")
    public class Async2 extends AsyncTask<Object, Integer, List<jsondate2>
            > {

        protected void onPreExecute() {

        }



        @Override
        protected List<jsondate2> doInBackground(Object... params) {
            String responseData = null;

            try{
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://github-trending-api.now.sh/developers").get()
                        .build();
                Response response = client.newCall(request).execute();
                responseData = response.body().string();
                Gson gson = new Gson();
                list2 = gson.fromJson(responseData, new  TypeToken<ArrayList<jsondate2>>(){}.getType());
            }catch (Exception e){
                e.printStackTrace();
            }
            return list2;

        }



        protected void onPostExecute(List<jsondate2> list){


            zt2=true;



        }
    }



}