package Abstraksi;

class Pembalap extends Orang {
    public Pembalap(String nama, int usia) {
        super(nama, usia);
    }

    public String getPekerjaan() {
        return "Pembalap";
    }
}