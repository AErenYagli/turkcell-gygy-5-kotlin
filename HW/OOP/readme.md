# Kotlin OOP Concepts

Bu projede Kotlin dilinde Object-Oriented Programming (OOP) kavramlarını basit ve anlaşılır örneklerle açıkladım.

---

## 1. Encapsulation (Kapsülleme)

Encapsulation, bir sınıfın içindeki veriyi dış dünyadan gizleyip sadece kontrollü şekilde erişilmesini sağlamaktır.

### Örnek:

📁 [encapsulation.kt](encapsulation.kt)


### Açıklama:

* `balance` değişkeni `private` olarak tanımlandı.
* Bu sayede dışarıdan direkt erişilemez.
* Sadece `deposit`, `withdraw` ve `getBalance` fonksiyonları ile kontrol edilir.

✔ Avantajları:

* Veri güvenliği sağlar
* Hatalı kullanımın önüne geçer

---

## 2. Inheritance (Kalıtım)

Inheritance, bir sınıfın başka bir sınıfın özelliklerini miras almasıdır.

### Örnek:

📁 [inheritance.kt](inheritance.kt)

### Açıklama:

* `Animal` → üst sınıf (parent)
* `Dog` → alt sınıf (child)
* `Dog`, `Animal` sınıfındaki özellikleri kullanabilir.

✔ Avantajları:

* Kod tekrarını azaltır
* Daha düzenli yapı sağlar

---

## 3. Polymorphism (Çok Biçimlilik)

Polymorphism, aynı fonksiyonun farklı şekillerde davranabilmesidir.

### Örnek:

📁 [polymorphism.kt](polymorphism.kt)

### Açıklama:

* `makeSound()` fonksiyonu farklı sınıflarda farklı davranır.
* Aynı isim → farklı çıktı

✔ Avantajları:

* Esnek yapı sağlar
* Kodun genişletilebilirliğini artırır

---

## 4. Abstraction (Soyutlama)

Abstraction, gereksiz detayları gizleyip sadece gerekli kısmı göstermektir.

### Örnek:

📁 [abstraction.kt](abstraction.kt)

### Açıklama:

* `Payment` sınıfı soyuttur (`abstract`)
* Direkt kullanılamaz
* Alt sınıflar `pay()` fonksiyonunu implement etmek zorundadır

✔ Avantajları:

* Karmaşıklığı azaltır
* Kullanıcıya sade bir arayüz sunar

---

## 🎯 Sonuç

Bu projede OOP'nin 4 temel kavramını öğrendik:

* Encapsulation → veri gizleme
* Inheritance → kalıtım
* Polymorphism → çok biçimlilik
* Abstraction → soyutlama

Bu kavramlar sayesinde:

* Daha düzenli
* Daha güvenli
* Daha sürdürülebilir

kod yazabiliriz.

---

## 🚀 Not

Bu proje, OOP kavramlarını öğrenmek ve göstermek amacıyla hazırlanmıştır. Gerçek projelerde bu yapı daha büyük ve kompleks sistemlerde kullanılır.
