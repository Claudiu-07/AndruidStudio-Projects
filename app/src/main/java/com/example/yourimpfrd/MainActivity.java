package com.example.yourimpfrd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button documentsBtn = (Button)findViewById(R.id.documentsBtn);
        documentsBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), documents.class);
                startIntent.putExtra("com.example.yourimpfrd.SOMETHING", "Hello world!");
                startActivity(startIntent);

            }
        });



        Button addBtn = (Button)findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), adding.class);
                startActivity(startIntent);
            }
        });

    }
}
