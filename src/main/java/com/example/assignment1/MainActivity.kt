package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mealTextView = findViewById<TextView>(R.id.mealTextView)
        val breakfastButton = findViewById<Button>(R.id.breakfastButton)
        val lunchButton = findViewById<Button>(R.id.lunchButton)
        val dinnerButton = findViewById<Button>(R.id.dinnerButton)

        breakfastButton.setOnClickListener {
            mealTextView.text = "Breakfast Options:\n- Pancakes\n- Omelette\n- Toast\n- Coffee"
        }

        lunchButton.setOnClickListener {
            mealTextView.text = "Lunch Options:\n- Sandwich\n- Salad\n- Rice & Chicken\n- Juice"
        }

        dinnerButton.setOnClickListener {
            mealTextView.text = "Dinner Options:\n- Pasta\n- Steak\n- Soup\n- Tea"
        }
    }
}

