package com.jasjotsingh.slideanimationintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        overridePendingTransition(R.anim.in_from_left,R.anim.out_to_left);
        Button button = findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent =  new Intent(Main2Activity.this,MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
