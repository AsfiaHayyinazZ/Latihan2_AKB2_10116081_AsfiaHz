package com.example.latihan2_akb2_10116081_asfia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostThere extends AppCompatActivity {
        Button btnAlmost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        btnAlmost = (Button) findViewById(R.id.btnalmost);
        btnAlmost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlmostThere.this,VerifyAccount.class);
                startActivity(intent);
            }
        });
    }
}
