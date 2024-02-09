package com.example.uygulama7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editTextYas,editTextmaas;
Button buttonKaydet;
TextView textViewsonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextYas=findViewById(R.id.editTextYas);
        buttonKaydet=findViewById(R.id.buttonKaydet);
        textViewsonuc=findViewById(R.id.textViewSonuc);
        editTextmaas=findViewById(R.id.editTextNumber);
        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas= Integer.parseInt(editTextYas.getText().toString());
                int maas=Integer.parseInt(editTextmaas.getText().toString());
                personel personel=new personel();
                personel.setYas(yas);
                personel.setMaas(maas);
                textViewsonuc.setText("yaş:"+personel.getYas()+" maaş:"+ personel.getMaas());



            }
        });
    }
}