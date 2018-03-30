package thefirstchange.example.com.coolweather.gson;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 11401 on 2018/3/24.
 */

public class Weather{
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
   // public List<Now> nowList;
   /* public int describeContents(){
        return 0;
    }
    public void writeToParcel(Parcel out,int flags){
        out.writeString(status);
        out.writeParcelable(basic,0);
    }*/
}
