package com.example.searchapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class NewAdater extends RecyclerView.Adapter<NewAdater.ViewHolder> {
    private ArrayList<itemModel> name;
    public NewAdater(ArrayList<itemModel> names) {
        this.name = names;
    }
    @Override
    public NewAdater.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_item, parent, false);
        NewAdater.ViewHolder viewHolder = new NewAdater.ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(NewAdater.ViewHolder holder, int position) {
        holder.rowId.setText(name.get(position).getId());
    }
    @Override
    public int getItemCount() {
        return name.size();
    }
    public void filterdNames(ArrayList<itemModel> filterdNames) {
        this.name = filterdNames;
        notifyDataSetChanged();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        TextView rowId, rowName, rowDate;
        public ViewHolder(View itemView) {
            super(itemView);
            rowId = itemView.findViewById(R.id.textv);
            context = itemView.getContext();
        }
    }
}



