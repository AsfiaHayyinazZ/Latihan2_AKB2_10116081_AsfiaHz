package com.example.latihan2_akb2_10116081_asfia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifyAccount extends AppCompatActivity {
    Button btnverify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
        btnverify = (Button) findViewById(R.id.btnverify);
        btnverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyAccount.this,UserHome.class);
                startActivity(intent);
            }
        });

    }
}
