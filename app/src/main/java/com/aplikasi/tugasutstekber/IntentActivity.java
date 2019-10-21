package com.aplikasi.tugasutstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn10 = new Intent(IntentActivity.this,SyntaxIntentActivity.class);
                startActivity(btn10);
            }
        });
    }

    public void LinkIntent(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codepolitan.com/belajar-menggunakan-intent-sebuah-jembatan-interaksi-antar-komponen-599a5576271ef"));
        startActivity(browserIntent);
    }
}
