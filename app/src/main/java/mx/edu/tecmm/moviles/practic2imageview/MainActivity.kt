package mx.edu.tecmm.moviles.practic2imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.mlkit.vision.text.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var miImagen: ImageView
    lateinit var txtNumeros: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miImagen = findViewById(R.id.imgDado)
        txtNumeros = findViewById(R.id.txtNumero)
    }
    fun clickButton(v: View) {
        Log.e("Mensaje", "As Precionado")
        val numero = Random.nextInt(6) + 1;

        Toast.makeText(this, "Hola $numero", Toast.LENGTH_LONG)
            .show()

        txtNumeros.text = "$numero"
        when (numero) {
            1 -> miImagen.setImageResource(R.drawable.dice_1)
            2 -> miImagen.setImageResource(R.drawable.dice_2)
            3 -> miImagen.setImageResource(R.drawable.dice_3)
            4 -> miImagen.setImageResource(R.drawable.dice_4)
            5 -> miImagen.setImageResource(R.drawable.dice_5)
            6 -> miImagen.setImageResource(R.drawable.dice_6)
        }
        }
    }