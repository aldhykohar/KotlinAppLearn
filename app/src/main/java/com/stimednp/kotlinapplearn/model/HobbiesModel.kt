package com.stimednp.kotlinapplearn.model

data class HobbiesModel(var title: String)

object Supplier{
    val hobbiesModel = listOf<HobbiesModel>(
        HobbiesModel("Beranang"),
        HobbiesModel("Berlari"),
        HobbiesModel("Main Bola"),
        HobbiesModel("Basket"),
        HobbiesModel("Volly"),
        HobbiesModel("Melempar"),
        HobbiesModel("Lompat"),
        HobbiesModel("Menari"),
        HobbiesModel("Memasak"),
        HobbiesModel("Memancing"),
        HobbiesModel("Membersihkan"),
        HobbiesModel("Bulu Tangkis"),
        HobbiesModel("Tenis Meja"),
        HobbiesModel("Takros")
    )
}