package mainlarimahasiswa;
public class CariPemenang {
    private int putaran;
    private int waktu;
    private int pemenang;
    public CariPemenang(){
        putaran = 0;
        waktu = 0;
    }
    public CariPemenang(int ptr,int wkt){
        putaran = ptr;
        waktu = wkt;
    }
    public int CariPemenang(){
        pemenang = putaran/waktu;
        return pemenang;
    }
}
