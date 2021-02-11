package com.example.androidhelloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

@SuppressLint("WrongViewCast")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.button)
        var myTextView = findViewById<TextView>(R.id.textView)
        clickMeButton.setOnClickListener {
            myTextView.text = "new Text"
        }
    }
}