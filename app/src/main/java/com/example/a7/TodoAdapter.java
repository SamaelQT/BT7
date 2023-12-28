package com.example.a7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ToDo> todoList;

    public TodoAdapter(Context context, ArrayList<ToDo> todoList) {
        this.context = context;
        this.todoList = todoList;
    }

    @Override
    public int getCount() {
        return todoList.size();
    }

    @Override
    public Object getItem(int position) {
        return todoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TodoViewHolder holder;

        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_todo, parent, false);
            holder = new TodoViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (TodoViewHolder) convertView.getTag();
        }

        ToDo todo = todoList.get(position);

        holder.tvTitle.setText(todo.getTitle());
        holder.tvDate.setText(todo.getDate());

        return convertView;
    }

    private static class TodoViewHolder {
        TextView tvTitle, tvDate;

        public TodoViewHolder(View view) {
            tvTitle = view.findViewById(R.id.tvTitle);
            tvDate = view.findViewById(R.id.tvDate);
        }
    }

}