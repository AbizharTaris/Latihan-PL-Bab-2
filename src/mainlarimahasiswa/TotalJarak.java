package mainlarimahasiswa;
public class TotalJarak {
    private int kelilingLapangan;
    private int putaran;
    private int jarak;
    public TotalJarak(){
        kelilingLapangan = 0;
        putaran = 0;
    }
    public TotalJarak(int kel,int ptr){
        kelilingLapangan = kel;
        putaran = ptr;
    }
    public int TotalJarak(){
        jarak = kelilingLapangan*putaran;
        return jarak;
    }
}
