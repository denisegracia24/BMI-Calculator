## 🚀 Cara Menggunakan Aplikasi Kalkulator BMI

1. **Jalankan Aplikasi:**
   * Buka proyek melalui IDE NetBeans, lalu jalankan file `App.java` (atau gunakan perintah `javafx:run` jika melalui Maven).

2. **Masukkan Data:**
   * Ketik nilai **Berat Badan** dalam satuan kilogram (kg) pada kolom input pertama.
   * Ketik nilai **Tinggi Badan** dalam satuan sentimeter (cm) pada kolom input kedua.

3. **Hitung BMI:**
   * Klik tombol hijau **"Hitung BMI"**.
   * Hasil perhitungan indeks masa tubuh beserta kategori kesehatan (misalnya Normal, Underweight, Overweight) akan langsung muncul di bagian bawah layar.

4. **Validasi & Penanganan Error:**
   * Jika kolom dikosongkan atau diisi dengan nilai yang tidak valid (seperti angka minus), aplikasi akan menampilkan peringatan kesalahan (*exception handling*) secara otomatis tanpa mengalami *crash*.
