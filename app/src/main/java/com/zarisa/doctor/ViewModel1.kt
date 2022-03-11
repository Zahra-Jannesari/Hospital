package com.zarisa.doctor
import androidx.lifecycle.ViewModel

class ViewModel1: ViewModel() {

    fun getInfo(id:String?):Doctor {
        return when(id) {
            "n78"-> Doctor("n78", "Sara B.", "n1 street", 335)
            "f52"-> Doctor("f52", "Emily D.", phone = 123)
            else-> Doctor("i36", "Ben N.", "212B Street", 895)
        }
    }
    fun getId(number: Int):String{
        return when(number){
            1->"n78"
            2->"f52"
            else->"i36"
        }
    }
}