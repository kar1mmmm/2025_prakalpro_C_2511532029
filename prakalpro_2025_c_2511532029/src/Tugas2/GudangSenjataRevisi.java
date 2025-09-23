package Tugas2;

public class GudangSenjataRevisi {
    public static void main(String[] args) {
        // Data senjata
        int jumlahSenjata = 50;        
        char kategori = 'B';            
        boolean siapDigunakan = true;   

        // Tampilkan data
        System.out.println("=== STOK GUDANG SENJATA ===");
        System.out.println("Jumlah Senjata   : " + jumlahSenjata);
        System.out.println("Kategori         : " + kategori);
        System.out.println("Siap Digunakan?  : " + siapDigunakan);
        System.out.println();

        // === 1. Cek jumlah senjata ===
        if (jumlahSenjata > 100) {
            System.out.println(" Stok banyak — siap untuk misi besar!");
        } else if (jumlahSenjata > 50) {
            System.out.println(" Stok cukup — bisa untuk misi kecil.");
        
        }

        // === 2. Cek kategori senjata ===
        if (kategori == 'A') {
            System.out.println(" Ini senjata jenis Assault — cocok untuk pertempuran umum.");
        } else if (kategori == 'B') {
            System.out.println(" Ini senjata jenis Sniper — untuk jarak jauh.");
        
        }

        // === 3. Cek kesiapan ===
        if (siapDigunakan) {
            System.out.println(" Semua senjata siap digunakan.");
        } else {
            System.out.println("Ada senjata yang perlu diperbaiki!");
        }
    }
}
