// class Tas 
public class Tas {

    // Atribut yan diberi Encapsulation (Private: tidak bisa di akses dari luar
    // classnya)
    private String merk, warna;
    private int harga;

    // Konstruktor kosong
    public Tas() {

    }

    // Konstruktor sekaligus polymorphisme (Overloading)
    public Tas(String merk, String warna, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    // Mutator
    void setMerk(String merk) {
        this.merk = merk;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    // Accsessor
    String getMerk() {
        return merk;
    }

    String getWarna() {
        return warna;
    }

    int getHarga() {
        return harga;
    }

    String tampilkanInfo() {
        return "ini tas " + getMerk() + ", berwarna " + getWarna() + ", dengan harga " + getHarga();

    }

}
