package mainlarimahasiswa;
public class DataMahasiswa {
    private String nama;
    private String nim;
    private int panjang;
    private int lebar;
    private int kelilingLapangan;
    private int banyakMahasiswa;
    private int banyakKeliling;
    private int waktuKeliling;
    
    public DataMahasiswa(int banyakMahasiswa){
        this.banyakMahasiswa = banyakMahasiswa;
    }
    
    public DataMahasiswa(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public DataMahasiswa(String nama, String nim, int banyakKeliling, int waktuKeliling){
        this.nama = nama;
        this.nim = nim;
        this.banyakKeliling = banyakKeliling;
        this.waktuKeliling = waktuKeliling;
    }
}
