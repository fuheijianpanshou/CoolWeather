package thefirstchange.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 11401 on 2018/3/24.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
        @SerializedName("brf")
        public String br;

    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
        @SerializedName("brf")
        public String br;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
        @SerializedName("brf")
        public String br;
    }
}
