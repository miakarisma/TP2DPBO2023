# TP2DPBO2023
## Janji
Saya Mia Karisma Haq NIM [2102165] mengerjakan soal Tugas Praktikum-2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
## Deskripsi Program
Buatlah program Java yang terkoneksi dengan database MySQL. Berikut spesifikasi program yang harus dibuat:
- Program bebas, kecuali program Mahasiswa dan Book Author
- Terdapat proses Create, Read, Update, dan Delete data
- Terdapat proses Autentikasi (Login, Register) *
- Menggunakan minimal 2 tabel pada database
- Harus terdapat minimal 1 properti gambar pada class yang dibuat (gambar akan ditampilkan pada UI)
- Terdapat pergantian screen pada UI
- Terdapat button navigasi untuk beralih screen
- List data ditampilkan menggunakan card (JPanel)
- Boleh login dan/atau register. Tidak perlu ada enkripsi password
## Desain UML
![tp2_dpbo drawio](https://user-images.githubusercontent.com/100817609/231527025-c0c8c0fc-8528-4105-b1f6-1331565c6656.png)

## Penjelasan Desain
Program terdiri dari 9 kelas.
1. dbConnection merupakan kelas yang digunakan untuk terhubung dengan database, dimana setiap kelas pada program mmemiliki kelas dbConnection.
2. User merupakan kelas yang digunakan untuk menyimpan data user, setiap user memiliki main yang terdiri dari list penyanyi dan playlist music.
3. Main merupakan kelas utama yang terdiri dari list penyanyi dan playlist music.
4. PenyanyiCard merupakan kelas yang menyimpan data penyanyi, penyanyiCard memiliki kelas EditPenyanyi dan AddPenyanyi.
5. MusikCard merupakan kelas yang menyimpan data musik, musikCard memiliki kelas Penyanyi, selain itu musikCard juga memiliki kelas EditMusik dan AddMusik.
6. EditPenyanyi merupakan kelas yang digunakan untuk mengedit data penyanyi dan memperbaharui data yang disimpan pada database
7. EditMusik merupakan kelas yang digunakan untuk mengedit data musik dan memperbaharui data yang disimpan pada database
8. AddPenyanyi merupakan kelas yang digunakan untuk menambah data penyanyi dan memperbaharui data yang disimpan pada database
9. AddMusik merupakan kelas yang digunakan untuk menambah data musik dan memperbaharui data yang disimpan pada database.

## Penjelasan Alur
Pertama akan ditampilkan halaman login, apabila user belum memiliki akun maka user akan diarahkan ke halaman pendaftaran, setelah log in user akan diarahkan ke halaman list penyanyi, lalu user dapat melakukan add, edit, ataupun hapus data penyanyi. Setelah terdapat penyanyi, user dapat melakukan add, edit ataupun hapus data musik. Apabila user ingin berganti peran, user dapat melakukan log out, dan log in kembali menggunakan akun yang berbeda, adapun tampilan playlist dan list penyanyi setiap user berbeda.

## Dokumentasi
- Login <br></br>
![Screenshot LoginVisitor1](https://user-images.githubusercontent.com/100817609/231527920-6aec4388-95f8-47c6-929b-b2c4510b4976.png)
- Register <br></br>
![Screenshot Register](https://user-images.githubusercontent.com/100817609/231527954-23469fa6-cc15-4b36-b3fa-c417641ec977.png)
- Add Penyanyi<br></br>
![Screenshot AddPenyanyiVisitor1](https://user-images.githubusercontent.com/100817609/231528043-4b4253a6-9aca-4a74-9bfc-a840916544df.png)
- Add Musik<br></br>
![Screenshot AddMusikVisitor1](https://user-images.githubusercontent.com/100817609/231528081-e48aa6d7-62f1-48fb-8412-96f2077aa582.png)
- Edit Musik<br></br>
![Screenshot EditMusikVisitor1](https://user-images.githubusercontent.com/100817609/231528192-1495df4e-1bca-4c41-803b-785a62fdfab7.png)
- Delete<br></br>
![Screenshot AddPenyanyiVisitor1Success](https://user-images.githubusercontent.com/100817609/231528272-1b6869b0-53d9-467b-87e4-36b10fecc74e.png)
- Playlist Music<br></br>
![Screenshot PlaylistMusicVisitor1](https://user-images.githubusercontent.com/100817609/231528348-5fd22660-0a94-4e4e-8095-7be5e627592f.png)
- List Penyanyi<br></br>
![Screenshot ListPenyanyiVisitor1](https://user-images.githubusercontent.com/100817609/231528449-54767a1a-af5e-44d4-a194-38392d46fcbc.png)

**akun log in  :**<br></br>
username : visitor1<br></br>
password : visitor1<br></br>
<br></br>
username : visitor2<br></br>
password : visitor2<br></br>
