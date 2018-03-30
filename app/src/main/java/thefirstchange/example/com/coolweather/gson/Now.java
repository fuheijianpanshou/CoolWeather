package thefirstchange.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 11401 on 2018/3/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("pres")
    public String pres;
    @SerializedName("vis")
    public String vis;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
        @SerializedName("wind_deg")
        public String deg;
        @SerializedName("wind_spd")
        public String spd;
        @SerializedName("wind_sc")
        public String sc;
        @SerializedName("wind_dir")
        public String dir;

}
