package com.mezan.tablayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class RiceFragment extends Fragment {

    String []name;
    String []description;
    String []price;

    public RiceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rice, container, false);

        ListView appetizerList;
        appetizerList = view.findViewById(R.id.riceList);

        name = getResources().getStringArray(R.array.RICE);
        description = getResources().getStringArray(R.array.RICE_description);
        price = getResources().getStringArray(R.array.RICE_price);

        ListAdapter adapter = new ListAdapter(getContext(),name,description,price);
        appetizerList.setAdapter(adapter);

        return view;
    }


}
