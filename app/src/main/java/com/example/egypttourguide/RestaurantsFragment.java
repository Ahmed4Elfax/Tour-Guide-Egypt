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
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.litem, container, false);

        final ArrayList<ListItem> Restaurants = new ArrayList<ListItem>();
        Restaurants.add(new ListItem("Le Pacha 1901",
                R.drawable.lepache));
        Restaurants.add(new ListItem("Abou El Sid",
                R.drawable.aboelsaid));
        Restaurants.add(new ListItem("Koshary Abou Tarek",
                R.drawable.abotarek));
        Restaurants.add(new ListItem("Pier 88",
                R.drawable.pier));
        Restaurants.add(new ListItem("Taboula",
                R.drawable.taboula));
        Restaurants.add(new ListItem("Olivo",
                R.drawable.olivo));
        Restaurants.add(new ListItem("Naguib Mahfouz Cafe",
                R.drawable.nagib_mahfouz));
        Restaurants.add(new ListItem("Crimson",
                R.drawable.crimson));
        Restaurants.add(new ListItem("Tabla Luna",
                R.drawable.tabla_luna));
        Restaurants.add(new ListItem("Kebdet el Prince",
                R.drawable.elprince));

        ItemAdapter adapter = new ItemAdapter(getActivity(), Restaurants, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListItem restaurant = Restaurants.get(position);
                Intent intent = new Intent(getActivity(), Restaurants.class);
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