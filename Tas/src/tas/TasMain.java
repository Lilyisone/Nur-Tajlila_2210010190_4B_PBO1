import java.util.Scanner;

public class TasMain {

    public static void main(String[] args) {
        // Error Handling
        try {
            
        // Object
        Scanner scanner = new Scanner(System.in);

        //Array
        TasSekolah[] tas1 = new TasSekolah[1];

        // for loop perulangan
        for (int i = 0; i < tas1.length; i++) {

            //Input 
            System.out.print("Masukkan Merk Tas ke-" + (i + 1) + ": ");
            String merk = scanner.nextLine();
            System.out.print("Masukkan Warna Tas ke-" + (i + 1) + ": ");
            String warna = scanner.nextLine();
            System.out.print("Masukan kapasitas tas (Liter): ");
            String kapasitas = scanner.nextLine();
            System.out.print("Masukan Harga Tas ke-" + (i + 1) + ": ");
            int harga = scanner.nextInt();
            scanner.nextLine();


            tas1[i] = new TasSekolah(merk, warna, kapasitas, harga);
        }
        //output
        System.out.println("\n Data Tas yang dimasukan: ");
        for (TasSekolah tas2 : tas1) {
            System.out.println(tas2.tampilkanInfo());
        }
        scanner.close();
        
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
