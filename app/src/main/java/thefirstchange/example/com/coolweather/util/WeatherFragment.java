package thefirstchange.example.com.coolweather.util;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import thefirstchange.example.com.coolweather.R;

/**
 * Created by 11401 on 2018/3/30.
 */

public class WeatherFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.weather_fragment,container,false);

    }
}
