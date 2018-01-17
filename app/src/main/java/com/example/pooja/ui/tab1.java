package com.nehatayade.hotels;

/**
 * Created by NehaTayade on 14-01-2018.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        int  [] IMAGES = {R.drawable.ic_insert_photo_black_24dp};
        String[] menuItems = {"HOTEL 1",
                "HOTEL 2",
                "HOTEL 3",
        "HOTEL 4",
        "HOTEL 5",
        "HOTEL 6",
        "HOTEL 7",
        "HOTEL 8",
        "HOTEL 9",
        "HOTEL 10"};
ListView listView = (ListView) view.findViewById(R.id.Tab1);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems

        );
        listView.setAdapter(listViewAdapter);

        return view;
    }
}
