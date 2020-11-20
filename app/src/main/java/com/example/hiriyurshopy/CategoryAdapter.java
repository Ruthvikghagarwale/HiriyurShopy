package com.example.hiriyurshopy;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    // local variable
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    public Fragment getItem(int position) {
        if (position == 0) {
            return new Groceries();
        } else if (position == 1) {
            return new Fruits();
        } else if (position == 2) {
            return new Vegetables();
        } else {
            return new ReadyFood();
        }
    }

    /**
     * Return the total number of pages.
     */

    public int getCount() {

        return 4;

    }


    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Category_grocery);
        } else if (position == 1) {
            return mContext.getString(R.string.Category_fruits);
        } else if (position == 2) {
            return mContext.getString(R.string.Category_vegetable);
        } else {
            return mContext.getString(R.string.Category_ReadyFood);
        }
    }
};
