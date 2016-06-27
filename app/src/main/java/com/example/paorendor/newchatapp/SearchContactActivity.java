package com.example.paorendor.newchatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.paorendor.newchatapp.adapters.ContactAdapter;
import com.example.paorendor.newchatapp.adapters.SearchContactAdapter;
import com.example.paorendor.newchatapp.pojo.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_contact);
        initView();
    }

    private void initView(){

        ListView contactListView = (ListView) findViewById(R.id.lv_searchcontact);

        List<Contact> contacts = new ArrayList<>();
        Date date = new Date();

        Contact contact1 = new Contact("Paolo", "Rendor", "paorendor@gmail.com", "09176880575", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/11046392_10153470799883519_3745362851528649751_o.jpg");

        Contact contact2 = new Contact("Ariel", "Silva", "arielsilva@gmail.com", "09176880576", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/12186257_10206715399982230_8629849205288280003_o.jpg");

        Contact contact3 = new Contact("Ian", "de Jesus", "iandejesusa@gmail.com", "09176880577", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/12186257_10206715399982230_8629849205288280003_o.jpg");

        Contact contact4 = new Contact("Edward", "Pedron", "edwardpednron@gmail.com", "09176880578", "https://scontent.fmnl4-3.fna.fbcdn.net/t31.0-8/12186257_10206715399982230_8629849205288280003_o.jpg");


        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);




        SearchContactAdapter searchcontactadapter = new SearchContactAdapter(SearchContactActivity.this, contacts);

        if (contactListView != null) {
            contactListView.setAdapter(searchcontactadapter);
        }


    }

}
