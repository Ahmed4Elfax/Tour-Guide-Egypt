package com.example.egypttourguide;


import android.app.SearchManager;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;


import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Hotel extends AppCompatActivity {

    private TextView mTextView;
    private TextView name;
    private ImageView src_image;
    private String map;
    private String phone;
    private String site;
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
        setContentView(R.layout.activity_hotel);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        src_image = (ImageView)findViewById(R.id.src_image);
        mTextView = (TextView) findViewById(R.id.summary);
        name = (TextView) findViewById(R.id.name);
       if(message.equalsIgnoreCase("0")){
           name.setText("Sunrise Alex Avenue Hotel");
            src_image.setImageResource(R.drawable.sunrise_alex_venue_hotel);
            mTextView.setText("Occupying a sea front location in the middle of Alexandria, SUNRISE Alex Avenue Hotel features a private beach. All rooms boast panoramic views of the Mediterranean Sea. ");
            map = "https://www.google.com/maps/place/SUNRISE+Alex+Avenue+Hotel/@31.2340702,29.9479487,17z/data=!3m1!4b1!4m8!3m7!1s0x14f5c5b0d81ab201:0x691d577e4d074f82!5m2!4m1!1i2!8m2!3d31.2340656!4d29.94576";
            phone ="0100 320 0083";
            site ="https://www.sunrise-resorts.com/Home/ALEXANDRIA/SUNRISE_Select_Alex_Avenue_Hotel";

       }else if(message.equalsIgnoreCase("1")){
           name.setText("Pavillon Winter Luxor");
           src_image.setImageResource(R.drawable.pavillon_winter_luxor);
           mTextView.setText("Pavillon Winter Luxor offers 3 restaurants, 2 bars, and warm hospitality in the heart of Luxor city. It overlooks the River Nile and is just 328 feet away from the Luxor Temple. ");
           map = "https://www.google.com/maps/place/Hotel+Pavillon+Winter+Luxor/@25.6968463,32.6409372,17z/data=!3m1!4b1!4m8!3m7!1s0x145840cfc0b0c23f:0xc5c45a5bffb2eec1!5m2!4m1!1i2!8m2!3d25.6969142!4d32.6386383";
           phone ="(095) 2380425";
           site ="https://www.guestreservations.com/pavillon-winter-luxor/booking?gclid=EAIaIQobChMIw6-JrdeX8gIV1wIGAB0FNQskEAAYASAAEgL2RvD_BwE";

       }else if(message.equalsIgnoreCase("2")){
           name.setText("Valencia Hotel Downtown");
            src_image.setImageResource(R.drawable.valencia_hotel_downtown);
            mTextView.setText("Valencia Hotel is a three-star property in Cairo. We offers 50 rooms and excellent customer service. Our mission is to offer the highest quality accommodation at the most affordable price. We do everything we can to make sure our guests leave with a smile.");
           map = "https://www.google.com/maps/place/Hotel+Pavillon+Winter+Luxor/@25.6968463,32.6409372,17z/data=!3m1!4b1!4m8!3m7!1s0x145840cfc0b0c23f:0xc5c45a5bffb2eec1!5m2!4m1!1i2!8m2!3d25.6969142!4d32.6386383";
           phone ="0127 121 8023";
           site ="https://valencia-eg.com/";

       }else if(message.equalsIgnoreCase("3")){
           name.setText("Elite Pyramids Boutique Hotel");
            src_image.setImageResource(R.drawable.elite_pyramids_boutique_hotel);
            mTextView.setText("Located in Cairo, 1.1 mi from Giza Pyramids, Elite Pyramids Boutique Hotel features accommodations with a restaurant, free private parking, a bar and a shared lounge. ");
           map = "https://www.google.com/maps/place/Elite+Pyramids+Boutique+Hotel/@29.985341,31.1388445,17z/data=!3m1!4b1!4m8!3m7!1s0x14584510573c05a7:0xab666b76ee554679!5m2!4m1!1i2!8m2!3d29.9853364!4d31.1366558";
           phone ="0102 106 8267";
           site ="https://www.booking.com/hotel/eg/elite-pyramids-boutique.ar.html";

       }else if(message.equalsIgnoreCase("4")){
           name.setText("PortSaid Hotel");
            src_image.setImageResource(R.drawable.portsaid_hotel);
            mTextView.setText("Set in Port Said, 1.4 mi from Dock Ferry Iskenderun (Port Said), PortSaid Hotel offers accommodations with a restaurant, free private parking, a seasonal outdoor swimming pool and a bar. ");
           map = "https://www.google.com/maps/place/%D9%81%D9%86%D8%AF%D9%82+%D8%A8%D9%88%D8%B1%D8%B3%D8%B9%D9%8A%D8%AF+%D9%85%D8%B5%D8%B1+%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%AD%D8%A9%E2%80%AD/@31.2710938,32.31736,17z/data=!3m1!4b1!4m8!3m7!1s0x14f99d0140cf022d:0xd7d3135adb987da!5m2!4m1!1i2!8m2!3d31.2710936!4d32.3151714";
           phone ="(066) 3320890";
           site ="http://portsaidmisrtravel.com/";

       }else if(message.equalsIgnoreCase("5")){
           name.setText("Golden Pyramids Inn");
            src_image.setImageResource(R.drawable.golden_pyramids_inn);
            mTextView.setText("Located in Cairo, 984 feet from Great Sphinx, Golden Pyramids Inn features a terrace and views of the city.");
           map = "https://www.google.com/maps/place/Golden+Pyramids+Inn/@29.9759774,31.1439423,17z/data=!3m1!4b1!4m8!3m7!1s0x145845e40870304b:0xa0007d82641a55b3!5m2!4m1!1i2!8m2!3d29.9759728!4d31.1417536";
           phone ="01150091300";
           site ="https://www.booking.com/hotel/eg/golden-pyramids-inn-giza1.ar.html";

       }else if(message.equalsIgnoreCase("6")){
           name.setText("Victory Of Downtown Hotel");
            src_image.setImageResource(R.drawable.victory_of_downtown_hotel);
            mTextView.setText("Boasting a bar and a terrace, Victory Of Downtown Hotel is located in Cairo, 0.7 mi from Khan Al Khalili and 0.7 mi from Tahrir Square. ");
           map = "https://www.google.com/maps/place/Victory+Of+Downtown+Hotel/@30.0493849,31.2486037,17z/data=!3m1!4b1!4m8!3m7!1s0x145841986d1a21f7:0x405fd2581e0aafd9!5m2!4m1!1i2!8m2!3d30.0493803!4d31.246415";
           phone ="01017663243";
           site ="https://victory-of-downtown-hotel.business.site/?utm_source=gmb&utm_medium=referral";

       }else if(message.equalsIgnoreCase("7")){
           name.setText("Pyramids Hills Inn");
            src_image.setImageResource(R.drawable.pyramids_hills_inn);
            mTextView.setText("Located within 1969 feet of Great Sphinx and less than 0.6 mi of Giza Pyramids, Pyramids Hills Inn offers rooms with air conditioning and a private bathroom in Cairo. ");
           map = "https://www.google.com/maps/place/Pyramids+Hills+inn/@29.9778828,31.1454178,17z/data=!3m1!4b1!4m8!3m7!1s0x14584593c91905a3:0xac01b4fe3bc1d6dd!5m2!4m1!1i2!8m2!3d29.9778782!4d31.1432291";
           phone ="01125032937";
           site ="https://www.booking.com/hotel/eg/pyramids-hills.ar.html";

       }else if(message.equalsIgnoreCase("8")){
           name.setText("Steigenberger Hotel El Lessan");
            src_image.setImageResource(R.drawable.steigenberger_hotel_ellessan);
            mTextView.setText("Facing the beachfront, Steigenberger Hotel El Lessan offers 5-star accommodations in Ras El Bar and has a restaurant, bar and private beach area. ");
            map = "https://www.google.com/maps/place/Steigenberger+Hotel+El+Lessan/@31.5245939,31.8447415,17z/data=!3m1!4b1!4m8!3m7!1s0x14f9f7324e550569:0x1665350d0779bd61!5m2!4m1!1i2!8m2!3d31.5245893!4d31.8425528";
            phone = "(057) 2535000";
            site = "https://www.steigenberger.com/en/hotels/all-hotels/egypt/damietta/steigenberger-hotel-el-lessan";
       }else {
           name.setText("Solymar Soma Beach");
            src_image.setImageResource(R.drawable.solymar_soma_beach);
            mTextView.setText("Set in Hurghada, less than 0.6 mi from Sentido Palm Royale Soma Bay, Solymar Soma Beach offers accommodations with a restaurant, free private parking, an outdoor swimming pool and a bar. ");
           map = "https://www.google.com/maps/place/Solymar+Soma+Beach/@26.8333686,33.9452236,17z/data=!3m1!4b1!4m8!3m7!1s0x144d731869d9d3b1:0x1e384e4978baf55d!5m2!4m1!1i2!8m2!3d26.8333638!4d33.9430349";
           phone ="(065) 3260921";
           site ="https://www.jazhotels.com/hoteldetail/62-egypt-hurghada-solymar-soma-beach";

       }

            ImageView i1 = (ImageView)findViewById(R.id.call_icon_image);
            i1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1 = new Intent(Intent.ACTION_DIAL);
                    i1.setData(Uri.parse("tel:"+phone));
                    if(i1.resolveActivity(getPackageManager()) != null) {
                        startActivity(i1);
                    }
                }
            });

            ImageView i2 = (ImageView)findViewById(R.id.web_search_image);
            i2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String info = site;
                    Intent i2 = new Intent(Intent.ACTION_WEB_SEARCH);
                    i2.putExtra(SearchManager.QUERY, info);
                    if (i2.resolveActivity(getPackageManager()) != null) {
                        startActivity(i2);
                    }
                }
            });

            ImageView i3 = (ImageView)findViewById(R.id.google_map_search_image);
            i3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri gmmIntentUri = Uri.parse(map);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    if(mapIntent.resolveActivity(getPackageManager()) != null)
                    {
                        startActivity(mapIntent);
                    }

                }
            });

            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
}