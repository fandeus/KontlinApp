package com.weather.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.weather.app.date.Forecast
import com.weather.app.domain.RequestForecastCommand
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread
import java.nio.file.Files.find
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList: RecyclerView = this.find(R.id.recycler_view_forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)


        doAsync {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                forecastList.adapter = ForecastListAdapter(result)
            }
        }
    }

    private fun addNumber(x: Int, y: Int): Int {
        return x + y;
    }

    private fun toast(message: String, type: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, type).show()
    }

}
