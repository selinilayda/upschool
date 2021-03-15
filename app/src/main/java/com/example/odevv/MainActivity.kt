package com.example.odevv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val zar1: ImageView = findViewById(R.id.zar1)
        val zar2: ImageView = findViewById(R.id.zar2)
        val zar_id: Button = findViewById(R.id.zar_id)
        val temizle: Button = findViewById(R.id.temizle)

        zar_id.setOnClickListener {
            val randomSayi = (1..6).random()
            val random = (1..6).random()


            when (randomSayi) {
                1 -> zar1.setImageResource(R.drawable.dice_1)
                2 -> zar1.setImageResource(R.drawable.dice_2)
                3 -> zar1.setImageResource(R.drawable.dice_3)
                4 -> zar1.setImageResource(R.drawable.dice_4)
                5 -> zar1.setImageResource(R.drawable.dice_5)
                else -> zar1.setImageResource(R.drawable.dice_6)
            }
            when (random) {
                1 -> zar2.setImageResource(R.drawable.dice_1)
                2 -> zar2.setImageResource(R.drawable.dice_2)
                3 -> zar2.setImageResource(R.drawable.dice_3)
                4 -> zar2.setImageResource(R.drawable.dice_4)
                5 -> zar2.setImageResource(R.drawable.dice_5)
                else -> zar2.setImageResource(R.drawable.dice_6)
            }
        }

        temizle.setOnClickListener {
            zar1.setImageResource(R.drawable.empty_dice)
            zar2.setImageResource(R.drawable.empty_dice)
        }




    }

}