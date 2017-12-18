package com.anny1002.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    private EditText edName;
    private EditText edPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
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
}
