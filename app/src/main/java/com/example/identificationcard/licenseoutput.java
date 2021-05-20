package com.example.identificationcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class licenseoutput extends AppCompatActivity {
    TextView displayInfo, displayInfo1;
    ImageView defaultImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licenseoutput);

        displayInfo= findViewById(R.id.displayInfo);
        displayInfo1= findViewById(R.id.displayInfo1);
        defaultImage = findViewById(R.id.imageView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String add = intent.getStringExtra("ADD");
        String birth = intent.getStringExtra("BIRTH");
        String sex = intent.getStringExtra("SEX");
        String height = intent.getStringExtra("HEIGHT");
        String weight = intent.getStringExtra("WEIGHT");
        String nationality = intent.getStringExtra("NATIONALITY");
        String info = "NAME (LN, FN MI)\n" + name;
        String info1 = "ADDRESS\n" + add + "\nBIRTH DATE  SEX  HT.(cm)  WT.(kg)  NATIONALITY\n" + birth + "       " + sex + "     "+
                height+ "          " + weight + "             " + nationality;
        displayInfo.setText(info);
        displayInfo1.setText(info1);
        defaultImage.setImageResource(R.drawable.picturee);

    }
}
