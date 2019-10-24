package com.example.atividadepaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("PAA", "******** OnCreate chamado! ********");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("PAA", "******** OnStart chamado! ********");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i("PAA", "******** OnRestart chamado! ********");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.i("PAA", "******** OnPause chamado! ********");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("PAA", "******** OnStop chamado! ********");
        super.onStop();
    }


    public void chamaTela2(View view) {
        Intent tela2 = new Intent(this, Tela2Activity.class);
        startActivity(tela2);
    }
}
