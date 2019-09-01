package com.example.suhudanpertambahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungLuas extends AppCompatActivity   {
private EditText editpanjang,editlebar;
private Button btnHasil;
private TextView txtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menghitung_luas);

        editpanjang = findViewById(R.id.edit_panjang);
        editlebar = findViewById(R.id.edit_lebar);

        txtHasil = findViewById(R.id.txtHasil);

        btnHasil = findViewById(R.id.btnHItung);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = editpanjang.getText().toString().trim();
                String lebar = editlebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p*l;

                txtHasil.setText("Hasil:" + luas);


            }
        });
    }
}
