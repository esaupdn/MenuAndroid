package com.example.hub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.hub.Atividade1;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Atividade1.class);
            startActivity(intent);
        });

        Button bt2 = findViewById(R.id.bt2);
        bt2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Atividade2.class);
            startActivity(intent);
        });

        Button bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Atividade3.class);
            startActivity(intent);
        });
    }
}