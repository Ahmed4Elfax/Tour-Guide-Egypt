package com.example.egypttourguide;

import android.content.Intent;

import android.os.Bundle;

import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Food extends AppCompatActivity {

    private TextView mTextView;
    private TextView name;
    private ImageView src_image;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        src_image = (ImageView)findViewById(R.id.src_image);
        mTextView = (TextView) findViewById(R.id.summary);
        name = (TextView) findViewById(R.id.name);
        if(message.equalsIgnoreCase("0")){
            name.setText("Kushari");
            src_image.setImageResource(R.drawable.kushari);
            mTextView.setText("One of the most famous dishes of Egyptian food consists of rice, lentils, onions, garlic, chickpeas, and tomato sauce. It has four sources of carbohydrates made it the most popular lunch item in Egypt.");
        }else if(message.equalsIgnoreCase("1")){
            name.setText("Ful & Ta’meya (Fava Beans and Falafel)");
            src_image.setImageResource(R.drawable.ful_tamia);
            mTextView.setText("The most famous Egyptian fast food; they are the main fast food in the Egyptian breakfast. The full (pronounced: fool) is made of fava beans. The ta’meya, or falafel is made out of crushed fava beans that are made into a paste then fried");
        }else if(message.equalsIgnoreCase("2")){
            name.setText("Hawawshi (Egyptian Meat Pie)");
            src_image.setImageResource(R.drawable.hawawashi);
            mTextView.setText("Spiced ground beef cooked in a whole loaf of bread, either in a rotisserie oven or baked in a regular oven.");

        }else if(message.equalsIgnoreCase("3")){
            name.setText("Shawerma");
            src_image.setImageResource(R.drawable.shawerma);
            mTextView.setText("While Shawerma is not originally a native Egyptian dish, it became so due to Egypt being part of the Ottoman Empire. That said, the best Shawerma in Egypt will traditionally be available at Syrian owned sandwich parlours.");

        }else if(message.equalsIgnoreCase("4")){
            name.setText("Kabab & Kofta (Grilled Meats)");
            src_image.setImageResource(R.drawable.kabab_kofta);
            mTextView.setText("Succulent grilled meat cubes and sheesh kebab, typically made out of veal or lamb, they are usually served with bread and an assortment of green salads and dips, mostly tahini, baba ghanoush. They are grilled over charcoal and they are a must for any meat lover visiting Egypt.");

        }else if(message.equalsIgnoreCase("5")){
            name.setText("Mulukhiya");
            src_image.setImageResource(R.drawable.mulukhiya);
            mTextView.setText("Mulukhiya is made from the leaves of jute and plants, prepared by chopping the leaves with garlic and cooking it in an animal stock such as chicken, beef or rabbit, and served with rice or bread. and it’s one of the most delicious dishes in Egypt.");

        }else if(message.equalsIgnoreCase("6")){
            name.setText("Fatta");
            src_image.setImageResource(R.drawable.fatta);
            mTextView.setText("Fatta is usually prepared for festivities such as a woman’s first birth. It consists of rice and fried bread, covered in garlic and meat soup and Large chunks of stewed beef.");

        }else if(message.equalsIgnoreCase("7")){
            name.setText("Baklava");
            src_image.setImageResource(R.drawable.baklawa);
            mTextView.setText("Crushed nuts baked between layers of filo dough and topped with a sweet syrup.");

        }else if(message.equalsIgnoreCase("8")){
            name.setText("Basboosa");
            src_image.setImageResource(R.drawable.basbosa);
            mTextView.setText("Light and crumbly cake baked and topped with a sweet syrup.");
        }else {
            name.setText("Konafa");
            src_image.setImageResource(R.drawable.konafa);
            mTextView.setText("At first glance, it looks like hay, but it’s actually really thin and topped with a sweet syrup.");

        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
}