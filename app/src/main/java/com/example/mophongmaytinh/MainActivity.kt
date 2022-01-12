package com.example.mophongmaytinh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd.setOnClickListener {
            var kq = number_one.text.toString().toDouble() + number_two.text.toString().toDouble()
            tvresult.text = kq.toString()
        }
        btnsub.setOnClickListener {
            var kq = number_one.text.toString().toDouble() - number_two.text.toString().toDouble()
            tvresult.text = kq.toString()
        }
        btnmultiple.setOnClickListener {
            var kq = number_one.text.toString().toDouble() * number_two.text.toString().toDouble()
            tvresult.text = kq.toString()
        }
        btndevide.setOnClickListener {
            var kq = number_one.text.toString().toDouble() / number_two.text.toString().toDouble()
            tvresult.text = kq.toString()
        }

    }
}