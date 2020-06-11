package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.adapters.CityAdapter
import com.example.travelapp.models.CityItem
import com.squareup.picasso.Picasso

class CountryActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)

        val back: ImageButton = findViewById(R.id.backToMain)
        back.setOnClickListener{
            startActivity(Intent(this@CountryActivity,MainActivity::class.java))
        }

        var header = intent.getStringExtra("header")
        var description = intent.getStringExtra("description")
        var image = intent.getStringExtra("image")

        var countryTitle:TextView = findViewById(R.id.item_header)
        var countryDescription:TextView = findViewById(R.id.country_description)
        var countryImage:ImageView = findViewById(R.id.country_main_image)

        countryTitle.text = header.toString()
        countryDescription.text = description.toString()
        Picasso.get().load(image).into(countryImage)


        viewManager = GridLayoutManager(this, 2)


        viewAdapter = CityAdapter(arrayOf(
            CityItem(
                "Rome",
                "https://images.unsplash.com/photo-1531572753322-ad063cecc140?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2110&q=80"
            ),
            CityItem(
                "Venice",
                "https://images.unsplash.com/photo-1520874628750-bed9c0a19086?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Florence",
                "https://images.unsplash.com/photo-1551801526-53c17182f88e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Milan",
                "https://images.unsplash.com/photo-1585854189634-9aaabcd884ed?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Naples",
                "https://images.unsplash.com/photo-1589304602025-df482503a5c1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Amalfi",
                "https://images.unsplash.com/photo-1578508462038-6582882a33c8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Rome",
                "https://images.unsplash.com/photo-1531572753322-ad063cecc140?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2110&q=80"
            ),
            CityItem(
                "Venice",
                "https://images.unsplash.com/photo-1520874628750-bed9c0a19086?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Florence",
                "https://images.unsplash.com/photo-1551801526-53c17182f88e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Milan",
                "https://images.unsplash.com/photo-1585854189634-9aaabcd884ed?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Naples",
                "https://images.unsplash.com/photo-1589304602025-df482503a5c1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Amalfi",
                "https://images.unsplash.com/photo-1578508462038-6582882a33c8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Rome",
                "https://images.unsplash.com/photo-1531572753322-ad063cecc140?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2110&q=80"
            ),
            CityItem(
                "Venice",
                "https://images.unsplash.com/photo-1520874628750-bed9c0a19086?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Florence",
                "https://images.unsplash.com/photo-1551801526-53c17182f88e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Milan",
                "https://images.unsplash.com/photo-1585854189634-9aaabcd884ed?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Naples",
                "https://images.unsplash.com/photo-1589304602025-df482503a5c1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Amalfi",
                "https://images.unsplash.com/photo-1578508462038-6582882a33c8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Rome",
                "https://images.unsplash.com/photo-1531572753322-ad063cecc140?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2110&q=80"
            ),
            CityItem(
                "Venice",
                "https://images.unsplash.com/photo-1520874628750-bed9c0a19086?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Florence",
                "https://images.unsplash.com/photo-1551801526-53c17182f88e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Milan",
                "https://images.unsplash.com/photo-1585854189634-9aaabcd884ed?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Naples",
                "https://images.unsplash.com/photo-1589304602025-df482503a5c1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Amalfi",
                "https://images.unsplash.com/photo-1578508462038-6582882a33c8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Rome",
                "https://images.unsplash.com/photo-1531572753322-ad063cecc140?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2110&q=80"
            ),
            CityItem(
                "Venice",
                "https://images.unsplash.com/photo-1520874628750-bed9c0a19086?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Florence",
                "https://images.unsplash.com/photo-1551801526-53c17182f88e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Milan",
                "https://images.unsplash.com/photo-1585854189634-9aaabcd884ed?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Naples",
                "https://images.unsplash.com/photo-1589304602025-df482503a5c1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            ),
            CityItem(
                "Amalfi",
                "https://images.unsplash.com/photo-1578508462038-6582882a33c8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=60"
            )
        ))

        recyclerView = findViewById<RecyclerView>(R.id.city_recycler_view).apply {

            layoutManager = viewManager

            adapter = viewAdapter
        }
    }


//    back.setOnClickListener(new View.OnClickListener(){
//        override fun onClick(v: View?) {
//
//        })


}
