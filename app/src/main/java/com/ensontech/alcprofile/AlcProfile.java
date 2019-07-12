package com.ensontech.alcprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlcProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_profile);
        ImageView backStack=findViewById(R.id.back_stack);
        backStack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
