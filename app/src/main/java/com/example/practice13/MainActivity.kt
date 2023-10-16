package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun convertButton(view: View){
        val textViewOut: TextView = findViewById(R.id.textView4)
        val editTextDollarExchangeRate: EditText = findViewById(R.id.editTextText)
        val editTextDollarsInputToChange: EditText = findViewById(R.id.editTextText2)
        if(editTextDollarsInputToChange.text.toString() != "" && editTextDollarExchangeRate.text.toString() != "") {
            val a: String = editTextDollarsInputToChange.text.toString()
            val b: String = editTextDollarExchangeRate.text.toString()
            var convertedRubles: Double = a.toDouble() * b.toDouble()
            textViewOut.text = "${editTextDollarsInputToChange.text} $ это $convertedRubles Рублей"
        }
        else if(editTextDollarsInputToChange.text.toString() != "" && editTextDollarExchangeRate.text.toString() == ""){
            val checkDataToast = Toast.makeText(this, "Введите курс доллара", Toast.LENGTH_SHORT)
            checkDataToast.show()
        }
        else if(editTextDollarsInputToChange.text.toString() == "" && editTextDollarExchangeRate.text.toString() != ""){
            val checkDataToast2 = Toast.makeText(this, "Введите сумму", Toast.LENGTH_SHORT)
            checkDataToast2.show()
        }
        else{
            val checkDataToast3 = Toast.makeText(this, "Введите курс доллара и сумму", Toast.LENGTH_SHORT)
            checkDataToast3.show()
        }
    }
}