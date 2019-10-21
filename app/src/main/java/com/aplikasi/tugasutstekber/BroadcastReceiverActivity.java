package com.aplikasi.tugasutstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BroadcastReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);

        Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn14 = new Intent(BroadcastReceiverActivity.this,SyntaxBroadcastReceiverActivity.class);
                startActivity(btn14);
            }
        });
    }

    public void linkBroadcastReceiver(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.malasngoding.com/komponen-layout-android/"));
        startActivity(browserIntent);
    }
}
