package com.masanz.proyecto004

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //buscamos el primer campo de texto mediante su id usando la funcion findViewById()
        val et1=findViewById<EditText>(R.id.et1)

        //buscamos los demás campos y componentes mediante su id
        val et2=findViewById<EditText>(R.id.et2)
        val check1=findViewById<CheckBox>(R.id.check1)
        val check2=findViewById<CheckBox>(R.id.check2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)

        //Iniciamos que debe ocurrir cuando el usuario pulse el boton
        button.setOnClickListener {

            // creamos una variable vacía para añadir un resultado después
            var resultado=""

            //comprobamos si el primer check está seleccionado mediante la propiedad ischecked
            if (check1.isChecked)

                //si esta seleccionado hace esta acción:
                //primero convierte los dos valores a string y luego a enteros para sumarlos y añadir el resultado a la variable
                resultado = "Suma = ${et1.text.toString().toInt() + et2.text.toString().toInt()} "

            //Aquí comprobamos el segundo check
            if (check2.isChecked)

                //Aquí hace lo mismo que antes pero restando
                // el símbolo '+=' sirve para añadir el resultado de la resta manteniendo el de la suma
                resultado += "Resta = ${et1.text.toString().toInt() - et2.text.toString().toInt()}"

            //mostramos en el textvie wel resultado final
            tv1.text = resultado
        }
    }
}