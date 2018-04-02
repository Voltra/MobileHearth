package com.example.ladysnake.mobile;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ladysnake.mobile.tools.ResourceAwareFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A custom {@link FragmentPagerAdapter} specialized for this specific use case
 * @author Ludwig GUERIN
 */
public class TabPagerAdapter extends FragmentPagerAdapter {
    List<ResourceAwareFragment> fragments = new ArrayList<ResourceAwareFragment>(){{
        add(0, SearchView.make().withRes(R.drawable.search));
        add(1, EditView.make().withRes(R.drawable.edit));
    }};

    public TabPagerAdapter(FragmentManager fm) { super(fm); }

    @Override
    public ResourceAwareFragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}
