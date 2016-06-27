package com.example.paorendor.newchatapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.paorendor.newchatapp.R;
import com.example.paorendor.newchatapp.pojo.Contact;

import java.util.List;

/**
 * Created by PaoRendor on 27/06/16.
 */
public class SearchContactAdapter extends ArrayAdapter<Contact> {

    private Context mContext;
    private List<Contact> mContactList;

    public SearchContactAdapter(Context context, List<Contact> objects) {
        super(context, 0, objects);
        this.mContext = context;
        this.mContactList = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.search_contact_item, parent, false);

        ImageView userImage = (ImageView) view.findViewById(R.id.iv_img_user);
        TextView userName = (TextView) view.findViewById(R.id.tv_user_name);

        Contact contact = mContactList.get(position);
        Glide.with(mContext).load(contact.getSenderPhotoUrl()).asBitmap().into(userImage);

        String name = contact.getFirstName() + " " + contact.getLastName();
        userName.setText(name);


        return view;

    }

    @Override
    public Contact getItem(int position) {
        return mContactList.get(position);
    }
}
