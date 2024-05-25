package com.sup.calcule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prenom=txt_prenom.getText().toString();
                String nom=txt_nom.getText().toString();
                txt.setText("Bonjour "+prenom +" "+nom);
            }
        });





    }
}