package com.example.pasgenap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Bundle bundle;
    private TextView nama, nim, noHp, email;
    private String str_nama, str_nim, str_noHp, str_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = findViewById(R.id.nama_detail);
        nim = findViewById(R.id.nim_detail);
        noHp = findViewById(R.id.nomor_detail);
        email = findViewById(R.id.email_detil);

        bundle = getIntent().getExtras();
        if (bundle != null){
            str_nama = bundle.getString("nama");
            str_nim = bundle.getString("nim");
            str_noHp = bundle.getString("nohp");
            str_email = bundle.getString("email");
        }

        nama.setText(str_nama);
        nim.setText(str_nim);
        noHp.setText(str_noHp);
        email.setText(str_email);

    }
}