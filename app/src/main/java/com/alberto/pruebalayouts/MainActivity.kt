package com.alberto.pruebalayouts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse

import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ejemplo de crear una variable para luego utilizarla según este la pantalla en horizontal o vertical
        var horizontal=false;

        // Si el Id del objeto creado lo encuentra en la pantalla pues hace las funciones indicadas.
        if(tHorizontal!=null){
            toast("Estoy en Horizontal")
            horizontal=true;
        }else{
            toast("Estoy en Vertical")
            horizontal=false;
        }

        // Variable para crear un intent
        val intent = Intent(this, OtraActivity::class.java).apply {
            // Función para pasarle un id y el contenido
            //putExtra("id", 5)
        }


        btn_Generic.setOnClickListener(){

            // Abre un navegador
            browse("https://www.pokemon.com/es/episodios-pokemon/")
            // Abre otra actividad
            //startActivity(intent)
        }


    }
    }

