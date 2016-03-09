package mainlarimahasiswa;
import java.util.Scanner;
public class MainLariMahasiswa {
    public static void main(String[] args) {
        int pjg = 0,lbr = 0;
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
        for (int i = 0; i < jum; i++) {
            System.out.print("Nama : ");
            String nama = in.nextLine();
            mhs.setNama(nama);
            System.out.print("NIM : ");
            String nim = in.nextLine();
            mhs.setNIM(nim);
            System.out.print("Mengelilingi lapangan sebanyak : ");
            int kel_lap = in2.nextInt();
            mhs.setBanyakKeliling(kel_lap);
            System.out.print("Waktu per putaran : ");
            int wkt_putaran = in2.nextInt();
            mhs.setWaktuKeliling(wkt_putaran);
            System.out.println("==============================");
            TotalJarak mhs3 = new TotalJarak(mhs2.KelilingLapangan(),kel_lap);
            mhs3 = new TotalJarak(mhs2.KelilingLapangan(),kel_lap);
            System.out.println("Nama : "+nama);
            System.out.println("Total Jarak : "+mhs3.TotalJarak());
            System.out.println("==============================");
        }
    }
}
