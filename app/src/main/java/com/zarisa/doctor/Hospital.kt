package com.zarisa.doctor

object Hospital {
    val doctorsList= mutableListOf<Doctor>()

    fun testData(){
        var drSara=Doctor("n78","Sara B.","n1 street",335)
        doctorsList.add(drSara)
        var drEmily=Doctor("f52","Emily D.",phone = 123)
        doctorsList.add(drEmily)
        var drBen=Doctor("i36","Ben N.","212B Street",895)
    }
}
data class Doctor(var ID:String,var name:String,var personalOffice:String="unrecorded", var phone:Int){
    override fun equals(other: Any?): Boolean {
        return this.ID==(other as? Doctor)?.ID
    }
    override fun toString(): String {
        return "Dr.$name, phone:$phone"
    }
}