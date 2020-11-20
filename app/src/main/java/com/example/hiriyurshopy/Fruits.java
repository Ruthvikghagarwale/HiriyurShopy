package com.example.hiriyurshopy;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiriyurshopy.dummy.DummyContent;

/**
 * A fragment representing a list of Items.
 */
public class Fruits extends Fragment {

    public Fruits() {
        // Required empty public constructor
        // let put the comment her
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.product_list, container, false);

        return rootView;
    }
}