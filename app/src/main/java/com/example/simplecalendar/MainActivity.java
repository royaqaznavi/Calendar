package com.example.simplecalendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView card = findViewById(R.id.card);
         card.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this , "JANUARY!" , Toast.LENGTH_LONG).show();
             }
         });

        CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "FEBRUARY!" , Toast.LENGTH_LONG).show();
            }
        });

        CardView card3 =findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "MARCH!" , Toast.LENGTH_LONG).show();
            }
        });

        CardView card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "APRIL!" , Toast.LENGTH_LONG).show();
            }
        });

        CardView card5 = findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "MAY!" , Toast.LENGTH_LONG).show();
            }
        });

        CardView card6 = findViewById(R.id.card6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "JUNE!" , Toast.LENGTH_LONG).show();
            }
        });

        VideoView video = findViewById(R.id.video);
        String url = "https://saednews.com/storage/media-center/videos/ac-video-IV15491932866x.mp4";
        video.setMediaController(new MediaController(MainActivity.this));
        video.setVideoURI(Uri.parse(url));
        video.start();


        WebView web = findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.teamup.com/");
    }


}

