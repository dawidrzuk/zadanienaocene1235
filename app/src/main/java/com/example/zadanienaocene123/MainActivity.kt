package com.example.zadanienaocene123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val przycisk1 = findViewById<ToggleButton>(R.id.toggleButton)
        val przycisk2 = findViewById<ToggleButton>(R.id.toggleButton2)
        val przycisk3 = findViewById<ToggleButton>(R.id.toggleButton3)
        val przycisk4 = findViewById<ToggleButton>(R.id.toggleButton4)
        val przycisk5 = findViewById<ToggleButton>(R.id.toggleButton5)
        val przycisk6 = findViewById<ToggleButton>(R.id.toggleButton6)
        val przycisk7 = findViewById<ToggleButton>(R.id.toggleButton7)
        val przycisk8 = findViewById<ToggleButton>(R.id.toggleButton8)
        val przycisk9 = findViewById<ToggleButton>(R.id.toggleButton9)
        val losuj = findViewById<Button>(R.id.button)
        val random1 = (0..100).shuffled().last()
        val random2 = (0..100).shuffled().last()
        val random3 = (0..100).shuffled().last()
        val random4 = (0..100).shuffled().last()
        val random5 = (0..100).shuffled().last()
        val random6 = (0..100).shuffled().last()
        val random7 = (0..100).shuffled().last()
        val random8 = (0..100).shuffled().last()
        val random9 = (0..100).shuffled().last()

        losuj.setOnClickListener {
            przycisk1.text = random1.toString();
            przycisk2.text = random2.toString();
            przycisk3.text = random3.toString();
            przycisk4.text = random4.toString();
            przycisk5.text = random5.toString();
            przycisk6.text = random6.toString();
            przycisk7.text = random7.toString();
            przycisk8.text = random8.toString();
            przycisk9.text = random9.toString();
        }
    }
}