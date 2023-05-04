package Inheritance;

public class Main {
    public static void main(String[] args) {
        Manajer manager = new Manajer("Tatang", 40, "Laki-laki", "Manajer", 10000);
        Insinyur engineer = new Insinyur("Neneng", 30, "Perempuan", "Insinyur", "Pengembangan Perangkat Lunak");

        manager.bekerja();
        engineer.bekerja();

        System.out.println(manager.getNama() + " adalah seorang " + manager.getJabatan() + " dan mendapatkan bonus sebesar $" + manager.getBonus());
        System.out.println(engineer.getNama() + " adalah seorang " + engineer.getJabatan() + " yang mengkhususkan diri pada " + engineer.getSpesialisasi());
    }
}