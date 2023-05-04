package Abstraksi;

class Guru extends Orang {
    public Guru(String nama, int usia) {
        super(nama, usia);
    }

    public String getPekerjaan() {
        return "Guru";
    }
}