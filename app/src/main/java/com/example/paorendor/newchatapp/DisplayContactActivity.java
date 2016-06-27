package com.example.paorendor.newchatapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.paorendor.newchatapp.adapters.ProfileAdapter;
import com.example.paorendor.newchatapp.pojo.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisplayContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);
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

        ListView messageListView = (ListView) findViewById(R.id.lv_displaycontact);

        List<Message> messages = new ArrayList<>();
        Date date = new Date();


        Message message1 = new Message("sample Message 1", "Paolo Rendor", date);
        Message message2 = new Message("sample Message 1", "Ariel Silva", date);
        Message message3 = new Message("sample Message 1", "Edward Pedron", date);

        messages.add(message1);
        messages.add(message2);
        messages.add(message3);

        ProfileAdapter profileadapter = new ProfileAdapter(DisplayContactActivity.this, messages);

        if (messageListView != null) {
            messageListView.setAdapter(profileadapter);
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
