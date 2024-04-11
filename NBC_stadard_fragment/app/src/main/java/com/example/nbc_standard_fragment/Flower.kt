package com.example.nbc_standard_fragment

data class Flower(
    val img:Int,
    val name:String,
    val description:String
){
    companion object{
        val flowerlist = listOf(
            Flower(R.drawable.rose, "장미", "This is Rose"),
            Flower(R.drawable.cherryblossom, "벚꽃", "This is cherryblossom"),
            Flower(R.drawable.daffodill, "수선화", "This is daffodill"),
            Flower(R.drawable.azalea, "진달래", "This is azalea"),
            Flower(R.drawable.dandelion, "민들레", "This is dandelion"),
            Flower(R.drawable.hydrangea, "수국", "This is hydrangea"),
            Flower(R.drawable.magnolia, "목련", "This is magnolia"))
        fun showlist():List<Flower>{
            return flowerlist
        }
    }
}
