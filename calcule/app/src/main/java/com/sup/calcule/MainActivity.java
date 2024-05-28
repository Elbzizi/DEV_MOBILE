package com.sup.calcule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt_prenom=(EditText) findViewById(R.id.txt_prenom);
        EditText txt_nom=(EditText) findViewById(R.id.txt_nom);
        EditText txt_age=(EditText) findViewById(R.id.txt_age);
        Button btn_afficher=(Button) findViewById(R.id.btn_afficher);
        TextView txt=(TextView) findViewById(R.id.txt_affichage);
        Spinner sp=(Spinner) findViewById(R.id.spinner);

        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prenom=txt_prenom.getText().toString();
                String nom=txt_nom.getText().toString();
                Integer age= Integer.parseInt(txt_age.getText().toString());
                if(!prenom.equals("")&&!nom.equals("")){
               String message = "Bonjour "+prenom +" "+nom;
                txt.setText(message);

                    String[] matiere = {"info", "réseaux", "commerce", "droit"};
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, matiere);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sp.setAdapter(adapter);

                Toast.makeText(MainActivity.this, "Votre Age est :"+String.valueOf(age)+" ans", Toast.LENGTH_SHORT).show();
            }else{
                    Toast.makeText(MainActivity.this, "le prenom et nom est oblicatoire !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}