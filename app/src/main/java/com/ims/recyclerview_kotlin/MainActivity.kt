package com.ims.recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val superhero = listOf<SuperHero>(
            SuperHero(
                R.drawable.ic_launcher_background,
                "Ant Man",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Black Panther",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Iron-Man",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Captain Amerika",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Hulk",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Thor",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Hawk Eye",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Captain Marvel",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Groot",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
            SuperHero(
                R.drawable.ic_launcher_background,
                "Spiderman",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),
        )
        val recyclerview = findViewById<RecyclerView>(R.id.rv_main)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = SuperheroAdapter(this, superhero){

        }

    }

}