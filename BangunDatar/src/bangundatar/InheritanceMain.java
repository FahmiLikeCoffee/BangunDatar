package bangundatar;
import java.util.Scanner;

public class InheritanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        System.out.print("Masukkan panjang sisi persegi: ");
        persegi.sisi = (int) scanner.nextDouble();

        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan jari-jari lingkaran: ");
        lingkaran.r = (int) scanner.nextDouble();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.print("Masukkan panjang persegi panjang: ");
        persegiPanjang.panjang = (float) scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        persegiPanjang.lebar = (float) scanner.nextDouble();

        Segitiga mSegitiga = new Segitiga();
        System.out.print("Masukkan alas segitiga: ");
        mSegitiga.alas = (float) scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        mSegitiga.tinggi = (float) scanner.nextDouble();

        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

