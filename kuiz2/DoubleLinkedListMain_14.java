package kuiz2;

import java.util.Scanner;
public class DoubleLinkedListMain_14 {
    
public static void menu(){
        System.out.println(" 1. Tambah Antrian");
        System.out.println(" 2. Cetak Antrian");
        System.out.println(" 3. Hapus Antrian");
        System.out.println(" 4. Laporan Pengurututan pesanan by nama");
        System.out.println(" 5. Hitung total Pendapatan");
        System.out.println(" 6. Keluar");
        System.out.println("==================================");
        System.out.print("Pilih(1-5): ");

}

public static void main(String[] args) throws Exception{
    System.out.println("========== QUIZ 2 PRAKTIKUM ASD-TI - 1C dan TI - 1F ==========");
    System.out.println("dibuat oleh : Muhammad Dzaka Murran Rusid");
    System.out.println("NIM : 2141720076");
    System.out.println("Absen : 14");
    System.out.println("====================================================");
    System.out.println("Sistem Antrian Resto Royal Delish");
    System.out.println("====================================================");


        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        
        DoubleLinkedList_14 dll = new DoubleLinkedList_14();
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
    
            switch(pilih){
                case 1:
                    System.out.print("Nomor Antrian\t: ");
                    int nomor = sd.nextInt();
                    System.out.print("Nama Customer\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor Hp\t: ");
                    String noHP = sd.nextLine();
                    dll.addLast(nomor, nama, noHP);
                    sc.nextLine();
                break;
                
                case 2:
                    dll.print();
                break;
                
                case 3:
                    dll.removeFirst();
                    dll.print();
                break;
                
                case 4:
                
                break;

                case 5:
                
                break;

                case 6:
                    System.exit(0);
                break;
                
            } 
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 );
    }
}



