# Daftar untuk menyimpan inventaris barang
inventaris = []

def tambah_barang(nama, jumlah, kategori):
    barang = {
        'nama': nama,
        'jumlah': jumlah,
        'kategori': kategori
    }
    inventaris.append(barang)
    print(f"Barang '{nama}' berhasil ditambahkan.")

def hapus_barang(nama):
    global inventaris
    inventaris = [barang for barang in inventaris if barang['nama'] != nama]
    print(f"Barang '{nama}' berhasil dihapus.")

def lihat_barang():
    if not inventaris:
        print("Inventaris kosong.")
        return
    print("Daftar Inventaris:")
    for barang in inventaris:
        print(f"Nama: {barang['nama']}, Jumlah: {barang['jumlah']}, Kategori: {barang['kategori']}")

def cari_barang(nama):
    ditemukan = False
    for barang in inventaris:
        if barang['nama'].lower() == nama.lower():
            print(f"Barang ditemukan: Nama: {barang['nama']}, Jumlah: {barang['jumlah']}, Kategori: {barang['kategori']}")
            ditemukan = True
            break
    if not ditemukan:
        print(f"Barang '{nama}' tidak ditemukan.")

# Menu Utama
while True:
    print("\nMenu Pengelolaan Inventaris")
    print("1. Tambah Barang")
    print("2. Hapus Barang")
    print("3. Lihat Barang")
    print("4. Cari Barang")
    print("5. Keluar")
    
    pilihan = input("Pilih menu (1-5): ")
    
    if pilihan == '1':
        nama = input("Masukkan nama barang: ")
        jumlah = int(input("Masukkan jumlah barang: "))
        kategori = input("Masukkan kategori barang: ")
        tambah_barang(nama, jumlah, kategori)
    elif pilihan == '2':
        nama = input("Masukkan nama barang yang ingin dihapus: ")
        hapus_barang(nama)
    elif pilihan == '3':
        lihat_barang()
    elif pilihan == '4':
        nama = input("Masukkan nama barang yang ingin dicari: ")
        cari_barang(nama)
    elif pilihan == '5':
        print("Keluar dari program.")
        break
    else:
        print("Pilihan tidak valid. Silakan coba lagi.")