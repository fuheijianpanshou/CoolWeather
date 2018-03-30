package thefirstchange.example.com.coolweather.gson;

/**
 * Created by 11401 on 2018/3/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
        public String qlty;
    }
}
