package com.alberto.pruebalayouts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var horizontal=false;

        if(tHorizontal!=null){
            toast("Estoy en Horizontal")
            horizontal=true;
        }else{
            toast("Estoy en Vertical")
            horizontal=false;
        }

    }
    }

