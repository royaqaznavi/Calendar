package com.example.simplecalendar;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class VazirClass extends AppCompatTextView{

    public VazirClass(Context context){
        super(context);
    }
    public VazirClass(Context context, AttributeSet attrs){
        super(context, attrs);
        Typeface vazir = Typeface.createFromAsset(context.getAssets(), "Vazir.ttf");
        this.setTypeface(vazir);
    }
}

