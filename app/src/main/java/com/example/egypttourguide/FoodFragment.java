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
public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.litem, container, false);

        final ArrayList<ListItem> Food = new ArrayList<ListItem>();
        Food.add(new ListItem("Kushari",
                R.drawable.kushari));
        Food.add(new ListItem("Ful & Ta’meya (Fava Beans and Falafel)",
                R.drawable.ful_tamia));
        Food.add(new ListItem("Hawawshi (Egyptian Meat Pie)",
                R.drawable.hawawashi));
        Food.add(new ListItem("Shawerma",
                R.drawable.shawerma));
        Food.add(new ListItem("Kabab & Kofta (Grilled Meats)",
                R.drawable.kabab_kofta));
        Food.add(new ListItem("Mulukhiya",
                R.drawable.mulukhiya));
        Food.add(new ListItem("Fatta",
                R.drawable.fatta));
        Food.add(new ListItem("Baklava",
                R.drawable.baklawa));
        Food.add(new ListItem("Basboosa",
                R.drawable.basbosa));
        Food.add(new ListItem("Konafa",
                R.drawable.konafa));

        ItemAdapter adapter = new ItemAdapter(getActivity(), Food, R.color.category_food);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListItem food = Food.get(position);
                Intent intent = new Intent(getActivity(), Food.class);
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