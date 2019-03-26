package com.alberto.pruebalayouts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_otra.*

import org.jetbrains.anko.*

class OtraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otra)

        btn_OpenGitHub.setOnClickListener(){

            // Abre un navegador
            browse("https://github.com/ablancoabalde/PruebaLayouts")

        }

        btn_masDiver.setOnClickListener(){

            // Abre un navegador
            browse("https://www.pokemon.com/es/episodios-pokemon/")

        }

        // Recuperamos los valores del intent
        val bundle = intent.extras
        // Recogemos el valor que nosotros queramos poniendo la referencía del objeto y lo guardamos en una variable
        val numero = bundle.get("id")
        val name = bundle.get("Myid")
        // 2 metodos para cargar valores en un TexrView
        // 1º Forma
        miText.setText("Id: "+numero.toString() + " " + name.toString())
        // 2º Forma
       // miText.text = name.toString()


    }
}
