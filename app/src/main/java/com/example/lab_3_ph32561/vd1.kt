package com.example.lab3_ph32561


fun main() {
    val soA = 5
    var soB = 10

    with(soB){
       soB = this.inc()
        println("So b: $soB")
    }
    val sv1 = SinhVienModel("hieu","ph32561",9f)
        .apply {
            tenSv = "abcd"
            diemTb = 2f
        }
    println(sv1)

    val luyThuaBac3CuaA = soA.let {
        val kq = it * it * it
        kq
    }

    val title = "Buoi 3 - Android kotlin"
    val length = title?.run {
        if(isEmpty() == null) {
            0
        }else{
            length
        }
    }

    println("Do dai cua chuoi $title = $length")
    println(luyThuaBac3CuaA)
    println("Tong 2 so $soA va $soB = ${tinhTong(soA, soB)}")
    println("Tinh 2 so $soA va $soB = ${phepNhan(soA, soB)}")
    println("Thuong 2 so $soA va $soB la: ${phepChia(soA.toFloat(), soB.toFloat())()}")
    println("luy thua  $soA  la: ${luyThua(soA)}")


}

val tinhTong = { soA: Int, soB: Int -> (soA + soB) }
val phepNhan: (Int, Int) -> Int = { soA: Int, soB: Int -> (soA * soB) }

val phepChia = { soA: Float, soB: Float ->
    {
        if (soB == 0f) {
            "So bi chia phai khac 0 "
        } else {
            val kq = soA / soB
            kq
        }
    }
}

val luyThua: (Int) -> Int = { it * it }

