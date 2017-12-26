package com.anny1002.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {

    private EditText edName;
    private EditText edPhone;
    private Spinner ages;
    private final String TAG =  "";
    private Button b_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ages = (Spinner) findViewById(R.id.ages);
        ArrayList<String> data = new ArrayList<>();
        for (int i =15 ;i <= 40 ;i++){
            data.add(i+"");
        }
        ArrayAdapter adapter = new ArrayAdapter(
                this,android.R.layout.simple_expandable_list_item_1,data
        );
        ages.setAdapter(adapter);
        Log.d(TAG, "onCreate: ");
        edName = (EditText) findViewById(R.id.ed_name);
        edPhone = (EditText) findViewById(R.id.ed_phone);
        String edname = getSharedPreferences("info",MODE_PRIVATE).getString("Name","");
        String edphone = getSharedPreferences("info",MODE_PRIVATE).getString("Phone","");
        edName.setText(edname);
        edPhone.setText(edphone);

    }
    public void getInfo(View view){
        String name = edName.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("EXTRA_NAME",name);
        getIntent().putExtra("EXTRA_PHONE",phone);
        setResult(RESULT_OK,getIntent());
        finish();
    }
    public void address(View view){
        startActivity(new Intent(this,CityActivity.class));

    }
}
