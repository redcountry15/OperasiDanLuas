package com.example.suhudanpertambahan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btnTambah;
Button btnKalkul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTambah = findViewById(R.id.button1);
        btnKalkul = findViewById(R.id.button2);

        btnKalkul.setOnClickListener(this);
        btnTambah.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent niat = new Intent(MainActivity.this,MenghitungLuas.class);
                startActivity(niat);
                break;
            case R.id.button2:
                Intent niat2 = new Intent(MainActivity.this,KalkulatorSederhana.class);
                startActivity(niat2);
                startActivity(niat2);
        }
    }
}
