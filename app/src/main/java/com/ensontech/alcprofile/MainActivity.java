package com.ensontech.alcprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myProfile,aboutAlc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutAlc=findViewById(R.id.btn_about);
        myProfile=findViewById(R.id.btn_profile);
        
        aboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AboutAlc.class);
                startActivity(intent);
            }
        });
        
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AlcProfile.class);
                startActivity(intent);
                
            }
        });
    }
}
