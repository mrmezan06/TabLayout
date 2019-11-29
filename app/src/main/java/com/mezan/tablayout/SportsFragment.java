package com.mezan.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class SportsFragment extends Fragment {

    String []name;
    String []description;
    String []price;

    //Salad

    public SportsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sports, container, false);

        ListView appetizerList;
        appetizerList = view.findViewById(R.id.saladList);

        name = getResources().getStringArray(R.array.SALAD);
        description = getResources().getStringArray(R.array.SALAD_description);
        price = getResources().getStringArray(R.array.SALAD_price);

        ListAdapter adapter = new ListAdapter(getContext(),name,description,price);
        appetizerList.setAdapter(adapter);

        return view;
    }

}