package mainlarimahasiswa;
import java.util.Scanner;
public class MainLariMahasiswa {
    public static void main(String[] args) {
        int pjg = 0,lbr = 0;
        int kel_lap = 0;
        int wkt_putaran = 0;
        String nama ="",nim;
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();
        System.out.print("Jumlah Mahasiswa \t: ");
        int jum = in2.nextInt();
        mhs.setBanyakMahasiswa(jum);
        System.out.print("Panjang Lapangan (m)\t: ");
        pjg = in2.nextInt();
        mhs.setPanjang(pjg);
        System.out.print("Lebar Lapangan (m)\t: ");
        lbr = in2.nextInt();
        mhs.setLebar(lbr);
        KelilingLapangan mhs2 = new KelilingLapangan(pjg,lbr);
        mhs2 = new KelilingLapangan(pjg,lbr);
        System.out.println("Keliling Lapangan (m)\t: "+mhs2.KelilingLapangan());
        System.out.println("==============================");
        TotalJarak mhs3 = new TotalJarak(mhs2.KelilingLapangan(),kel_lap);
        for (int i = 0; i < jum; i++) {
            System.out.print("Nama : ");
            nama = in.nextLine();
            mhs.setNama(nama);
            System.out.print("NIM : ");
            nim = in.nextLine();
            mhs.setNIM(nim);
            System.out.print("Mengelilingi lapangan sebanyak : ");
            kel_lap = in2.nextInt();
            mhs.setBanyakKeliling(kel_lap);
            System.out.print("Waktu per putaran : ");
            wkt_putaran = in2.nextInt();
            mhs.setWaktuKeliling(wkt_putaran);
            System.out.println("==============================");
            mhs3 = new TotalJarak(mhs2.KelilingLapangan(),kel_lap);
            System.out.println("Nama : "+nama);
            System.out.println("Total Jarak : "+mhs3.TotalJarak());
            System.out.println("==============================");
            
        }
        CariPemenang mhs4 = new CariPemenang(mhs3.TotalJarak(),wkt_putaran);
        mhs4 = new CariPemenang(mhs3.TotalJarak(),wkt_putaran);
        int temp = 0;
        String pemenang = nama;
            for (int j = 0; j < jum; j++) {
                if(mhs4.CariPemenang()>temp){
                    temp = mhs4.CariPemenang();
                }
                else if (temp>mhs4.CariPemenang()) {
                    pemenang = nama;
                }
            }
            System.out.println("Pemenang : "+pemenang);
    }
}
