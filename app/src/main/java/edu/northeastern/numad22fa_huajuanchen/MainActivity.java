package edu.northeastern.numad22fa_huajuanchen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_aboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_aboutMe = (Button) findViewById(R.id.button_aboutMe);

        btn_aboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Name: Huajuan Chen; Email: chen.huaj@gnortheastern.edu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}