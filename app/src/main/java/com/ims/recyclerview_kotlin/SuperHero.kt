package com.ims.recyclerview_kotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SuperHero(
    val imgSuperhero : Int,
    val nameSuperHero: String,
    val descSuperHero: String,

) : Parcelable
