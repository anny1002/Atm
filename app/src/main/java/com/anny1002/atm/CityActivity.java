package com.anny1002.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] cities;
    private static final String TAG =CityActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView city = (ListView) findViewById(R.id.city);
        cities =new String[]{"基隆市","新北市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,cities);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String[] data =null;
        if (position ==0){
            data = new String[] {"中正區","暖暖區","八堵區"};
        }
        if (position ==1){
            data = new String[] {"永和區","板橋區","新莊區"};
        }
        if (position ==2){
            data = new String[] {"信義區","大安區","士林區"};
        }

    }

}
