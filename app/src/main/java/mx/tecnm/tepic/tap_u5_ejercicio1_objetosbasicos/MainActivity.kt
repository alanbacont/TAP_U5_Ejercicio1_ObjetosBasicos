package mx.tecnm.tepic.tap_u5_ejercicio1_objetosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ejecutar.setOnClickListener {
            var nombre = dato.text.toString()

            Toast.makeText(this, "hola,¿cómo estás, mi amigo ${nombre}?", Toast.LENGTH_LONG)
                    .show()

            dato.setText("")
        }
    }
}