package com.aplikasi.tugasutstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn6 = new Intent(ActivityActivity.this,SyntaxActivityActivity.class);
                startActivity(btn6);
            }
        });
    }

    public void LinkActivity(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.petanikode.com/android-activity/"));
        startActivity(browserIntent);
    }
}
