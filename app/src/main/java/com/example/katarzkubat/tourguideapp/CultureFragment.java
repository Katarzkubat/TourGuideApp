package com.example.katarzkubat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CultureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Place> culture = new ArrayList<>();
        culture.add(new Place(R.string.MOCAK, R.string.Mocaddress, R.drawable.mocak));
        culture.add(new Place(R.string.Manggha, R.string.Mghaddress, R.drawable.mangha));
        culture.add(new Place(R.string.BSGallery, R.string.BSGaddress, R.drawable.bunkier));
        culture.add(new Place(R.string.EthnoM, R.string.EMaddress, R.drawable.muzetno));
        culture.add(new Place(R.string.Cricoteca, R.string.Cricaddress, R.drawable.muzkantor));
        culture.add(new Place(R.string.OldS, R.string.OldSaddress, R.drawable.oldsyng));
        culture.add(new Place(R.string.NationalM, R.string.NMaddress, R.drawable.muznar));

        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), culture);

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
