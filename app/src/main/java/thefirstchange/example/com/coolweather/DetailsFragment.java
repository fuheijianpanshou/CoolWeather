package thefirstchange.example.com.coolweather;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import thefirstchange.example.com.coolweather.gson.Now;
import thefirstchange.example.com.coolweather.gson.Weather;

/**
 * Created by 11401 on 2018/3/27.
 */

public class DetailsFragment extends Fragment {

    private TextView windsDetailsTextView;
    private TextView windDesciibeTextView;
    private TextView windDataTextView;
    private LinearLayout windsDetailLayout;
    private TextView pressText;
    private TextView visibilityTextView;
    private String[] windStr;
    private ImageView bingImage;
    private Button backActivity;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.details_fragment,container,false);
        windsDetailLayout=(LinearLayout)view.findViewById(R.id.winds_details_layout);
        pressText=(TextView)view.findViewById(R.id.press_text);
        bingImage=(ImageView)view.findViewById(R.id.detail_bing_pic);
       backActivity=(Button)view.findViewById(R.id.datails_back_button);
        visibilityTextView=(TextView)view.findViewById(R.id.visibity_text);
        Bundle data=getArguments();
        windStr=data.getStringArray("wind");
        backActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });

        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        loadPic();
        showWeatherDetails();

    }
    private void showWeatherDetails(){

        String[] strings={"风速","风力等级","风向角度","风向方向"};
        String[] strings1={"km/h","级","rad"," "};
        String presText=windStr[4];
        String visText=windStr[5];
            for (int i=0;i<=3;i++){
            View view=LayoutInflater.from(getActivity()).inflate(R.layout.details_item,windsDetailLayout,false);
            windsDetailsTextView=(TextView)view.findViewById(R.id.winds_details);
            windDataTextView=(TextView)view.findViewById(R.id.wind_data);
            windDesciibeTextView=(TextView)view.findViewById(R.id.wind_describe);
            windsDetailsTextView.setText(strings[i]);
            windDataTextView.setText(windStr[i]);
            windDesciibeTextView.setText(strings1[i]);
            windsDetailLayout.addView(view);
        }
        pressText.setText(presText);
        visibilityTextView.setText(visText);

    }
    private void loadPic(){
        String bingPic;
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(getActivity());
        bingPic=preferences.getString("bing_pic","");
        Glide.with(getActivity()).load(bingPic).into(bingImage);
    }
}
