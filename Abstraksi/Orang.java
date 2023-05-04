package Abstraksi;

abstract class Orang {
    private String nama;
    private int usia;

    public Orang(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public abstract String getPekerjaan();
}