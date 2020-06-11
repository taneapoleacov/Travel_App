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
import com.example.travelapp.netwoking.WeatherResponse
import com.example.travelapp.netwoking.WeatherService
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CountryActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var weatherData: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)
        weatherData = findViewById(R.id.textView)
        findViewById<View>(R.id.button).setOnClickListener { getCurrentData() }

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

    private fun getCurrentData() {
        val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(WeatherService::class.java)
        val call = service.getCurrentWeatherData(lat, lon, AppId)
        call.enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                if (response.code() == 200) {
                    val weatherResponse = response.body()!!

                    val stringBuilder = "Country: " +
                            weatherResponse.sys!!.country +
                            "\n" +
                            "Temperature: " +
                            weatherResponse.main!!.temp +
                            "\n" +
                            "Temperature(Min): " +
                            weatherResponse.main!!.temp_min +
                            "\n" +
                            "Temperature(Max): " +
                            weatherResponse.main!!.temp_max +
                            "\n" +
                            "Humidity: " +
                            weatherResponse.main!!.humidity +
                            "\n" +
                            "Pressure: " +
                            weatherResponse.main!!.pressure

                    weatherData!!.text = stringBuilder
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                weatherData!!.text = t.message
            }
        })
    }

    companion object {

        var BaseUrl = "http://api.openweathermap.org/"
        var AppId = "848336f2bcd3adfd81c9a20a37c76bbd"
        var lat = "35"
        var lon = "139"
    }

}
