package com.example.switchtoenableabuttonclicked

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast.isEnabled = false
        switch1.setOnCheckedChangeListener {_, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this, "Turn on", Toast.LENGTH_SHORT).show()
                showToast.setOnClickListener {
                    Toast.makeText(this, "This is a toast message.", Toast.LENGTH_SHORT).show()
                }
                showToast.isEnabled = true
            }
            else
            {

                Toast.makeText(this, "Turn off", Toast.LENGTH_SHORT).show()
                showToast.isEnabled = false
            }
        }
    }




}
