package com.example.administrator.caidanlan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.MapView;

public class MainActivity extends AppCompatActivity {
MapView mapView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView=(MapView)findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        AMap aMap=null;
        if (aMap == null) {
            aMap = mapView.getMap();
        }
    }
}
