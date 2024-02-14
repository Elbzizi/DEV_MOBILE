package com.sup.p2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyActivity extends Activity {

    // equivalent de constructeur
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /*Button button = new Button(this);
        button.setText("Hello world");
        LinearLayout panneau = new LinearLayout(this);
        TextView text = new TextView(this);

        text.setText("salut");
        panneau.addView(button);
        panneau.addView(text);
        setContentView(panneau);
        */

    }
}
