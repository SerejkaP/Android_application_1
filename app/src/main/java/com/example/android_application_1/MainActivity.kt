package com.example.android_application_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_blank)

        FindButton.setOnClickListener {
            val min = editTextNumber.editableText.toString().toInt()
            val max = editTextNumber2.editableText.toString().toInt()
            if(min>max){
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
            }
            else {
                fun diff(max: Int, min: Int): Int = max - min
                fun ans(max: Int, min: Int): Int =
                    Random(diff(max, min) + 1).nextInt(diff(max, min) + 1) + min
                // val str = ans(max, min).toString()
                val str = ans(max, min).toString()
                textView5.text = str
            }
        }
    }
}