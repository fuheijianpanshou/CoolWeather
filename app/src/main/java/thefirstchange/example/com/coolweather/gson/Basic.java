package thefirstchange.example.com.coolweather.gson;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 11401 on 2018/3/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
    /*public int describeContents(){
        return 0;
    }
    public void writeToParcel(Parcel out,int flags){
        out.writeString(cityName);
        out.writeString(weatherId);
        out.writeParcelable(update,0);
    }*/
}
