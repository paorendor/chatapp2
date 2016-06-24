package com.example.paorendor.newchatapp.adapters;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

/**
 * Created by PaoRendor on 24/06/16.
 */
public class ProfileAdapter extends ArrayAdapter<Message> {

    private Context mContext;
    private List<Message> mMessageList;

    public ProfileAdapter(Context context, List<Message> objects) {
        super(context 0, objects);
        this.mContext = context;
        this.mMessageList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(android.R.layout.profilemessageitem, parent, false);

        TextView userName = (TextView) view.findViewById(R.id.tv_user_name); 
        TextView userMessage = (TextView) view.findViewById(R.id.tv_message); 
        TextView time = (TextView) view.findViewById(R.id.tv_time);

        Message message = mMessageList.get(position);



        return super.getView(position, convertView, parent);


    }
}
