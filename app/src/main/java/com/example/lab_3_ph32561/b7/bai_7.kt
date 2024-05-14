package com.example.lab3_ph32561.b7

import java.util.Scanner

class QuanLyCBGV {
    val danhSachCBGV = mutableListOf<CBGV>()

    // Phương thức thêm cán bộ giáo viên
    fun themCBGV(giaoVien: CBGV) {
        danhSachCBGV.add(giaoVien)
    }

    // Phương thức xoá cán bộ giáo viên theo mã số giáo viên
    fun xoaCBGV(maSoGV: String) {
        val giaoVien = danhSachCBGV.find { it.maSoGV == maSoGV }
        giaoVien?.let {
            danhSachCBGV.remove(it)
        }
    }

    // Phương thức hiển thị thông tin của các cán bộ giáo viên và lương thực lĩnh
    fun hienThiThongTinVaLuong() {
        println("+++++++++++++++++ danh sách cán bộ gv ++++++++++++++++++")
        for (giaoVien in danhSachCBGV) {
            println("Tên: ${giaoVien.hoTen}, Tuổi: ${giaoVien.tuoi}, Quê quán: ${giaoVien.queQuan}, Mã số: ${giaoVien.maSoGV}")
            println("Lương thực lĩnh: ${giaoVien.tinhLuongThucLinh()} VND")
        }
        println("********************************************************")
    }
}

fun main() {
    // Khởi tạo đối tượng QuanLyCBGV
    val quanLy = QuanLyCBGV()
    // Thêm vài cán bộ giáo viên vào danh sách
    quanLy.themCBGV(CBGV("Nguyen Van A", 35, "Hanoi", "GV001", 5000000f, 1000000f, 500000f))
    quanLy.themCBGV(CBGV("Tran Thi B", 40, "Hue", "GV002", 5500000f, 1200000f, 600000f))
    quanLy.hienThiThongTinVaLuong()

    val scanner = Scanner(System.`in`)
    var choice: Int

    do {
        println("Chọn chức năng:")
        println("1. Thêm cán bộ giáo viên")
        println("2. Xoá cán bộ giáo viên")
        println("0. Thoát")

        print("Nhập lựa chọn của bạn: ")
        choice = scanner.nextInt()

        when (choice) {
            1 -> {
                // Thêm cán bộ giáo viên
                val giaoVien = nhapThongTinCBGV(scanner)
                quanLy.themCBGV(giaoVien)
                quanLy.hienThiThongTinVaLuong()
                hoiTiepTucc(scanner)

            }

            2 -> {
                // Xoá cán bộ giáo viên
                print("Nhập mã số giáo viên cần xoá: ")
                val maSoGV = scanner.next()
                quanLy.xoaCBGV(maSoGV)
                quanLy.hienThiThongTinVaLuong()
                hoiTiepTucc(scanner)

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

// Hàm nhập thông tin của cán bộ giáo viên từ người dùng
fun nhapThongTinCBGV(scanner: Scanner): CBGV {
    print("Nhập tên: ")
    val hoTen = scanner.next()
    print("Nhập tuổi: ")
    val tuoi = scanner.nextInt()
    print("Nhập quê quán: ")
    val queQuan = scanner.next()
    print("Nhập mã số giáo viên: ")
    val maSoGV = scanner.next()
    print("Nhập lương cứng: ")
    val luongCung = scanner.nextFloat()
    print("Nhập lương thưởng: ")
    val luongThuong = scanner.nextFloat()
    print("Nhập tiền phạt: ")
    val tienPhat = scanner.nextFloat()

    return CBGV(hoTen, tuoi, queQuan, maSoGV, luongCung, luongThuong, tienPhat)
}
fun hoiTiepTucc(scanner: Scanner) {
    print("Bạn có muốn tiếp tục không? (1: Có, 0: Không): ")
    val tiepTuc = scanner.nextInt()
    if (tiepTuc == 0) {
        println("Thoát chương trình.")
        System.exit(0)
    }
}