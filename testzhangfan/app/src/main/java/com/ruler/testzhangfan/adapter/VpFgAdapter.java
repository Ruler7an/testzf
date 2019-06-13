package com.ruler.testzhangfan.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.PropertyResourceBundle;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:13
 * year:2019
 * project_name:testzhangfan
 */
public class VpFgAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragmentArrayList;

    public VpFgAdapter(FragmentManager fm, ArrayList<Fragment> fragmentArrayList) {
        super(fm);
        this.fragmentArrayList = fragmentArrayList;
    }

    public VpFgAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentArrayList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
}
