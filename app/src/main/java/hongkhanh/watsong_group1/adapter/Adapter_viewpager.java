package hongkhanh.watsong_group1.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import hongkhanh.watsong_group1.fragment.fragment.Fragment_history;
import hongkhanh.watsong_group1.fragment.fragment.Fragment_infomation_song;
import hongkhanh.watsong_group1.fragment.fragment.Fragment_main;

/**
 * Created by HONGKHANH on 07/11/2017.
 */

public class Adapter_viewpager extends FragmentPagerAdapter {
    List<Fragment> fragments = new ArrayList<>();
    public Adapter_viewpager(FragmentManager fm) {
        super(fm);
        fragments.add(new Fragment_history());
        fragments.add(new Fragment_main());
        fragments.add(new Fragment_infomation_song());
    }


    @Override
    public Fragment getItem(int position) {


        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

