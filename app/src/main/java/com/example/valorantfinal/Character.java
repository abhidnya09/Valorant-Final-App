package com.example.valorantfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

public class Character extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_character);

    }
    public void nextSova(View view){
        Intent intent = new Intent(this,Sova.class);
        startActivity(intent);
        Log.d("Sova","I am the Hunter");
    }
    public void nextJett(View v){
        Intent intent = new Intent(this,jett.class);
        startActivity(intent);
        Log.d("Jett","Watch This");
    }
    public void nextReyna(View v){
        Intent intent = new Intent(this,Reyna.class);
        startActivity(intent);
        Log.d("Reyna","HAA HAA HA");
    }
}