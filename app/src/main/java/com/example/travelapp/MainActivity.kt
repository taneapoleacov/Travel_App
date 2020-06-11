package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapp.adapters.CountryAdapter
import com.example.travelapp.adapters.ExperienceAdapter
import com.example.travelapp.models.CountryItem
import com.example.travelapp.models.ExperienceItem
import kotlinx.android.synthetic.main.country_cell.*

class MainActivity : AppCompatActivity(), CountryAdapter.OnItemClickListener{

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    private lateinit var recyclerView1: RecyclerView
    private lateinit var viewAdapter1: ExperienceAdapter
    private lateinit var viewManager1: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        viewManager1 = LinearLayoutManager(this)
        viewAdapter = CountryAdapter(
            arrayListOf(
            CountryItem(
                "Italy",
                "https://images.unsplash.com/photo-1529154036614-a60975f5c760?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3910&q=80",
                "Italy, a European country with a long Mediterranean coastline, has left a powerful mark on Western culture and cuisine. Its capital," +
                        " Rome, is home to the Vatican as well as landmark art and ancient ruins."
            ),
            CountryItem(
                "France",
                "https://images.unsplash.com/photo-1499856871958-5b9627545d1a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1907&q=80",
                "France, in Western Europe, encompasses medieval cities, alpine villages and Mediterranean beaches. Paris, its capital, is famed for " +
                        "its fashion houses, classical art museums including the Louvre and monuments like the Eiffel Tower. "
            ),
            CountryItem(
                "Australia",
                "https://images.unsplash.com/photo-1524293581917-878a6d017c71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80",
                "Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the " +
                        "island of Tasmania, and numerous smaller islands. "
            ),
            CountryItem(
                "China",
                "https://images.unsplash.com/photo-1547981609-4b6bfe67ca0b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80",
                "China, officially the People's Republic of China, is a country in East Asia. It is the world's most populous country, with a " +
                        "population of around 1.4 billion in 2019. "
            ),
            CountryItem(
                "Brazil",
                "https://images.unsplash.com/photo-1483729558449-99ef09a8c325?ixlib=rb-1.2.1&auto=format&fit=crop&w=2100&q=80",
                "Brazil, officially the Federative Republic of Brazil, is the largest country in both South America and Latin " +
                        "America. At 8.5 million square kilometers and with over 211 million people, Brazil is the world's fifth-largest country " +
                        "by area and the sixth most populous."
            ),
            CountryItem(
                "Croatia",
                "https://images.unsplash.com/photo-1414862625453-d87604a607e4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2389&q=80"
                ,
                "bla bla"
            ),
            CountryItem(
                "Iceland",
                "https://images.unsplash.com/photo-1476610182048-b716b8518aae?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2254&q=80"
                ,
                "bla bla"
            ),
            CountryItem(
                "Sweden",
                "https://images.unsplash.com/photo-1497217968520-7d8d60b7bc25?ixlib=rb-1.2.1&auto=format&fit=crop&w=2100&q=80"
                ,
                "bla bla"
            ),
            CountryItem(
                "Canada",
                "https://images.unsplash.com/photo-1493246507139-91e8fad9978e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80"
                ,
                "bla bla"
            ),
            CountryItem(
                "Indonesia",
                "https://images.unsplash.com/photo-1513415756790-2ac1db1297d0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1867&q=80"
                ,
                "bla bla"
            ),
            CountryItem(
                "Mongolia",
                "https://images.unsplash.com/photo-1553267870-e92627117826?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2104&q=80"
                ,
                "bla bla"
            ),
            CountryItem(
                "Chile",
                "https://images.unsplash.com/photo-1494783435443-c15feee0a80a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2102&q=80"
                ,
                "bla bla"
            ),
            CountryItem(
                "Czech Republic",
                "https://images.unsplash.com/photo-1563913801192-bcefb1bb7651?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80"
                ,
                "bla bla"
            )
        ),this)

        viewAdapter1 = ExperienceAdapter(arrayOf(
            ExperienceItem(
                "Wine Tasting",
                "https://images.unsplash.com/photo-1513618827672-0d7c5ad591b1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80"
            ),
            ExperienceItem(
                "Cooking",
                "https://images.unsplash.com/photo-1513135557534-682d53fd7046?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2249&q=80"
            ),
            ExperienceItem(
                "Rooftop Views",
                "https://images.unsplash.com/photo-1583411545815-20c030328e49?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2106&q=80"
            ),
            ExperienceItem(
                "China",
                "https://images.unsplash.com/photo-1547981609-4b6bfe67ca0b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80"
            ),
            ExperienceItem(
                "Brazil",
                "https://images.unsplash.com/photo-1483729558449-99ef09a8c325?ixlib=rb-1.2.1&auto=format&fit=crop&w=2100&q=80"
            ),
            ExperienceItem(
                "Croatia",
                "https://images.unsplash.com/photo-1414862625453-d87604a607e4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2389&q=80"
            ),
            ExperienceItem(
                "Iceland",
                "https://images.unsplash.com/photo-1476610182048-b716b8518aae?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2254&q=80"
            ),
            ExperienceItem(
                "Sweden",
                "https://images.unsplash.com/photo-1497217968520-7d8d60b7bc25?ixlib=rb-1.2.1&auto=format&fit=crop&w=2100&q=80"
            ),
            ExperienceItem(
                "Canada",
                "https://images.unsplash.com/photo-1493246507139-91e8fad9978e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80"
            ),
            ExperienceItem(
                "Indonesia",
                "https://images.unsplash.com/photo-1513415756790-2ac1db1297d0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1867&q=80"
            ),
            ExperienceItem(
                "Mongolia",
                "https://images.unsplash.com/photo-1553267870-e92627117826?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2104&q=80"
            ),
            ExperienceItem(
                "Chile",
                "https://images.unsplash.com/photo-1494783435443-c15feee0a80a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2102&q=80"
            ),
            ExperienceItem(
                "Czech Republic",
                "https://images.unsplash.com/photo-1563913801192-bcefb1bb7651?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2100&q=80"
            )
        ))

        recyclerView = findViewById<RecyclerView>(R.id.country_recycler_view).apply {

            layoutManager = viewManager

            adapter = viewAdapter
        }


        recyclerView1 = findViewById<RecyclerView>(R.id.experience_recycler_view).apply {

            layoutManager = viewManager1

            adapter = viewAdapter1
        }

    }

    override fun onItemClick(country: CountryItem) {
        // send data to detailed activity

        var intent = Intent(this@MainActivity,CountryActivity::class.java)
        intent.putExtra("header", country.header)
        intent.putExtra("description",country.description)
        intent.putExtra("image",country.image)
        startActivity(intent)
        finish()
    }
}
