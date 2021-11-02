package com.ims.recyclerview_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(
    private val context: Context, private val superHeroList: List<SuperHero>,
    val listener: (SuperHero) -> Unit
) : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SuperheroAdapter.SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }


    override fun onBindViewHolder(holder: SuperheroAdapter.SuperheroViewHolder, position: Int) {
        holder.bindView(superHeroList[position], listener)
    }

    override fun getItemCount(): Int = superHeroList.size



    class SuperheroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgSuperHero = itemView.findViewById<ImageView>(R.id.img_item_foto)
        val nameSuperHero = itemView.findViewById<TextView>(R.id.txt_item_name)
        val descSuperHero = itemView.findViewById<TextView>(R.id.txt_desc)

        fun bindView(superHero: SuperHero, listener: (SuperHero) -> Unit) {

            imgSuperHero.setImageResource(superHero.imgSuperhero)
            nameSuperHero.text = superHero.nameSuperHero
            descSuperHero.text = superHero.descSuperHero

        }

    }
}