package Inheritance;

class Manajer extends Karyawan {
    private double bonus;

    public Manajer(String nama, int umur, String jenisKelamin, String jabatan, double bonus) {
        super(nama, umur, jenisKelamin, jabatan);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void bekerja() {
        System.out.println("Manajer sedang mengatur tim kerja");
    }
}