/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

class Mahasiswa {
    protected String nama;
    protected int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class MahasiswaBaru extends Mahasiswa {
    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

class MahasiswaLama extends Mahasiswa {
    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Alina Mahfiroh", 19);
        System.out.println("Mahasiswa:");
        mhs.displayInfo();
        System.out.println();

        MahasiswaBaru mhsBaru = new MahasiswaBaru("Ade Syifa Maanifiati", 20, 2022);
        System.out.println("Mahasiswa Baru:");
        mhsBaru.displayInfo();
        System.out.println();

        MahasiswaLama mhsLama = new MahasiswaLama("Nurul Khafidoh", 22, 2019);
        System.out.println("Mahasiswa Lama:");
        mhsLama.displayInfo();
    }
}