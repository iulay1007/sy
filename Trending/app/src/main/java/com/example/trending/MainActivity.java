package com.example.trending;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


;


public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private TabLayout mTablayout;
    private ViewPager mViewPager;
    private List<Fragment> fragmentlist;
    private TabFragmentPagerAdapter adapter;
    private  String[] titles = new String[]{"Repository","Developer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
      //  ViewPager.addOnPageChangeListener(new ViewPagerChangeListener());
        adapter = new TabFragmentPagerAdapter(getSupportFragmentManager(),fragmentlist);
        mViewPager.setAdapter(adapter);
        mTablayout.setupWithViewPager(mViewPager);
        mTablayout.getTabAt(0).setText(titles[0]);
        mTablayout.getTabAt(1).setText(titles[1]);
      // mTablayout.addOnTabSelectedListener(new OnTabSelectedListener()

       // mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTablayout));
      //  mViewPager.setCurrentItem(0);
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

    @Override
    public void onClick(View v) {

    }
}







