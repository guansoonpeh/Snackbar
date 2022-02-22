package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btnSend)

        btn.setOnClickListener(){

            val mySnackbar = Snackbar.make(it, "Delete message", Snackbar.LENGTH_SHORT)
            mySnackbar.setAction("Undo") {
                //task todo
                mySnackbar.dismiss();
            }
            mySnackbar.show()

        }
    }
}