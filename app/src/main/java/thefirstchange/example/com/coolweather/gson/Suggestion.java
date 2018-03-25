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
    public Traval traval;
    public Drsg drsg;
    public Flu flu;
    public Uv uv;

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
    public class Traval{
        @SerializedName("txt")
        public String info;
        @SerializedName("brf")
        public String br;
    }
    public class Drsg{
    @SerializedName("txt")
    public String info;
    @SerializedName("brf")
    public String br;}
    public class Flu{
        @SerializedName("txt")
        public String info;
        @SerializedName("brf")
        public String br;
    }
    public class Uv{
        @SerializedName("txt")
        public String info;
        @SerializedName("brf")
        public String br;
    }
}
