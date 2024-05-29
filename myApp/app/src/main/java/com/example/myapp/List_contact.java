package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapp.model.Contact;
import com.example.myapp.model.ContactManager;

import java.util.ArrayList;

public class List_contact extends AppCompatActivity {
    ListView lsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        lsv = findViewById(R.id.lsv);

        ArrayList<Contact> contactsList = ContactManager.getContacts();

        ArrayList<String> list = new ArrayList<>();

        for(Contact c : contactsList){
            list.add("nom : " + c.nom + " - tel : " + c.tel);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);

        lsv.setAdapter(adapter);
    }
}