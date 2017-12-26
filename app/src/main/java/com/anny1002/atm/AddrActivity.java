package com.anny1002.atm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {

    private Spinner add;
    private Spinner spinner;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        spinner = (Spinner) findViewById(R.id.spinner2);
        add = (Spinner) findViewById(R.id.spinner3);
        final String [] data = {"基隆市","新北市","台北市"};
        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,data);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[] data1 =null;
                if (position ==0){
                    data1 = new String[] {"中正區","暖暖區","八堵區"};
                }
                if (position ==1){
                    data1 = new String[] {"永和區","板橋區","新莊區"};
                }
                if (position ==2){
                    data1 = new String[] {"信義區","大安區","士林區"};
                }
                ArrayAdapter adapter1 =new ArrayAdapter(AddrActivity.this,android.R.layout.simple_expandable_list_item_1,data1);
                add.setAdapter(adapter1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
