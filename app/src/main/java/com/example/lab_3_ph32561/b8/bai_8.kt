package com.example.lab3_ph32561.b8

import java.util.Scanner

class QuanLyTheMuon {
    private val danhSachTheMuon = mutableListOf<TheMuon>()

    fun themTheMuon(theMuon: TheMuon) {
        danhSachTheMuon.add(theMuon)
    }

    fun xoaTheMuon(maPhieuMuon: String) {
        val theMuon = danhSachTheMuon.find { it.maPhieuMuon == maPhieuMuon }
        theMuon?.let {
            danhSachTheMuon.remove(it)
        }
    }

    fun hienThiDanhSachTheMuon() {
        if (danhSachTheMuon.isEmpty()) {
            println("Danh sách thẻ mượn đang trống.")
        } else {
            println("+++++++++++++ Danh sách phiếu mượn: +++++++++++++++ ")
            for (theMuon in danhSachTheMuon) {
                println("Mã phiếu mượn: ${theMuon.maPhieuMuon}, Ngày mượn: ${theMuon.ngayMuon}, Hạn trả: ${theMuon.hanTra}, Số hiệu sách: ${theMuon.soHieuSach}")
                println("Thông tin sinh viên:")
                println("  Họ tên: ${theMuon.sinhVien.hoTen}, Tuổi: ${theMuon.sinhVien.tuoi}, Lớp: ${theMuon.sinhVien.lop}")
            }

            println("****************************************************")

        }
    }
}


fun main() {
    // Khởi tạo đối tượng QuanLyTheMuon

    val quanLyTheMuon = QuanLyTheMuon()
    quanLyTheMuon.themTheMuon(TheMuon("PM001", 1, 10, "SH001", SinhVien("Nguyen Van A", 20, "K18")))
    quanLyTheMuon.themTheMuon(TheMuon("PM002", 3, 12, "SH002", SinhVien("Tran Thi B", 21, "K19")))
    quanLyTheMuon.themTheMuon(TheMuon("PM003", 5, 14, "SH003", SinhVien("Le Thi C", 22, "K20")))

    quanLyTheMuon.hienThiDanhSachTheMuon()


    val scanner = Scanner(System.`in`)

    var choice: Int

    do {
        println("Chọn chức năng:")
        println("1. Thêm thẻ mượn")
        println("2. Xoá thẻ mượn")
        println("3. Hiển thị danh sách thẻ mượn")
        println("0. Thoát")

        print("Nhập lựa chọn của bạn: ")
        choice = scanner.nextInt()

        when (choice) {
            1 -> {
                // Thêm thẻ mượn
                val theMuon = nhapThongTinTheMuon(scanner)
                quanLyTheMuon.themTheMuon(theMuon)

                quanLyTheMuon.hienThiDanhSachTheMuon()
                hoiTiepTuc(scanner)


            }

            2 -> {
                // Xoá thẻ mượn
                print("Nhập mã phiếu mượn cần xoá: ")
                val maPhieuMuon = scanner.next()
                quanLyTheMuon.xoaTheMuon(maPhieuMuon)
                quanLyTheMuon.hienThiDanhSachTheMuon()

                hoiTiepTuc(scanner)

            }



            0 -> {
                // Thoát chương trình
                println("Thoát chương trình.")
            }

            else -> {
                println("Lựa chọn không hợp lệ. Vui lòng chọn lại.")
            }
        }
    } while (choice != 0)
}

fun nhapThongTinTheMuon(scanner: Scanner): TheMuon {
    print("Nhập mã phiếu mượn: ")
    val maPhieuMuon = scanner.next()
    print("Nhập ngày mượn: ")
    val ngayMuon = scanner.nextInt()
    print("Nhập hạn trả: ")
    val hanTra = scanner.nextInt()
    print("Nhập số hiệu sách: ")
    val soHieuSach = scanner.next()
    print("Nhập thông tin sinh viên - Họ tên: ")
    val hoTen = scanner.next()
    print("Nhập thông tin sinh viên - Tuổi: ")
    val tuoi = scanner.nextInt()
    print("Nhập thông tin sinh viên - Lớp: ")
    val lop = scanner.next()

    val sinhVien = SinhVien(hoTen, tuoi, lop)
    return TheMuon(maPhieuMuon, ngayMuon, hanTra, soHieuSach, sinhVien)
}
fun hoiTiepTuc(scanner: Scanner) {
    print("Bạn có muốn tiếp tục không? (1: Có, 0: Không): ")
    val tiepTuc = scanner.nextInt()
    if (tiepTuc == 0) {
        println("Thoát chương trình.")
        System.exit(0)
    }
}
