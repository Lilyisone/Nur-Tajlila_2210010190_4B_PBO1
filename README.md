# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Tas`, `TasSekolah`, dan `TasMain` adalah contoh dari class.

```bash
    public class Tas {
        ...
    }

    public class TasSekolah extends Toko {
        ...
    }

    public class TasMain {
        ...
    }
```

2. **Object** adalah instance dari class. Pada kode ini, `tas1[i] = new TasSekolah(merk, warna, kapasitas, harga);` adalah contoh pembuatan object.

```bash
    tas1[i] = new TasSekolah(merk, warna, kapasitas, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk`, `warna` dan `harga` adalah contoh atribut.

```bash
    String merk, warna;
    int harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Tas` dan `TasSekolah`.

```bash
    public Tas() {

    }

    public Tas(String merk, String warna, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public TasSekolah(String merk, String warna, String kapasitas, int harga) {
        super(merk, warna, harga);
        this.kapasitas = kapasitas;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk`,  `setWarna`, `setHarga` dan `setKapasitas` adalah contoh method mutator.

```bash
    void setMerk(String merk) {
        this.merk = merk;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`,  `getWarna`, `getHarga` dan `getKapasitas` adalah contoh method accessor.

```bash
    String getMerk() {
        return merk;
    }

    String getWarna() {
        return warna;
    }

    int getHarga() {
        return harga;
    }

    String getKapasitas() {
    return kapasitas;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk`, `warna` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk, warna;
private int harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TasSekolah` mewarisi `Tas` dengan sintaks `extends`.

```bash
public class TasSekolah extends Tas {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Tas` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo()` di `TasSekolah` merupakan override dari method `tampilkanInfo()` di `Tas`.

```bash
    String tampilkanInfo() {
        return "ini tas " + getMerk() + ", berwarna " + getWarna() + ", dengan harga " + getHarga();

    }

    @Override
    String tampilkanInfo() {
        return super.tampilkanInfo() + " dan memiliki kapasitas " + kapasitas + "\n" + getDiskon() + "\n";
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKapasitasStok`.

```bash
    public String getDiskon() {
        if (getHarga() > 300000) {
            return "Anda mendapatkan diskon 10%";
        } else {
            return "Anda tidak mendapatkan diskon";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
    for (int i = 0; i < tas1.length; i++) {
        ...
    }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
    System.out.print("Masukan kapasitas tas (Liter): ");
    String kapasitas = scanner.nextLine();
    System.out.print("Masukan Harga Tas ke-" + (i + 1) + ": ");
    int harga = scanner.nextInt();

    System.out.println(tas2.tampilkanInfo());
    System.out.println("Error: " + e.getMessage());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `TasSekolah[] tas1 = new TasSekolah[1];` adalah contoh penggunaan array.

```bash
TasSekolah[] tas1 = new TasSekolah[1];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nur Tajlila
NPM: 2210010190
