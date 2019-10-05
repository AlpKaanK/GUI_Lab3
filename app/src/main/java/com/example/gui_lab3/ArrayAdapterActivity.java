package com.example.gui_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterActivity extends ListActivity {


    static final String[] ANIMALS = new String[] {"ANT" , " BEAR", "BIRD","ANT2" , " BEAR2", "BIRD2","ANT3" , " BEAR3", "BIRD3",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_array_adapter);
        setListAdapter((new ArrayAdapter<String>(this,R.layout.activity_array_adapter,ANIMALS)));

        ListView listView = getListView();
                listView.setTextFilterEnabled(true);
    }
}
