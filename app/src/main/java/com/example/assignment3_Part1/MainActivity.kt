package com.example.assignment3_Part1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.add)
        val tableLayoutid = findViewById<TableLayout>(R.id.tableLayout)
        val versionField = findViewById<EditText>(R.id.version)
        val codeField = findViewById<EditText>(R.id.code)
        myButton.setOnClickListener {

            // Create a new table row.
            val tableRow = TableRow(getApplicationContext()) // this
            // Set new table row layout parameters.
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.setLayoutParams(layoutParams)
            // add values into row by calling addView()
            val versionView = TextView(this)
            versionView.text = versionField.text
            val codeView = TextView(this)
            codeView.text = codeField.text
            tableRow.addView(versionView)
            tableRow.addView(codeView)
            // Finally add the created row row into layout
            tableLayoutid.addView(tableRow) // id from Layout_file
        }
    }
}