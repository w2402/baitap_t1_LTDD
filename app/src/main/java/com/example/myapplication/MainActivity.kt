package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        //bo góc
        Glide.with(this)
            .load(R.drawable.hinh)
            .circleCrop()
            .into(findViewById(R.id.imageView3))
    }
}


