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
public class PlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.litem, container, false);

        final ArrayList<ListItem> Places = new ArrayList<ListItem>();
        Places.add(new ListItem("Pyramids of Giza",
                R.drawable.pyramids));
        Places.add(new ListItem("Luxor's Karnak Temple and the Valley of the Kings",
                R.drawable.karnak));
        Places.add(new ListItem("Siwa Oasis",
                R.drawable.siwa));
        Places.add(new ListItem("Aswan",
                R.drawable.aswan));
        Places.add(new ListItem("Abu Simbel",
                R.drawable.abusimbel));
        Places.add(new ListItem("Egyptian Museum",
                R.drawable.egyption_museum));
        Places.add(new ListItem("Khan el-Khalili",
                R.drawable.khan));
        Places.add(new ListItem("Abydos Temple",
                R.drawable.abydos));
        Places.add(new ListItem("Saqqara",
                R.drawable.saqqara));
        Places.add(new ListItem("White Desert",
                R.drawable.white_desert));
        Places.add(new ListItem("St. Catherine's Monastery",
                R.drawable.st_catherine));

        ItemAdapter adapter = new ItemAdapter(getActivity(), Places, R.color.category_places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListItem place = Places.get(position);
                Intent intent = new Intent(getActivity(), Place.class);
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