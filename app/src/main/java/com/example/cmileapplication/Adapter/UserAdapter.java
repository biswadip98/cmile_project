package com.example.cmileapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cmileapplication.EntityClass.UserModel;
import com.example.cmileapplication.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    Context context;
    List<UserModel> list;

    public UserAdapter(Context context, List<UserModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.data_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.id.setText(list.get(position).getId());
        holder.name.setText(list.get(position).getName());
        holder.department.setText(list.get(position).getDepartment());
        holder.designation.setText(list.get(position).getDesignation());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static  class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView id,name,department,designation;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id=itemView.findViewById(R.id.id);
            name=itemView.findViewById(R.id.name);
            department=itemView.findViewById(R.id.department);
            designation=itemView.findViewById(R.id.designation);






        }
    }
}
