package com.example.afi.aplikasimasakan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 05/10/2017.
 */

public class MasakanAdapter extends RecyclerView.Adapter<MasakanAdapter.MasakanViewHolder>{
    private Context context;

    private ArrayList<ListMasakan>listMasakan;

    public MasakanAdapter(Context context, ArrayList<ListMasakan> listMasakan) {
        this.context = context;
        this.listMasakan = listMasakan;
    }

    @Override
    public MasakanAdapter.MasakanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listmasakan,parent,false);
        return new MasakanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MasakanAdapter.MasakanViewHolder holder, final int position) {
        holder.judulMasakan.setText(listMasakan.get(position).getJudulMasakan());
        holder.gambarMasakan.setImageResource(listMasakan.get(position).getGambarMasakan());
        holder.deskripsiMasakan.setText(listMasakan.get(position).getDeskripsiMasakan());

        holder.judulMasakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(context, DetailMasakan.class);
                x.putExtra("judul",listMasakan.get(position).getDetailJudul());
                x.putExtra("gambar",listMasakan.get(position).getDetailGambar());
                x.putExtra("deskripsi",listMasakan.get(position).getDetailDeskripsi());
                context.startActivity(x);

                context.startActivity(x);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMasakan.size();
    }

    public class MasakanViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarMasakan;
        TextView judulMasakan;
        TextView deskripsiMasakan;


        public MasakanViewHolder(View itemView)
        {
            super(itemView);
            gambarMasakan = (ImageView)itemView.findViewById(R.id.GambarMasakan);
            judulMasakan = (TextView)itemView.findViewById(R.id.JudulMasakan);
            deskripsiMasakan = (TextView)itemView.findViewById(R.id.DeskripsiMakanan);
        }
    }
}
