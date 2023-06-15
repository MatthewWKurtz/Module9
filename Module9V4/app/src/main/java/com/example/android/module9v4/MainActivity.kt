package com.example.android.module9v4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    //The array of numbers for the assignment
    var nums = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setting up layout stuff
        val numButton : Button = findViewById(R.id.activity1Button)
        val numInput = findViewById(R.id.editTextNumber) as EditText
        val buttonHolder : LinearLayout = findViewById(R.id.buttonHolder)


        //Button Listener
        numButton.setOnClickListener(View.OnClickListener {
            //nums.add(numInput.text.toString())

            var num = numInput.text.toString()

            //Adding a button to the layout
            var testButton : Button = Button(this)
            testButton.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            testButton.text = numInput.text.toString()

            testButton.setOnClickListener(View.OnClickListener {
                Toast.makeText(this, num, Toast.LENGTH_SHORT).show()
            })

            buttonHolder.addView(testButton)

            //printArr()
        })
    }

    //Prints the current numbers
    fun printArr()
    {
        for(x in nums)
        {
            println(x)
        }
    }

}