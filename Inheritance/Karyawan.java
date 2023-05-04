package Inheritance;

class Karyawan {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String jabatan;

    public Karyawan(String nama, int umur, String jenisKelamin, String jabatan) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void bekerja() {
        System.out.println("Karyawan sedang bekerja");
    }
}