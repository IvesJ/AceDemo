package com.ace.acedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ace.acedemo.databinding.ItemListLayoutBinding;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    private LayoutInflater mLayoutInflater;
    private AdapterItemClickListener mItemClickListener;

    public ListAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListLayoutBinding binding = ItemListLayoutBinding.inflate(mLayoutInflater, parent, false);
        return new ListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mItemClickListener != null) {
                    mItemClickListener.onClick(holder.itemView);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public void setItemClickListener(AdapterItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView mIvBg;
        TextView mText1, mText2, mText3;

        public ListViewHolder(ItemListLayoutBinding itemView) {
            super(itemView.getRoot());
            mIvBg = itemView.ivBg;
            mText1 = itemView.tvText1;
            mText2 = itemView.tvText2;
            mText3 = itemView.tvText3;
        }
    }

    public interface AdapterItemClickListener {
        void onClick(View view);
    }
}
