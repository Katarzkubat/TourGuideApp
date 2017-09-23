package com.example.katarzkubat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Place> food = new ArrayList<>();
        food.add(new Place(R.string.Vegab, R.string.Vegaddress));
        food.add(new Place(R.string.Momo, R.string.Momaddress));
        food.add(new Place(R.string.CafeM, R.string.CafeMaddress));
        food.add(new Place(R.string.Veganic, R.string.Veganicaddress));
        food.add(new Place(R.string.Noreny, R.string.Noraddress));
        food.add(new Place(R.string.CafeM, R.string.CafeMaddress));
        food.add(new Place(R.string.Veganic, R.string.Veganicaddress));
        food.add(new Place(R.string.Noreny, R.string.Noraddress));
        food.add(new Place(R.string.Vegab, R.string.Vegaddress));
        food.add(new Place(R.string.Momo, R.string.Momaddress));

        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), food);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
        return rootView;
    }

}