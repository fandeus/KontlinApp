package com.weather.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread
import java.nio.file.Files.find
import java.util.*


class MainActivity : AppCompatActivity() {

    private val mItems = listOf(
        "Mon	6/23	-	Sunny	-	31/17",
        "Tue	6/24	-	Foggy	-	21/8",
        "Wed	6/25	-	Cloudy	-	22/17",
        "Thurs	6/26	-	Rainy	-	18/11",
        "Fri	6/27	-	Foggy	-	21/10",
        "Sat	6/28	-	TRAPPED	IN	WEATHERSTATION	-	23/18",
        "Sun	6/29	-	Sunny	-	20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList: RecyclerView = this.find(R.id.recycler_view_forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(mItems)


        val url = "https://samples.openweathermap.org/data/2.5/forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1"
        doAsync {
            Request(url).run()
            uiThread {
                longToast("Request performed")
            }
        }


        val f1 = Forecast(Date(), 25.5f, "Sunday Day");
        val f2 = f1.copy(temperature = 30f)

        /*
        val i: Int = 7
        val d: Double = i.toDouble()

        val j = 12;
        val iHex = 0x0f;
        val l = 4L;
        val dl = 2.4;
        val f = 4.5f;

        val s = "TsetJava"
        val c = s[3]
        for (c in s) {
            print(c)
        }
        */
    }

    private fun addNumber(x: Int, y: Int): Int {
        return x + y;
    }

    private fun toast(message: String, type: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, type).show()
    }

}
