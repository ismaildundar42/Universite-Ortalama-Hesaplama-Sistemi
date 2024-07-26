package com.ismail.universitedersortalamahesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText vize;
    EditText finall;
    TextView txtNot;
    TextView txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vize = findViewById(R.id.vizetext);
        finall = findViewById(R.id.finaltext);
        txtNot = findViewById(R.id.lblNot);
        txtSonuc = findViewById(R.id.lblSonuc);
    }
    public void SonucHesapla(View view)
    {
        int vizepuan = Integer.parseInt(vize.getText().toString());
        int finalpuan = Integer.parseInt(finall.getText().toString());

        int sonuc = (int)(vizepuan*0.4 + finalpuan*0.6);

        if(sonuc<40)
        {
            txtNot.setText(String.valueOf(sonuc)+" -- FF");
            txtSonuc.setText("SONUÇ : BAŞARISIZ !");
        }
        if(sonuc>=40 && sonuc<=49)
        {
            txtNot.setText(String.valueOf(sonuc)+" -- DC");
            txtSonuc.setText("SONUÇ : BAŞARISIZ !");
        }
        else if(sonuc>=50 && sonuc<=57)
        {
            txtNot.setText(String.valueOf(sonuc)+" --  CC");
            txtSonuc.setText("SONUÇ : BAŞARILI !");
        }
        else if(sonuc>=58 && sonuc<=64)
        {
            txtNot.setText(String.valueOf(sonuc)+" --  BC");
            txtSonuc.setText("SONUÇ : BAŞARILI !");
        }
        else if(sonuc>=65 && sonuc<=73)
        {
            txtNot.setText(String.valueOf(sonuc)+" --  BB");
            txtSonuc.setText("SONUÇ : BAŞARILI !");
        }
        else if(sonuc>=74 && sonuc<=81)
        {
            txtNot.setText(String.valueOf(sonuc)+" --  BA");
            txtSonuc.setText("SONUÇ : BAŞARILI !");
        }
        else if(sonuc>=82 && sonuc<=100)
        {
            txtNot.setText(String.valueOf(sonuc)+" --  AA");
            txtSonuc.setText("SONUÇ : BAŞARILI !");
        }
    }
}