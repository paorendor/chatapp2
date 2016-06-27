package com.example.paorendor.newchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.paorendor.newchatapp.adapters.ContactAdapter;
import com.example.paorendor.newchatapp.pojo.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initView();
    }

    private void initView() {

        ListView contactListView = (ListView) findViewById(R.id.lv_contact);
        if (contactListView != null) {
            contactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(ContactsActivity.this, DisplayContactActivity.class);
                    startActivity(intent);
                }
            });
        }


        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Contact("Paolo", "Rendor", "paorendor@gmail.com", "09176880575", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/11046392_10153470799883519_3745362851528649751_o.jpg");

        Contact contact2 = new Contact("Ariel", "Silva", "arielsilva@gmail.com", "09176880576", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/12186257_10206715399982230_8629849205288280003_o.jpg");

        Contact contact3 = new Contact("Ian", "de Jesus", "iandejesusa@gmail.com", "09176880577", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/12186257_10206715399982230_8629849205288280003_o.jpg");

        Contact contact4 = new Contact("Edward", "Pedron", "edwardpednron@gmail.com", "09176880578", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/12186257_10206715399982230_8629849205288280003_o.jpg");


        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);




        ContactAdapter contactAdapter = new ContactAdapter(ContactsActivity.this, contacts);

        if (contactListView != null) {
            contactListView.setAdapter(contactAdapter);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
