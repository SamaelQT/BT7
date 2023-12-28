package com.example.a7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ToDoDAO toDoDao;
    ArrayList<ToDo> listToDo;

    ListView listView = findViewById(R.id.listView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toDoDao = new ToDoDAO(this);
        listToDo = toDoDao.getListTodo();
        TodoAdapter adapter = new TodoAdapter(this, listToDo);
        listView.setAdapter(adapter);
    }
}