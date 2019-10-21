package com.aplikasi.tugasutstekber;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonService = findViewById(R.id.buttonService);
        Button buttonActivity = findViewById(R.id.buttonActivity);
        Button buttonIntent = findViewById(R.id.buttonIntent);
        Button buttonContentProviders = findViewById(R.id.buttonContentProvider);
        Button buttonBroadcastReceiver = findViewById(R.id.buttonBroadcastReceiver);

    }
        public void buttonService(View view){
            Intent intent = new Intent(MainActivity.this, ServiceActivity.class);
            startActivity(intent);
        }

        public void buttonActivity(View view){
            Intent intent = new Intent(MainActivity.this, ActivityActivity.class);
            startActivity(intent);
        }

        public void buttonIntent(View view){
            Intent intent = new Intent(MainActivity.this, IntentActivity.class);
            startActivity(intent);
        }

        public void buttonContentProviders(View view){
            Intent intent = new Intent(MainActivity.this, ContentProviderActivity.class);
            startActivity(intent);
        }

        public void buttonBroadcastReceiver(View view){
            Intent intent = new Intent(MainActivity.this, BroadcastReceiverActivity.class);
            startActivity(intent);
    }
}
