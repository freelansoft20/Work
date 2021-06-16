package com.freelansoft.work.dto

data class Plant(var genus: String, var species : String, var common :String){

     //, @PrimaryKey @SerializedName("id") var plantId:Int = 0) {
    override fun toString(): String {
        return common
    }
}