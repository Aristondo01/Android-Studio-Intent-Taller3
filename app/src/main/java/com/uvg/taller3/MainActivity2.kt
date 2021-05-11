package com.uvg.taller3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        var valor3 = ""
        if (bundle!=null)
        {
            val texto = bundle.getString("valor")
            txtTexto.text=texto

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this,valor2,Toast.LENGTH_SHORT).show()

            valor3 = bundle.getString("valor3").toString()
        }

        btnsuma.setOnClickListener{
            val intent : Intent =Intent()
            val num1: Double=  ETA.text.toString().toDouble()
            val num2: Double= ETB.text.toString().toDouble()
            var respuesta=0.0

            if (valor3.equals("+"))
            {
                respuesta = num1 + num2
            }

            if (valor3.equals("-"))
            {
                respuesta = num1 - num2
            }

            if (valor3.equals("*"))
            {
                respuesta = num1 * num2
            }

            if (valor3.equals("/"))
            {
                respuesta = num1 / num2
            }



            intent.putExtra("resultado1",respuesta.toString())
            setResult(RESULT_OK,intent)
            finish()

        }




    }
}