package com.example.latihan2_akb2_10116081_asfia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Register extends AppCompatActivity {

    Button btnREGIS;
    ImageView btnBACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        btnREGIS = (Button) findViewById(R.id.btnregis);
        btnBACK = (ImageView) findViewById(R.id.btnkembali);

        btnREGIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,AlmostThere.class);
                startActivity(intent);
            }
        });


    }
}
