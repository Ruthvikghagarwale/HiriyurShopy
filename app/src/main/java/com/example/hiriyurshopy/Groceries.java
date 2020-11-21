package com.example.hiriyurshopy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
/**
 * A fragment representing a list of Items.
 */
public class Groceries extends Fragment {

    public Groceries() {
        // Required empty public constructor
        // let put the comment her
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.product_list, container, false);
    }
}