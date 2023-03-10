package com.alan.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Welcome", Toast.LENGTH_LONG).show() //uyari mesaji
        Toast.makeText(this@MainActivity, "Welcome", Toast.LENGTH_LONG)
            .show()
    }

    fun save(view: View) {

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")  //baslik
        alert.setMessage("Are You Sure") //uyari mesaji
        alert.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") { dialog, which ->
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}