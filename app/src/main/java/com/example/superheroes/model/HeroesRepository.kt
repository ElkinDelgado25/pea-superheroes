package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(R.string.hero_nick, R.string.description_nick, R.drawable.android_superhero1),
        Hero(R.string.hero_reality, R.string.description_reality, R.drawable.android_superhero2),
        Hero(R.string.hero_andre, R.string.description_andre, R.drawable.android_superhero3),
        Hero(R.string.hero_benjamin, R.string.description_benjamin, R.drawable.android_superhero4),
        Hero(R.string.hero_maru, R.string.description_maru, R.drawable.android_superhero5),
        Hero(R.string.hero_yasmine, R.string.description_yasmine, R.drawable.android_superhero6)
    )
}