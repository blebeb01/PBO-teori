package Abstraksi;

public class Main {
    public static void main(String[] args) {
        Orang pembalap = new Pembalap("Maman Resing", 35);
        Orang guru = new Guru("Ujang Kopling", 28);

        System.out.println(pembalap.getNama() + " adalah seorang " + pembalap.getPekerjaan());
        System.out.println(guru.getNama() + " adalah seorang " + guru.getPekerjaan());
    }
}