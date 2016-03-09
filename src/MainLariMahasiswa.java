package mainlarimahasiswa;
import java.util.Scanner;
public class MainLariMahasiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();
        System.out.print("Jumlah Mahasiswa : ");
        int jum = in2.nextInt();
        mhs.setBanyakMahasiswa(jum);
        System.out.print("Panjang Lapangan : ");
        int pjg = in2.nextInt();
        mhs.setPanjang(pjg);
        System.out.print("Lebar Lapangan : ");
        int lbr = in2.nextInt();
        mhs.setLebar(lbr);
        for (int i = 0; i < jum; i++) {
            System.out.print("Nama : ");
            String nama = in.nextLine();
            System.out.print("NIM : ");
            String nim = in.nextLine();
        }
    }
    
}
