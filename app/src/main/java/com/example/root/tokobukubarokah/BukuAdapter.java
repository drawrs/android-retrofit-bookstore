package com.example.root.tokobukubarokah;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by root on 29/12/17.
 */

class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.MyViewHolder> {

    // Variable global
    Context con;

    public BukuAdapter(Context context) {
        this.con = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // layout inflater
        View view = LayoutInflater.from(con).inflate(R.layout.item_buku, parent, false);

        // Buat object view Holder
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
