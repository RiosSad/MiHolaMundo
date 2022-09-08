package com.example.miholamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var boton: Button
    lateinit var lbl: TextView
    lateinit var img: ImageView
    lateinit var img2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        lbl = findViewById(R.id.lblsaludo)
        boton = findViewById(R.id.btnroller)
        img = findViewById(R.id.imgRoller)
        img2 = findViewById(R.id.imgRoller1)


        img.setImageDrawable(resources.getDrawable(R.drawable.dice_3))
        img2.setImageDrawable(resources.getDrawable(R.drawable.dice_3))
        boton.setOnClickListener {
            val al = diceRoller()
            val al1 = diceRoller()
            /*
            Toast.makeText(
                applicationContext,
                "Boton presionado " + al,
                Toast.LENGTH_SHORT
            ).show()

             */
            img.setImageResource(getRandomDiceImage(al))
            img2.setImageResource(getRandomDiceImage(al1))
            //lbl.text = al.toString()
            }
        }
    fun diceRoller(): Int {
        return (1..6).random()
    }

    fun getRandomDiceImage(n:Int): Int {
        return when(n){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
    }
}

