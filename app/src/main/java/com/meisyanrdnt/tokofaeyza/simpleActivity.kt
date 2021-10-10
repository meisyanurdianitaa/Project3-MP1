package com.meisyanrdnt.tokofaeyza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class simpleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener {
            val backIntent = Intent(this@simpleActivity, MainActivity::class.java)
            startActivity(backIntent)


        }
    }
}