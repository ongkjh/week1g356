package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the button view from the layout and assign a click
        //listener to it
        val rollButton: Button = findViewById(R.id.rollBtn)
        rollButton.setOnClickListener{ rollDice()}
    }

    /**
     * Click Listener for the Roll Button
     */
    private fun rollDice(){
        Toast.makeText(this, "Dice is rolled",
            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.txtNumber)
        resultText.text = randomInt.toString()
    }
}