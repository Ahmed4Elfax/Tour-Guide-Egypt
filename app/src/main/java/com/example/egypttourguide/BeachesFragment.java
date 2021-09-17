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
public class BeachesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.litem, container, false);

        final ArrayList<ListItem> Beaches = new ArrayList<ListItem>();
        Beaches.add(new ListItem("Naama Bay",
                R.drawable.naama_bay));
        Beaches.add(new ListItem("Dahab Lagoon",
                R.drawable.dahab_lagoon));
        Beaches.add(new ListItem("El Gouna",
                R.drawable.elgouna));
        Beaches.add(new ListItem("Ras Um Sid Beach",
                R.drawable.ras_um_sid_beach));
        Beaches.add(new ListItem("Nuweiba-Taba Coastline",
                R.drawable.nuwiba_taba));
        Beaches.add(new ListItem("Soma Bay",
                R.drawable.soma_bay));
        Beaches.add(new ListItem("Marsa Alam",
                R.drawable.marsa_alam));
        Beaches.add(new ListItem("Taba",
                R.drawable.taba));
        Beaches.add(new ListItem("Sahl Hasheesh",
                R.drawable.sahl_hasheesh));
        Beaches.add(new ListItem("Makadi Bay",
                R.drawable.makadi_bay));

        ItemAdapter adapter = new ItemAdapter(getActivity(), Beaches, R.color.category_beaches);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListItem beach = Beaches.get(position);
                Intent intent = new Intent(getActivity(), Beach.class);
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