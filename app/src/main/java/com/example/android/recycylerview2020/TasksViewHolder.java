package com.example.android.recycylerview2020;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


public class TasksViewHolder extends RecyclerView.ViewHolder {
    private CardView cardView;
    private TextView taskNameView;
    private TextView taskTimeView;
    private TextView taskInfoView;
    private Context context;

    @SuppressLint("WrongViewCast")
    public TasksViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        taskNameView = (TextView) itemView.findViewById(R.id.task_name);
        taskTimeView = (TextView) itemView.findViewById(R.id.task_time);
        taskInfoView = (TextView) itemView.findViewById(R.id.task_info);
        this.context = context;

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "New Task added!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public TextView getTaskNameView() {

        return taskNameView;
    }

    public TextView getTaskTimeView() {
        return taskTimeView;
    }

    public TextView getTaskInfoView() {

        return taskInfoView;
    }


}


