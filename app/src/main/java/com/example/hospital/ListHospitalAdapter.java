package com.example.hospital;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHospitalAdapter extends RecyclerView.Adapter<ListHospitalAdapter.ListViewHolder> {
    private final ArrayList<Hospital> listhospital;

    ListHospitalAdapter(ArrayList<Hospital> list) {
        this.listhospital = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hospital, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Hospital hospital = listhospital.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hospital.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hospital.getNama());
        holder.tvDetail.setText(hospital.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(holder.itemView.getContext(), Detail_Hospital.class);

                intent.putExtra("hospitalPhoto",hospital.getPhoto());
                intent.putExtra("hospitalName",hospital.getNama());
                intent.putExtra("hospitalDetail",hospital.getDetail());
                intent.putExtra("hospitalAddress",hospital.getAddress());
                intent.putExtra("hospitalRoom", hospital.getRoom());
                intent.putExtra("hospitalPhone",hospital.getPhone());
                holder.itemView.getContext().startActivity(intent);


            }
        });
    }


    @Override
    public int getItemCount() {
        return listhospital.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {
        final TextView tvName;
        final TextView tvDetail;
        final TextView tvAddress;
        final TextView tvRoom;
        final TextView tvPhone;

        final ImageView imgPhoto;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tv_item_name);
            tvDetail= itemView.findViewById(R.id.tv_item_detail);
            imgPhoto=itemView.findViewById(R.id.img_item_photo);
            tvAddress= itemView.findViewById(R.id.tv_item_address);
            tvRoom = itemView.findViewById(R.id.tv_item_room);
            tvPhone = itemView.findViewById(R.id.tv_item_phone);
        }
    }
}
