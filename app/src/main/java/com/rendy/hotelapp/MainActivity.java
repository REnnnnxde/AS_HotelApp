package com.rendy.hotelapp;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Jika Anda menggunakan EdgeToEdge, pastikan tema aplikasi Anda telah dikonfigurasi dengan tepat
        // EdgeToEdge.enable(this);

        _imageView1 = findViewById(R.id.imageview1);

        String imageUrl = "https://meramuda.com/wp-content/uploads/2018/11/pure-luxury-a-hotel-renovation-12.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}
