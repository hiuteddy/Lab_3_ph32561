package com.example.lab3_ph32561

class SinhVienModel (var tenSv : String, var mssv: String, var diemTb : Float) {
    var daTotNghiep : Boolean? = null
    var tuoi : Int? = null

    constructor(tenSV: String, mssv: String, diemTB: Float, daTotNghiep: Boolean, tuoi: Int) : this(
        tenSV,
        mssv,
        diemTB
    ) {
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }
    fun getThongTin () : String {
        val thongtin :String
        if(daTotNghiep != null && tuoi != null){
            thongtin = "Ten : $tenSv,mssv : $mssv,diemtb : $diemTb,datotnghiep : $daTotNghiep,tuoi: $tuoi"

        }else{
            thongtin = "Ten : $tenSv,mssv : $mssv,diemtb : $diemTb"

        }
        return thongtin
    }

    override fun toString(): String {
        return "SinhVienModel(tenSv='$tenSv', mssv='$mssv', diemTb=$diemTb, daTotNghiep=$daTotNghiep, tuoi=$tuoi)"
    }
}