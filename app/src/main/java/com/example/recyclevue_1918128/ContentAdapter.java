package com.example.recyclevue_1918128;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContentAdapter extends
        RecyclerView.Adapter<ContentAdapter.ContentViewHolder> {
    private ArrayList<Content> dataList;

    public ContentAdapter(ArrayList<Content> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ContentAdapter.ContentViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ContentViewHolder(view);
    }

    public void onBindViewHolder(ContentViewHolder holder, int
            position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtMsg.setText(dataList.get(position).getMsg());
        holder.txtClock.setText(dataList.get(position).getClock());
        holder.images_profile.setImageResource(dataList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ContentViewHolder extends
            RecyclerView.ViewHolder {
        private TextView txtNama, txtMsg, txtClock;
        private ImageView images_profile;

        public ContentViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtMsg = (TextView)
                    itemView.findViewById(R.id.txt_msg);
            txtClock = (TextView)
                    itemView.findViewById(R.id.txt_clock);
            images_profile=(ImageView)
                    itemView.findViewById(R.id.image);
        }
    }
}
