package com.mezan.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MovieFragment extends Fragment {

    String []name;
    String []description;
    String []price;

    //Pasta

    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie, container, false);

        ListView appetizerList;
        appetizerList = view.findViewById(R.id.pastaList);

        name = getResources().getStringArray(R.array.PASTA);
        description = getResources().getStringArray(R.array.PASTA_description);
        price = getResources().getStringArray(R.array.PASTA_price);

        ListAdapter adapter = new ListAdapter(getContext(),name,description,price);
        appetizerList.setAdapter(adapter);

        return view;
    }

}