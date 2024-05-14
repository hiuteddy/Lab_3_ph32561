package com.example.lab3_ph32561.btOpp

import java.util.Scanner

fun main() {
    var gv1 = CBGVV("Nguyen Van Long", 30, "HCM", "003468", 500f, 50f, 10f)
    val scanner = Scanner(System.`in`)
    println(gv1.getThongTin())

    val quanLy = QuanLyCBGV()

    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = scanner.nextInt()
            when (options) {
                1 -> {
                    println("Nhap thong tin giao vien:")
                    print("Ho ten: ")
                    val hoten = scanner.next()
                    print("Tuoi: ")
                    val tuoi = scanner.nextInt()
                    print("Que quan: ")
                    val quequan = scanner.next()
                    print("Ma so giao vien: ")
                    val msgv = scanner.next()
                    print("Luong cung: ")
                    val luongcung = scanner.nextFloat()
                    print("Luong thuong: ")
                    val lThuong = scanner.nextFloat()
                    print("Tien phat (neu co, neu khong nhap 0): ")
                    val lPhat = scanner.nextFloat()

                    val newGV = CBGVV(hoten, tuoi, quequan, msgv, luongcung, lThuong, lPhat)
                    quanLy.themCBGV(newGV)
                    println("Them giao vien thành công:")
                    println(newGV.getThongTin())
                }

                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")
                    quanLy.hienThiDanhSachCBGV()
                    println(gv1.getThongTin())

                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    print("Nhap msgv can xoa: ")
                    val msgvXoa = scanner.next()
                    quanLy.xoaCBGV(msgvXoa)
                    println("Đã xóa thành công cán bộ giáo viên có mã số $msgvXoa")
                }

                4 -> {
                    println("Cap nhat thong tin gv")
                    println("Nhap msgv can cap nhat: ")
                    val msgvCapNhat = scanner.next()
                    val cbgvCapNhat = quanLy.timCBGVTheoMSGV(msgvCapNhat)
                    if (cbgvCapNhat != null) {
                        println("Nhap thong tin moi cho giao vien:")
                        print("Ho ten: ")
                        val hotenMoi = scanner.next()
                        print("Tuoi: ")
                        val tuoiMoi = scanner.nextInt()
                        print("Que quan: ")
                        val quequanMoi = scanner.next()
                        print("Luong cung: ")
                        val luongcungMoi = scanner.nextFloat()
                        print("Luong thuong: ")
                        val lThuongMoi = scanner.nextFloat()
                        print("Tien phat (neu co, neu khong nhap 0): ")
                        val lPhatMoi = scanner.nextFloat()

                        cbgvCapNhat.hoten = hotenMoi
                        cbgvCapNhat.tuoi = tuoiMoi
                        cbgvCapNhat.quequan = quequanMoi
                        cbgvCapNhat.luongcung = luongcungMoi
                        cbgvCapNhat.lThuong = lThuongMoi
                        cbgvCapNhat.lPhat = lPhatMoi

                        println("Đã cập nhật thông tin của cán bộ giáo viên có mã số $msgvCapNhat")
                        println("Thông tin sau khi cập nhật:")
                        println(cbgvCapNhat.getThongTin())
                    } else {
                        println("Không tìm thấy cán bộ giáo viên có mã số $msgvCapNhat")
                    }
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            print("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = scanner.next()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }
    } while (tiepTuc)
}