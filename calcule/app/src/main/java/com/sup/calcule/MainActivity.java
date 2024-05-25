package com.sup.calcule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt_prenom=(EditText) findViewById(R.id.txt_prenom);
        EditText txt_nom=(EditText) findViewById(R.id.txt_nom);
        Button btn_afficher=(Button) findViewById(R.id.btn_afficher);
        TextView txt=(TextView) findViewById(R.id.txt_affichage);





    }
}