package com.mkrdeveloper.intentexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)

        //explicit Intent

        btn1.setOnClickListener {
            val intent1 = Intent(this, SecondActivity::class.java)
            startActivity(intent1)
            finish()
        }


        //implicit Intent

        btn2.setOnClickListener {
            val intent2 = Intent(Intent.ACTION_SEND)
            intent2.putExtra(Intent.EXTRA_TEXT, "simple text")
            intent2.type = "text/plain"
            startActivity(intent2)
        }

    }
}