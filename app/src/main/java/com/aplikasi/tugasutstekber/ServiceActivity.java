package com.aplikasi.tugasutstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn8 = new Intent(ServiceActivity.this,SyntaxServiceActivity.class);
                startActivity(btn8);
            }
        });
    }

    public void LinkService(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://medium.com/easyread/konsep-service-pada-android-4b37b2402a9e"));
        startActivity(browserIntent);
    }
}
