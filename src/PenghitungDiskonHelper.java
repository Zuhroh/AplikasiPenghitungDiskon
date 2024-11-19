
public class PenghitungDiskonHelper {
    // Method untuk menghitung total diskon
    public double hitungTotalDiskon(double hargaAsli, int persenDiskon, int persenDiskonKodeKupon) {
    double diskonDariSlider = hargaAsli * persenDiskon / 100;
    double diskonDariKodeKupon = hargaAsli * persenDiskonKodeKupon / 100;
    return diskonDariSlider + diskonDariKodeKupon;
    }

    // Method untuk menghitung total harga setelah diskon
    public double hitungHargaSetelahDiskon(double hargaAsli, double totalDiskon) {
        return hargaAsli - totalDiskon;
    }
    // Method untuk memvalidasi kode kupon dan mengembalikan persentase diskon
    public int validasiKodeKupon(String kodeKupon) {
        return switch (kodeKupon.toLowerCase()) {
            case "diskon10persen" -> 10;
            case "diskon25persen" -> 25;
            case "diskon50persen" -> 50;
            case "diskon75persen" -> 75;
            case "diskon99persen" -> 99;
            default -> 0;
        }; // Jika kode kupon tidak valid, diskon tambahan 0%
    }
    // Method untuk memformat hasil riwayat
    public String formatRiwayat(String harga, String diskon, String kodeKupon, String totalDiskon, String totalHarga) {
        return "Harga Asli: Rp" + harga + 
               ", Diskon: " + diskon + 
               "%, Kode Kupon: " + (kodeKupon.isEmpty() ? "Tidak ada" : kodeKupon) + 
               ", Total Diskon: Rp" + totalDiskon + 
               ", Total Harga: Rp" + totalHarga + "\n";
    }
}
