package com.psp.listview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.psp.listview_example.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ActivityMainBinding binding;

    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();
    }

    private void init() {
        binding.listViewStudents.setOnItemClickListener(this);
        list = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.list_item_student,list);
        binding.listViewStudents.setAdapter(adapter);

        addStudents();
    }

    private void addStudents() {
        list.add("Raj");
        list.add("Ankit");
        list.add("Prakash");
        list.add("Rohit");
        list.add("Karan");
        list.add("Prasad");
        list.add("John");
        list.add("Martin");
        list.add("Guru");
        list.add("Omkar");
        list.add("Dhwani");
        list.add("Zeel");

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Hello "+list.get(position), Toast.LENGTH_SHORT).show();
    }
}