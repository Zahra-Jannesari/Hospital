package com.zarisa.doctor

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

object Hospital {
    val doctorsList= mutableListOf<Doctor>()

    fun testData(number:Int):Doctor{
        var drSara=Doctor("n78","Sara B.","n1 street",335)
        doctorsList.add(drSara)
        var drEmily=Doctor("f52","Emily D.",phone = 123)
        doctorsList.add(drEmily)
        var drBen=Doctor("i36","Ben N.","212B Street",895)
        doctorsList.add(drBen)

        return when(number){
            1->drSara
            2->drEmily
            else->drBen
        }
    }
}
@Parcelize
data class Doctor(var ID:String,var name:String,var personalOffice:String="unrecorded", var phone:Int) : Parcelable {
    override fun equals(other: Any?): Boolean {
        return this.ID==(other as? Doctor)?.ID
    }
    override fun toString(): String {
        return "Dr.$name, phone:$phone"
    }
}