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
    
    public DataMahasiswa(){
        banyakMahasiswa = 0;
        panjang = 0;
        lebar = 0;
        nama = "";
        nim = "";
        banyakKeliling = 0;
        waktuKeliling = 0;
    }
    
    public DataMahasiswa(int banyakMahasiswa ,int panjang, int lebar, String nama, String nim, int banyakKeliling, int waktuKeliling){
        this.banyakMahasiswa = banyakMahasiswa;
        this.panjang = panjang;
        this.lebar = lebar;
        this.nama = nama;
        this.nim = nim;
        this.banyakKeliling = banyakKeliling;
        this.waktuKeliling = waktuKeliling;
    }
    
    public void setBanyakMahasiswa(int jumMhs){
        banyakMahasiswa = jumMhs;
    }
    public void setPanjang(int p){
        panjang = p;
    }
    public void setLebar(int l){
        lebar = l;
    }
    public void setNama(String n){
        nama = n;
    }
    public void setNIM(String N){
        nim = N;
    }
    public void setBanyakKeliling(int jumKel){
        banyakKeliling = jumKel;
    }
    public void setWaktuKeliling(int wktKel){
        waktuKeliling = wktKel;
    }
}
