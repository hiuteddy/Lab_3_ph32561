package com.example.lab3_ph32561.btOpp

class QuanLyCBGV {
    private val danhSachCBGV = mutableListOf<CBGVV>()

    fun themCBGV(cbgv: CBGVV) {
        danhSachCBGV.add(cbgv)
    }

    fun hienThiDanhSachCBGV() {
        danhSachCBGV.forEach { println(it.getThongTin()) }
    }

    fun xoaCBGV(msgv: String) {
        val cbgv = danhSachCBGV.find { it.msgv == msgv }
        if (cbgv != null) {
            danhSachCBGV.remove(cbgv)
        } else {
            println("Không tìm thấy cán bộ giáo viên có mã số $msgv")
        }
    }

    fun timCBGVTheoMSGV(msgv: String): CBGVV? {
        return danhSachCBGV.find { it.msgv == msgv }
    }
}