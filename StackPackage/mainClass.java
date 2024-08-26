package StackPackage;

public class mainClass {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Joker", 01, "A1");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", 02, "A1");
        Mahasiswa mahasiswa3 = new Mahasiswa("Aldi", 03, "A1");
        Mahasiswa mahasiswa4 = new Mahasiswa("Ghea", 04, "A1");
        Mahasiswa mahasiswa5 = new Mahasiswa("Happy", 05, "A2");
        Stack dataMahasiswa = new Stack(5);
        dataMahasiswa.push(mahasiswa1);
        dataMahasiswa.push(mahasiswa2);
        dataMahasiswa.push(mahasiswa3);
        dataMahasiswa.push(mahasiswa4);
        dataMahasiswa.push(mahasiswa5);
        System.out.println(dataMahasiswa);
        System.out.println("Data " + dataMahasiswa.pop() + " dihapus dari dalam stack");
        System.out.println(dataMahasiswa);
    }
}
