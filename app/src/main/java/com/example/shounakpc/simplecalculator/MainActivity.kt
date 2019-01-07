package com.example.shounakpc.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.addButton)
        val fieldOne = findViewById<EditText>(R.id.firstNumEditText)
        val fieldTwo = findViewById<EditText>(R.id.secondNumEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        addButton.setOnClickListener {
            val numOne = fieldOne.text.toString().toInt()
            val numTwo = fieldTwo.text.toString().toInt()
            fieldOne.onEditorAction(EditorInfo.IME_ACTION_DONE)
            fieldTwo.onEditorAction(EditorInfo.IME_ACTION_DONE)
            resultTextView.text = (numOne+numTwo).toString()
        }
    }
}
