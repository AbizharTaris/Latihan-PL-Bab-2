package mainlarimahasiswa;
public class KelilingLapangan {
    private int pjg;
    private int lbr;
    private int kelilingLapangan;
    public KelilingLapangan(){
        pjg = 0;
        lbr = 0;
    }
    public KelilingLapangan(int panjang, int lebar){
        pjg = panjang;
        lbr = lebar;
    }
    public int KelilingLapangan(){
        kelilingLapangan = 2*(pjg+lbr);
        return kelilingLapangan;
   }
}
