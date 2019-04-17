package com.example.latihan2_akb2_10116081_asfia;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Asfia Hayyinaz Zahro
    //10116081
    //IF-2
    //Change Log Selasa 16 APRIL 2019
    //1.membuat mainactivity jam 8.00
    //2.membuat register jam 10.00
    //
    //Rabu 17 April 2019
    //1. membuat almost there jam 10.00
    //2.membuat verify your acount jam 12.00
    //3.membuat user home jam 15.00

    EditText editUser, Password;
    Button btn_Login;
    TextView txtRegis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUser = (EditText) findViewById(R.id.edituser);
        Password = (EditText) findViewById(R.id.pass);
        btn_Login = (Button) findViewById(R.id.btn_login);
        txtRegis = (TextView) findViewById(R.id.txtregis);

        String txtregis = "Doesn't have any account ? Register";
        SpannableString spans = new SpannableString(txtregis);
        StyleSpan txtBold = new StyleSpan(Typeface.BOLD);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }

        };

        spans.setSpan(clickableSpan1, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spans.setSpan(txtBold, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtRegis.setText(spans);
        txtRegis.setMovementMethod(LinkMovementMethod.getInstance());

    }


}



