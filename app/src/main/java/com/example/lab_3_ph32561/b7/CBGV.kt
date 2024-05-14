package com.example.lab3_ph32561.b7

// Yêu cầu 2: Xây dựng lớp CBGV để quản lý các thông tin của các cán bộ giáo viên.
class CBGV(hoTen: String, tuoi: Int, queQuan: String, maSoGV: String,
           val luongCung: Float, val luongThuong: Float, val tienPhat: Float) : Nguoi(hoTen, tuoi, queQuan, maSoGV) {

    // Yêu cầu 4: Tính lương thực lĩnh cho giáo viên
    fun tinhLuongThucLinh(): Float {
        return luongCung + luongThuong - tienPhat
    }
}