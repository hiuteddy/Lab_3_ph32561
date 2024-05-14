package com.example.lab3_ph32561.btOpp
class CBGVV(hoten: String, tuoi: Int?, quequan: String?, var msgv: String, var luongcung: Float, var lThuong: Float, var lPhat: Float?) : NguoiModel(hoten, tuoi, quequan) {

     var lThuongLinh: Float = 0f
         get() = luongcung + (lThuong?:0f) -(lPhat?:0f)

    override fun getThongTin(): String {
        return "CBGV: ${super.getThongTin()} - msgv: $msgv - luong thuc linh: ${lThuongLinh}"
    }


}
