package Tugas2;

public class GudangSenjata {
    public static void main(String[] args) {
        // Data senjata
        int jumlahSenjata = 120;        
        // int → jumlah senjata
        float beratSenjata = 3.75f;    
        // float → berat rata-rata senjata (kg)
        char kategori = 'A';            
        // char → kategori senjata (misalnya A = Assault)
        boolean siapDigunakan = true;   
        // boolean → status siap digunakan atau tidak

        // Cetak data stok senjata
        System.out.println("Data Stok Gudang Senjata");
        System.out.println("Jumlah Senjata    : " + jumlahSenjata + " unit");
        System.out.println("Berat Rata-rata   : " + beratSenjata + " kg");
        System.out.println("Kategori Senjata  : " + kategori);
        System.out.println("Siap Digunakan?   : " + siapDigunakan);
    }
}

