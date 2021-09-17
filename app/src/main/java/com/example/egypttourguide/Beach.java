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

public class Beach extends AppCompatActivity {

    private TextView mTextView;
    private TextView name;
    private ImageView src_image;
    private String map;

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
        setContentView(R.layout.activity_beach);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        src_image = (ImageView)findViewById(R.id.src_image);
        mTextView = (TextView) findViewById(R.id.summary);
        name = (TextView) findViewById(R.id.name);
        if(message.equalsIgnoreCase("0")){
            name.setText("Naama Bay");
            src_image.setImageResource(R.drawable.naama_bay);
            src_image.getLayoutParams().height = 590;
            mTextView.setText("One of Egypt's most famous sandy strips, Naama Bay's scoop of white-sand beach sits at the epicenter of Egypt's prime beach resort, Sharm el-Sheikh, on the Sinai Peninsula.\n" +
                    "\n" +
                    "Sun seekers from across Northern and Eastern Europe decamp here during the winter months to loll on sand lapped by the calm, aqua-blue waters of the Gulf of Aqaba and gaze out at the dusky jagged silhouette of Saudi Arabia's mountainous coastline in the distance.\n" +
                    "\n" +
                    "Before the beachgoers beelined here in vast numbers, Sharm el-Sheikh was already known for its scuba diving, with a multitude of coral reefs, including the world-class dive sites of Ras Mohammed National Park, within easy reach. Today, this makes it Egypt's top choice for a beach break with added underwater action. Both complete beginners and more experienced divers will find plenty of dive trips that cater to their level.\n" +
                    "\n" +
                    "You can snorkel just off Naama Bay itself, though more colorful reefs need to be accessed by boat. Behind the beach is Sharm el-Sheikh's lively, main resort area, with plenty of restaurants and cafés, as well as accommodation ranging from large resorts like the Movenpick Sharm El Sheikh, which sits on the northern clifftop overlooking the bay, to cozy midrange hotels such as Oonas Dive Club, with its friendly, family-run feel.\n" +
                    "\n" +
                    "The Naama Bay shoreline is split into separate private sections, owned by the resorts that line the shore. All of them offer full facilities for easygoing beach days, including restaurants, water sports operators, sun-loungers, and umbrellas");

            map = "https://www.google.com.eg/maps/place/%D8%AE%D9%84%D9%8A%D8%AC+%D9%86%D8%B9%D9%85%D8%A9%E2%80%AD/@27.9147013,34.3423176,20.63z/data=!4m5!3m4!1s0x145337874a9d678b:0x5196877e0aa024d0!8m2!3d27.9116973!4d34.3324244";

        }else if(message.equalsIgnoreCase("1")){
            name.setText("Dahab Lagoon");
            src_image.setImageResource(R.drawable.dahab_lagoon);
            src_image.getLayoutParams().height = 590;
            mTextView.setText("First things first. Despite being perched along South Sinai's shoreline, central Dahab doesn't have much of a beach. The coastal strip here is mostly rock rather than sand. For an actual beach, head just to the south of the center to the sheltered bay known as Dahab Lagoon. This curved strip of golden sand edges the bay, backed by the craggy red-hued Sinai Mountain Range.\n" +
                    "\n" +
                    "While Dahab remains best known for its scuba diving opportunities (it is Egypt's top destination for learning to dive) and its backpacker-friendly choice of accommodation, the Lagoon area concentrates more on travelers who simply want to sloth out on the sand. It's home to Dahab's most luxurious places to stay, including the contemporary-styled Le Meridien Dahab Resort.\n" +
                    "\n" +
                    "If you do want to mix up your holiday with some more active pursuits though, don't worry. The Lagoon hotels all offer dive trips, and the Lagoon's beach is also a major kitesurfing destination, with water sports operators offering both equipment hire and week-long lesson packages.\n" +
                    "\n" +
                    "Off the beach, Dahab is a great destination for those looking for a more casual and local vacation scene. The central area is packed with cafés and restaurants built on the rocks that line the shorefront, and there are plenty of travel agencies specializing in excursions out into the desert beyond the beach, from camel rides and Bedouin dinners to ATV tours and jeep safaris.");

            map = "https://www.google.com.eg/maps/place/Dahab+Lagoon/@28.4754852,34.5020628,17z/data=!3m1!4b1!4m5!3m4!1s0x1454b4a853e2da0d:0x7920d026e09204d8!8m2!3d28.4754805!4d34.4998741";

        }else if(message.equalsIgnoreCase("2")){
            name.setText("El Gouna");
            src_image.setImageResource(R.drawable.elgouna);
            mTextView.setText("The purpose-built beach town of El Gouna, 27 kilometers north of Hurghada, was made for easygoing, family-friendly sun-and-sand vacations. El Gouna is dedicated to resort-style holidays that offer plenty of diversions off the beach for those who want to do more than soak up the sun, with stand up paddleboarding, kayaking, horse riding, and desert ATV tours all available, along with an 18-hole golf course.\n" +
                    "\n" +
                    "There are four main beach areas, including the wide swath of Mangroovy Beach, which is El Gouna's kitesurfing central, and the soft white sand of Zeytouna Beach, with its 400-meter-long jetty allowing you to stroll out to the deeper water where the coral reefs lie to conserve your energy for snorkeling.\n" +
                    "\n" +
                    "Most of the hotels here are large, low-slung resorts surrounded by mature gardens of palm trees that lead out to the beach, such as the Sheraton Miramar Resort, though there's a couple of smaller midrange options that focus on attracting visitors who've come here purely to kitesurf.\n" +
                    "\n" +
                    "Head here if you want to easily add a day trip to Luxor's famous Valley of the Kings and Temple of Karnak into your beach break or want to do some diving in the many reefs offshore from Hurghada.\n" +
                    "\n" +
                    "El Gouna's pastel-hued and immaculately manicured bijou town area is home to a range of cafés, shops, restaurants, and spas and often hosts family-focused entertainment in the evening.");

            map = "https://www.google.com.eg/maps/place/%D8%A7%D9%84%D8%AC%D9%88%D9%86%D8%A9%D8%8C+%D8%A7%D9%84%D8%BA%D8%B1%D8%AF%D9%82%D8%A9%D8%8C+%D8%A7%D9%84%D8%A8%D8%AD%D8%B1+%D8%A7%D9%84%D8%A3%D8%AD%D9%85%D8%B1%E2%80%AD/@27.3957716,33.6859709,13z/data=!3m1!4b1!4m5!3m4!1s0x1452667b76243569:0xcd29553adebe01a3!8m2!3d27.402484!4d33.6511438";

        }else if(message.equalsIgnoreCase("3")){
            name.setText("Ras Um Sid Beach");
            src_image.setImageResource(R.drawable.ras_um_sid_beach);
            mTextView.setText("Because the renowned Ras Um Sid reef, with its gorgonian forests, is just offshore, this is one of the best strips of sand in the Sharm el-Sheikh area for beach days that combine sun-soaked lounging with snorkeling.\n" +
                    "\n" +
                    "Sure, you'd need to head out on a dive trip to access the spectacular lower depths of the Ras Um Sid reef, but even snorkelers are able to see a myriad of soft corals and spot rainbow-hued, flitting reef fish close to the surface. It's no wonder then that this golden-sand beach, backed by a cliff, is a highly popular outing for visitors staying in the more central Naama Bay area.\n" +
                    "\n" +
                    "While here, don't miss hanging out for a while in the cliff-top Farsha Café, where the rambling terraces enjoy panoramic views. This is one of Sharm el-Sheikh's most beautiful spots to watch the sun set and the moon rise across the Gulf of Aqaba and Saudi Arabia beyond.");

            map = "https://www.google.com.eg/maps/place/Ras+Um+El+Sid/@27.848919,34.3133338,17z/data=!3m1!4b1!4m5!3m4!1s0x14533a6a8d0dbb51:0x72e99d764daa520e!8m2!3d27.8489143!4d34.3111451";

        }else if(message.equalsIgnoreCase("4")){
            name.setText("Nuweiba-Taba Coastline");
            src_image.setImageResource(R.drawable.nuwiba_taba);
            mTextView.setText("If you're looking for the simple life, far away from the bright lights of the resorts, the thin strips of beach that edge the coastline between Nuweiba and Taba in South Sinai could be for you. This is beach life that harks back to the days before the Sinai Peninsula's tourism boom. Facilities are few, and for those that head here, that's just the way they like it.\n" +
                    "\n" +
                    "Most camps consist of a main restaurant area, strewn with low cushioned sitting areas, where guests can order food and drink, and simple huts, made from date palm-fronds, that sit directly on the sand only steps from the lapping waves. Bathroom facilities are usually shared, and electricity in many is only available for a set number of hours daily.\n" +
                    "\n" +
                    "This is the perfect place for those seeking a digital detox for a few days to completely tune-out from life.");

            map = "https://www.google.com.eg/maps/place/%D8%B7%D8%A7%D8%A8%D8%A7%D8%8C+%D9%82%D8%B3%D9%85+%D9%86%D9%88%D9%8A%D8%A8%D8%B9%D8%8C+%D8%AC%D9%86%D9%88%D8%A8+%D8%B3%D9%8A%D9%86%D8%A7%D8%A1%E2%80%AD/@29.4934676,34.9002502,16z/data=!3m1!4b1!4m5!3m4!1s0x1500749b30665a07:0x1c94353b9ed186c!8m2!3d29.4924783!4d34.8968986";

        }else if(message.equalsIgnoreCase("5")){
            name.setText("Soma Bay");
            src_image.setImageResource(R.drawable.soma_bay);
            mTextView.setText("One of the most exclusive beaches in Egypt, the wide stretch of Soma Bay's white sand is backed by just five resort hotels dedicated to an all-inclusive, luxurious beach holiday experience, far away from any town bustle. The beach is only steps away from whichever resort you choose to stay at, meaning vacations here are all about serious relaxation and sandy bliss.\n" +
                    "\n" +
                    "With Hurghada 61 kilometers to the north, this is not the place to come if you like to pop into town, but beachgoers here still have plenty of options if they do feel like spending some time off the sand.\n" +
                    "\n" +
                    "Traveling families are well catered for, with plenty of regular entertainment events focused on kids, and the resorts have a full array of facilities, including water sports offices, which offer kitesurfing lessons, stand up paddleboarding, and diving and snorkeling boat trips.");

            map = "https://www.google.com.eg/maps/place/%D8%B0%D8%A7+%D9%88%D9%8A%D8%B3%D8%AA%D9%86+%D8%B3%D9%88%D9%85%D8%A7+%D8%A8%D8%A7%D9%89+%D8%AC%D9%88%D9%84%D9%81%D8%8C+%D8%B1%D9%8A%D8%B2%D9%88%D8%B1%D8%AA+%D8%A7%D9%86%D8%AF+%D8%B3%D8%A8%D8%A7%E2%80%AD/@26.8481933,33.9921794,17z/data=!3m1!4b1!4m8!3m7!1s0x144d71b8c6955555:0xc1648856bee55624!5m2!4m1!1i2!8m2!3d26.8481885!4d33.9899907";

        }else if(message.equalsIgnoreCase("6")){
            name.setText("Marsa Alam");
            src_image.setImageResource(R.drawable.marsa_alam);
            mTextView.setText("Marsa Alam, in the far south of Egypt's rambling Red Sea coastline (289 kilometers south of Hurghada), was the beach destination divers whispered about for years. While Hurghada, to the north, and Sharm el-Sheikh, on the Sinai Peninsula, became booming diving hot spots, regularly featuring on top ten lists for diving worldwide, Marsa Alam remained an obscure destination little known outside the diving community.\n" +
                    "\n" +
                    "The secret, though, is now firmly out, and the resorts have moved in to develop this long strip of coastline. For experienced divers, Marsa Alam is the best base to access the astonishing kaleidoscope-colored reefs of the Red Sea's far south, but the hotels now hugging the shore have snapped up the strips of white sand, meaning a vacation in Marsa Alam can now combine sun-lounging in resort comfort as well as diving.");

            map = "https://www.google.com.eg/maps/place/%D9%85%D8%B1%D8%B3%D9%89+%D8%B9%D9%84%D9%85%D8%8C+%D9%82%D8%B3%D9%85+%D9%85%D8%B1%D8%B3%D9%89+%D8%B9%D9%84%D9%85%D8%8C+%D8%A7%D9%84%D8%A8%D8%AD%D8%B1+%D8%A7%D9%84%D8%A3%D8%AD%D9%85%D8%B1%E2%80%AD/@25.0684889,34.9192078,13z/data=!3m1!4b1!4m5!3m4!1s0x15b4ea245c03b81d:0x51ad8e167c79ac32!8m2!3d25.0676256!4d34.8789697";

        }else if(message.equalsIgnoreCase("7")){
            name.setText("Taba");
            src_image.setImageResource(R.drawable.taba);
            mTextView.setText("The most northern of South Sinai's beach resort towns, Taba sits adjacent to Egypt's border crossing with Israel and so has been used for years by overland travelers. Taba itself, though, is worth a stop for its beach life.\n" +
                    "\n" +
                    "Lesser known than Sharm el-Sheikh, 215 kilometers to the south, the central Taba area has just one resort hotel plus the self-contained Taba Heights complex just to the south of Taba town. At Taba Heights, a handful of family-friendly all-inclusive resorts front swaths of white-sand beach looking out onto the calm waters of the Gulf of Aqaba.\n" +
                    "\n" +
                    "Diving is available, though it's better for beginners rather than experienced divers, and most people head here for relaxed sun-and-sand holidays rather than activities.");

            map = "https://www.google.com.eg/maps/place/%D8%B7%D8%A7%D8%A8%D8%A7%D8%8C+%D9%82%D8%B3%D9%85+%D9%86%D9%88%D9%8A%D8%A8%D8%B9%D8%8C+%D8%AC%D9%86%D9%88%D8%A8+%D8%B3%D9%8A%D9%86%D8%A7%D8%A1%E2%80%AD/@29.4934676,34.9002502,16z/data=!3m1!4b1!4m5!3m4!1s0x1500749b30665a07:0x1c94353b9ed186c!8m2!3d29.4924783!4d34.8968986";

        }else if(message.equalsIgnoreCase("8")){
            name.setText("Sahl Hasheesh");
            src_image.setImageResource(R.drawable.sahl_hasheesh);
            mTextView.setText("The sweeping bay of Sahl Hasheesh, 30 kilometers south of Hurghada, is a stunner, so it's no surprise that it battles it out with Soma Bay for number one place in Egypt for upscale beach vacation living. The wide stretch of soft white-sand beach, speckled with date palms, trails for the entire length of bay, backed by a handful of luxurious resorts and a purpose-built \"Old Town\" center providing shopping and eating options outside the resort gates.\n" +
                    "\n" +
                    "Facilities are top-notch, catering both to couples looking for a romantic getaway and families seeking a beach break. Diving, horse riding, and boat trips are the most popular things to do if you can manage to drag yourself off your patch of sand, and if you want to mix some history into your vacation, Luxor day trips are easily arranged.");

            map = "https://www.google.com.eg/maps/place/%D8%B3%D9%87%D9%84+%D8%AD%D8%B4%D9%8A%D8%B4%D8%8C+%D8%A7%D9%84%D8%BA%D8%B1%D8%AF%D9%82%D8%A9%D8%8C+%D8%A7%D9%84%D8%A8%D8%AD%D8%B1+%D8%A7%D9%84%D8%A3%D8%AD%D9%85%D8%B1%E2%80%AD/@27.0300051,33.9079207,13z/data=!3m1!4b1!4m5!3m4!1s0x144d7e92735e4d49:0xd050ef198ba82166!8m2!3d27.0369588!4d33.8522923";
        }else {
            name.setText("Makadi Bay");
            src_image.setImageResource(R.drawable.makadi_bay);
            mTextView.setText("Just 39 kilometers south of Hurghada, Makadi Bay is all about family-friendly beach vacations, with a bundle of large resort hotels, often offering good-value package deals and plentiful facilities (multiple swimming pools, nighttime entertainment, kids' clubs, and water parks) to attract families.\n" +
                    "\n" +
                    "The hotels here hug the bay and are each fronted by a strip of golden sand. The family theme continues onto the beach, where beach volleyball and beach football are offered, along with snorkeling and dive trips to see the Red Sea's famed reefs, while many staying here also choose to add some off-the-sand sightseeing into their beach time and head inland to Luxor's Pharaonic temples and tombs on day trips.\n" +
                    "\n" +
                    "As this is one of the Hurghada area's most well set up beach destinations, the beach can get crowded in the winter high season, with sun-loungers packed quite close together on the sand.");

            map = "https://www.google.com.eg/maps/place/Makadi+Bay,+%D8%A7%D9%84%D8%BA%D8%B1%D8%AF%D9%82%D8%A9%D8%8C+%D8%A7%D9%84%D8%A8%D8%AD%D8%B1+%D8%A7%D9%84%D8%A3%D8%AD%D9%85%D8%B1%E2%80%AD/@26.9817913,33.8996357,14z/data=!3m1!4b1!4m5!3m4!1s0x144d795ece54e42d:0x3452f607db5f794b!8m2!3d26.9886114!4d33.8996425";

        }


        ImageView i = (ImageView)findViewById(R.id.google_map_search_image);
        i.setOnClickListener(new View.OnClickListener() {
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