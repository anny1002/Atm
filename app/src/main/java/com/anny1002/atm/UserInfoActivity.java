package com.anny1002.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void getInfo(View view){
        EditText edName = (EditText) findViewById(R.id.ed_name);
        EditText edPhone = (EditText) findViewById(R.id.ed_phone);
        String name = edName.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("EXTRA_NAME",name);
        getIntent().putExtra("EXTRA_PHONE",phone);
        setResult(RESULT_OK,getIntent());
        finish();
    }
}
