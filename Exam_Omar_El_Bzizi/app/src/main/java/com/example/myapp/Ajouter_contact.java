package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapp.model.Contact;
import com.example.myapp.model.ContactManager;

public class Ajouter_contact extends AppCompatActivity {
    public EditText nameEditText,phoneEditText;
    public Button insertButton,goToButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_contact);
        nameEditText = findViewById(R.id.nom);
        phoneEditText = findViewById(R.id.tel);
        insertButton = findViewById(R.id.ajouter);
        goToButton = findViewById(R.id.list);

        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                Contact c = new Contact(name,phone);
                ContactManager.addContact(c);
                nameEditText.setText("");
                phoneEditText.setText("");
            }
        });

        goToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ajouter_contact.this, List_contact.class);
                startActivity(intent);
                /// finish();
            }
        });

    }
}