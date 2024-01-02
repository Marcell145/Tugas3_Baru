/**
 * kalkulator
 */
public class KalkulatorLuas {

    private double panjang;
    private double lebar;
    public KalkulatorLuas(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        KalkulatorLuas kalkulator = new KalkulatorLuas(5, 3);
        System.out.println("Luas Persegi Panjang: " + kalkulator.hitungLuas());
    }
}
