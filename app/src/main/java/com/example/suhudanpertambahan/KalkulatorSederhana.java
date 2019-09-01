package com.example.suhudanpertambahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class KalkulatorSederhana extends AppCompatActivity implements View.OnClickListener {
    Button Tambah,Kurang,Kali,Bagi;
    EditText Teks1,Teks2,Teks3;

    Float bilangan1,bilangan2,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_sederhana);

        Teks1 = findViewById(R.id.textA);
        Teks2 = findViewById(R.id.txtB);
        Teks3 = findViewById(R.id.Edit_hasil);

        Tambah = findViewById(R.id.btnTambah);
        Kurang = findViewById(R.id.btnKurang);
        Kali = findViewById(R.id.btnKali);
        Bagi = findViewById(R.id.btnBagi);

        Tambah.setOnClickListener(this);
        Kurang.setOnClickListener(this);

        Kali.setOnClickListener(this);
        Bagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        bilangan1 = Float.parseFloat(Teks1.getText().toString());

        bilangan2 = Float.parseFloat(Teks2.getText().toString());

        switch (view.getId()){

            case R.id.btnTambah:
                hasil = bilangan1 + bilangan2;
                Teks3.setText(Float.toString(hasil));
                break;
            case R.id.btnKurang:
                hasil = bilangan1-bilangan2;
                Teks3.setText(Float.toString(hasil));
                break;
            case R.id.btnKali:
                hasil = bilangan1*bilangan2;
                Teks3.setText(Float.toString(hasil));
                break;
            case R.id.btnBagi:
                hasil = bilangan1/bilangan2;
                Teks3.setText(Float.toString(hasil));
                break;
        }

    }
}
