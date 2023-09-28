package com.example.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radMasc = findViewById<RadioButton>(R.id.radBtnMasc)
        val radFem = findViewById<RadioButton>(R.id.radBtnFem)
        val alturaTxt = findViewById<EditText>(R.id.altura)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            var altura = alturaTxt.text.toString().toDouble()
            println("Altura: $altura")
            val pesoIdeal : Double
            if (radMasc.isChecked) {
                pesoIdeal = (72.7 * altura) - 58
            } else {
                pesoIdeal = (62.1 * altura) - 44.7
            }
            val dec = DecimalFormat("#.0")
            val mensagem = "Peso ideal = ${dec.format(pesoIdeal)}"
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()

        }
    }
}