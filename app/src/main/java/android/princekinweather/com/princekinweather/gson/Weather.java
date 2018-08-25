package android.princekinweather.com.princekinweather.gson;

import android.princekinweather.com.princekinweather.db.AQI;
import android.princekinweather.com.princekinweather.db.Basic;
import android.princekinweather.com.princekinweather.db.Forecast;
import android.princekinweather.com.princekinweather.db.Now;
import android.princekinweather.com.princekinweather.db.Suggestion;
import android.widget.ListView;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
