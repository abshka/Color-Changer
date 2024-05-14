package com.abshka.colorchanger

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val colorRectangle: View = findViewById(R.id.colorRectangle)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioButtonRed -> colorRectangle.setBackgroundColor(Color.RED)
                R.id.radioButtonGreen -> colorRectangle.setBackgroundColor(Color.GREEN)
                R.id.radioButtonBlue -> colorRectangle.setBackgroundColor(Color.BLUE)
            }
        }
    }
}