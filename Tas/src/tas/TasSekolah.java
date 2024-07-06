public class TasSekolah extends Tas {
    // Atribut baru kapasitas tas
    private String kapasitas;

    public TasSekolah(String merk, String warna, String kapasitas, int harga) {
        super(merk, warna, harga);
        this.kapasitas = kapasitas;
    }

    // Mutator
    void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Accsesor
    String getKapasitas() {
        return kapasitas;
    }

    // Seleksi
    public String getDiskon() {
        if (getHarga() > 300000) {
            return "Anda mendapatkan diskon 10%";
        } else {
            return "Anda tidak mendapatkan diskon";
        }
    }

    @Override
    String tampilkanInfo() {
        return super.tampilkanInfo() + " dan memiliki kapasitas " + kapasitas + "\n" + getDiskon() + "\n";
    }

}
