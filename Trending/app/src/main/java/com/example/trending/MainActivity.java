package com.example.trending;


import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

;


public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private TabLayout mTablayout;
    private ViewPager mViewPager;
    private List<Fragment> fragmentlist;
    private TabFragmentPagerAdapter adapter;
    private  String[] titles = new String[]{"Repository","Developer"};
    private Async mAsync;

    public static boolean zt;
    public static List<jsondate> list=new ArrayList<>();
    public static List<String> imagelist=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        mAsync=new Async();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
            mAsync.execute();

        }
        mTablayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        fragmentlist = new ArrayList<>();
        Fragment fragmentone = new FragmentOne();
        Fragment fragmenttwo = new FragmentTwo();
        fragmentlist.add(fragmentone);
        fragmentlist.add(fragmenttwo);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
      actionBar.setCustomView(R.layout.actionbar_title);
        adapter = new TabFragmentPagerAdapter(getSupportFragmentManager(),fragmentlist);
        mViewPager.setAdapter(adapter);
        mTablayout.setupWithViewPager(mViewPager);
        mTablayout.getTabAt(0).setText(titles[0]);
        mTablayout.getTabAt(1).setText(titles[1]);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    @SuppressLint("NewApi")
    public class Async extends AsyncTask<Object, Integer, List<jsondate>
            > {

        protected void onPreExecute() {

        }



        @Override
        protected List<jsondate> doInBackground(Object... params) {
            String responseData = null;

            try{
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://github-trending-api.now.sh/repositories").get()
                        .build();
                Response response = client.newCall(request).execute();
                responseData = response.body().string();
                Gson gson = new Gson();
                list = gson.fromJson(responseData, new  TypeToken<ArrayList<jsondate>>(){}.getType());
            }catch (Exception e){
                e.printStackTrace();
            }
            return list;

        }



        protected void onPostExecute(List<jsondate> list){


            zt=true;



        }
    }




    @Override
    public void onClick(View v) {

    }
}







