package com.example.katarzkubat.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class OutdoorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Place> outdoor = new ArrayList<>();
        outdoor.add(new Place(R.string.Planty, R.string.Pladdress, R.drawable.planty));
        outdoor.add(new Place(R.string.Blonia, R.string.Blonaddress, R.drawable.blonia));
        outdoor.add(new Place(R.string.ForestW, R.string.ForestWaddress, R.drawable.wolski));
        outdoor.add(new Place(R.string.KosciuszkoK, R.string.KosKaddress, R.drawable.kosciuszko));
        outdoor.add(new Place(R.string.Bednarski, R.string.Bednaddress, R.drawable.bednarski));

        PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), outdoor);

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
