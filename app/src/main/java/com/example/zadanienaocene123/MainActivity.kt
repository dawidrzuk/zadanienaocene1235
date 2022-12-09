package com.example.zadanienaocene123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val losuj = findViewById<Button>(R.id.button)
        val sortuj = findViewById<Button>(R.id.button2)
        val wynik = findViewById<TextView>(R.id.textView)
        val lista: List<Switch> = listOf(
            findViewById(R.id.switch18),
            findViewById(R.id.switch20),
            findViewById(R.id.switch21),
            findViewById(R.id.switch22),
            findViewById(R.id.switch23),
            findViewById(R.id.switch24),
            findViewById(R.id.switch25),
            findViewById(R.id.switch26),
            findViewById(R.id.switch27)
        )

        losuj.setOnClickListener {
            for(i in 0..8)
            {
                val liczba = Random.nextInt(0,100)
                lista[i].text = liczba.toString()
            }
            sortuj.setOnClickListener {
                val lista2: MutableList<Int> = mutableListOf()
                for (i in 0..8) {
                    if (lista[i].isChecked)
                        lista2.add(lista[i].text.toString().toInt())
                }
                for (i in 0 until  lista2.size-1)
                    for(j in 0 until  lista2.size-1)
                        if(lista2[j] > lista2[j+1])
                        {
                            val zamiana = lista2[j]
                            lista2[j] = lista2[j+1]
                            lista2[j+1] = zamiana
                        }
                if (lista2.isEmpty())
                {
                    wynik.text = "Lista jest pusta"
                }
                else
                {
                    wynik.text = lista2.toString()
                }
            }
        }

    }
}