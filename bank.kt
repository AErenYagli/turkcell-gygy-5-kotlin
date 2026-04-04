// Bank.kt dosyası oluşturalım.
// Bir bankacılık uygulaması (OOP yok)
// Min 5. adet bankacılık uygulamasında olması gerektiğini düşündüğünüz fonksiyonu tanımlayalım.
// Main fonksiyonunda da bu fonksiyonları çağırıp test edelim.





fun main() {
    var bakiye = 4500.0

    println("--- Banka Uygulaması ---")

    bakiyeGoster(bakiye)

    println(" ")
    bakiye = paraYatir(bakiye, 1000.0)
    bakiyeGoster(bakiye)

    println(" ")
    bakiye = paraCek(bakiye, 200.0)
    bakiyeGoster(bakiye)

    println(" ")
    bakiye = paraTransferi(bakiye, 300.0, "Ahmet")
    bakiyeGoster(bakiye)

    println(" ")
    bakiye = faturaOde(bakiye, 150.0, "Su")
    bakiyeGoster(bakiye)

    println(" ")
    bakiye = hisseAlis(bakiye,49.75,10)
    bakiyeGoster(bakiye)

    println(" ")
    bakiye = hisseSatis(bakiye,52.16,7)
    bakiyeGoster(bakiye)

    println("--- İşlemler Tamamlandı ---")
}


fun bakiyeGoster(bakiye: Double) {
    println("Güncel bakiyeniz: $bakiye TL")
}

fun paraYatir(bakiye: Double, miktar: Double = 0.0): Double {
    return if (miktar > 0) {
        println("$miktar TL hesaba yatırıldı.")
        bakiye + miktar
    } else {
        println("Geçersiz yatırım miktarı.")
        bakiye
    }
}

fun paraCek(bakiye: Double, miktar: Double = 0.0): Double {
    return if (miktar <= 0) {
        println("Geçersiz çekim miktarı.")
        bakiye
    } else if (miktar > bakiye) {
        println("Yetersiz bakiye. İşlem yapılamadı.")
        bakiye
    } else {
        println("$miktar TL hesaptan çekildi.")
        bakiye - miktar
    }
}

fun paraTransferi(bakiye: Double, miktar: Double = 0.0, alici: String = "Bilinmeyen Alıcı"): Double {
    return if (miktar <= 0) {
        println("Geçersiz transfer miktarı.")
        bakiye
    } else if (miktar > bakiye) {
        println("Yetersiz bakiye. Transfer yapılamadı.")
        bakiye
    } else {
        println("$alici kişisine $miktar TL transfer edildi.")
        bakiye - miktar
    }
}

fun faturaOde(bakiye: Double, faturaTutari: Double = 0.0, faturaTuru: String = "Bilinmeyen Fatura"): Double {
    return if (faturaTutari <= 0) {
        println("Geçersiz fatura tutarı.")
        bakiye
    } else if (faturaTutari > bakiye) {
        println("Yetersiz bakiye. $faturaTuru faturası ödenemedi.")
        bakiye
    } else {
        println("$faturaTuru faturası için $faturaTutari TL ödendi.")
        bakiye - faturaTutari
    }
}

fun hisseAlis(bakiye: Double, hisseFiyati: Double = 0.0, adet: Int =0): Double {
    val toplamMaliyet = hisseFiyati * adet

    return if (hisseFiyati <=0.0 || adet <=0) {
        println("Geçersiz hisse alım emri.")
        bakiye
    } else if (toplamMaliyet > bakiye){
        println("Bu işlem için bakiye yetersiz. Hisse alış emiri geçersiz.")
        bakiye
    } else {
        println("$adet adet hisse $hisseFiyati TL'den alış emir verildi. Maliyet: $toplamMaliyet TL")
        bakiye - toplamMaliyet
    }
}

fun hisseSatis(bakiye: Double, hisseFiyati: Double = 0.0, adet: Int = 0): Double {
    val toplamKazanc = hisseFiyati * adet

    return if (hisseFiyati <=0.0 || adet <=0) {
        println("Geçersiz hisse satış emri.")
        bakiye
    } else {
        println("$adet hisse $hisseFiyati TL'den satış emri verildi. Kazanç: $toplamKazanc TL")
        bakiye + toplamKazanc
    }
}

