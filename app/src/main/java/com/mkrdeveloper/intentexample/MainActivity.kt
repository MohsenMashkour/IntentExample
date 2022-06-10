package com.mkrdeveloper.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //explicit Intent

        val btn1 = findViewById<Button>(R.id.button)

        btn1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }

        //implicit Intent
        val text = "share this text"

        val btn2 = findViewById<Button>(R.id.button2)

        btn2.setOnClickListener {

            val intent2 = Intent(Intent.ACTION_SEND)
            intent2.putExtra(Intent.EXTRA_TEXT, text)
            intent2.type = "text/plain"
            startActivity(intent2)
        }

    }
}