package StackPackage;

public class Mahasiswa {
    private String nama;
    private int NIM;
    private String kelas;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, int NIM, String kelas) {
        this.nama = nama;
        this.NIM = NIM;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "NIM 0" + NIM + " " + nama + " " + kelas;
    }
}
