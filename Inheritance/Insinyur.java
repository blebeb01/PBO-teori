package Inheritance;

class Insinyur extends Karyawan {
    private String spesialisasi;

    public Insinyur(String nama, int umur, String jenisKelamin, String jabatan, String spesialisasi) {
        super(nama, umur, jenisKelamin, jabatan);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    @Override
    public void bekerja() {
        System.out.println("Insinyur sedang merancang dan membangun produk");
    }
}