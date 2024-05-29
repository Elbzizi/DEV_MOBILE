package com.sup.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     EditText etName;
     EditText etPhone;
     Button btnAdd;
     Button btnViewContacts;
     ArrayList<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        btnAdd = findViewById(R.id.btnAdd);
        btnViewContacts = findViewById(R.id.btnViewContacts);
        contactList = new ArrayList<Contact>();

        btnAdd.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String phone = etPhone.getText().toString();
            if (!name.isEmpty() && !phone.isEmpty()) {
                contactList.add(new Contact(name, phone));
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();.makeText(MainActivity.this, "Contact ajouté", Toast.LENGTH_SHORT).show();
                etName.setText("");
                etPhone.setText("");
            } else {
                Toast.makeText(MainActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
            }
        });

        btnViewContacts.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContactListActivity.class);
            intent.putParcelableArrayListExtra("contacts", contactList);
            startActivity(intent);
        });
    }
}