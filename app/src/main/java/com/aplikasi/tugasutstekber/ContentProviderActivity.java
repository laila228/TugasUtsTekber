package com.aplikasi.tugasutstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentProviderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider);

        Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn12 = new Intent(ContentProviderActivity.this,SyntaxContentProviderActivity.class);
                startActivity(btn12);
            }
        });
    }

    public void LinkContentProvider(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://farninuramalia.blogspot.com/2013/06/activities-service-intent-content.html"));
        startActivity(browserIntent);
    }
}
