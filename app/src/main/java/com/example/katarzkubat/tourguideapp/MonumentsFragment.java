package com.example.katarzkubat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Place> monuments = new ArrayList<>();
        monuments.add(new Place(R.string.Cisters, R.string.Cisaddress, R.drawable.cysters));
        monuments.add(new Place(R.string.Wawel, R.string.Waweladdress, R.drawable.wawel));
        monuments.add(new Place(R.string.BMary, R.string.BMaryaddress, R.drawable.mariacki));
        monuments.add(new Place(R.string.TownHall, R.string.THaddress, R.drawable.sukiennice));
        monuments.add(new Place(R.string.Barbican, R.string.Barbaddress, R.drawable.barbakan));
        monuments.add(new Place(R.string.StKatherine, R.string.StKatherinaddress, R.drawable.skatherine));

        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), monuments);

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
