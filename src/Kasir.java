class Kasir {
    String namaBarang;
    int jumlahBarang;
    int hargaBarang;
    int bayar;
    int kembalian;

    Kasir(String namaBarang, int jumlahBarang, int hargaBarang, int bayar, int kembalian) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
        this.bayar = bayar;
        this.kembalian = kembalian;
    }

    void Display() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Bayar : " + bayar);
        System.out.println("Kembalian : " + kembalian);
    }
}