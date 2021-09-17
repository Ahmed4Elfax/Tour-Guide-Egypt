package com.example.egypttourguide;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.litem, container, false);

        final ArrayList<ListItem> Hotels = new ArrayList<ListItem>();
        Hotels.add(new ListItem("Sunrise Alex Avenue Hotel",
                R.drawable.sunrise_alex_venue_hotel));
        Hotels.add(new ListItem("Pavillon Winter Luxor",
                R.drawable.pavillon_winter_luxor));
        Hotels.add(new ListItem("Valencia Hotel Downtown",
                R.drawable.valencia_hotel_downtown));
        Hotels.add(new ListItem("Elite Pyramids Boutique Hotel",
                R.drawable.elite_pyramids_boutique_hotel));
        Hotels.add(new ListItem("PortSaid Hotel",
                R.drawable.portsaid_hotel));
        Hotels.add(new ListItem("Golden Pyramids Inn",
                R.drawable.golden_pyramids_inn));
        Hotels.add(new ListItem("Victory Of Downtown Hotel",
                R.drawable.victory_of_downtown_hotel));
        Hotels.add(new ListItem("Pyramids Hills Inn",
                R.drawable.pyramids_hills_inn));
        Hotels.add(new ListItem("Steigenberger Hotel El Lessan",
                R.drawable.steigenberger_hotel_ellessan));
        Hotels.add(new ListItem("Solymar Soma Beach",
                R.drawable.solymar_soma_beach));

        ItemAdapter adapter = new ItemAdapter(getActivity(), Hotels, R.color.category_hotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListItem hotel = Hotels.get(position);
                Intent intent = new Intent(getActivity(), Hotel.class);
                intent.putExtra("message", position+"");
                getActivity().startActivity(intent);
            }
        });

        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }

}