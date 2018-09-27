package com.example.jabels.listviewexam.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jabels.listviewexam.R;
import com.example.jabels.listviewexam.adapter.PhoneModelAdapter;
import com.example.jabels.listviewexam.pojo.PhoneModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

         listView = (ListView) findViewById(R.id.listView);

        /*List<String> items = initData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);*/

        PhoneModelAdapter adapter = new PhoneModelAdapter(getApplicationContext(), initData());

        listView.setAdapter(adapter);
    }

    private List<PhoneModel> initData() {

        List<PhoneModel> list = new ArrayList<>();

        list.add(new PhoneModel(1, "IPhone", 35000));
        list.add(new PhoneModel(2, "Samsung", 35000));
        list.add(new PhoneModel(3, "HTC", 35000));
        list.add(new PhoneModel(4, "Sony Ericson", 35000));
        list.add(new PhoneModel(5, "Nexus", 35000));
        return list;
    }
}
