package com.example.notepad;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class adapter extends RecyclerView.Adapter<adapter.viewHolder> {

    ArrayList<onenote> arrayList;

    public adapter() {
        arrayList=new ArrayList<>();
        arrayList.add(new onenote("سورة الفاتحة","بسم الله الرحمن الرحيم"));
        arrayList.add(new onenote("سورة الاخلاص","قل هو الله احد"));
        arrayList.add(new onenote("سورة الناس ","قل اعوذ برب الناس"));

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.note,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        onenote item =arrayList.get(position);
        viewHolder.tv1.setText(item.getText1());
        viewHolder.tv2.setText(item.getText2());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        static TextView tv1;
        static TextView tv2;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }}

