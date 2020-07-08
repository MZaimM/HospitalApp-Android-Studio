package com.example.hospital;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail_Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__hospital);

        ImageView imageView = findViewById(R.id.img_item_detail);
        TextView name = findViewById(R.id.tv_item_name_detail);
        TextView detail = findViewById(R.id.tv_item_description);
        TextView address = findViewById(R.id.tv_address);
        TextView room = findViewById(R.id.tv_room);
        TextView phone = findViewById(R.id.tv_phone);

        String hospitalName = getIntent().getStringExtra("hospitalName");
        String hospitalDetail = getIntent().getStringExtra("hospitalDetail");
        String hospitalAddress = getIntent().getStringExtra("hospitalAddress");
        String hospitalRoom = getIntent().getStringExtra("hospitalRoom");
        String hospitalPhone = getIntent().getStringExtra("hospitalPhone");
        int image = getIntent().getIntExtra("hospitalPhoto", 0);

        name.setText(hospitalName);
        detail.setText(hospitalDetail);
        address.setText(hospitalAddress);
        room.setText(hospitalRoom);
        phone.setText(hospitalPhone);
        imageView.setImageResource(image);



    }
}
