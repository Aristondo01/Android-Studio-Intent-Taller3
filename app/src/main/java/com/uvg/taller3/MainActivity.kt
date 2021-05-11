package com.uvg.taller3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnsuma.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity2:: class.java)

            intent.putExtra("valor","Ingrese los valores")
            intent.putExtra("valor2","Prueba")
            intent.putExtra("valor3","+")

            //startActivity(intent)
            //finish()

            startActivityForResult(intent,1)
        }

        btnresta.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity2:: class.java)

            intent.putExtra("valor","Ingrese los valores")
            intent.putExtra("valor2","Prueba")
            intent.putExtra("valor3","-")

            //startActivity(intent)
            //finish()

            startActivityForResult(intent,1)
        }

        btnmulti.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity2:: class.java)

            intent.putExtra("valor","Ingrese los valores")
            intent.putExtra("valor2","Prueba")
            intent.putExtra("valor3","*")

            //startActivity(intent)
            //finish()

            startActivityForResult(intent,1)
        }

        btndiv.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity2:: class.java)

            intent.putExtra("valor","Ingrese los valores")
            intent.putExtra("valor2","Prueba")
            intent.putExtra("valor3","/")

            //startActivity(intent)
            //finish()

            startActivityForResult(intent,1)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode== RESULT_OK)
        {
            if (requestCode==1)
            {
                val bundle = data?.extras
                if (bundle!=null)
                {
                    val resultado = bundle.getString("resultado1")
                    txtTexto1.text="El resultado es: "+resultado
                    //Toast.makeText(this,resultado,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}