package com.example.jabels.listviewexam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jabels.listviewexam.R;
import com.example.jabels.listviewexam.pojo.PhoneModel;

import java.util.List;

public class PhoneModelAdapter extends BaseAdapter {

    private List<PhoneModel> list;
    private LayoutInflater inflater;

    public PhoneModelAdapter(Context context, List<PhoneModel> list) {
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.item_layout, parent, false);
        }

        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(getPhoneModel(position).getModel());
        return view;
    }

    private PhoneModel getPhoneModel(int position){
        return (PhoneModel) getItem(position);
    }


}
