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

public class Place extends AppCompatActivity {

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
        setContentView(R.layout.activity_place);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        src_image = (ImageView)findViewById(R.id.src_image);
        mTextView = (TextView) findViewById(R.id.summary);
        name = (TextView) findViewById(R.id.name);
        if(message.equalsIgnoreCase("0")){
            name.setText("Pyramids of Giza");
            src_image.setImageResource(R.drawable.pyramids);
            src_image.getLayoutParams().height = 610;
            mTextView.setText("The last surviving of the Seven Wonders of the Ancient World, the Pyramids of Giza are one of the world's most recognizable landmarks.\n" +
                    "\n" +
                    "Having awed travelers down through the ages, these tombs of the Pharaohs Cheops (Khufu), Chephren (Khafre), and Mycerinus (Menkaure), guarded by the enigmatic Sphinx, are usually top of most visitor's lists of tourist attractions to see in Egypt and often the first sight they head to after landing.\n" +
                    "\n" +
                    "Today, sitting on the desert edge of Cairo's sprawl, these megalithic memorials to dead pharaohs are still as wondrous a sight as they ever were and an undeniable highlight of any Egypt trip. ");

            map = "https://www.google.com.eg/maps/place/Pyramids+of+Giza/@29.9739201,31.1442753,17z/data=!3m1!4b1!4m5!3m4!1s0x14584ff2faeb1be7:0x5575871d1b6a98e9!8m2!3d29.9739155!4d31.1420866?hl=ar";

        }else if(message.equalsIgnoreCase("1")){
            name.setText("Luxor's Karnak Temple and the Valley of the Kings");
            src_image.setImageResource(R.drawable.karnak);
            src_image.getLayoutParams().height = 580;
            mTextView.setText("Famed for the Valley of the Kings, Karnak Temple, and the Memorial Temple of Hatshepsut, the Nile-side town of Luxor in Upper Egypt has a glut of tourist attractions.\n" +
                    "\n" +
                    "This is ancient Thebes, power base of the New Kingdom pharaohs, and home to more sights than most can see on one visit.\n" +
                    "\n" +
                    "While Luxor's East Bank holds the modern city, with its vibrant souq; the two temples of Karnak and Luxor; and the museum; the West Bank's lush farmland and barren cliffs are where the vast majority of Luxor's tourist attractions sit, with so many tomb and temple sights that it has been called the biggest open-air museum in the world.\n" +
                    "\n" +
                    "Spend a few days here exploring the colorful wall art of the tombs and gazing in awe at the colossal columns in the temples, and you'll see why Luxor continues to fascinate historians and archaeologists.");

            map = "https://www.google.com.eg/maps/place/%D8%A7%D9%84%D9%83%D8%B1%D9%86%D9%83%E2%80%AD/@25.7188394,32.659459,17z/data=!3m1!4b1!4m5!3m4!1s0x1449159228fec0cd:0xc71ae8c008c259d8!8m2!3d25.7188346!4d32.6572703?hl=ar";

        }else if(message.equalsIgnoreCase("2")){
            name.setText("Siwa Oasis");
            src_image.setImageResource(R.drawable.siwa);
            mTextView.setText("Sitting in isolation, in the western corner of the Western Desert, Siwa is the tranquil tonic to the hustle of Egypt's cities.\n" +
                    "\n" +
                    "This gorgeous little oasis, surrounded by date palm plantations and numerous hot-water springs, is one of the Western Desert's most picturesque spots.\n" +
                    "\n" +
                    "Siwa town is centered around the ruins of a vast mud-brick citadel, known as the Fortress of Shali, which dominates the view, while various temple remnants, including the Temple of the Oracle where Alexander the Great is said to have come to receive advice, are scattered throughout the wider oasis area.\n" +
                    "\n" +
                    "This is a top spot to wind down and go slow for a few days, as well as being an excellent base from which to plan adventures into the surrounding desert.");

            map = "https://www.google.com.eg/maps/place/Wahat+Siwah/@29.1968645,25.5399652,15.83z/data=!4m5!3m4!1s0x147aaef8c649a39d:0x43c597bf7bfa09b7!8m2!3d29.1922222!4d25.5275?hl=ar";

        }else if(message.equalsIgnoreCase("3")){
            name.setText("Aswan");
            src_image.setImageResource(R.drawable.aswan);
            mTextView.setText("Egypt's most tranquil town is Aswan, set upon the winding curves of the Nile. Backed by orange-hued dunes, this is the perfect place to stop and unwind for a few days and soak up the chilled-out atmosphere.\n" +
                    "\n" +
                    "Take the river ferry across to Elephantine Island and stroll the colorful streets of the Nubian villages.\n" +
                    "\n" +
                    "Ride a camel to the desert monastery of St. Simeon on the East Bank. Or just drink endless cups of tea on one of the riverboat restaurants, while watching the lateen-sailed feluccas drift past.\n" +
                    "\n" +
                    "Make sure to jump aboard a felucca at sunset to sail around Aswan's islands. This is by far, Aswan's most popular activity and the most relaxing way to take in the local sights.\n" +
                    "\n" +
                    "There are plenty of historic sites here and numerous temples nearby, including Philae Temple on its island, but one of Aswan's most popular things to do is simply kicking back and watching the river life go by.");

            map = "https://www.google.com.eg/maps/place/%D8%A3%D8%B3%D9%88%D8%A7%D9%86%E2%80%AD/@24.0923728,32.9176158,14z/data=!3m1!4b1!4m5!3m4!1s0x14367b5ab1a30e5f:0xfb109fe337cabccb!8m2!3d24.088938!4d32.8998293?hl=ar";

        }else if(message.equalsIgnoreCase("4")){
            name.setText("Abu Simbel");
            src_image.setImageResource(R.drawable.abusimbel);
            mTextView.setText("Even in a country festooned with temples, Abu Simbel is something special. This is Ramses II's great temple, adorned with colossal statuary standing guard outside, and with an interior sumptuously decorated with wall paintings.\n" +
                    "\n" +
                    "Justly famous for its megalithic proportions, Abu Simbel is also known for the incredible engineering feat carried out by UNESCO in the 1960s, which saw the entire temple moved from its original setting to save it from disappearing under the rising water of the Aswan dam.\n" +
                    "\n" +
                    "Today, exploring Abu Simbel is just as much about admiring the triumph of this international effort to save the temple complex as it is about gaping in wonder at Ramses II's awe-inspiring building works, itself. ");

            map = "https://www.google.com.eg/maps/place/%D9%85%D8%B9%D8%A7%D8%A8%D8%AF+%D8%A3%D8%A8%D9%88+%D8%B3%D9%85%D8%A8%D9%84%E2%80%AD/@22.3372368,31.6279877,17z/data=!3m1!4b1!4m5!3m4!1s0x143aa988b126055b:0xa7d3cc6618f898d2!8m2!3d22.3372319!4d31.625799?hl=ar";

        }else if(message.equalsIgnoreCase("5")){
            name.setText("Egyptian Museum");
            src_image.setImageResource(R.drawable.egyption_museum);
            mTextView.setText("A treasure trove of the Pharaonic world, Cairo's Egyptian Museum is one of the world's great museum collections. The faded pink mansion in downtown Cairo is home to a dazzling amount of exhibits.\n" +
                    "\n" +
                    "It's a higgledy-piggledy place, with little labeling on offer and chronological order severely lacking, but that's half of its old-school charm.\n" +
                    "\n" +
                    "The museum's two highlight collections are the haul of golden treasures unearthed from Tutankhamen's tomb in the Valley of the Kings and the fascinating Royal Mummies exhibit room.\n" +
                    "\n" +
                    "Every corner you turn here, though, is home to some wonderful piece of ancient art or statuary that would form a highlight of any other museum.");

            map = "https://www.google.com.eg/maps/place/%D8%A7%D9%84%D9%85%D8%AA%D8%AD%D9%81+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%8A%E2%80%AD/@36.9364514,41.2007881,4z/data=!4m9!1m2!2m1!1sEgyptian+Museum!3m5!1s0x145841885535bec3:0x520da52b3a7a660f!8m2!3d30.0475781!4d31.2336139!15sCg9FZ3lwdGlhbiBNdXNldW2SAQZtdXNldW0?hl=ar";

        }else if(message.equalsIgnoreCase("6")){
            name.setText("Khan el-Khalili");
            src_image.setImageResource(R.drawable.khan);
            src_image.getLayoutParams().height = 540;
            mTextView.setText("Khan el-Khalili  is a famous bazaar and souq (or souk) in the historic center of Cairo, Egypt.\n " +
                    "Established as a center of trade in the Mamluk era and named for one of its several historic caravanserais.\n" +
                    " the bazaar district has since become one of Cairo's main attractions for tourists and Egyptians alike. It is also home to many Egyptian artisans and workshops involved in the production of traditional crafts and souvenirs. ");

            map = "https://www.google.com.eg/maps/place/%D8%AE%D8%A7%D9%86+%D8%A7%D9%84%D8%AE%D9%84%D9%8A%D9%84%D9%8A%E2%80%AD/@30.0477432,31.2644425,17z/data=!3m1!4b1!4m5!3m4!1s0x145840eb2c0e580f:0x1761e0e461027d11!8m2!3d30.0477386!4d31.2622538?hl=ar";
        }else if(message.equalsIgnoreCase("7")){
            name.setText("Abydos Temple");
            src_image.setImageResource(R.drawable.abydos);
            mTextView.setText("The Temple of Osiris in Abydos is one of Ancient Egypt's most fascinating artistic treasures.\n" +
                    "\n" +
                    "The temple, begun by Seti I, sits amid a vast necropolis site where archaeological excavations are ongoing. There a various other temple remnants to see here but for most visitors, the Temple of Osiris is the main reason to visit.\n" +
                    "\n" +
                    "Its hypostyle halls, graced by papyrus-headed columns, contain some of the finest relief-work in Egypt, with various scenes portraying the pharaoh and the gods of Ancient Egypt.\n" +
                    "\n" +
                    "As the temple lies north of Luxor, it isn't on the main Nile cruise ship route, so it receives much fewer visitors than the temple sites in Luxor itself and the Nile-side temples to the south. This means you are often lucky enough to wander through the temple's halls with only a few other visitors on site. ");

            map = "https://www.google.com.eg/maps/place/%D9%85%D8%B9%D8%A8%D8%AF+%D8%B3%D9%8A%D8%AA%D9%8A+%D8%A7%D9%84%D8%A3%D9%88%D9%84%D9%89%E2%80%AD/@26.1850592,31.921416,17z/data=!3m1!4b1!4m5!3m4!1s0x1448b54710e0aa7d:0xfb509b8fd0656902!8m2!3d26.1850544!4d31.9192273?hl=ar";

        }else if(message.equalsIgnoreCase("8")){
            name.setText("Saqqara");
            src_image.setImageResource(R.drawable.saqqara);
            mTextView.setText("Everyone's heard of Giza's Pyramids, but they're not the only pyramids Egypt has up its sleeve.\n" +
                    "\n" +
                    "Day-tripping distance from Cairo, Saqqara is a vast necropolis of tombs and pyramids that was utilized during every era of pharaonic rule.\n" +
                    "\n" +
                    "It's best known for its Old Kingdom Step Pyramid, which shows how the architects of Ancient Egypt advanced their engineering knowledge to finally create a true pyramid shape.\n" +
                    "\n" +
                    "There's much more to see beyond the Step Pyramid, though, with some of the surrounding tombs, such as the Mastaba of Ti, showcasing some of the finest tomb paintings you'll see in the country.\n" +
                    "\n" +
                    "Nearby, the pyramid site of Dahshur is home to the Red Pyramid and Bent Pyramid, which should be included on any Saqqara visit. ");

            map = "https://www.google.com.eg/maps/place/%D8%A7%D9%84%D9%87%D8%B1%D9%85+%D8%A7%D9%84%D9%85%D8%AF%D8%B1%D8%AC+%D9%84%D9%84%D9%85%D9%84%D9%83+%D8%B2%D9%88%D8%B3%D8%B1%E2%80%AD/@29.8713273,31.2187317,17z/data=!3m1!4b1!4m5!3m4!1s0x14584bd553b25c81:0x8c577a7fabef89d!8m2!3d29.8713227!4d31.216543?hl=ar";

        }else if(message.equalsIgnoreCase("9")){
            name.setText("White Desert");
            src_image.setImageResource(R.drawable.white_desert);
            mTextView.setText("\n" +
                    "\n" +
                    "Egypt's kookiest natural wonder is White Desert National Park, out in the Western Desert, just south of Bahariya Oasis.\n" +
                    "\n" +
                    "Here, surreally shaped chalk pinnacles and huge boulders loom over the desert plateau, creating a scene that looks like icebergs have found themselves stranded amid a landscape of sand.\n" +
                    "\n" +
                    "This highly scenic environment looks like something out of a science fiction movie and is a favorite destination for 4WD desert trips and overnight camping, which are both easiest organized in Bahariya Oasis.\n" +
                    "\n" +
                    "For desert fans and adventurers, this is the ultimate weird playground, while anybody who's had their fill of temples and tombs will enjoy this spectacular natural scenery.\n");

            map = "https://www.google.com.eg/maps/place/White+Desert/@27.3306811,28.1910467,17z/data=!3m1!4b1!4m5!3m4!1s0x1469919c247c8fa9:0x6298fc9f6ef78f7d!8m2!3d27.3306764!4d28.188858?hl=ar";

        }else {
            name.setText("St. Catherine's Monastery");
            src_image.setImageResource(R.drawable.st_catherine);
            mTextView.setText("One of the oldest monasteries in the world, St. Catherine's stands at the foot of Mount Sinai, amid the desert mountains of the Sinai Peninsula, where Moses is said to have received the Ten Commandments.\n" +
                    "\n" +
                    "This desert monastery is home to an incredible collection of religious iconography, art, and manuscripts (some of which can be seen in the on-site museum), as well as the burning bush.\n" +
                    "\n" +
                    "For most visitors here, a trip to St. Catherine's also involves a hike up Mount Sinai to see sunrise or sunset.\n" +
                    "\n" +
                    "Take the camel path for the easy route, or climb the famous Steps of Repentance if you want better views.");

            map = "https://www.google.com.eg/maps/place/%D8%AF%D9%8A%D8%B1+%D8%B3%D8%A7%D9%86%D8%AA+%D9%83%D8%A7%D8%AA%D8%B1%D9%8A%D9%86%E2%80%AD/@28.5559531,33.9782367,17z/data=!3m1!4b1!4m5!3m4!1s0x1454901def4fa789:0xc91f754605c6dadf!8m2!3d28.5559484!4d33.976048?hl=ar";
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