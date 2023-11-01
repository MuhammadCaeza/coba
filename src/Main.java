import java.util.Scanner;

/**
 * @author LordCaeza
 *
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi pertama segitiga: ");
        double sisi1 = input.nextDouble();

        System.out.print("Masukkan panjang sisi kedua segitiga: ");
        double sisi2 = input.nextDouble();

        System.out.print("Masukkan panjang sisi ketiga segitiga: ");
        double sisi3 = input.nextDouble();

        // Menghitung luas permukaan segitiga
        double luasPermukaan = hitungLuasPermukaanSegitiga(sisi1, sisi2, sisi3);

        System.out.println("Luas permukaan segitiga adalah: " + luasPermukaan);

        input.close();
    }

    /**
     * Hitung luas permukaan segitiga double.
     *
     * @param sisi1 adalah sisi pertama pada suatu segitiga
     * @param sisi2 the sisi 2
     * @param sisi3 the sisi 3
     * @return mengembalikan luas permukaan suatu segitiga
     */
    // Fungsi untuk menghitung luas permukaan segitiga
    public static double hitungLuasPermukaanSegitiga(double sisi1, double sisi2, double sisi3) {
            double s = (sisi1 + sisi2 + sisi3) / 2;
            double luas = Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
            return luas;
    }


}
