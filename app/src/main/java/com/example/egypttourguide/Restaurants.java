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

public class Restaurants extends AppCompatActivity {

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
        setContentView(R.layout.activity_restaurants);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        src_image = (ImageView)findViewById(R.id.src_image);
        mTextView = (TextView) findViewById(R.id.summary);
        name = (TextView) findViewById(R.id.name);
        if(message.equalsIgnoreCase("0")){
            name.setText("Le Pacha 1901");
            src_image.setImageResource(R.drawable.lepache);
            src_image.getLayoutParams().height = 590;
            mTextView.setText("Location: Zamalek\n" +
                    "Dress code: smart casual\n" +
                    "Price range: 300-600 EGP per person\n" +
                    "Alcohol served: yes\n" +
                    "Nile view: yes\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "We’re starting off the list with the international award-winning Le Pacha because it’s technically not one, not two, but several great restaurants, all in one Nile-docked boat.\n" +
                    "\n" +
                    "Le Pacha offers 7 different restaurants and one bar/lounge/nightspot-ish venue. Our absolute favorites are: Carlo’s, where the menu is a mix of all different cuisines (including local Egyptian favorites) and you can order shisha; L’Asiatique, their pan-Asian restaurant which was voted 3rd best in Africa; and Piccolo Mondo, which is Italian overlooking the Nile. ");
            map = "https://www.google.com/maps/place/Le+Pacha+1901+%D9%85%D8%B1%D9%83%D8%A8+%D8%A7%D9%84%D8%A8%D8%A7%D8%B4%D8%A7+%D9%A1%D9%A9%D9%A0%D9%A1%E2%80%AD/@30.0519852,31.229947,17z/data=!3m1!4b1!4m5!3m4!1s0x145840dcbad063ed:0xeb449deffe198cd8!8m2!3d30.0519806!4d31.2277583";
            phone ="(02) 27356730";
            site ="http://www.lepacha.com/";

        }else if(message.equalsIgnoreCase("1")){
            name.setText("Abou El Sid");
            src_image.setImageResource(R.drawable.aboelsaid);
            src_image.getLayoutParams().height = 700;
            mTextView.setText("Location: Zamalek, Heliopolis, 6th of October and Tagamo’a.\n" +
                    "Dress code: casual\n" +
                    "Price range: 200-500 EGP per person\n" +
                    "Alcohol served: yes\n" +
                    "Nile view: no\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "Abou El Sid is the must-go-to restaurant if you want classic Egyptian dishes in a super ambient atmosphere (the decor, music, and wall art is enough to make it worth it). They also offer shisha and Egyptian twists on alcoholic cocktails, like vodka with fresh sugarcane juice. \n" +
                    "\n" +
                    "Dishes of theirs that are definitely worth trying: the sharqisseya, a chicken dish with walnut sauce; stuffed vine leaves; the Egyptian moussaka, which is an eggplant stew served with rice; and a mix and match of all their various Egyptian mezzes. Drool. ");
            map = "https://www.google.com/maps/place/%D8%A7%D8%A8%D9%88+%D8%A7%D9%84%D8%B3%D9%8A%D8%AF%E2%80%AD/@30.0594302,31.2263904,17z/data=!3m1!4b1!4m5!3m4!1s0x145840eb2c0e580f:0x25aa349178187545!8m2!3d30.0594217!4d31.2242096";
            phone ="(02) 27359640";
            site ="http://www.abouelsid.com/";
        }else if(message.equalsIgnoreCase("2")){
            name.setText("Koshary Abou Tarek");
            src_image.setImageResource(R.drawable.abotarek);
            src_image.getLayoutParams().height = 800;
            mTextView.setText("Location: Downtown\n" +
                    "Dress code: casual\n" +
                    "Price range: Less than 10 EGP per person\n" +
                    "Alcohol served: no\n" +
                    "Nile view: no\n" +
                    "Vegan & vegetarian options available: koshary itself is vegan, so a resounding yes\n" +
                    "\n" +
                    "This restaurant is by no means fancy, no means ambient, and by no means a romantic dining destination (unless your idea of romance is very very quirky, and in that case, rock on). \n" +
                    "\n" +
                    "Koshary Abou Tarek is a brightly-lit, fast-foodish type of restaurant in Downtown, and it’s known for having some of the *best* koshary in town. \n" +
                    "\n" +
                    "What is koshary, you may ask? \n" +
                    "\n" +
                    "We’d be delighted to tell you. Koshary in one of Egypt’s proud national dishes, comprised of rice, macaroni, lentils, chickpeas and fried onions all topped with a garlicky tomato sauce.  While it might sound like a clusterf*ck of ingredients, trust us when we say it’s the clusterf*ck you never knew you both needed and wanted in your life. ");
            map = "https://www.google.com/maps/place/%D9%83%D8%B4%D8%B1%D9%89+%D8%A7%D8%A8%D9%88+%D8%B7%D8%A7%D8%B1%D9%82%E2%80%AD/@30.050185,31.2399906,17z/data=!3m1!4b1!4m5!3m4!1s0x145840c0d951113d:0x3cd085938aad3157!8m2!3d30.05014!4d31.2377711";
            phone ="(02)25775935";
            site ="http://www.abutarek.com/";

        }else if(message.equalsIgnoreCase("3")){
            name.setText("Pier 88");
            src_image.setImageResource(R.drawable.pier);
            src_image.getLayoutParams().height = 715;
            mTextView.setText("Location: Zamalek\n" +
                    "Dress code: Smart casual\n" +
                    "Price range: 300-600 EGP per person\n" +
                    "Alcohol served: yes\n" +
                    "Nile view: yes\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "Pier 88 started as a restaurant/bar in the seaside town of El Gouna on the Red Sea, and its food and overall vibe became so popular that the owners decided to take the plunge and open up shop in Cairo. \n" +
                    "\n" +
                    "Pier 88 sits on the upper level of a docked boat in Zamalek overlooking the Nile, and during the day it’s one of those quietly sophisticated restaurants, complete with an open kitchen and drinks overlooking the water. \n" +
                    "\n" +
                    "At night it gets more of a nightlife feel to it, and reservations are recommended. On weekend nights the music gets turned up and there’s occasionally dancing by the tables (we don’t recommend eating when the dancing gets started, because you won’t find much room to wield your knife and fork). \n" +
                    "\n");
            map = "https://www.google.com/maps/place/Elite+Pyramids+Boutique+Hotel/@29.985341,31.1388445,17z/data=!3m1!4b1!4m8!3m7!1s0x14584510573c05a7:0xab666b76ee554679!5m2!4m1!1i2!8m2!3d29.9853364!4d31.1366558";
            phone ="0102 106 8267";
            site ="http://pier88group.com/";

        }else if(message.equalsIgnoreCase("4")){
            name.setText("Taboula");
            src_image.setImageResource(R.drawable.taboula);
            mTextView.setText("Location: Garden City\n" +
                    "Dress code: casual\n" +
                    "Price range: 200-500 EGP per person\n" +
                    "Alcohol served: yes\n" +
                    "Nile view: no\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "While Taboula has a branch in Zamalek, our local recommendation is to skip it and stick to its original branch in Garden City -- for some reason beyond our comprehension it’s vaaaaastly better. \n" +
                    "\n" +
                    "Taboula is a Lebanese restaurant with a warm, chill (can’t decide if that’s an oxymoron or not, but moving on) vibe in the heart of Garden City, close to the US and British embassies. They serve Egyptian wine and beer and also have good shisha, in case you’re not in the mood for a full meal and want to just puff at a waterpipe. \n" +
                    "\n" +
                    "Food-wise, Taboula is an awesome option for both lunch and dinner because you can pick and choose from their long list of cold and hot Lebanese mezze and main dishes. ");
            map = "https://www.google.com/maps/place/%D8%A8%D9%8A%D9%8A%D8%B1+88+%D9%86%D9%87%D8%B1+%D8%A7%D9%84%D9%86%D9%8A%D9%84%E2%80%AD/@30.0529056,31.2289429,17z/data=!3m1!4b1!4m5!3m4!1s0x145840dcc4f214ab:0x16f8f3fc6dc4b752!8m2!3d30.052901!4d31.2267542";
            phone ="01208111130";
            site ="http://portsaidmisrtravel.com/";

        }else if(message.equalsIgnoreCase("5")){
            name.setText("Olivo");
            src_image.setImageResource(R.drawable.olivo);
            src_image.getLayoutParams().height =715;
            mTextView.setText("Location: Zamalek, New Cairo, 6th October City\n" +
                    "Dress code: casual\n" +
                    "Price range: 200-400 EGP per person\n" +
                    "Alcohol served: yes\n" +
                    "Nile view: no\n" +
                    "Vegan & vegetarian options available: vegetarian options but no vegan options (unless you want to stick to a basic salad)\n" +
                    "\n" +
                    "Olivo is a cute little pizza bar hidden away in the New President Hotel in Zamalek. Emphasis being on the ‘little’, because this place has around 10 tables in total, so it’s worth calling ahead to book a table unless you’re a reservation daredevil (in the case that you are and there’s no tables available, you can hit up neighboring restaurants Mezcal or Crave). They also have another branch in New Cairo and 6th October if you're out in the 'burbs. \n" +
                    "\n" +
                    "Their menu is mainly all pizzas, with a few salads, starters and desserts. Their red, pink & white sangria is always worth ordering too. \n" +
                    "\n" +
                    "Their pizza is thin-crust, with fresh ingredients and some of the best buffalo mozzarella found in Egypt. ");
            map = "https://www.google.com/maps/place/Olivo+Pizzeria+%26+Bar+(Zamalek)/@30.0673762,31.2217726,17z/data=!3m1!4b1!4m5!3m4!1s0x145840e2e01c5d55:0xe376e042df3ba96b!8m2!3d30.067367!4d31.2195537";
            phone ="01026444475";
            site ="https://m.facebook.com/OlivoPizzeria/?locale2=ar_AR";

        }else if(message.equalsIgnoreCase("6")){
            name.setText("Naguib Mahfouz Cafe");
            src_image.setImageResource(R.drawable.nagib_mahfouz);
            //src_image.requestLayout();
            src_image.getLayoutParams().height = 1075;
            mTextView.setText("Location: Khan el Khalili (Old Cairo)\n" +
                    "Dress code: casual\n" +
                    "Price range: 50-200 EGP per person\n" +
                    "Alcohol served: no\n" +
                    "Nile view: no\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "Deep in the famous Khan el Khalili market , is a little cafe slash restaurant slash shisha joint named after one of Egypt’s most beloved writers. \n" +
                    "\n" +
                    "The cafe is a nod to Egypt’s modern history (one has to be specific when referring to Egypt’s history, lest they think we’re talking about pharaohs and pyramids all the time). \n" +
                    "\n" +
                    "While you might be hesitant about eating in a restaurant in Khan el Khalili, rest assured that Naguib Mahfouz Cafe is run by Oberoi Hotels, and thus not only has AC but a kitchen you can trust. \n" +
                    "\n" +
                    "Make sure to try their shishas, myriad of fresh juices and desserts. ");
            map = "https://www.google.com/maps/place/%D9%85%D9%82%D9%87%D9%89+%D9%86%D8%AC%D9%8A%D8%A8+%D9%85%D8%AD%D9%81%D9%88%D8%B8%E2%80%AD/@30.0480672,31.2638072,17z/data=!3m1!4b1!4m5!3m4!1s0x1458409fe312f077:0x38ed746841b3f83!8m2!3d30.0480542!4d31.261615";
            phone ="(02) 25903788";
            site ="http://w.facebook.com/KhanElKhaliliRestaurantAndCafe/";

        }else if(message.equalsIgnoreCase("7")){
            name.setText("Crimson");
            src_image.setImageResource(R.drawable.crimson);
            src_image.getLayoutParams().height = 800;
            mTextView.setText("Location: Zamalek\n" +
                    "Dress code: smart casual\n" +
                    "Price range: 300-600 EGP per person (not including cocktails)\n" +
                    "Alcohol served: yes\n" +
                    "Nile view: yes\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "We don’t need to say much more than this: when Gloria Gaynor was in Cairo, she went to Crimson. And if the I Will Survive queen was feeling Crimson, chances are you will too. \n" +
                    "\n" +
                    "Crimson is on the roof of a Zamalek building overlooking the Nile, with both indoor and outdoor terrace seating. The view is spectacular and the food is nothing to sneeze at either. \n" +
                    "\n" +
                    "Their menu has a lot of great appetizers, pasta and grill dishes, and their cocktail list is one of Cairo’s more extensive. \n" +
                    "\n" +
                    "They also serve breakfast and brunch (they're one of the few restaurants in Cairo that open at 8 am), but their morning fare isn't as good as their evening fare.");

            map = "https://www.google.com/maps/place/Crimson+Clubhouse,+Cario,+Egypt./@30.0706928,31.2245493,17z/data=!3m1!4b1!4m5!3m4!1s0x145840fc78c6626b:0xfb69d680ce097d0!8m2!3d30.0706904!4d31.2224345";
            phone ="01275055555";
            site ="http://www.crimsoncairo.com/";

        }else if(message.equalsIgnoreCase("8")){
            name.setText("Tabla Luna");
            src_image.setImageResource(R.drawable.tabla_luna);
            src_image.getLayoutParams().height = 715;
            mTextView.setText("Location: Maadi\n" +
                    "Price range: 200-500 EGP per person\n" +
                    "Alcohol served: it’s BYOB\n" +
                    "Nile view: no\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "This Latin American restaurant deep in the heart of Maadi is a great choice if you’re craving some good meat or South American fusion flavors (and by fusion, we mean fusion -- one of our favorite dishes is called the Confused Argentinian, which is sweet potato gnocchi in a creamy roasted pepper spinach sauce). Their steak y Huancaina rib-eye is also a huge crowd-pleaser.\n" +
                    "\n" +
                    "Tabla Luna doesn’t serve alcohol but occasionally allow you to bring your own beer and wine (best to ask ahead of time before you go). Reservations are sometimes needed, depending on what time you’re going. ");
            map = "https://www.google.com/maps/place/Tabla+LUNA/@29.9622206,31.2790107,17z/data=!3m1!4b1!4m5!3m4!1s0x1458386d0228b2d9:0x7f84c8b79d66c23d!8m2!3d29.962216!4d31.2767962";
            phone = "(02) 25198403";
            site = "http://www.facebook.com/TablaLUNA.Cairo";
        }else {
            name.setText("Kebdet el Prince");
            src_image.setImageResource(R.drawable.elprince);
            src_image.getLayoutParams().height = 715;
            mTextView.setText("Location: Imbaba\n" +
                    "Price range: it really depends on what (and how much) you order, but it's affordable\n" +
                    "Alcohol served: no\n" +
                    "Nile view: no\n" +
                    "Vegan & vegetarian options available: yes\n" +
                    "\n" +
                    "Whether you're a local or a visitor who's an adventurous eater, Kebdet el Prince ('El Brens' as we locals refer to it) is a must-go at least once. \n" +
                    "\n" +
                    "This restaurant is not fancy nor in a trendy neighborhood, but as a testament to how good their food is, the place is PACKED. Like, all the time. \n" +
                    "\n" +
                    "Kebdet el Prince (which translates to 'the prince of liver') is the darling of both regular Egyptian locals and Egyptian celebrities alike, because of their hardcore, homestyle Egyptian  menu, full of traditional favorites that you'd have a hard time finding anywhere else but an Egyptian grandma's kitchen. \n" +
                    "\n" +
                    "The restaurant is open until the early hours of the morning, and seating is first come, first serve (the restaurant is basically rows and rows of sidewalk tables). You get there, place your order, eat until you're blue in the face, and then make room for the next hungry customer. \n" +
                    "\n" +
                    "Their menu is not for the faint-hearted visitor to Egypt, but it'll be an experience you won't forget.");
            map = "https://www.google.com/maps/place/Kebdet+El+Prince/@30.0672942,31.2091799,17z/data=!3m1!4b1!4m5!3m4!1s0x145840bfc32e39ff:0x450f35610441140e!8m2!3d30.0672896!4d31.2069912";
            phone ="(02) 33116265";
            site ="https://m.facebook.com/KebdetElprince/";

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