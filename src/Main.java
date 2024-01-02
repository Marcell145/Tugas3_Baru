import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang dalam centimeter
        System.out.print("Masukkan panjang dalam centimeter: ");
        double panjangCM = scanner.nextDouble();

        // Konversi ke meter dan kilometer
        double panjangM = konversiCMKeM(panjangCM);
        double panjangKM = konversiCMKeKM(panjangCM);

        // Menampilkan hasil konversi
        System.out.println("Hasil konversi:");
        System.out.println("Panjang dalam meter: " + panjangM + " M");
        System.out.println("Panjang dalam kilometer: " + panjangKM + " KM");
    }

    // Metode untuk konversi CM ke M
    private static double konversiCMKeM(double panjangCM) {
        return panjangCM / 100.0; // 1 meter = 100 centimeter
    }

    // Metode untuk konversi CM ke KM
    private static double konversiCMKeKM(double panjangCM) {
        return panjangCM / 100000.0; // 1 kilometer = 100,000 centimeter
    }
}
